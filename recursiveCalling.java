package com.tech.Constructor;

public class recursiveCalling 
{
 void m1() 
 {
	 this. m2();
	 System.out.println("m1() method");
 }
 void m2()
 {
	this. m1();
	System.out.println("m2() method");
 }
 public static void main(String[] args)
 {
	 recursiveCalling r= new recursiveCalling();
			 r.m1();
	         //r.m2();
 }
 }