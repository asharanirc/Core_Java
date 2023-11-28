package javaFeature.LEC;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[]args)   {
		 
		ArrayList<studentt> a = new ArrayList();
		a.add(new studentt(101, "Anish", "Math", 85));
		a.add(new studentt(104, "sujal", "Math", 81));
		a.add(new studentt(105, "Priya", "Math", 90));
		a.add(new studentt(103, "vrushi", "Math", 86));
		a.add(new studentt(106, "Soham", "Math", 70));
		a.add(new studentt(102, "sujal", "Math", 74));
		System.out.println("");
		System.out.println(a);
		System.out.println();
		
		Collections.sort(a,(s1,s2)->(s1.sName.compareTo(s2.sName)));
		System.out.println(a);
	
		System.out.println();
		
//		Collections.sort(a,(s1,s2)->(s1.sId>s2.sId)?1:(s1.sId<s2.sId)?-1:0);
//	    System.out.println(a);
//	    System.out.println();
//	    
//	    Collections.sort(a, (s1,s2)->(s1.sScore - s2.sScore));
//	    System.out.println(a);
//	    
	}
	
}
		










