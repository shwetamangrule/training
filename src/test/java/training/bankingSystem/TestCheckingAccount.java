package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckingAccount {

	Money money=new Money();
	CheckingAccount chknAcnt=new CheckingAccount();
	
	@Test
	public void testdeposit(){
		
				
				//System.out.println(money.getMoney());
				assertEquals("testmessage",600,chknAcnt.deposit(100));
		
	}
	@Test
	public void testwithdrawl(){
		
				
				//System.out.println(money.getMoney());
				assertEquals("testmessage",400,chknAcnt.withdrawl(200));
		
	}
	
	}


