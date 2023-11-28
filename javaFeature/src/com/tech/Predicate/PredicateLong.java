package com.tech.Predicate;

import java.util.function.LongPredicate;

public class PredicateLong {

	// To check the numeric no for Long datatype
	
	public static void main(String[] args) {

		LongPredicate p = l -> (l >= 922343);
		
		System.out.println(p.test(14657));
		System.out.println(p.test(-922343));
		System.out.println(p.test(-3676387));
		System.out.println(p.test(922341));
		System.out.println(p.test(922344));
		System.out.println(p.test(922343));

	}
}
//false
//false
//false
//false
//true
//true

