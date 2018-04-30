package com.customer.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.customer.model.Address;
import com.customer.model.Customer;
import com.customer.service.CustomerService;

public class controller {

	public static void main(String[] args) {

		ApplicationContext appContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Address address=(Address) appContext.getBean("address");
		Address address1=(Address) appContext.getBean("addressRetail");
		Customer customer=(Customer) appContext.getBean("customer");
		Customer customer1=(Customer) appContext.getBean("customer1");
		CustomerService custService=(CustomerService)appContext.getBean("customerService");
		
		custService.addCustomer(customer);
		custService.addCustomer(customer1);
		System.out.println(custService.viewCustomer());
		
	}

}
