package com.tech.wrapperClass;

public class intClass 
{
     public static void main(String[] args)                                          
	{
		int x=1000;
		
		Integer I1=new Integer("tech");  //  showing NumberFormatException            
		   System.out.println(I1);
		   Integer I2=new Integer("10");
		   System.out.println(I2);
		   Double I3= new Double(10.5);                                                       
		   System.out.println(I3);
		   Double I4=new Double("10.5");
	       System.out.println(I4);
	       
	}
 }
	