package com.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Customer;
import com.training.repository.CustomerRepo;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepo customerrepo;

//	public CustomerServiceImpl(CustomerRepo customerrepo) {
//
//		super();
//		this.customerrepo = customerrepo;
//	}
	/*
	 * (non-Javadoc)
	 * @see Service.CustomerService#addCustomer(model.Customer)
	 */
	@Override
	public int addCustomer(Customer customer) {

		return customerrepo.addCustomer(customer);

	}

/*
 * (non-Javadoc)
 * @see Service.CustomerService#removeCustomer(int)
 */
	@Override
	public int removeCustomer(int customerId) {

		return customerrepo.removeCustomer(customerId);
	}
	/*
	 * (non-Javadoc)
	 * @see Service.CustomerService#updateCustomer(java.lang.String, int)
	 */
	@Override
	public int updateCustomer(String paymentMode, int customerId) {

		return customerrepo.updateCustomer(paymentMode, customerId);
	}



}