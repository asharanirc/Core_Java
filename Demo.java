package com.tech.Polymorphism;

public class Demo {
	public void add(int x, int y)

	{
		int c = x + y;
		System.out.println("addition of x & y");
	}

	public void add(int x, int y, int z) {
		int c = (x + y + z);
		System.out.println("the additon of x,y & z=" + c);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.add(10, 20, 30);
	}
}
