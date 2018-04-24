package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMoney {

	Money test=new Money();
	
	@Test
	public void testMoney() {
		test.setMoney(1000);
		assertEquals(test.getMoney(),1000);
		
	}

}
