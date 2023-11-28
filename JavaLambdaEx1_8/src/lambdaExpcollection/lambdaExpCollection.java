package lambdaExpcollection;

import java.util.Scanner;
import java.util.TreeSet;

import treeSetcollcetion.B;

public class lambdaExpCollection {

	public static void main(String[] args) {
		
		while(true){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println(" 1.student name \n 2. student id \n 3.student department \n 4.student score \n");
			int x= sc.nextInt();
			
		
			
		  TreeSet<A> t= new TreeSet();
		  
		  switch(x) {
		  case 1: t=new TreeSet (new B());
		  break;
		  
		  case 2:
		 break;
		 
		  case 3:
		 break;
		 
		  case 4:
			break;
			
			default :
				System.out.println("enter correct choice");
				break;
		  }
		  A a=new A();
		  a.setsId(101);
		  a.setsName("sushma");
		  a.setsDepartment("IT");
		  a.setsScore(85);
		  
		  A a1= new A();
		  a1.setsId(102);
		  a1.setsName("sonna");
		  a1.setsDepartment("Math");
		  a1.setsScore(75);
		  
		  A a2= new A();
		  a2.setsId(103);
		  a2.setsName("Pranjal");
		  a2.setsDepartment("Pharmacy;");
		  a2.setsScore(79);
		  
		  A a3= new A();
		  a3.setsId(104);
		  a3.setsName("chaitali");
		  a3.setsDepartment("Pharmacy");
		  a3.setsScore(80);
		  
		  A a4= new A();
		  a4.setsId(104);
		  a4.setsName("Ruruja");
		  a4.setsDepartment("Micro");
		  a4.setsScore(75);
		  
		  A a5= new A();
		  a5.setsId(105);
		  a5.setsName("Mansi");
		  a5.setsDepartment("Computer science");
		  a5.setsScore(82);
		  
		  t.add(a);
		  t.add(a1);
		  t.add(a2);
		  t.add(a3);
		  t.add(a4);
		  t.add(a5);
		  
		  for (A  m:t) {
			  System.out.println(((A) m).getsId());
			  System.out.println(((A) m).getsName());
			  System.out.println(((A) m).getsDepartment());
			  System.out.println(((A) m).getsScore());
			  System.out.println("*************************");
		  }
		  
			
		}
		
	}

}
