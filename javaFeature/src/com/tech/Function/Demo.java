package com.tech.Function;

import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		
		Function<String, Integer> f = a->a.length();
		System.out.println(f.apply("ABC"));
		System.out.println(f.apply("ABCDE"));
		System.out.println(f.apply("ABCFGHI"));
		System.out.println(f.apply("AB"));
	
	}
}
//3
//5
//7
//2
