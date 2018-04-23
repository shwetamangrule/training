package service;

import java.util.List;

import model.Customer;
import repository.CustomerInterface;

public class CustomerService implements CustomerServiceInterface {
	
	CustomerInterface customerinterface;
	
	public void setCustomerinterface(CustomerInterface customerinterface) {
		this.customerinterface = customerinterface;
	}

	/* (non-Javadoc)
	 * @see service.CustomerServiceInterface#addName()
	 */
	@Override
	public List<Customer> addName()
	{
		return customerinterface.addName();
	}

}
