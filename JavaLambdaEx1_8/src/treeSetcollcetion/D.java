package treeSetcollcetion;

import java.util.Comparator;

public class D  implements Comparator<A> {


	@Override
	public int compare(A obj1, A obj2) {
	
		return obj1.getsScore()-obj2.getsScore();
	}

}
