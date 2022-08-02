package phase1.mphasis;

import java.util.LinkedHashMap;

public class CollectionLinkedhashmap {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> s= new LinkedHashMap<>();
		s.put(1,"apple");
		s.put(2,"Green apple");
		s.put(3,"Pine apple");
		s.put(4,"Orange");
		s.put(5,"Grape");
		s.put(6,"banana");
		s.put(7,"goa ");
		s.put(8,"cherry");
		s.put(9,"lichi");
		s.put(10,"water melon");

		System.out.println(s);
		for(Integer key: s.keySet())
		{
			System.out.println("key :"+ key +"   value "+s.get(key));
		}
		
		s.remove(7);
		
		System.out.println(s);
		
		System.out.println(s.containsKey("bavana"));
		System.out.println(s.containsKey("apple"));
		
		System.out.println(s.hashCode());
		s.clear();
		System.out.println(s);

	}

}
