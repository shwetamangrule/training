package training.bankingSystem;

import java.util.Scanner;

public class CheckingAccount implements Account {
	
	Money money=new Money();
	InterestRate interestRate=new InterestRate();
	Period interestPeriod=new Period();
	
	
	public int deposit(int depositAmmount)
	{
		money.setMoney(100);
		interestPeriod.setPeriod(4);
		return money.getMoney()+depositAmmount;
	}
	public int withdrawl(int withdrawlAmmount)
	{

		return money.getMoney()-withdrawlAmmount;
	}
	
	public int getBalance()
	{
//		Scanner sc=new Scanner(System.in);
//		int interest=sc.nextInt();
//		interestRate.setInterestRate(interest);
		interestRate.setInterestRate(8);
		money.setMoney(100);
		interestPeriod.setPeriod(4);
		return interestRate.getInterestRate()*money.getMoney()*interestPeriod.getPeriod()/100;
	}
}

