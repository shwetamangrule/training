package com.training.retailerboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.retailerboot.model.Customer;
import com.training.retailerboot.services.CustomerServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private CustomerServiceImpl customerservice;
	
	@RequestMapping("/showallcustomer")
	public List<Customer> showall()
	{
		return customerservice.showall();
	}
	@RequestMapping("/showallcustomer/{customer_name}")
	public Customer getOne(@PathVariable String customer_name)
	{
		return customerservice.getone(customer_name);
	}
	@RequestMapping(value="/addcustomer" ,method=RequestMethod.POST)
	public void addcustomer(@RequestBody Customer customer)
	{
		 customerservice.addcustomer(customer);
	} 
}
