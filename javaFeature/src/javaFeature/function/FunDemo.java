package javaFeature.function;

import java.util.function.Function;

public class FunDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> (s.length());
		System.out.println(f.apply("ASHARANI"));                // 8
		System.out.println(f.apply("WELCOME TO WORLD JAVA"));  // 21

		Function<Integer, Byte> f1 = s -> (s.byteValue());
		System.out.println(f1.apply(5679));                 // 47
		System.out.println(f1.apply(890));                 // 122

		Function<Long, Float> f2 = s -> (s.floatValue());
		System.out.println(f2.apply((long) 3762));        // 3762.0
		System.out.println(f2.apply((long) 1));          // 1.0
	}
	
}
