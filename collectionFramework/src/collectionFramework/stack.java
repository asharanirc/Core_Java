package collectionFramework;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack s = new Stack();     
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push(10);
		System.out.println(s);  //[a, b, c, d, 10]
		
		System.out.println(s.pop()); 		//10
		
		System.out.println(s.peek()); 		//d
		
		System.out.println(s.empty()); 		//false
		
		System.out.println(s.search("b"));      //if present then print offset but not present then return -1
		
		System.out.println(s.push("r"));       //r

	
		
		
	    
		
		// Stack
//		it is child class of Vector.
//		it is also design for last in first out order.
//		heterogenous objects are allowed.
		
	}
	
}











