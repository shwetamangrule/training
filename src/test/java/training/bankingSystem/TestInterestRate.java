package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterestRate {

	InterestRate test=new InterestRate();
	
	@Test
	public void testInterestRate() {
		test.setInterestRate(8);
		assertEquals(test.getInterestRate(),8);
		
	}
}
