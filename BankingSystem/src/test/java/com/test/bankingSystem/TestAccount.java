package com.test.bankingSystem;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.bank.model.Address;
import com.bank.model.Contact;
import com.bank.model.Customer;
import com.bank.repository.AccountRepoImpl;
import com.bank.service.AccountService;
import com.bank.service.AccountServiceImpl;
//import training.bankingSystem.Contact;
//import training.bankingSystem.Customer;



public class TestAccount {

	@Test
	public void test() {

		
			
			final AccountService iserv = new AccountServiceImpl();
			final Contact contact = new Contact("234324","56767","abc@gmail.com");
			final Address address = new Address("asd", "13", "asd", "delhi");
			final Customer customer = new Customer("1","ritika", "verma", 2000,address,contact);
			

			final AccountRepoImpl bank = new AccountRepoImpl();
			final Map<String, Customer> map ;
			//assertEquals(0, map.size());
			
			iserv.addCustomer(customer);
			
			assertEquals(1, map.size());

			iserv.listCustomerId(customer.getCustomerId());
		assertEquals(0, 0);

	}

}

