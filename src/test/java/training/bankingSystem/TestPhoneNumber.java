package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPhoneNumber {

	PhoneNumber test=new PhoneNumber();
	
	@Test
	public void testPhoneNumber() {
		test.setPhoneNumber("8348105724");
		assertEquals(test.getPhoneNumber(),"8348105724");
		
	}

}
