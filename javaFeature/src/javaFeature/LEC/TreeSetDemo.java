package javaFeature.LEC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javaFeature.Setget.SetGet;

public class TreeSetDemo {

	public static void main(String[] args) {

		ArrayList<Student> t = new ArrayList();

		t.add(new Student(101, "Mayur"));
		t.add(new Student(102, "Ishwar"));
		t.add(new Student(107, "yogesh"));
		t.add(new Student(105, "laxman"));
		t.add(new Student(106, "sajed"));
		t.add(new Student(104, "Ram"));
		t.add(new Student(103, "Manoj"));
		System.out.println(t);

   Collections.sort(t,(s1,s2)->(s1.sId>s2.sId)?1:(s1.sId<s2.sId)?-1:0);
   System.out.println(t);
//    Collections.sort(t,(s1,s2)->(s1.sId -(s2.sId)));
//    System.out.println(t);

    Collections.sort(t, (s1, s2) -> (s1.sName.compareTo(s2.sName)));
    System.out.println(t);

	}
}
