package phase1.mphasis;

import java.io.IOException;

public class Throwchecked 
{
	
	void add (int a, int b) throws IOException,ClassNotFoundException
	{
		if(a==b)
		{
			throw new IOException("velaya jao...");
		}
		else
		{
			throw new ClassNotFoundException("neeyum vela jao");
		}
			
	}
	public static void main(String[] args) 
	{
		Throwchecked x=new Throwchecked();
		int a=10,b=11;
		try
		{
			x.add(a,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
			//System.out.println(e.getMessage());
			
		}
		

	}

}
