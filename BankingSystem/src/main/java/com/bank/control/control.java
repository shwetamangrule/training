package com.bank.control;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.model.Contact;
import com.bank.model.Customer;
import com.bank.repository.AccountRepo;
import com.bank.service.AccountServiceImpl;

public class control {

	

	final static Scanner sc=new Scanner(System.in);
	
		public static void main(String[] args) {
	
	
			Contact contact = new Contact();
			ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
			//AccountService service=(AccountService) appContext.getBean("Customer");
			
			Customer customer = (Customer) appContext.getBean("Customer");
			System.out.println(customer.toString());
			
			AccountServiceImpl account=(AccountServiceImpl) appContext.getBean("secviceAccount");
//			AccountService service=(AccountService) appContext.getBean("account");
//			service.addCustomer(customer);
}
}
