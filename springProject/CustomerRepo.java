package repo;

import entity.customer;

public class CustomerRepo {
	
	customer cust=new customer();

	public String addName()
	{
		String customerName=cust.getFirstName()+cust.getLastName();
		return customerName;
	}
}
