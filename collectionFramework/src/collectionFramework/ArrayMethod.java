package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayMethod {

	 public static void main(String[] args) {
		 List l= new ArrayList();
		  l.add("Ram");
		  l.add("Mayur");
		  l.add(10);
		  l.add("10.5");
		  System.out.println(l);  //[Ram, Mayur, 10, 10.5]
		  
		  Iterator itr = (Iterator) l.iterator();
		  while(itr.hasNext()) {
			  Object obj=itr.next();
					  if(obj instanceof String) {
						  String s = (String)obj;
						  System.out.println(s); //Ram Mayur
						  							
					  }
			  
					  else if(obj instanceof Integer) {
						  int x = (int)obj;
						  System.out.println(x); //10  10.5
						 
					  }
		  }
	}
} 
	

