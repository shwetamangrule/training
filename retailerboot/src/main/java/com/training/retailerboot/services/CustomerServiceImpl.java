package com.training.retailerboot.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.retailerboot.model.Customer;
import com.training.retailerboot.repository.CustomerRepo;

@Service
public class CustomerServiceImpl {

	@Autowired
	private CustomerRepo custRepo;
	
	
	public List<Customer> showall()
	{
		List<Customer> custlist=new ArrayList<>();
		custRepo.findAll().forEach(custlist::add);
		return custlist;
	}

	public Optional<Customer> getone(String customer_name)
	{
		return custRepo.findById(customer_name);
	}

	public void addcustomer(Customer customer) {
		custRepo.save(customer);
		
	}

	public void updatecustomer(Customer customer,String customer_name) {
		custRepo.save(customer);
	}

	public void deletecustomer(String customer_name) {
		
		custRepo.deleteById(customer_name);
		
	}
	
	
}
