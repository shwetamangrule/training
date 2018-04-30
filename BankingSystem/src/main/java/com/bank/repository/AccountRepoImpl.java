package com.bank.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bank.model.Account;
import com.bank.model.Customer;

public class AccountRepoImpl implements AccountRepo {
	
	Account account=new Account();
	
	Scanner sc=new Scanner(System.in);
	Map<String,Customer> map=new HashMap<String, Customer>();
	
	public Map<String, Customer> getMap() {
		return map;
	}
	@Override
	public float deposit(final int depositAmount) {
		return account.getBalance()+depositAmount;
	}
	@Override
	public float withdraw(final int withdrawAmount) {
		
		return account.getBalance()-withdrawAmount;
	}
	@Override
	public Map<String,Customer> addCustomer(final Customer customer) {

		map.put(customer.getCustomerId(), customer);
		return map;

	}
	public AccountRepoImpl()
	{
		System.out.println("i am in");
	}
	@Override
	public float getBalance() {
		System.out.println("Enter interestRate:");
		final int interest=sc.nextInt();
		account.setInterestRate(interest);
		System.out.println("Enter interestPeriod:");
		final int interestPeriod=sc.nextInt();
		account.setInterestPeriod(interestPeriod);
		System.out.println("Enter balance:");
		final int balance=sc.nextInt();
		account.setBalance(balance);
		return account.getBalance()+(account.getInterestRate()*account.getBalance()*account.getInterestPeriod()/100);

	}
	@Override
	public int listCustomerId(final String customerId) {
		if (map.containsKey(customerId)) {
			final Customer customerDetails = map.get(customerId);
			//Contact contact=new Contact();
			System.out.println(customerDetails.getFirstName()+" " +customerDetails.getLastName());
			System.out.println("Current balance is: "+customerDetails.getCurrentBalance());
		} else {
			System.out.println("No such user");
		}
		return 0;
	}


}
