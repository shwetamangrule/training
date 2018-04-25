package training.bankingSystem;

import java.util.Scanner;
/**
 * Saving account class implements all the operation of saving account
 */

public class SavingAccount implements Account {
	
	Money money;
	InterestRate interestRate;
	Period interestPeriod;
/*
 * (non-Javadoc)
 * @see training.bankingSystem.Account#deposit(int)
 */
	public int deposit(int depositAmmount)
	{
		
		return money.getMoney()+depositAmmount;
	}
	/*
	 * (non-Javadoc)
	 * @see training.bankingSystem.Account#withdrawl(int)
	 */
	public int withdrawl(int withdrawlAmmount)
	{
		return money.getMoney()-withdrawlAmmount;
	}
	/*
	 * (non-Javadoc)
	 * @see training.bankingSystem.Account#getBalance()
	 */
	public int getBalance()
	{
		Scanner sc=new Scanner(System.in);
		int interest=sc.nextInt();
		interestRate.setInterestRate(interest);
		return interestRate.getInterestRate()*money.getMoney()*interestPeriod.getPeriod()/100;
	}
}
