package com.tech.Predicate;

import java.util.function.DoublePredicate;

public class predicateFractionalNo
{
	// check given no is fractional or not
	
	public static void main(String[] args) {

		DoublePredicate p = d -> (d > 0);
		System.out.println(p.test(2.3));
		System.out.println(p.test(0));
		System.out.println(p.test(-1.2));
		System.out.println(p.test(5));
		
	}
}

//true
//false
//false
//true
