package com.tech.Priority;

public class DefautPriority
{
	public static void main(String[] args) 
	{
	MyThread t = new MyThread();
		
	System.out.println(Thread.currentThread().getPriority());   //5
	
	Thread.currentThread().setPriority(3);
	
	System.out.println(Thread.currentThread().getPriority());    //3
	t.start();
}
}
//
//5
//3
//Child thread
//Child thread
//Child thread
//Child thread