package training.testing;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class testPalindrome {


	@Test
	public void checkpalindrone()

	{
		Palindrome test = new Palindrome(); // Palindrome program to test

		// assert statements
		assertEquals("true",121,test.testPalindrome(121));
		assertNotEquals("false", 12345, test.testPalindrome(12345));
		
	}

	
}