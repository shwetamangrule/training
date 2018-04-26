package simplejava.bank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Logger;

public class App {
	final static Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		final Scanner scan = new Scanner(System.in);
		List list = null;
		
		Money money=new Money();
		InterestRate interestRate=new InterestRate();
		Period period=new Period();

		final Set<String> bankname = new HashSet();
		bankname.add("SBI");// adding bank using set
		final Address address = new Address("Sector-20", "405", "800804", "Mumbai");
		final Contact contactbank = new Contact(8348105, 022234, "tuhin@das.com", address);
																								
		LOGGER.info("Bank Address is" + contactbank);

		
		final Customer customer = new Customer("Tuhin", "Das", bankname);
		LOGGER.info("Customer Details are" + customer);
		
		Account account = null;
		account=new CheckingAccount();

				
					LOGGER.info("Enter the amount to deposit");
					float depositAmount = scan.nextFloat();
					if(depositAmount<0)
					{
						LOGGER.info("Please Enter valid amount");
						
					}else
					{
					list=account.deposit(depositAmount);
					List list1 = account.getStatement(list);
					String content = "withraw";
					list1.add(content);
					list1.add(customer.getAccountNumber());
					
					LOGGER.info("Today's list" + list1);
					}
					LOGGER.info("Enter the amount to withdraw");
					float withdrawlAmount = scan.nextFloat();
					
						list = account.withdrawl(withdrawlAmount);
						List list2 = account.getStatement(list);
						 String content = "withraw";
						list2.add(content);
						list2.add(customer.getAccountNumber());
						
						LOGGER.info("Today's list" + list2);
					}
				}
				

			
		

		
		
	