package com.tech;

import java.util.ArrayList;
import java.util.Collection;

public class quetion5 {

	public static void main(String[] args) {
		
		 
		ArrayList l= new ArrayList();
		l.add("Nashik");
		l.add("Pune");
		l.add("Dhule");
		l.add("Raygadh");
	    System.out.println(l);
		
		ArrayList l1= new ArrayList();
		l1.add("Yeola");
		l1.add("Niphad");
		l1.add("Vaijapur");
		l1.add("vinchur");
		System.out.println(l1);
		
	    l.addAll(l1);
	    System.out.println("joined ArrayList :" +l+l1);
				
	}
}
