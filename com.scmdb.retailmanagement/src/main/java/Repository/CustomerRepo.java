package Repository;

import model.Customer;

public interface CustomerRepo {

	public int addCustomer(Customer customer);
	public int removeCustomer(int customerId);
	public int updateCustomer(String paymentMode,int customerId);


}