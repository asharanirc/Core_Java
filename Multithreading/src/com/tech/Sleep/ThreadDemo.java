package com.tech.Sleep;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t= new MyThread();
		 t.start();
		 System.out.println("Main start");
		// t.sleep(500);
		 t.sleep(3000, 500);
		 System.out.println("Main End");
		 
	}
}

//	Child Thread
//	Main Thread
// main thread execute after some tme as per slepp() time



//Main start
//Child Thread
//Main End
// main end execute after some time
