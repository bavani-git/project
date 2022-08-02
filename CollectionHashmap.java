package phase1.mphasis;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CollectionHashmap {

	public static void main(String[] args) 
	{
		HashMap h= new HashMap();
		h.put(1,"vanakam");
		h.put(2, "maple");
		h.put(3," chennai la eruthu");
		
		System.out.println(h.get(2));
		h.remove(2);
		System.out.println("enga kanum   "+h);


		LinkedHashMap<Integer, String> s= new LinkedHashMap<>();
		s.put(1, "onu");
		s.put(2, "rendu");
		s.put(3, "moonu");
		
		for(Integer key:s.keySet())
		{
			System.out.println(s.get(key));
		}
		
		
	}

}
