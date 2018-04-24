package training.bankingSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCustomer {

Customer test=new Customer();
	
	@Test
	public void testFirstName() {
		test.setFirstName("Tuhin");
		assertEquals(test.getFirstName(),"Tuhin");
		
	}
	@Test
	public void testLastName() {
		test.setLastName("Das");
		assertEquals(test.getLastName(),"Das");
		
	}

}
