package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmail {

	Email test=new Email();
	
	@Test
	public void testEmail() {
		test.setEmail("tuhin.a.das@capgemini.com");
		assertEquals(test.getEmail(),"tuhin.a.das@capgemini.com");
		
	}
}
