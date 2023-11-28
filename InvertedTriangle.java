package com.tech.Demo;

public class InvertedTriangle
{

	public static void main(String[] args) 
    {
//int rows = 5;
//for stars
    for ( int i=0; i<=5; i++ )
    {
	for (int j=0; j<=i; j++ )
	{
		System.out.print("  *  ");
		
	}
	System.out.println();
	System.out.println();
    }
// for inverted stars
	 {
		 
     for (int i=5; i<=i; i--)	 
     {
     for ( int j=1; j<=i; j++)
     { 
    	 System.out.print( "  *  ");
     }
       System.out.println();
       System.out.println();
     }
	 }
    }
    
}
