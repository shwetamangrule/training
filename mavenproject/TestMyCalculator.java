package training.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import collection.CalculatorException;


/**
 * @author tuhindas
 * test cases for myCalculator (calculates the result of  power of a base number)
 *
 */
public class TestMyCalculator {

	myCalculator test=new myCalculator();
	
	/**
	 * @author tuhindas
	 * tests a positive result which will match the 
	 * expected and actual result
	 */
	
	@Test
	public void test() {
		assertEquals("true:calculate original result",16,test.calculator(2,4));
	}
	
	/**
	 * tests a exception result 
	 * when base is negative
	 */

	@Test(expected=CalculatorException.class)
	public void test1() {
		
		assertEquals("false:base is negative",16,test.calculator(-2,4));
	}
	/**
	 * tests a exception result 
	 * when base and power both are greater than or equals to 10
	 */
	
	@Test(expected=CalculatorException.class)
	public void test2() {
		assertEquals("false:any of the base and power is greater than 9",16,test.calculator(10,20));
	}
	
	/**
	 * tests a exception result 
	 * when base and power both is zero
	 */
	
	@Test(expected=CalculatorException.class)
	public void test3() {
		assertEquals("false:both base and power is zero",16,test.calculator(0,0));
	}
	/**
	 * tests a exception result 
	 * when power is negative
	 */
	@Test(expected=CalculatorException.class)
	public void test4() {
		assertEquals("false:power is negative",16,test.calculator(9,-8));
	}

}
