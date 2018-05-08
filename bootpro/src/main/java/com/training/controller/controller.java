package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.model.Customer;
import com.training.services.RetailerServiceImpl;

@RestController
public class controller{
	@Autowired
	private RetailerServiceImpl retail;
	
	@RequestMapping(value="/showcustomer",method=RequestMethod.GET)
	public List<Customer> st()
	{
		List<Customer> list=retail.viewCustomer();
		
		return list;
	}
}