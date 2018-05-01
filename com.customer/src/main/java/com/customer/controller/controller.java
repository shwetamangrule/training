package com.customer.controller;

import com.customer.model.Address;
import com.customer.model.Customer;
import com.customer.service.CustomerService;

public class controller {

	public static void main(String[] args) {

		ApplicationContext appContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		/*
		 * adding a new customer
		 */
		Address address=(Address) appContext.getBean("address");
		Address address1=(Address) appContext.getBean("addressRetail");
		CustomerService custService=(CustomerService)appContext.getBean("customerService");
		Customer customer=(Customer) appContext.getBean("customer");
		custService.addCustomer(customer);
		System.out.println(custService.viewCustomer());	//view all customer
/*
 * adding another customer
 */
		Customer customer1=(Customer) appContext.getBean("customer1");
		custService.addCustomer(customer1);
		System.out.println(custService.viewCustomer());			//view all customer

		/*
		 * removing a customer
		 */
		custService.removeCustomer(customer1);
		System.out.println(custService.viewCustomer());	//view all customer

		Customer customerU=(Customer) appContext.getBean("customerU");
		custService.updateCustomer(customerU);
		System.out.println(custService.viewCustomer());

	}

}
