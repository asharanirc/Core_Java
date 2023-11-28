package com.tech.Package;

public class Student {
	
	String name;
	int sid;
	
	public Student (String name,int sid)
	{
		this.name = name;
		this.sid = sid;	
	}

	public static void main(String[] args)
	{
		Student s = new Student("mayur", 101);
		Student s1 = new Student ("Ram", 102);
		
		System.out.println(s.toString());
		System.out.println("*****************");
		System.out.println(s1);
		System.out.println(s.getClass().getName()+"@"+Integer.toHexString(15));
			
	}

}


























