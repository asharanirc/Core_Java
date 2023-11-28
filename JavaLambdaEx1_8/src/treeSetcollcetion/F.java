package treeSetcollcetion;

import java.util.Comparator;

public class F implements Comparator<A> {

	@Override
	public int compare(A obj1, A obj2) {
		
		return obj1.getsDepartment().compareTo(obj2.getsDepartment());
	}

	


}
