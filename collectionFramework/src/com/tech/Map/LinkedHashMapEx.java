package com.tech.Map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		// for HashMap only insertion order is not preserved
		Map<Integer, String> m = new HashMap();
		m.put(6, "Rani");
		m.put(3, "Kaustubh");
		m.put(4, "Rupali");
		m.put(5, "Kajol");
		System.out.println(m);   //{3=Kaustubh, 4=Rupali, 5=Kajol, 6=Rani}
		
		
		//for LinkedHashMap  insertion order is  preserved
		Map<Integer, String> m1= new LinkedHashMap<Integer, String>();
		m1.put(6, "Rani");
		m1.put(3, "Kaustubh");
		m1.put(4, "Rupali");
		m1.put(5, "Kajol");
		System.out.println(m1);  //{6=Rani, 3=Kaustubh, 4=Rupali, 5=Kajol}
	}
}
