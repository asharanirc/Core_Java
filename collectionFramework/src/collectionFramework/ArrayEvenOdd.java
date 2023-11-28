package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		
		List l= new ArrayList();
		
		for(int i=1; i<=50; i++) 
		{
		l.add(i);
			
			Iterator itr =l.iterator();
			while(itr.hasNext())
			{
			int m =(int)itr.next();       
			if(m%2!=0) 
			{
			System.out.println(m);
			}
		
		}
	}
}
}
