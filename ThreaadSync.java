package phase1.mphasis;

import practice.SynchronizedMethod;

class sync21 extends Thread
{
	
	sunc21(int a)
	{
		
	}
	public synchronized  void run(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
			fact=fact*i;
		System.out.println("factorial is  :"+fact);
	}
	public synchronized  void run(int a,int b)
	{
		int c=a+b;
		System.out.println("sum is  :"+c);
	}
}
public class ThreaadSync {
	public static void main(String[] args) 
	{
		
		sync21 s1 = new sync21();
		sync21 s2 = new sync21();
		sync21 s3 = new sync21();
		sync21 s4 = new sync21();
		
		
		s1.start(10);
		

	}

}
