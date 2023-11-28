package com.tech.Synchronization;

public class CreateConstructor {

	public synchronized void display(String Name) 
	{
		for (int i=1;i<=3; i++)
		{
			System.out.println("GOOD MORNING");
			
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Name);
		System.out.println("GOOD NIGHT");
	}
}
