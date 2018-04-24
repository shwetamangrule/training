package training.bankingSystem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestContact {
	
	@Test
	public void testAddContact(){
		
		Contact c = new Contact();
		List <PhoneNumber> phone=new ArrayList<PhoneNumber>();
		PhoneNumber phonee=new PhoneNumber();
		c.addPhone("8348105724");
		phonee.setPhoneNumber("8348105724");
		String actuals=c.getPhone().get(0).getPhoneNumber();
		assertEquals("testmessage",actuals,phonee.getPhoneNumber());
		
	}

	

}
