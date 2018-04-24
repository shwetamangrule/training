package training.bankingSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestContact {
	
	@Test
	public void testAddContact(){
		
		Contact c = new Contact();
		c.addPhone("8348105724");
		System.out.println(c.getPhone().get(0));
	//assertEquals("testmessage",c.getPhone(),"8348105724");
		
	}

	

}
