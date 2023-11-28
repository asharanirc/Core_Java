package com.tech.wrapperClass;

public class Boolean1 {

	public static void main(String[] args)
	{
		Boolean A= new Boolean(false);
		System.out.println(A);            //false
		
		Boolean A1= new Boolean("true");
		System.out.println(A);             //false
		
        Boolean A2= new Boolean("FALSE");
    	System.out.println(A2);            //false
    	
		Boolean A3= new Boolean("True");
		System.out.println(A3);             //true
		
		Boolean A4= new Boolean("tech");
		System.out.println(A4);              //false
	
	}

}
