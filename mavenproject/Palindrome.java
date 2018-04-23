package training.testing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {

	public int testPalindrome(int number)   //test case to validate the palindrome logic
	{
		
			int temp=number;					//initializing the local variable 

			int rem=0;
			int reverse=0;
			while(number!=0)					//checking the palindrome logic
			{
				rem=number%10;
				reverse=reverse*10+rem;
				number=number/10;
			}
			return reverse;
		
	}
	public static void main(String[] args) {
		Palindrome pal=new Palindrome();					//creating a palindrome object
		Scanner sc=new Scanner(System.in);					//creating a scanner object
		System.out.println("enter a input in Integer");
		try {
			pal.testPalindrome(sc.nextInt());
		} catch (InputMismatchException e) {
			
			System.out.println("Only Numbers");
		}					
	}

}
