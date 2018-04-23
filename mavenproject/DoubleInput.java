package training.testing;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class DoubleInput {

	private static Logger LOG = Logger.getLogger(DoubleInput.class);
	
	public int Doubleinput(String input)
	
	{
		BasicConfigurator.configure();
	
		int flag=0;
		
		final int inputLength=input.length();
		
		for (int i = 0; i < inputLength; i++)
		{

	        for (int j = i+1; j < inputLength; j++)
	        {

	            if(input.charAt(i)==input.charAt(j))
	            {
	                flag++;
	                
	                break;

	            }
	        }   
	    }
		
			return flag;
		
	}
	
	public static void main(String[] args) {
		
		final Scanner scan=new Scanner(System.in);					//creating a scanner object
		//System.out.println("enter a string");
		LOG.info("enter a string ");
		final String input=scan.nextLine();
		scan.close();
		
		DoubleInput test=new DoubleInput();
		
		test.Doubleinput(input);
		
	}

}
