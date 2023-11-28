package com.tech.Predicate;

import java.util.function.Predicate;

public class PredicateLessThan {

	public static void main(String[] args) {

		Predicate<Integer> p = i -> (i <= 25);
		System.out.println(p.test(20));
		System.out.println(p.test(15));
		System.out.println(p.test(27));
		System.out.println(p.test(40));

	}

}
//true
//true
//false
//false
