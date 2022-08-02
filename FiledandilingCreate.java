package phase1.mphasis;

import java.io.File;

public class FiledandilingCreate {

	public static void main(String[] args) 
	{
	try
	{
		File file= new File("C://Users//91701//Desktop//java_training");
		if(file.createNewFile())
		{
			System.out.println("creasted");
		}
		if(file.exists())
		{
			System.out.println("file exit");
			System.out.println("file name  :"+file.getName());
			System.out.println("get class"+file.getClass());
			System.out.println("address :"+file.getParent());
			System.out.println("space :"+file.getUsableSpace());
			
			
			boolean b = file.delete();
			if(b==true)
				System.out.println(" cleared file");
			else
				System.out.println(" veliya jao");
		}
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}

	}

}
