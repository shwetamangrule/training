package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckingAccount {

	Money money=new Money();
	
	CheckingAccount chknAcnt=new CheckingAccount();
	
	
	@Test
	public void testdeposit(){
		
				money.setMoney(0);
				int m = money.getMoney() + 100;
				System.out.println(m);
				money.setMoney(m);
				System.out.println(money.getMoney());
				assertEquals("testmessage",money.getMoney(),chknAcnt.deposit(100));
		
	}
	@Test
	public void testwithdrawl(){
		
		
				int m = money.getMoney() - 200;
				System.out.println(m);

				money.setMoney(m);
				System.out.println(money.getMoney());

				assertEquals("testmessage",money.getMoney(),chknAcnt.withdrawl(200));
		
	}
	
	}


