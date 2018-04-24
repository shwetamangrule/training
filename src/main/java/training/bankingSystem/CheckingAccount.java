package training.bankingSystem;

import java.util.Scanner;

public class CheckingAccount implements Account {
	
	Money money=new Money();
	InterestRate interestRate=new InterestRate();
	Period interestPeriod=new Period();
	
	
	public int deposit(int depositAmmount)
	{
		
		return money.getMoney()+depositAmmount;
	}
	public int withdrawl(int withdrawlAmmount)
	{

		return money.getMoney()-withdrawlAmmount;
	}
	
	public int getBalance()
	{
		Scanner sc=new Scanner(System.in);
		int interest=sc.nextInt();
		interestRate.setInterestRate(interest);
		return interestRate.getInterestRate()*money.getMoney()*interestPeriod.getPeriod()/100;
	}
}

