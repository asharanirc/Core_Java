package com.tech.Thread;

public class OverloadRunMethod2 {

	public static void main(String[] args) {
		
		MyThread2 m= new MyThread2();
		m.start();
		m.run(10);
	}
}
