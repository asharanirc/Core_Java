package com.tech.Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateCollection {

	public static void main(String[] args) {
		
		List A= new ArrayList();
		List A1 = new ArrayList();
		A1.add(8);
		A1.add(5);
		
		
    Predicate<Collection> p= s->(s.isEmpty());
		System.out.println(p.test(A));       //true
		System.out.println(p.test(A1));     // false
		
	}

	
}
