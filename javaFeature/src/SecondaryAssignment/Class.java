package SecondaryAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Class {

	public static void main(String[] args) {
		
		ArrayList<String> l= new ArrayList();
		
		l.add("Durga");
		l.add("Rupali");
		l.add("Rutuja");
		l.add("Kamini");
		l.add("Sushma");
		l.add("Chaitali");
		l.add("Pranjal");
		l.add("Asha");
		l.add("Sonali");
		System.out.println(l);
		
  List<String>l1=l.stream().sorted().collect(Collectors.toList());
				System.out.println(l1);
				
	//List<String>l2=l.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors).toList();
	//System.out.println(l2);
				
				
	}

}
