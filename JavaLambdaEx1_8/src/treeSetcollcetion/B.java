package treeSetcollcetion;

import java.util.Comparator;

public class B implements Comparator<A>  {


	@Override
	public int compare(A obj1, A obj2) {
		
		return obj1.getsId()-obj2.getsId();
		
	}

	
}
