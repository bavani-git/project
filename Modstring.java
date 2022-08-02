package phase1.mphasis;

public class Modstring {

	public static void main(String[] args) 
	{
		String s="abcd";
		StringBuffer s2= new StringBuffer("xyza");
		s2.reverse();
		s2.append(s);
		System.out.println(s2);
		

	}

}
