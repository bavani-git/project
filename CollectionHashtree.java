package phase1.mphasis;

import java.util.TreeSet;

public class CollectionHashtree {

	public static void main(String[] args) {

		TreeSet <String>hr = new TreeSet<String>();
		hr.add("java");
		hr.add("c");
		hr.add("c++");
		hr.add("python");
		hr.add("R");
		hr.add(".net");
		
		System.out.println("  tree set :"+ hr);
		hr.remove("R");
		hr.remove(".net");
		

		System.out.println("  tree set :"+ hr);
		
		hr.add("javascript ");
		hr.add(" sql ");
		hr.add(" c## ");
		
		System.out.println("  tree set :"+ hr);
		
		System.out.println(" is tree contains java :"+hr.contains("java"));
		
		hr.clear();
		
		System.out.println("  tree set :"+ hr);
		
		
		
		
		
		
	}

}
