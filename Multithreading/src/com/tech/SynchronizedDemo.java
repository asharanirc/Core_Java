package com.tech;

import com.tech.Synchronization.CreateConstructor;
import com.tech.Synchronization.MyThread;

public class SynchronizedDemo {

	public static void main(String[] args) {
		
		CreateConstructor c1 = new CreateConstructor();
		MyThread t= new MyThread(c1, "Rani");
		MyThread t1= new MyThread(c1, "Queen");
		MyThread t2= new MyThread(c1, "Have a Good Day");
		t.start();
		t1.start();
		t2.start();
		
	}
}
//GOOD MORNING
//GOOD MORNING
//GOOD MORNING
//Rani
//GOOD NIGHT
//GOOD MORNING
//GOOD MORNING
//GOOD MORNING
//Have a Good Day
//GOOD NIGHT
//GOOD MORNING
//GOOD MORNING
//GOOD MORNING
//Queen
//GOOD NIGHT
























