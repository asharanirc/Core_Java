package com.tech.Synchronization;

public class MyThread extends Thread
{
		CreateConstructor c;
		String name;
		
		public MyThread(CreateConstructor c, String name) {
			super();
			this.c = c;
			this.name = name;
		}
		public void run()
		{
			c.display(name);
	}
}
