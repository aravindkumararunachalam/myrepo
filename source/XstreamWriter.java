/**
 * @author Aravind
 * @date 11-Aug-2012
 *
 */
package source;

import com.thoughtworks.xstream.XStream;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;

import java.io.IOException;

import source.Customers;

public class XstreamWriter {
	private String targetName;
	private OutputStream fileBufferedStream;
	private XStream xstreamWriter;
	private ObjectOutputStream xstreamOutput;

	public XstreamWriter(String outputFileName) {
		this.targetName = outputFileName;
	}
	
	public int openStream() {
		try {
			this.xstreamWriter = new XStream();
			this.xstreamWriter.alias("CustomerList", CustomerList.class);
			this.xstreamWriter.alias("Customer", Customers.class);
			this.fileBufferedStream = new BufferedOutputStream(new FileOutputStream(this.targetName), 10240);
			this.xstreamOutput = this.xstreamWriter.createObjectOutputStream(this.fileBufferedStream, "CustomerList");
			return 0;
		}
		catch (IOException e) {
			System.out.println("Exception while trying to open file for writing...");
			e.printStackTrace();
			return 1;
		}
	}
	
	public int writeObject(Customers cust) {
		try {
			this.xstreamOutput.writeObject(cust);
			return 0;
		}
		catch (IOException e) {
			System.out.println("Error writing object to file output stream...");
			e.printStackTrace();
			return 1;
		}
	}
	
	public int closeStream() {
		try {
			this.xstreamOutput.flush();
			this.xstreamOutput.close();	
			return 0;
		}
		catch (IOException e) {
			System.out.println("Error closing the file output stream...");
			e.printStackTrace();
			return 1;
		}
	}
}
