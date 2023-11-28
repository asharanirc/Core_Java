package com.tech.RunnableI;

public class GettingAndSettingMainMethod {

	public static void main(String[] args)
	
	{
		MyThread t= new MyThread();
		{
			System.out.println(t.currentThread().getName());
			
			Thread.currentThread().setName("MAIN METHOD");
			
			System.out.println(t.currentThread().getName());
			
		}
		
	}
}


//thread class defines some method to get and set name of method it may provided by JVM ,programer or genarated automaticly
//    1] public final String getName()
//    2] public final String setName(String Name)