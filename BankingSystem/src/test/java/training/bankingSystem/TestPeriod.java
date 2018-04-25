package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPeriod {

	Period test=new Period();
	
	@Test
	public void testPeriod() {
		test.setPeriod(12);
		assertEquals(test.getPeriod(),12);
		
	}

}
