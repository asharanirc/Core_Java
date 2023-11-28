package com.tech.Package;

public class B {
 String name;
 int sid;
  public B(String name,int sid)
  {
	  this.name=name;
	  this.sid=sid;
	  
  }
  public static void main(String[]args)
  {
	  B b= new B("asha", 101);
	  B b1= new B("RANI", 102);
	  System.out.println(b.toString());
	  System.out.println("***********");
	  System.out.println(b);
	  //System.out.println(b.getclass().getName()+"@"+Integer.toHexString(15));
  }
  
     
}
