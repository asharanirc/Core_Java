package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LIst {

	public  static void main(String[] args) {
		List<Integer> list1= new ArrayList<>();
		 list1.add(1);
		 list1.add(2);
		 list1.add(3);
		 
		 List<Integer>list2 = new ArrayList<>(list1);
		 list2.remove(1);
		 
		 System.out.println("List 1:" + list1);
		 System.out.println("List 2:" + list2);
		
	}
}
