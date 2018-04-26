package training.bankingSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bank.model.Address;

public class TestAddress {

	Address test=new Address();
	
	@Test
	public void testStreet() {
		test.setStreet("Sector-20");
		assertEquals(test.getStreet(),"Sector-20");
		
	}
	@Test
	public void testHouseNumber() {
		test.setHouseNumber("405");
		assertEquals(test.getHouseNumber(),"405");
		
	}
	@Test
	public void testzipCode() {
		test.setZipCode("804800");
		assertEquals(test.getZipCode(),"804800");
		
	}
	@Test
	public void testcity() {
		test.setCity("Mumbai");
		assertEquals(test.getCity(),"Mumbai");
		
	}

}
