package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Repository.CustomerRepo;
import Service.CustomerService;
import model.Customer;

public class controller {

	public static void main(String[] args) {

		 ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
	      	
			CustomerService custService = (CustomerService) context.getBean("CustomerService");
			Customer customer = new Customer(106, "TuhinDas", "Wb", "credit", 101);
			System.out.println(custService.addCustomer(customer));
	}

}
