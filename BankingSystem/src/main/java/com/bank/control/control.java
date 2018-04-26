package com.bank.control;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.model.Contact;
import com.bank.model.Customer;
import com.bank.service.AccountService;

public class control {

	

	final static Scanner sc=new Scanner(System.in);
	
		public static void main(String[] args) {
	
	
			Contact contact = new Contact();
			ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
			
			Customer customer = (Customer) appContext.getBean("Customer");
			System.out.println(customer.getCurrentBalance());
}
}
