package com.tech.SortedMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMethods {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> t= new TreeMap<>();
		t.put(1, "Rani");
		t.put(4, "Deepak");
		t.put(3, "Surekha");
		t.put(6, "Meena");
		t.put(5, "Shital");
	//	t.put(A, "RRR");    // we can't use Heterogeneous type data
	//	t.put(null, "AAAA");   //no CE but RE i NullPointerException so we can't use null as key
		System.out.println(t);  //{1=Rani, 3=Surekh, 4=Deepak, 5=Shital, 6=Mina} Insertion order is not preserved
		
		
		Integer firstKey = t.firstKey();
		System.out.println(firstKey);    //1
		
		Integer lastKey = t.lastKey();
		System.out.println(lastKey);    //6
		
		SortedMap<Integer, String> headMap = t.headMap(4);
		System.out.println(headMap);     //{1=Rani, 3=Surekh} print below provided key 
		
		
		SortedMap<Integer, String> tailMap = t.tailMap(4);
		System.out.println(tailMap);    //{4=Deepak, 5=Shital, 6=Mina} print provided key and above all key
		
		SortedMap<Integer, String> subMap = t.subMap(3, 5);
		System.out.println(subMap);     //{3=Surekha, 4=Deepak} print key in between provided keys
		
		
		Comparator c = t.comparator();
		System.out.println(c);  
	}
}
