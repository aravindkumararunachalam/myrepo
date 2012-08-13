/**
 * @author Aravind
 * @date 11-Aug-2012
 * 
 */
package source;

import java.util.List;
import java.util.LinkedList;

import source.Customers;

public class CustomerList {
	private List<Customers> customerList;

	public CustomerList() {
		customerList = new LinkedList<Customers>();
	}
	
	public void addCustomers(Customers cust) {
		this.customerList.add(cust);
	}
	
	public List<Customers> getCustomers() {
		return this.customerList;
	}
}
