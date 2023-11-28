package com.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class question3 {

	public static void main(String[] args) {
		
		 ArrayList arrayList = new ArrayList();

		 arrayList.add("Monday");
		 arrayList.add("tuesday");
		 arrayList.add("wednesday");
		 arrayList.add("Thursday");
		 arrayList.add("friday");
		 arrayList.add("saturday");
		 arrayList.add("sunday");
		 
		List<ArrayList> list=Arrays.asList(arrayList);
		//System.out.println(list);
	
		Collections.shuffle(list, new Random(2));
		//System.out.println(list);
		Collections.shuffle(list);
	    System.out.println(list);
		
	}
}
