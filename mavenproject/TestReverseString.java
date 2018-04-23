package training.testing;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestReverseString {

	ReverseString test = new ReverseString();	 // Palindrome program to test
	
	@Test
	public void checkReverseString()

	{
		assertEquals("nitin si a doog yob ",test.testReverseString("nitin is a good boy"));
		
	}
	@Test
	public void checkReverseStringTwo()

	{
		assertNotEquals("ninit is a good boy", test.testReverseString("nitin is a good boy"));
		
	}
	
}