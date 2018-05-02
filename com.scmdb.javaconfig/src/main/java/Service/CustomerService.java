package Service;

import model.Customer;
/*
 * customer service methods definition
 */
public interface CustomerService {

	public int addCustomer(Customer customer);
	public int removeCustomer(int customerId);
	public int updateCustomer(String paymentMode,int customerId);

}