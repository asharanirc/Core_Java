package com.tech.Pattern;

public class diamondUsingOne {

	public static void main(String[] args) {
		
		for (int i = 1, p = 1; i <= 6; i++, p++) {

			for (int j = 6; j >= i; j--) {
        		System.out.print(" ");
			}
			  for (int j = 1; j < i; j++) {
				System.out.print(p + "");
			  }
			   for (int j = 1; j <= i; j++) {
				System.out.print(p + "");
			   }
			System.out.println();
			}
		for (int i1 = 6, p1 = 1; i1 >= 1; i1--, p1++) {
			  for (int j = 0; j <= 6 - i1; j++) {
				System.out.print(" ");
			  }
			   for (int j = 1; j < i1; j++) {
				System.out.print(p1 + "");
			   }
		    	for (int j = 1; j <= i1; j++) {
				System.out.print(p1 + "");
			}
		  System.out.println();
		}
	}

}
