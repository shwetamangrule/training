package com.training.retailerboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.training.retailerboot.model.Customer;

@Service
public class CustomerServiceImpl {

	Customer cust=new Customer(101,"tuhin","mumbai");
	Customer cust1=new Customer(102,"tuhin","chennai");
	List<Customer> custlist=new ArrayList<>();
	public List<Customer> showall()
	{
		
		custlist.add(cust);
		custlist.add(cust1);
		return custlist;
	}

	public Customer getone(String name)
	{
		return custlist.stream().filter(t->t.getCustomer_name().equals(name)).findFirst().get();
	}

	public void addcustomer(Customer customer) {
		custlist.add(customer);
		
	}
}
