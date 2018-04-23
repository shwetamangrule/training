package training.testing;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		System.out.flush();
		String filename = sc.nextLine();
		
		File inputfile=new File(filename);
		Scanner input=new Scanner(inputfile);
		File outputfile=new File("output.txt");
		PrintWriter writer=new PrintWriter(outputfile);
		String output="";
		while(input.hasNextLine())
		{
			output = input.nextLine();
			writer.println(output);
		}
		input.close();
		
		writer.close();
	}

}