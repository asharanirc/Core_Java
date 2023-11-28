package com.tech.Predicate;

import java.util.function.Predicate;

public class predicateEven {

	public static void main(String[] args) {

		// To check given no is even or not
		
		Predicate<Integer> p = i -> (i % 2 == 0);
		
		System.out.println(p.test(3));
		System.out.println(p.test(4));
		System.out.println(p.test(11));
	}

	
	
	
}
//false
//true
//false




