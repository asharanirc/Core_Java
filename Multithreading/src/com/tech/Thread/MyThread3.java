package com.tech.Thread;

public class MyThread3 extends Thread{
    @Override
	public void run() 
    {
		for(int i=1; i<=4; i++) 
		{
			System.out.println("Child Thread");
		}
	}
    public void start()
    {
    	System.out.println("Start() called");
    }
}
