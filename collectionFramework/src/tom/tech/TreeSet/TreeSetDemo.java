package tom.tech.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet(new MyComparator());
		t.add(10);
		t.add(30);
		t.add(40);
		t.add(5);
		System.out.println(t);  //[5,0,30,40]
	}
}
