package phase1.mphasis;

public class consover {
	String name=null;
	int age=0;
	char sec,gender;
	float m1=0.0F,m2=0.0F,m3=0.0F, tmark=0.0F,avg=0.0F;
	
	
	
consover(String s,int ag, char se,char gende,float a, float b, float c)
{
	name=s;
	age=ag;
	sec=se;
	gender =gende;
	
	
	m1=a;
	m2=b;
	m3=c;
	
	tmark=a+b+c;
	avg = tmark/3;
	
	display(tmark,avg);
}

consover(String s,int ag, char se,char gende, float b, float c)
{
	name=s;
	age=ag;
	sec=se;
	gender =gende;
	
	m1=0;
	m2=b;
	m3=c;
	
	tmark=b+c;
	avg = tmark/3;
	
	display(tmark,avg);
}

public void display(float tmark2, float avg2) 
{
	
	
System.out.println("the name is:"+name);
System.out.println("the age is:"+age);
System.out.println("the gender is:"+gender);

		
System.out.println("the marks is:"+m1+"   "+m2+"   "+m2);
		
System.out.println("the total marks is:"+tmark2);
System.out.println("the average  is:"+avg2);

}

public static void main(String[] args) 
{
	consover s1= new consover(" abcd ",20,'a','m',50,50,50);
	consover s2= new consover(" efgh ",21,'a','m',50,50);
	consover s3= new consover(" ijkl ",22,'a','m',50,50);
	consover s4= new consover(" mnop ",23,'a','m',50,50,50);

}

}


	
