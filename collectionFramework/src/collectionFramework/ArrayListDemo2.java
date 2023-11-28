package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		
		for(int i=1; i<=15; i++) 
		{
			l.add(i);
		}
		System.out.println(l); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
		
		Iterator itr= l.iterator();
		while(itr.hasNext()) {
		int b =	(int) itr.next();
			
			System.out.println(b);
		//	we get object one by one
//			1
//			2
//			3
//			4
//			5
//			6
//			7
//			8
//			9
//			10
//			11
//			12
//			13
//			14
//			15

		}
		
		
	}
}
