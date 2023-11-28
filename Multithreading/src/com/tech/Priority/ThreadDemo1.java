package com.tech.Priority;

public class ThreadDemo1
{
 public static void main(String[] args)
 {
	 MyThread1 t= new MyThread1();
	    t.start();
	    
	    for(int i=1; i<=5; i++) 
	    {
	    	System.out.println("Main Thread");
	    }
}
}
