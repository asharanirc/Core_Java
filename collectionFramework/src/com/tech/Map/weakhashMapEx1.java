package com.tech.Map;

public class weakhashMapEx1
{
     
	public String toString()
	{
		return "weakhashMapEx1";
	}
	
	@Override
	public void finalize() 
	{
		System.out.println("finalize method get called");
	}
}


