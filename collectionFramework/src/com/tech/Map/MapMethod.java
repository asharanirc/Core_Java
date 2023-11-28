package com.tech.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethod {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m= new HashMap();
		m.put(1, "Rani");
		m.put(2, "Kiran");
		m.put(3, "Pooja");
		m.put(4, "Dipak");
		m.put(5, "Renuka");
		System.out.println(m);   //{1=Rani, 2=Kiran, 3=Pooja, 4=Dipak, 5=Renuka}
		
		String s= m.put(1, "Ram");
		System.out.println(m);  // for replace value {1=Ram, 2=Kiran, 3=Pooja, 4=Dipak, 5=Renuka}
		
		Set<Integer> key = m.keySet();
		System.out.println(key);   //[1, 2, 3, 4, 5]  only for t get keys
		
		Collection<String> values = m.values();
		System.out.println(values);   //[Ram, Kiran, Pooja, Dipak, Renuka] only for values
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);  //[1=Ram, 2=Kiran, 3=Pooja, 4=Dipak, 5=Renuka]
		
		String remove = m.remove(2);
		System.out.println(remove);    //Kiran
		
		boolean containsKey = m.containsKey(1);
		System.out.println(containsKey);         //true
		
		boolean containsValue = m.containsValue(m);
		System.out.println(containsValue);            //false
		
		boolean empty = m.isEmpty();
		System.out.println(empty);          //false
		
		int size = m.size();
		System.out.println(size);         //4
		
	
	}
}
