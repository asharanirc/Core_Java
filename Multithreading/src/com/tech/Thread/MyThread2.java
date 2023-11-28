package com.tech.Thread;

public class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1; i<=3; i++) 
		{
			System.out.println("Child Class");
		}	
	}
	public void run(int x)
	{
		for(int i=1; i<3; i++) 
		{
			System.out.println("Overloaded Run() Method");
			
		}
	}
}

//Overloaded Run() Method
//Overloaded Run() Method
//Child Class
//Child Class
//Child Class