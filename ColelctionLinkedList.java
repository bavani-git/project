package phase1.mphasis;

import java.util.Iterator;
import java.util.LinkedList;

public class ColelctionLinkedList {

	public static void main(String[] args) {
		LinkedList<String > s= new LinkedList<>();
		s.add("may");
        s.add("june ");
        s.add("july");
        s.add("august");
        s.add("april");
        s.add("November");
        
        s.addLast("December");
        s.addFirst("january");

        s.add(1,"feburay");
        s.add(2,"March");
        
        s.add(8,"september");
        s.add(9,"october");
        
        s.remove("april");
        s.add(3,"april");
        System.out.println(s);
        
        System.out.println("even------------");
        
        Iterator itr=s.iterator();
        for(int i=0;i<12;i++)
        {
        	if(i%2==0)
        	System.out.print(s.get(i)+" ");
        }
        System.out.println();
        
        System.out.println("odd------------");
        
        for(int i=0;i<12;i++)
        {
        	if(i%2!=0)
        	System.out.print(s.get(i)+" ");
        }
        System.out.println();
        System.out.println("iterator  ------------");
        while(itr.hasNext()) {
            System.out.print( itr.next());
        }
        System.out.println();
        System.out.println("first and last  ------------");
        System.out.println(s.getFirst()+"  "+ s.getLast());

        System.out.println("rwemove birthday"); 
       s.remove("feburay");
        System.out.println(s);
       
        System.out.println(s.peekFirst()+"  "+s.peekLast());
        System.out.println(s.pollFirst()+"  "+s.pollLast());
    		
        System.out.println(s);
        
       System.out.println( s.element());
       
	
	}
	
	

}
