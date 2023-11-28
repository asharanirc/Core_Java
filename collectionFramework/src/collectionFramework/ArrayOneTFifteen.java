package collectionFramework;

import java.util.ArrayList;  //ArrayListAssignment 1] insert 1-50 element and got even as well odd no
import java.util.Iterator;
import java.util.List;

public class ArrayOneTFifteen {

	public static void main(String[] args)
	{
		
		List l = new ArrayList();
		
		for(int i=1; i<=50; i++)
		{
			l.add(i);
			}
		System.out.println(l);
//		for(Object x:l) {             //using for loop get values and separate it.
//			if(x instanceof Integer)
//			{
//			int i=(Integer) x;	
//			System.out.println(i);
//        }
		
		Iterator<Integer> itr = l.iterator();   //using iterator getting value and separate it .
		while(itr.hasNext()) {                  // simulataneoulsy
			int i = itr.next();
			System.out.println(i);
	}
}
}
   //}
