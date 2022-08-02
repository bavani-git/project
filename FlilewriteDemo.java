package phase1.mphasis;

import java.io.File;
import java.io.FileWriter;
import java.io.*;
import java.io.FileReader;

import java.util.Scanner;

public class FlilewriteDemo {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		String ar;
		ar=s.nextLine();
		
		//DataInputStream f = new DataInputStream(System.in);
		
		try
		{
		FileWriter out= new FileWriter("C://Users//91701//Desktop//java_training//solaputha.txt");
		out.write(ar);
		out.append(" this contend was addeed  by me....");
		//out.
		out.close();
		FileReader re =new FileReader("C://Users//91701//Desktop//java_training//solaputha.txt");
		
		char [] array =new char[100];
		re.read(array);
		
		System.out.print(array);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
