package com.tech.Thread;

public class OverridingStartMethod3 {

	public static void main(String[] args) {
		
		MyThread3 m= new MyThread3();
		{
		m.start();
		
		}
	}
}


         // Start() called  it is highly recommended to  not override start() method bcoz programe
        //   output will produce by only main method.
       // no new thread created and thats why run method is also not activated and run 



// 1] Overload  start() -- no CE but RE saying  IlleagalThreadStateException
// 2] Override  start() -- it called just like normal method and no new thread created
// 3] Overload  run()-- thread class start() always called no argument run(),
//       to overload method we have to called  explicitly
// 4] Override  run()-- if don't override it then thread class run() will be called ,
//        which has empty implementation.. it i highly recommended to override it.
//
