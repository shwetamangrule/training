package Service;

import model.Customer;
/*
 * customer service methods definition
 */
public interface CustomerService {

	public String addCustomer(Customer customer);
	public int removeCustomer(int customerId);
	public int updateCustomer(String paymentMode,int customerId);

}