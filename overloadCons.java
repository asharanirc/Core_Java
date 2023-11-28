package com.tech.Constructor;

public class overloadCons {
	     // int x=20;
	      
		public overloadCons()
		{
			this(0);
	    System.out.println("No args constructor");
		  }
		 public overloadCons(int x)
		 {
		 System.out.println("int type args constructor");
		  }
		 public overloadCons(char x ) 
		{
			 this();
			 System.out.println("character type constructor");
		  }
		 //public overloadCons(short y)
		 //{
			// System.out.println("Short type constructor");
		// }
		 public overloadCons(double x)
		 {
			 System.out.println("long type constructor");
		 }
		 
		 public static void main(String []args)
		 {
			 overloadCons c= new overloadCons('a');
			 overloadCons c1=new overloadCons(10.5);
			
		 }
	}

