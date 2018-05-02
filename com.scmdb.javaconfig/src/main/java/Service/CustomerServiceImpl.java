package Service;

import Repository.CustomerRepo;
import model.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepo customerrepo;

	public CustomerServiceImpl(CustomerRepo customerrepo) {

		super();
		this.customerrepo = customerrepo;
	}
	@Override
	public int addCustomer(Customer customer) {

		return customerrepo.addCustomer(customer);

	}


	@Override
	public int removeCustomer(int customerId) {

		return customerrepo.removeCustomer(customerId);
	}
	@Override
	public int updateCustomer(String paymentMode, int customerId) {

		return customerrepo.updateCustomer(paymentMode, customerId);
	}



}