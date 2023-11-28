package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);   //[10, 30, 40, 50]
		
		
		//by using interator
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) 
		{
			int x= itr.next();
		//	System.out.println(x);  
//			ouptput
//			10
//			30
//			40
//			50
		}

		
		//by using for each loop
		for(Integer a:l) 
		{
			System.out.println(a);
//			ouptput
//			10
//			30
//			40
//			50
		}
		
		}
}
