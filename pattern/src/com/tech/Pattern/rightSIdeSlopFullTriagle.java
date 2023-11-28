package com.tech.Pattern;

public class rightSIdeSlopFullTriagle 
{
	
     public static void main(String[] args) 
    {
	    for ( int i=1;  i<=5; i++ )
	    {
		    for (int j=1; j<=i; j++ )
		    {
			System.out.print(" * ");
		    }
		    System.out.println();
	    }
	    
	   for ( int i1=4;  i1>=1; i1-- )
		{
			for (int j=1; j<=i1; j++ )
			{
				System.out.print(" * ");
			}
			   System.out.println();
		}
	}
	
}
 // total output 
// * 
// *  * 
// *  *  * 
// *  *  *  * 
// *  *  *  *  * 
// *  *  *  * 
// *  *  * 
// *  * 
// * 
//    
	


