package phase1.mphasis;

public class Method {

	int even(int a)
	{
	if(a%2==0)
		return 1;
	else
		return 0; 
		
	}
	public static void main(String[] args)
	{
	Method m=new Method();
	int number=31;
	System.out.println("the value is ");
	int result=m.even(number);
	if(result==1)
		System.out.println("even");
	else
		System.out.println("odd ");
	}

}
