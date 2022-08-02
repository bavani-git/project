package phase1.mphasis;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("orange");
		al.add("grape");
		al.add("banana");
		al.add("pineapple");
		al.add("goa");
		al.add("Thanjavur");
		al.add("Chennai");
		al.add("cricket");
		al.add("volly ball");
		
		System.out.println("array list"  +al );
		al.remove("volly ball");
		System.out.println("array list"  +al );
		System.out.println("cricket in array list"  +al.contains("cricket") );
		al.remove("Chennai");
		al.remove("apple");
		System.out.println("array list"  +al );
		
		al.remove(4);
		//al.remove(6);
		
		
		
	}

}
