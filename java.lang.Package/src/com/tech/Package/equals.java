package com.tech.Package;

public class equals {
 String s;
 int rollno; 
 
	 public equals(String s,int rollno)
	 {
		 this.s=s;
		 this.rollno=rollno;
		 
	 }
	 @Override
	 public String toString()
	 {
	return "equals name=" + s +",String rollno="+rollno;
 }
	 public static void main(String[] args)
	 {
		 equals E=new equals ("Asha", 101);   //  equals method is for content comparison
		 equals E1=new equals("rani", 102);
		 equals E2=new equals("queen",103);
		 
		 System.out.println(E.equals(E));    //true
		 System.out.println(E.equals(E1));   //false
		 System.out.println(E.equals(E2));   //false
	 }
}
