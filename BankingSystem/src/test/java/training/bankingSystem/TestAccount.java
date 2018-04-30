package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bank.model.Account;
import com.bank.repository.AccountRepoImpl;

public class TestAccount {
		
	AccountRepoImpl test=new AccountRepoImpl();
	Account account=new Account();
	
	@Test
	public void test() {
		account.setInterestRate(8);
		account.setInterestPeriod(5);
		account.setBalance(100);
		assertEquals(140,test.getBalance(),2);
		
		
	}
	

}
