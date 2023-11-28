package com.tech.Constructor;

public class varbleInitialiseThroughCons {
 String name;
 int rollNo;

 varbleInitialiseThroughCons(String name,int rollNo){
	 this.rollNo=rollNo;
	 this.name=name;
 }
  void m1()
  {
	  System.out.println(this.name);
	  System.out.println(this.rollNo);
  }
  public static void main(String[]args) {
	  varbleInitialiseThroughCons v = new varbleInitialiseThroughCons("tech", 101);
	  v.m1();
	  varbleInitialiseThroughCons v1 = new varbleInitialiseThroughCons("yogesh", 101);
	  v1.m1();
  }
}
  


