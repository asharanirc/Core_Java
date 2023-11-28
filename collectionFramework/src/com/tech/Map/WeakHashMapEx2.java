package com.tech.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapEx2 {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<Integer, String> h = new HashMap();
//		
//		weakhashMapEx1 t= new weakhashMapEx1();
//		h.put(1, "tech");
//		System.out.println(h);   //{1=tech}
//		
//		t= null;
//		System.gc();   //finalize method get called
//		
//		Thread.sleep(3000);
//		System.out.println(h);     //{1=tech} execute after 5000 sec
//		
		
		
		
		//for weakHashMap
		
		WeakHashMap<Integer, String> m= new WeakHashMap<>();
		
		weakhashMapEx1 t1= new weakhashMapEx1();
		m.put(3, "tech");
		System.out.println(m);   //{3=Solution}
		
		t1= null;
		System.gc();    //finalize method get called
		
		Thread.sleep(4000);
		System.out.println(m);    //{3=Solution}
		
		
	}
}
