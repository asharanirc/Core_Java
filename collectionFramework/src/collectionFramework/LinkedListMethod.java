package collectionFramework;

import java.util.LinkedList;

public class LinkedListMethod {

	public static void main(String[] args) {
		
	LinkedList l = new LinkedList();
		for(int i=1; i<=5; i++) {
			l.add(i);
		}
		System.out.println(l); 			//[1, 2, 3, 4, 5,]
		//l.add(3,30);
//		System.out.println(l);			//	[1, 2, 3, 30, 4, 5]
//		l.add("Ram"); 	
//		System.out.println(l);			// [1, 2, 3, 30, 4, 5, Ram]
//		l.addFirst(20);
//		System.out.println(l);			//[20, 1, 2, 3, 30, 4, 5, Ram]
//		l.addLast(25);					
//		System.out.println(l);			//[20, 1, 2, 3, 30, 4, 5, Ram, 25]
//		l.getFirst();
//		System.out.println(l);			//[20, 1, 2, 3, 30, 4, 5, Ram, 25]
//		l.getLast();
//		System.out.println(l);  		//[1, 2, 3, 30, 4, 5, Ram, 25]
//		l.removeFirst();
//		System.out.println(l); 			//[1, 2, 3, 30, 4, 5, Ram]
//		l.removeLast();
//		System.out.println(l);  		//[1, 2, 3, 30, 4, 5, Ram]
//			 	
	   System.out.println(l.getFirst());  		//20
	   System.out.println(l.getLast());			//25
	   System.out.println(l.removeFirst());		//20
	   System.out.println(l.removeLast());		//25
	   
	  
	}
}


	


