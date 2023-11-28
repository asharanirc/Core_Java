package collectionFramework;

import java.util.HashSet;

public class HashSetMethod {

	public static void main(String[] args) {
		
		HashSet h =new HashSet();
		
		h.add("sham");
		h.add("Ram");
		h.add("amit");
		h.add("Ram");
		h.add(null);
		h.add(null);
		h.add(10);
		System.out.println(h);
		
		for(Object x:h)              // object is parent of all 
			if(x instanceof String)      
		{
			String s = (String) x;
			System.out.println(s);
		}
		else if (x instanceof Integer)
		 {
			 int t= (int) x;
			 System.out.println(t);
		 }
		 else 
		 {
			 System.out.println(x);
		 }
		 
	}
		
	}

	
	

