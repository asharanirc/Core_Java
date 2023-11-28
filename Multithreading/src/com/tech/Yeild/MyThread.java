package com.tech.Yeild;

public class MyThread extends Thread
{
@Override
	public void run() 
{
	Thread.yield();
	for(int i=1; i<=5; i++) 
	{
		System.out.println("child Thread");{
}
	}
}
}
