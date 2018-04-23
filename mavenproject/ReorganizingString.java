package training.testing;

import java.util.Scanner;

public class ReorganizingString {
	
	public static void main(String[] args) {

	char temp;
	String str="";
	System.out.println("Enter a string:");
	Scanner sc=new Scanner(System.in);
	String inputString=sc.next();
	char [] inputarr=inputString.toCharArray();
	int count=0;
	int length=inputString.length();
	
	for(int i=0;i<length-1;i++)
	{
		if(inputarr[i]!=inputarr[i+1])
		{
			System.out.println(inputString);
			break;

		}
	} 
for(int i=1;i<length-1;i++)
	{
		if(inputarr[i]==inputarr[i+1])
		{
			count++;
			continue;
		}
		else {
			temp=inputarr[i];
			inputarr[i]=inputarr[i+1];
			inputarr[i+1]=temp;
			str=String.valueOf(inputarr);
		}
		//System.out.println(count);
	} 

		if(count!=3)
		{
			for(int j=0;j<length-1;j++) {
				if(str.charAt(j)==str.charAt(j+1))
				{
					System.out.println("null");
					break;
				}
				else
				{
					System.out.println("output:"+str);
					break;
				}
			}
		}
		else 
			{
				System.out.println(str);
			}
	 
}
}