package com.bank.service;

import java.util.Map;

import com.bank.model.Customer;

public interface AccountService {

		public Map<String,Customer> addCustomer(Customer customer);
		public float deposit(int depositAmount);
		public float withdraw(int withdrawAmount);
		public float getBalance();
		public int listCustomerId(String customerId);
	
		}


