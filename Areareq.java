package phase1.mphasis;

public class Areareq {

	int area(int c, int d)
	{
	int area=0;
	area= c*d;
	return area;
	}
	public static void main(String[] args) 
	{
		int a=5,b=6;
	Areareq ar=new Areareq();
	int value= ar.area(a,b);
	System.out.println(value);

	}

}
