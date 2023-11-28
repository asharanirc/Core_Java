package com.tech.Package;

public class A {
 
	public static void main(String[] args)
	{
		A a =new A();
		System.out.println(a);  // internally toString method called and print hashcode
		System.out.println(a.toString());    // toString()
		
	}
}
