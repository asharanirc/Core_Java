package com.tech.RunnableI;

public class MyThread1 implements Runnable{

	@Override
	public void run() 
	{
		for(int i=1; i<=4;  i++) 
		{
			System.out.println("Child thread");
		}
	}

	
}
