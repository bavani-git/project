package phase1.mphasis;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class collectionHashset {

	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(1);
		l1.add(2);
		l1.add(1.23f);
		l1.add(2.34f);
		l1.add('a');
		l1.add('b');
		l1.add(true);

		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("enter values :");
		
		l2.add(s.nextInt());
		l2.add(s.nextInt());
		l2.add(s.nextInt());
		l2.add(s.nextInt());
		
		System.out.println(" hashset 1 :"+ l1);
		System.out.println(" hashset 2 : "+l2);
				
	}

}
