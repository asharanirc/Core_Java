package tom.tech.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
		TreeSet t= new TreeSet(new MyComparator2());
		
		t.add("A");
		t.add("AB");
		t.add("AAA");
		t.add("ABC");
		t.add("BBB");
		t.add("DDDD");
		System.out.println(t);
		
	}
}
