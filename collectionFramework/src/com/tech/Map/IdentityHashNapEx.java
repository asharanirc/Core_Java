 package com.tech.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;


public class IdentityHashNapEx {

	public static void main(String[] args) {
		
		//in normal HashMap JVM use equal method to identify duplicate key for content comparison
		HashMap<Integer, String> m= new HashMap();
		
		Integer I = new Integer(10);
		Integer I1 = new Integer(10);
		
		m.put(I, "Rani");
		m.put(I1, "Kaustubh");
	
		System.out.println(m);   //{10=Kaustubh}
		
		//using identity hashMap 
		//in IdentityHashMap jvm will use double equalTo Operator to idetify duplicate key for reference Comparison
		IdentityHashMap<Integer, String> I3= new IdentityHashMap<>();
		
		Integer I4=new Integer(10);
		Integer I5= new Integer(10);
		
		I3.put(I4, "Rani");
		I3.put(I5, "Kaustubh");
		System.out.println(I3);  //{10=Rani, 10=Kaustubh}
	}
}
