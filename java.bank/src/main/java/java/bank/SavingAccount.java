package java.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class SavingAccount implements Account{

	final static Logger LOGGER = Logger.getLogger(App.class.getName());

	 private Money balance;
	 private InterestRate interestRate;
	 private Period interestPeriod;

	 balance.s
	 interestRate.
	/**
	 * @return the balance
	 */
	public float getBalance() {

		return balance;

	}



	/**

	 * @param balance the balance to set

	 */

	public void  {

		this.balance = balance;

	}



	/**

	 * @return the interestRate

	 */

	public InterestRate getInterestRate() {

		return interestRate;

	}



	/**

	 * @param interestRate the interestRate to set

	 */

	public void setInterestRate(InterestRate interestRate) {

		this.interestRate = interestRate;

	}



	/**

	 * @return the interestPeriod

	 */

	public Period getInterestPeriod() {

		return interestPeriod;

	}



	/**

	 * @param interestPeriod the interestPeriod to set

	 */

	public void setInterestPeriod(Period interestPeriod) {

		this.interestPeriod = interestPeriod;

	}



	

	

	public SavingAccount(float balance) {

		super();

		this.balance = balance;

	}

// to withdraw the amount

	public List withdraw(float amount)

	{

		// TODO Auto-generated method stub

		 

		 if(balance>0)

		 {

			 balance=balance-amount;

		 }

		// System.out.println("The balance is"+balance); 

		 Date date = new Date();

		 List list=new ArrayList();

		 list.add(date);

		 return list;

		// System.out.println(date);

          	

		

	}

	public SavingAccount() {

		// TODO Auto-generated constructor stub

	}

// to deposit a particular amount

	public List deposit(float amount) {

		List list=new ArrayList();

		if(amount<0)

		{

			LOGGER.info("Enter valid amount");

		}else

		{

		// TODO Auto-generated method stub

		balance=balance+amount;

		//System.out.println("The balance is"+balance);

		Date date=new Date();

	

		list.add(date);

		}

		return list;

		

		

		

		

	

		

	}

// to retrive the list of statments

public List<Account> getStatment(List list) {

		// TODO Auto-generated method stub

		List list1=new ArrayList();

		list1.add(list);

   return list1;	



  

}

	

		

	}