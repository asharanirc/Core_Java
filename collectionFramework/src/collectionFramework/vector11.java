package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class vector11 {

	public static void main(String[] args) {
		
		Vector v= new Vector();
		
		for(int i=0; i<10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);    //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		for(Object a:v) 
		{
	    System.out.println(a);
//	    0
//	    1
//	    2
//	    3
//	    4
//	    5
//	    6
//	    7
//	    8
//	    9

}
		Enumeration<Integer> e= v.elements();
		while(e.hasMoreElements()) 
		{
			 int b= e.nextElement();
			System.out.println(b);
//			0
//			1
//			2
//			3
//			4
//			5
//			6
//			7
//			8
//			9

		}
	
	}
}
