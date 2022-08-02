package phase1.mphasis;

abstract class vehicle
{
	abstract void run();
	abstract void  stop();
	
	void meth1(int a)
	{
		System.out.println("the A valuu  :"+a);
	}
	void meth2(float b, String c)
	{
		System.out.println(b+c);
	}void meth3(char d,int f)
	{
		System.out.println(d+f);
	}
	
	int speed;
	long distance;
	
	vehicle()
	{
		speed=50;
		distance=40;
	}
	
	vehicle(int a,int b)
	{
		System.out.println("time  : "+b/a);
	}
}

class w2 extends vehicle
{
	void run()
	{
		System.out.println("run.....");
	}
	void stop()
	{
		System.out.println("stop....");
	}
	
	w2()
	{
		super(10,20);
		System.out.println(" default of w2");
	}
	int nof=2,speed=10;
	long distance=20;
	
	void display()
	{
		System.out.println("the value of current speed "+speed);
		System.out.println("the value of current distance "+distance);
		System.out.println("the value of current nof "+nof);
		System.out.println("the value of prarent speed "+super.speed);
		System.out.println("the value of parrent distance "+super.distance);
	}
	
}


public class VehicleDemo {
	public static void main(String[] args)
	{
		w2 ob= new w2();
		ob.meth1(10);
		ob.meth2(2, "manik");
		ob.meth3('d', 1);

		ob.run();
		ob.stop();
		ob.display();
	}

}
