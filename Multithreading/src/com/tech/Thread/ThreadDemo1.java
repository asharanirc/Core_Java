package com.tech.Thread;

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		MyThread1 m= new MyThread1();
		m.start();
		
		for(int i=1; i<=5; i++) 
		{
		System.out.println("Main Thread");	
		} 
//		Main Thread
//		Main Thread
//		Main Thread
//		Main Thread
//		child Thread
//		child Thread
//		child Thread
//		child Thread
//		child Thread
//		Main Thread      -  change output everytime when we run 
		
	}
}
