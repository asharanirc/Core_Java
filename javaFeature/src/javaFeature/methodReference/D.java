package javaFeature.methodReference;

public class D {

	public static void main(String[] args) {

		C c = B::new;
		B b = c.set();

	}

}
