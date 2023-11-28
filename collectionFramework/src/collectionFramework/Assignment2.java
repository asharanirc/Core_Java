package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {

		List<String> State = new ArrayList();
		State.add("Nashik");

		List<List<String>> country = new ArrayList();
		country.add(State);

		Set<String> state1 = new HashSet();
		state1.add("orlando");

		Set<Set<String>> country1 = new HashSet();
		country1.add(state1);

		Map<String, Object> world = new HashMap<String, Object>();
		world.put("India", country);
		world.put("America", country1);

		Set<String> keys = world.keySet();
		System.out.println(keys);

		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key);

			Object obj = world.get(key);
			if (obj instanceof Set) {
			 Set l = (Set) obj;
				System.out.println(l);

				Iterator<Set<String>> itr2 = l.iterator();
				while (itr2.hasNext()) {
					Set<String> l1 = itr2.next();
					System.out.println(l1);

					Iterator<String> itr3 = l1.iterator();
					while (itr3.hasNext()) {
						String s2 = itr3.next();
						System.out.println(s2);
					}
					System.out.println(); 
				}
			
			Set<String> keys1 = world.keySet();
			System.out.println(keys1);

				Iterator itr1 = keys1.iterator();
				while (itr1.hasNext()) {
						String key1 = (String) itr1.next();
						System.out.println(key1);

					// Object obj1 = world.get(key1);
					if (obj instanceof List) {
						List s = (List) obj;       
						System.out.println(s);    
						 
						Iterator<Set<Set<String>>> itr4 = s.iterator();
						while (itr4.hasNext()) {
							List s2 = (List) itr4.next();
							System.out.println(s2);
           
//							Iterator<Set<String>> itr5 = s.iterator();
//							while (itr5.hasNext()) {
//								List s4 = (List) itr5.next();
//								System.out.println(s4);
								
								Iterator <String>itr6 = s2.iterator();
								while (itr6.hasNext()) {
									String s5 =  itr6.next(); 
									System.out.println(s5);
								
							}
						}
					}
				}
	}
	}
}
}
		
	


