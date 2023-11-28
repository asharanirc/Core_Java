package com.tech.RunnableI;

public class ThreadDemo {

	public static void main(String[] args)
	{
		
		MyThread1 m= new MyThread1();
		
			Thread t= new Thread();
			t.start();
			
			for(int i=1; i<=5; i++) 
			{
				System.out.println("Main thread");	
			}
		
	}
}
