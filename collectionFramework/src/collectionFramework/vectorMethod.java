package collectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class vectorMethod {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		System.out.println(v.capacity());  // Initial Capacity of vector is 10   o/p-10
				
				for(int i=0; i<=10; i++) {
					v.addElement(i);
				}
					
//					v.add(3,9);
//					v.remove(4);
//					v.removeElement(6);
//					v.remove(7);
//					v.removeAll(v);
//					v.get(5);
//					v.elementAt(9);
//					v.firstElement();
//					v.lastElement();
//					v.size();
//					v.capacity();
//					System.out.println(v); 
//					
					Enumeration <Integer> e = v.elements();
					while(e.hasMoreElements()) {
						int x = e.nextElement();
						System.out.println(x);
						
					}
			//		System.out.println(x); 
                                             
					//System.out.println(i);
//					v.add(2, 5);
//					System.out.println(i);
				}
				
	}

	
	
	
	

