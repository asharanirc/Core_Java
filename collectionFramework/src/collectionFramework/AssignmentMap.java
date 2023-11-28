package collectionFramework;

import java.util.ArrayList;    //assignment for getting frontend
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AssignmentMap {
	public static void main(String[] args) {

		List<String> l = new ArrayList();
		l.add("java");
		l.add(".Net");

		Set<String> s = new HashSet();
		s.add("HTML");
		s.add("Angular");
		s.add("CSS");

		Map<String, Object> m = new HashMap<String, Object>();
		m.put("Backend", l);
		m.put("Frontend", s);

		Set<String> keys = m.keySet();
		System.out.println(keys);

		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key);

			Object obj = m.get(key);
			if (obj instanceof List) {
				List l1 = (List) obj;
				System.out.println(l1);

				Iterator<String> itr1 = l1.iterator();
				while (itr1.hasNext()) {
					String l2 = itr1.next();
					System.out.println(l2);
				}
				System.out.println();
				
			}
			if(obj instanceof Set) {
				Set s1= (Set)obj;
				System.out.println(s1);
                                                                                                             
				Iterator<String>itr2=s1.iterator(); 
				while(itr2.hasNext()) {               
					String s2=itr2.next();             
					System.out.println(s2);             
				}                                          
			}
		}     

	}

}
