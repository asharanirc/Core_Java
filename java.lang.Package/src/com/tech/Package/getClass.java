package com.tech.Package;

import java.lang.reflect.Method;

public class getClass {

	public static void main(String[] args)
	{
		int count=0;
		Object obj=new String();
		Class c=obj.getClass();
		 System.out.println("Fully quallified name of class;"+c.getName());
		
		 Method[]m=c.getDeclaredMethods();
		 System.out.println("Method information");
		 for(Method method :m)
		 {
			 count ++;
			 System.out.println(method.getName());
		 }
		 System.out.println("total no of methods are="+count++);
		 
	}
	
}
