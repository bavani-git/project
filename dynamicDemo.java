package phase1.mphasis;

class shaper
{
	//int a,b;
	int result;
	public void area(int a,int b)
	{
		System.out.println("");
	}
}

class rectangle extends shaper
{
	public void area(int a,int b)
	{
		result=a*b;
		System.out.println("area of rectangle is:"+ result);
	}
}
class trianlge extends shaper
{
	public void area(int a,int b)
	{
		result=a*b/2;
		System.out.println("area of triangle is:"+ result);
	}
}

class squre extends shaper
{
	public void area(int a,int b)
	{
		result=a*b;
		System.out.println("area of squre is:"+ result);
	}
}

class rombus extends shaper
{
	public void area(int a,int b)
	{
		result=a*b/2;
		System.out.println("area of rombus is:"+ result);
	}
}


public class dynamicDemo {
	public static void main(String[] args) 
	{	
		shaper s;
		s = new rectangle();
		s.area(10, 10);
		
		s =new trianlge();
		s.area(10, 10);
		
		s=new squre();
		s.area(10, 10);
		
		s= new rombus();
		s.area(10,10);
		
		
	
	}

}
