package javaFeature.methodReference;

public class Demo {

	public static void m1() {
		for (int i = 0; i<=5; i++)	{
			System.out.println("child thread");
		}
	}

	public static void m2() {
		System.out.println("m2() method called");
	}

	public static void main(String[] args) {
		Runnable r = Demo::m1;
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<=5; i++)
		{
			System.out.println("Main thread");
		}
	}

}
