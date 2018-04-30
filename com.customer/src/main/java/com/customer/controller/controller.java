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
		CustomerService custService=(CustomerService)appContext.getBean("customerService");
		Customer customer=(Customer) appContext.getBean("customer");
		custService.addCustomer(customer);
		System.out.println(custService.viewCustomer());

		Customer customer1=(Customer) appContext.getBean("customer1");
		custService.addCustomer(customer1);
		System.out.println(custService.viewCustomer());

		custService.removeCustomer(customer1);
		System.out.println(custService.viewCustomer());

		Customer customerU=(Customer) appContext.getBean("customerU");
		custService.updateCustomer(customerU);
		System.out.println(custService.viewCustomer());

		
	}

}
