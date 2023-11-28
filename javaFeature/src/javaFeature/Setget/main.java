package javaFeature.Setget;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {

	public static void main(String[] args) {

		SetGet s = new SetGet();
		s.setsId(1);
		s.setsName("mayur");
		s.setsDepartment("Math");
		s.setsScore(87);

		SetGet s1 = new SetGet();
		s1.setsId(2);
		s1.setsName("Ram");
		s1.setsDepartment("Math");
		s1.setsScore(85);

		SetGet s2 = new SetGet();
		s2.setsId(3);
		s2.setsName("Ishwar");
		s2.setsDepartment("Math");
		s2.setsScore(86);

		ArrayList<SetGet> t = new ArrayList();
		t.add(s);
		t.add(s1);
		t.add(s2);

//		for (SetGet x : t) {
//			System.out.println(x.getsId());
//			System.out.println(x.getsDepartment());
//			System.out.println(x.getsName());
//			System.out.println(x.getsScore());
//			System.out.println();
//			}
		Comparator<SetGet> c = (m1,m2)-> (m1.getsId()-m2.getsId());
		
		
		Collections.sort(t, c);
		System.out.println(t);
	}
}
			
