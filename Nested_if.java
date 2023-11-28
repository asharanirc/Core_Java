package com.tech.Conditional_Statements;

public class Nested_if {
	public static void main(String []args)
	 {
	  int x=10, y=20, z=15;
	   if (x>y)
	   { 
	      if(x>z)
	      System.out.println("y is the largest no i.e 20");
	      else
	      System.out.println("z is the largest no ");
	   }
	   else
	   {
	      if(y>z)
	      System.out.println("y is the largest no i.e 20");
	      else
	      System.out.println("z is the largest no");
	   }
	 }
	}
