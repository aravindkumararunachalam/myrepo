/**
 * @author Aravind
 * @date 10-Aug-2012
 *
 */

package source;

import java.util.Date;

import source.OraclePullData;

public class DataGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OraclePullData pullDataObj = new OraclePullData (args[0], args[1], args[2]);
		
		pullDataObj.createConnection();
		System.out.println("Connection to database created..." + new Date());
		pullDataObj.openResultSet("select * from customers");
		System.out.println("Query executed..." + new Date());
		pullDataObj.fetchData();
		System.out.println("Data copied to xml..." + new Date());
		pullDataObj.closeResultSet();
		pullDataObj.closeConnection();
		System.out.println("Connection to database closed..." + new Date());
	}

}
