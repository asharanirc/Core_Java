package com.tech.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class KeyValueUseIterator 
{

	public static void main(String[] args) {
		
		HashMap<Integer, String> h= new HashMap();
		h.put(1, "queen");
		h.put(2, "King");
		h.put(3, "Prince");
		h.put(4, "princes");
		h.put(5, "angel");
		System.out.println(h);   //{1=queen, 2=King, 3=Prince, 4=princes, 5=angel}
		
		Set keys = h.keySet();
		System.out.println(keys);   //[1, 2, 3, 4, 5]
		Collection<String> values= h.values();
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()) 
		{
			int key= itr.next();
			System.out.println(key);
//			1
//			2
//			3
//			4
//			5
		}
      Iterator<String>itr1=	values.iterator();
      while(itr1.hasNext())
      {
    	String value =  itr1.next();
    	System.out.println(value); 
    	
//    	queen
//    	King
//    	Prince
//    	princes
//    	angel
//    	null

      }
     
			
		}
		
	}

