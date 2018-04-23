package training.bankingSystem;
/*
 * interface that will be used in implementing different types of account
 */
public interface Account {
	
//	
//		Money money;
//		InterestRate interestRate;
//		Period interestPeriod;
		
		public int deposit(int depositAmmount);
//		{
//			return money.getMoney()+depositAmmount;
//		}
		
		public int withdrawl(int withdrawAmmount);
//		{
//			return money.getMoney()-withdrawAmmount;
//		}
		
		public int getBalance();
//		{
//			return money.getMoney()*interestRate.getInterestRate()*interestPeriod.getPeriod()/100;
//		}
	}



