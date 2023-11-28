package com.tech.Priority;

public class MyThread extends Thread
{
@Override
	public void run() 
	{
		for(int i=1; i<=4;  i++) 
		{
			System.out.println("Child thread");
		}
	}

	
}
