package training.testing;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import collection.CalculatorException;


/**
 * @author tuhindas
 * inside myCalculator class a normal power(baseToThePower)operation done
 * and it is extending user defined CalculatorException 
 */


public class myCalculator extends CalculatorException {

	private static Logger LOG = Logger.getLogger(myCalculator.class);
	
/**
 * The method implements the power of a  base
 * and returns result of long type
 * also by using user defined CalculatorException
 * we are catching the exceptions and throws those exception 
 */
	
	public long calculator(long base,long power)
	{
		long value=1;
		if(base==0 && power==0)			//validating base and power
		{
			throw new CalculatorException("Both power and base is zero");
		//System.out.println("Both power and base is zero");
		}
		else if(base>9 && power>9)
		{
			throw new CalculatorException("either power and base is greater");
		}
		else if(base<0 || power<0)
		{
			throw new CalculatorException("either base or power is negetive");
		//System.out.println("either base or power is negetive");
		}
			else
			{
				for(int i=1;i<=power;i++)
			{
				value=value*base;
			}
		//System.out.println(value);
			}
		return value;							//returning value
	}
	/**
	 * @author tuhindas
	 *  main method calls calculator which calculate the  result(base to power) 
	 *
	 */
	public static void main(String[] args) 
	{
		BasicConfigurator.configure();
		myCalculator calculator=new myCalculator();
		Scanner scan = new Scanner (System.in);
		LOG.info("enter the base and power ");
		//System.out.println("enter the base and power ");
		long base=scan.nextLong();
		long power=scan.nextLong();
		long result=calculator.calculator(base,power);
		LOG.info(result);
		//System.out.println(result);
	}

}
