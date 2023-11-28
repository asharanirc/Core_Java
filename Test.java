package com.tech.Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.m1();
		a.m2();
		System.out.println();
		System.out.println("******************");

		B b = new B();
		b.show();
		b.m1();
		b.m2();
		System.out.println();
		System.out.println("******************");

		C c = new C();
		c.show();
		c.display();
		c.m1();
		c.m2();
		System.out.println();
         System.out.println("******************");

		D d = new D();
		d.d1();
		d.display();
		d.show();
		d.m1();
		d.m2();
		System.out.println();
		System.out.println("******************");

		E e = new E();
		e.e1();
		e.display();
		e.show();
		e.m1();
		e.m2();
		System.out.println();
		System.out.println("******************");

		// parent reference hold child object

		A a1 = new B();
		a1.m1();
		a1.m2();
		System.out.println();
		System.out.println("******************");

		A a2 = new C();
		a2.m1();
		a2.m2();
		System.out.println();
		System.out.println("******************");

		B b1 = new C();
		b1.m1();
		b1.m2();
		b1.show();
		System.out.println();
		System.out.println("******************");

		C c2 = new E();
		c2.display();
		c2.show();
		c2.m1();
		c2.m2();
		System.out.println();
		System.out.println("******************");

	}

}
