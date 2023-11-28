package com.tech.Priority;

public class MyThread1 extends Thread
{
@Override
	public void run() 
{
	Thread.currentThread().setPriority(10);
	
	for(int i=1; i<=5; i++) 
	{
		System.out.println("child Thread");
	}
	System.out.println("child Thread priority :" + Thread.currentThread().getPriority());
}
  
}
