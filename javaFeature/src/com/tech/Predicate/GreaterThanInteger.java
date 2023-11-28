package com.tech.Predicate;

import java.util.function.Predicate;

import com.tech.LambdaEAssi2.Main;

public class GreaterThanInteger {

	public static void main(String[] args) {
		

	Predicate<Integer> p = i->(i>10);
	
	System.out.println(p.test(15));
	System.out.println(p.test(10));
	System.out.println(p.test(30));
	
	
}
	
}
//true
//false
//true
