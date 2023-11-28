package tom.tech.TreeSet;

import java.util.Comparator;

public class MyComparator2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=	(String)o1;
		String s2= (String)o2;
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1>l2) 
		{
			return -1;    //[DDDD, BBB, AA, A]
		}
		else if(l2>l1) 
		{
			return 1;
		}
		return 0;
	}

}
