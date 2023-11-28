package com.tech.Pattern;

public class ReverseHillPattern {

	public static void main(String[] args) {	
		
		for(int i=10; i>=1; i--) 
		{
			 for(int j=0; j<=9-i; j++ )
		  {
			  System.out.print(" ");
		  }
		  for(int k=1; k<=i; k++) 
		  {
			  System.out.print("* ");
		  }
		  System.out.println();
}
}
}

