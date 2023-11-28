package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo3 {

	public static void main(String[] args) {
		
		List l= new ArrayList();
		l.add(30);
		l.add(3);
		l.add("rani");
		l.add(5.5);
		l.add('A');
		l.add(1.0f);
		l.add(7.3d);
		l.add(74563845);
		l.add(true);
		l.add(null);
	//	System.out.println(l);    //[30, 3, rani, 5.5, A, 1.0, 7.3, 74563845, true, null]
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			if(obj instanceof String ) 
			{
				String s =(String)obj;
		//		System.out.println(s);    //rani
			}
			else if(obj instanceof Integer) 
			{
				Integer i= (Integer)obj;
//				System.out.println(i);     
//				30
//				3
//				74563845
			}
			else if(obj instanceof Character) 
			{
			 Character c= (Character)obj;
				System.out.println(c);      //A
			}
		}
		
	}
}
