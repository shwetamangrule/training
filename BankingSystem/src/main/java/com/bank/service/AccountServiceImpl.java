package com.bank.service;

import java.util.Map;

import com.bank.model.Customer;
import com.bank.repository.AccountRepo;
import com.bank.repository.AccountRepoImpl;

public class AccountServiceImpl implements AccountService {

public AccountRepo repo;
	
	@Override
	public float deposit(int depositAmount) {
		
		return repo.deposit(depositAmount);
	}
	@Override
	public float withdraw(int withdrawAmount) {
		return repo.withdraw(withdrawAmount);
	}

	@Override
	public float getBalance() {
		return repo.getBalance();
	}
	@Override
	public Map<String, Customer> addCustomer(Customer customer) {
		return repo.addCustomer(customer);
	}
	@Override
	public int listCustomerId(String customerId) {
		return repo.listCustomerId(customerId);
	}

}