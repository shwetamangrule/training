package training.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDoubleInput {

	DoubleInput test = new DoubleInput();	 // Palindrome program to test
	
	@Test
	public void checkDoubleInput()

	{
		assertEquals("true",1,test.Doubleinput("apple"));
		
	}
	@Test
	public void checkReverseStringTwo()

	{
		assertNotEquals("false",1,test.Doubleinput("mango"));
		
	}
}
