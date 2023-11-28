package com.tech.Demo;

public class PalindromeNumber 
{
	public static void main(String [] args)
	{
		int start=100;
		int end=200;
		for (int i=start; i<=end; i++)
		
		{
			if (isPalindrome(i))
			{ System.out.println(i+" ");
			
			
			}
		}
	}
 public static boolean isPalindrome(int number)
 {
	 int originalNumber=number;
	 int reversedNumber=0;
	 while(number>0)
	 {
		 int remainder=number%10;
		 reversedNumber=reversedNumber*10+remainder;
		 number/=10;
	 
	 }
	 return originalNumber == reversedNumber;
 }
}
