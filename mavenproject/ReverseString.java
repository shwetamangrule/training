package training.testing;

import java.util.Scanner;

public class ReverseString {
	
	public String testReverseString(String input)   	//test case to validate the palindrome logic
	{
		String temp=input;							//initializing the local variable 
		String reverse="";
		String[] words=input.split(" ");			//splitting words from the string
		for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 					//initializing of variable
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		reverseWord = reverseWord + word.charAt(j);		//reverse of each word
	   }
	   reverse = reverse + reverseWord + " ";			//reverse of string
	}
		
		return reverse;
	}
	public static void main(String[] args) {
		ReverseString revstr=new ReverseString();					//creating a palindrome object
		Scanner sc=new Scanner(System.in);					//creating a scanner object
		System.out.println("enter a string");
		try {
			revstr.testReverseString(sc.nextLine());
		} catch (Exception e) {
			
			System.out.println("Only Strings");
		}					
	}

}
