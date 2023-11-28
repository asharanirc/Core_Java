package com.tech.Package;

public class clone implements Cloneable{
	
    public static void main(String[] args) throws CloneNotSupportedException //throws CloneNotSupportedException
    {
		int x=100;
		int y=200;
		
		clone C = new clone();
		clone C1 = (clone)C.clone();
		
		System.out.println(C);
		System.out.println(C1);
		System.out.println(x+"------"+y);
		}

}
