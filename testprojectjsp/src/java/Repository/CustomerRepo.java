package Repository;

import model.Customer;
/*
 * Interface to implement customerRepo logics
 */
public interface CustomerRepo {

	public int addCustomer(Customer customer);
	public int removeCustomer(int customerId);
	public int updateCustomer(String paymentMode,int customerId);


}