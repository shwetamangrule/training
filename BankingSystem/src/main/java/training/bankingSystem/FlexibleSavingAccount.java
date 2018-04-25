package training.bankingSystem;

import java.util.Scanner;

public class FlexibleSavingAccount implements Account {
	
	Money money;
	InterestRate interestRate;
	Period interestPeriod;

	public int deposit(int depositAmmount)
	{
		
		return money.getMoney()+depositAmmount;
	}
	public int withdrawl(int withdrawlAmmount)
	{
		return money.getMoney();
	}
	
	public int getBalance()
	{
		Scanner sc=new Scanner(System.in);
		int interest=sc.nextInt();
		interestRate.setInterestRate(interest);
		return interestRate.getInterestRate()*money.getMoney()*interestPeriod.getPeriod()/100;
	}

}
