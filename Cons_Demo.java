package com.tech.Constructor;

public class Cons_Demo {
      int x=20;
      
	public Cons_Demo()
	{
		this(0);
		System.out.println("No args constructor");
	  }
	 public Cons_Demo(int x)
	 {
	 System.out.println(" int type args constructor");
	  }
	 public Cons_Demo( char x ) 
	 {
		 this();
		 System.out.println("character type constructor");
	 }
	// public Cons_Demo(short y)
	// {
	//	 System.out.println("Short type constructor");
	// }
	// public Cons_Demo( long x)
	// {
	//	 System.out.println("long type constructor");
	// }
	 
	 public static void main(String []args)
	 {
		 Cons_Demo c= new Cons_Demo('a');
		
		
	 }
}

	 
