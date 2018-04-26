package training.bankingSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bank.model.Contact;

public class TestContact {
	
	final Contact c = new Contact();
	
	@Test
	public void testAddContact(){
				
				c.addPhone("8348105724");
				assertEquals("testmessage",c.getPhone().get(0).getPhoneNumber(),"8348105724");
		
	}

	@Test
	public void testaddMobile(){
				
				c.addMobile("022-456789");
				assertEquals("testmessage",c.getMobile().get(0).getPhoneNumber(),"022-456789");
		
	}
	@Test
	public void testgetEmail(){
				
				c.addEmail("tuhin.a.das@capgemini.com");
				assertEquals("testmessage",c.getEmail().get(0).getEmail(),"tuhin.a.das@capgemini.com");
		
	}

}
