package com.tech.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap {

	public static void main(String[] args) {

		List<String> l = new ArrayList();
		l.add("JAVA;");
		l.add(".NET");

		Set<String> s = new HashSet();
		s.add("HTML");
		s.add("ANGULAR");
		s.add("CSS");

		Map<String, Object> m = new HashMap<String, Object>();
		m.put("BACKEND", l);
		m.put("FRONTEND", s);

		Set<String> keys = m.keySet();
		System.out.println(keys);

		Iterator itr = keys.iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key);

			Object obj = m.get(key);
			if (obj instanceof List) {
				List l1 = (List) obj;

				Iterator itr2 = l1.iterator();
				while (itr2.hasNext()) {
					String next = (String) itr2.next();
					System.out.println(next);
				
			}
				Object obj1 = m.get(key);
				if (obj instanceof Set) {
					Set l2 =  (Set) obj;
		
				Iterator itr3 = l2.iterator();
				while (itr3.hasNext()) {
					String n = (String) itr3.next();
					System.out.println(n);

				}
			}
			}
			}
	}
}

		


	
