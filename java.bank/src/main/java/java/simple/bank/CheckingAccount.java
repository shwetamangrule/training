package java.simple.bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class CheckingAccount implements Account {
	final static Logger LOGGER = Logger.getLogger(CheckingAccount.class.getName());
	private Money balance;
	private InterestRate interestRate;
	private Period interestPeriod;
	
	public void setAll()
	{
		balance.setMoney(0);
		interestRate.setInterestRate(5);
		interestPeriod.setPeriod(12);
	}
	
	// to withdraw the amount
	public List withdrawl(float amount) {

		if (balance.getMoney() > 0) {
			
			balance.setMoney(balance.getMoney() - amount);
		}
		LOGGER.info("The balance is" + balance);
		Date date = new Date();
		LOGGER.info("The balance is" + balance);
		List list = new ArrayList();
		list.add(date);
		return list;

	}

	public CheckingAccount()
	{
	}

	// to deposit amount and return a date
	public List deposit(float amount) {
		balance.setMoney(balance.getMoney() + amount);
		LOGGER.info("The balance is" + balance);
		Date date = new Date();
		LOGGER.info("The balance is" + balance);
		List list = new ArrayList();
		list.add(date);
		return list;

	}



	public List<Account> getStatement(List list) {
		List list1 = new ArrayList();
		list1.add(list);
		return list1;
	}

}