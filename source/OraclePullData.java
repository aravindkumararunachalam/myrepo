/**
 * @author Aravind
 * @date 9-Aug-2012
 *
 */

package source;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

import source.XstreamWriter;
import source.Customers;

public class OraclePullData {
	private String url;
	private String userName;
	private String password;
	private PreparedStatement prepStmt;
	private Connection conn;
	private ResultSetMetaData rsMetaData;
	private ResultSet rs;
	private List <String> columnList, columnType;
	private HashMap<String, Object> customerMap;
	private Customers customerObj;
	private XstreamWriter xstreamWriterObj;
	private int columnCount;
	
	public OraclePullData(String url, String user, String pass) {
		this.url = url;
		this.userName = user;
		this.password = pass;
		this.xstreamWriterObj = new XstreamWriter("/home/cloudera/hdfs/output/CustomerList.xml");
	}
	
	public int createConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection(this.url, this.userName, this.password);
			return 0;
		}
		catch(ClassNotFoundException e) {
			System.out.println ("Class not found exception...");
			e.printStackTrace();
			return 1;
		}
		catch(SQLException e) {
			System.out.println ("Problem in creating connection...");
			e.printStackTrace();
			return 1;
		}
	}
	
	public int closeConnection() {
		try {
			this.conn.close();
			return 0;
		}
		catch (SQLException e) {
			System.out.println ("Problem closing the connection...");
			e.printStackTrace();
			return 1;
		}
	}
	
	public int openResultSet(String query) {
		int count = 0;
		this.columnCount = 0;
		
		try {
			this.prepStmt = this.conn.prepareStatement(query);
			this.rsMetaData = this.prepStmt.getMetaData();
			
			this.columnCount = this.rsMetaData.getColumnCount();
			
			this.columnList = new ArrayList <String>(this.columnCount);
			this.columnType = new ArrayList <String>(this.columnCount);
			
			//Resultset MetaData access starts from 1 and not 0
			count = 1;
			
			while(count <= this.columnCount) {
				this.columnList.add(this.rsMetaData.getColumnName(count));
				this.columnType.add(this.rsMetaData.getColumnTypeName(count));
				count++;
			}
			
			this.rs = this.prepStmt.executeQuery();
		}
		catch (SQLException e) {
			System.out.println("Error executing the sql statement...");
			e.printStackTrace();
			return 1;
		}
		return 0;
	}
	
	public int closeResultSet() {
		try {
			this.rs.close();
		}
		catch (SQLException e) {
			System.out.println("Error closing resultset...");
			e.printStackTrace();
		}
		return 0;
	}
	
	public int fetchCustomerData() {
		Integer tempInteger;
		String tempString;
		Date tempDate;
		int count = 0;
		
		try {
			this.customerMap = new HashMap<String, Object>();
			this.customerObj = new Customers();
			this.xstreamWriterObj.openStream();
			
			while(rs.next()) {
				count = 0;
				this.customerMap.clear();
				while(count < this.columnCount) {
					if(this.columnType.get(count).equalsIgnoreCase("NUMBER")== true) {
						tempInteger = rs.getInt(this.columnList.get(count).toString());
						if (rs.wasNull() == true) {
							tempString = new String("");
						}
						else {
							tempString = tempInteger.toString();
						}
						this.customerMap.put(this.columnList.get(count), tempString);
					}
					else if((this.columnType.get(count).equalsIgnoreCase("VARCHAR2") == true) || (this.columnType.get(count).equalsIgnoreCase("CHAR") == true)) {
						tempString = rs.getString(this.columnList.get(count).toString());
						if(rs.wasNull() == true) {
							tempString = "";
						}
						this.customerMap.put(this.columnList.get(count), tempString);
					}
					else if(this.columnType.get(count).equalsIgnoreCase("DATE") == true) {
						tempDate = rs.getDate(this.columnList.get(count).toString());
						if(rs.wasNull() == true) {
							tempString = new String("");
						}
						else {
							tempString = tempDate.toString();
						}
						this.customerMap.put(this.columnList.get(count), tempString);

					}
					count++;
				}
				this.customerObj.assignValues(this.customerMap);
				this.xstreamWriterObj.writeObject(this.customerObj);
			}
			
			this.xstreamWriterObj.closeStream();
			
			return 0;
		}
		catch (SQLException e) {
			System.out.println ("Error while fetching data in resultset...");
			e.printStackTrace();
			this.xstreamWriterObj.closeStream();
			this.closeResultSet();
			return 1;
		}
	}
}
