package phase1.mphasis;

abstract class mnc
{
	mnc()
	{
		System.out.println(" the constructor of MNC");
	}
	abstract  void abs1();
	abstract void abs2();
	
	void display()
	{
		System.out.println("the NORMAL METHOD");
	}
}

abstract class infosys  extends mnc
{
	void abs1()
	{
		System.out.println("the implementation of a abstact class ");
	}
}

class Hello  extends infosys
{
	/*void abs1()
	{
		System.out.println("the implementation of a stact class 2 type 2");
	}*/
	void abs2()
	{
		System.out.println("the implementation of a abstact class 2");
	}
	
	void show()
	{
		System.out.println("the NORMAL CLASS OF HELLO");
	}
}

public class AbstractionDemo {
	public static void main(String[] args) 
	{
		mnc ob =new Hello();
		ob.abs1();
		ob.abs2();
		ob.display();
		
		Hello ob1= new Hello();
		ob1.show();
		

	}

}
