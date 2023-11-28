package com.tech.Predicate;

import java.util.function.Predicate;

import com.tech.LambdaEAssi2.Main;

public class OddNO {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i->(i % 2 !=0);
		System.out.println(p.test(7));
		System.out.println(p.test(4));
		System.out.println(p.test(121));
		System.out.println(p.test(100));
		System.out.println(p.test(0));
	}
}

//true
//false
//true
//false
//false
