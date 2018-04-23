package repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Customer;

public class CustomerRepo implements CustomerInterface {
		
		Customer customer=new Customer();
		Scanner input=new Scanner(System.in);
		List <Customer> customers=new ArrayList<>();

		/* (non-Javadoc)
		 * @see repository.CustomerInterface#addName()
		 */
		@Override
		public List<Customer> addName()
		{
//			customer.setFirstName(input.next());
//			customer.setLastName(input.next());
//			
			customer.setFirstName("Tuhin");
			customer.setLastName("Das");

			customers.add(customer);
			return customers;
		}
	}


