package com.tech.Join;

public class ThreadDemo
{
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t= new MyThread();{
			t.start();
			t.join(5000);
			
			for(int i=1; i<4; i++)
			{
				System.out.println("Main Thread");
			}
		}
	}
	
}

//Child Thread
//Child Thread
//Child Thread
//Child Thread
//Child Thread
//Main Thread
//Main Thread
//Main Thread
//output is child thread followed By Main Thread
