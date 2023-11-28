package treeSetcollcetion;

import java.util.Comparator;

public class E implements Comparator<A> {

	@Override
	public int compare(A obj1, A obj2) {
		
		return obj1.getsName().compareTo(obj2.getsName());
	}

	
}
