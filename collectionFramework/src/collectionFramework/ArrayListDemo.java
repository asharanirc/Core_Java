package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
	

		ArrayList l= new ArrayList();
		System.out.println(l.size());
		
		l.add(1);             //add(object e)
		l.add(3);
		l.add(4);
		l.add(5);
//		System.out.println(l); //[1, 3, 4, 5] 
		
//		
//		//add(int index,obj element)
//		l.add(1, 6);           
//		System.out.println(l); //[1, 6, 3, 4, 5]  
//		
//		//addAll(collection c)
//		l.addAll(l);           
//		System.out.println(l);//[1, 6, 3, 4, 5, 1, 6, 3, 4, 5]  
		
		//addAll(int index,Collection c)
//		l.addAll(1, l);          
//		System.out.println(l); //[1, 1, 6, 3, 4, 5, 1, 6, 3, 4, 5, 6, 3, 4, 5, 1, 6, 3, 4, 5]
//	    l.addAll(2, l);
//		System.out.println(l);[ //1, 6, 1, 6, 3, 4, 5, 1, 6, 3, 4, 5, 3, 4, 5, 1, 6, 3, 4, 5]
//		l.addAll(3, l);
//		System.out.println(l); //[1, 6, 3, 1, 6, 3, 4, 5, 1, 6, 3, 4, 5, 4, 5, 1, 6, 3, 4, 5]
//		l.addAll(4, l);
//		System.out.println(l); //[1, 6, 3, 4, 1, 6, 3, 4, 5, 1, 6, 3, 4, 5, 5, 1, 6, 3, 4, 5]
//		l.addAll(5, l);
//		System.out.println(l); //[1, 6, 3, 4, 5, 1, 6, 3, 4, 5, 1, 6, 3, 4, 5, 1, 6, 3, 4, 5]
                                                                                             	
		
//      heterogenous Object are allowed
		l.add(3);
		l.add("rani");
		l.add(5.5);
		l.add('A');
		l.add(1.0f);
		l.add(7.3d);
		l.add(74563845);
		l.add(true);
		l.add(null);
		System.out.println(l);  //[1, 3, 4, 5, 3, rani, 5.5, A, 1.0, 7.3, 74563845, null]
		
		//size of Arraylist
		System.out.println(l.size());    //13
		
		ArrayList l1= new ArrayList();
		System.out.println(l1.size());    //0
		
		//new capacity = (cc*3/2)+1
	}
}
