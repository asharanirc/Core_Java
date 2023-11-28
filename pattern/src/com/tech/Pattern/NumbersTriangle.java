package com.tech.Pattern;

public class NumbersTriangle {
 
	public static void main(String []args) {
	
		for(int i=1, p=1; i<=5; i++ ) 
		{
			for(int j=i;j<=5;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<i ;j++)
			{
				System.out.print(p+"");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(p+"");
			}
			System.out.println();
		}
		
	}
	
}
