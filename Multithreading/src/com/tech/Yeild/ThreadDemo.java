package com.tech.Yeild;

public class ThreadDemo 
{
	public static void main(String[] args)
	{
		
		MyThread t= new MyThread();{
			t.start();
			
			for(int i=1; i<=5; i++)
			{
				System.out.println("Main Thread");
			}
			
		}
	}
	
}
//Main Thread
//Main Thread
//Main Thread
//child Thread
//child Thread
//Main Thread
//Main Thread
//child Thread
//child Thread
//child Thread
// output is changeable every time
