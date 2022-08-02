package phase1.mphasis;

class emploee
{
	int salary=5000;
	class preemp
	{
		int paid=salary;
		String code="PE01";
		float hike= 0.45F;
		float n;
		
		void new_salary()
		{
			n=paid+paid*hike;
			System.out.println("the new salary:"+n);
		}
		void display()
		{
			System.out.println("salary :"+salary);
			System.out.println("code: "+code);
			System.out.println("hike " +hike );
		}
	}
	
	class tempemp
	{
		int paid=salary;
		String code="TE01";
		float hike= 0.3F;
		float n;
		
		void new_salary()
		{
			n=paid+paid*hike;
			System.out.println("the new salary:"+n);
		}
		void display()
		{
			System.out.println("salary :"+salary);
			System.out.println("code: "+code);
			System.out.println("hike " +hike );
		}
	}
	
void local_emp()
{
class conemp
{
	int paid=salary;
	String code="TE01";
	float hike= 0.3F;
	float n;
	
	void new_salary()
	{
		n=paid+paid*hike;
		System.out.println("the new salary:"+n);
	}
	void display()
	{
		System.out.println("salary :"+salary);
		System.out.println("code: "+code);
		System.out.println("hike " +hike );
	}
}
conemp co =new conemp();
co.new_salary();
co.display();
}


}
public class InnerclassDemo {
	public static void main(String[] args) 
	{
		emploee e = new emploee();
		emploee.preemp p =e.new preemp();
		emploee.tempemp t=e.new tempemp();
		
		p.new_salary();
		p.display();
		
		t.new_salary();
		t.display();
		
		e.local_emp();

	}

}
