package com.bank.repository;

import java.util.Map;

import com.bank.model.Customer;

/*
 * interface that will be used in implementing different types of account
 */
public interface AccountRepo {
	
	public Map<String,Customer> addCustomer(Customer customer);
	
	public float deposit(int depositAmount);
	
	public float withdraw(int withdrawAmount);
	public float getBalance();
	public int listCustomerId(String customerId);

	}



