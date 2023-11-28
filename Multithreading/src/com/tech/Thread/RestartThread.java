package com.tech.Thread;

public class RestartThread {

	public static void main(String[] args) {
		
	MyThread1 m = new MyThread1();
	{
		m.start();
		System.out.println("start mathod called");
		m.start();   //we can't restart the same thread no CE but RE saying IlleagalThreadStateException
	}
}
}