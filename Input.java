package phase1.mphasis;

import java.util.Scanner;

public class Input {

	private static Scanner sc;

	public static void main(String[] args) 
	{
	
	sc = new Scanner(System.in);
	System.out.println("ewnter the iterasion");
	int s=sc.nextInt();
	int a[]={1,2,3,4,5};
	for (int i:a)
	{
		s=s+i;
	}
	
	
	System.out.print("entered value is:"+s);

	}

}
