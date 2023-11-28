package tom.tech.TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) 
	{
	Integer I1= (Integer)o1;
	Integer I2= (Integer)o2;
	
	//we can write like this also
	
//	return I1.compareTo(I2);   //[5, 10, 30, 40]
//	return I2.compareTo(I1);    //[40, 30, 10, 5]
//  return I1.compareToq1	(I1)	;    //[10]
	return I2.compareTo(I2);     //[10]
    
//	if(I1>I2) 
//	{
//		return -1;
//	}
//	else if(I1<I2) {
//		return 1;
//	}
//	else {
//	
//		return 0;
//	}

}
}
       //[40, 30, 10, 5]