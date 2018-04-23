package training.testing;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StringGen {

	static Scanner scanner = new Scanner (System.in);

	public static <T> void printArray(int count)
	{
		List<T> list = new ArrayList<T>();
		
		System.out.println("Input:");
		for (int i = 0; i < count; i++) 
		{
			T value = (T) scanner.next();
			list.add(value);
		} 

		for (T t : list) 
		{
			System.out.println(t);
		}

}
	

	public static <T> void main(String[] args) 
	{
		int count=0;

		System.out.print("Enter the number of values you want to enter: ");

		try
		{
			count=scanner.nextInt();

		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input, please try again");
		}
		
		StringGen string=new StringGen();
		string.printArray(count);
	} 

}
