package SecondaryAssignment;

import java.util.ArrayList;
import java.util.List;

public class SecondaryAss {

	public static void main(String[] args) {

		Trainer tr = new Trainer();
		tr.setCourseName("Java");
		tr.setInstituteName("Java By Nikam Sir");
		tr.setInstituteAdress("Hingewadi, pune");
		tr.setTrainerName("Nikam Sir");

		Student Asha = new Student();
		Asha.setsId(1);
		Asha.setsName("Asha");
		Asha.setEmail("asha19.rc@gmail.com");
		Asha.setAddress("Samarth Nagar, Nashik");
		Asha.setTr(tr);

		Student Rutuja = new Student();
		Rutuja.setsId(2);
		Rutuja.setsName("Rutuja");
		Rutuja.setEmail("rutu54@gmai.com");
		Rutuja.setAddress("Kamatwade Nashik");
		Rutuja.setTr(tr);

		Student Ankita = new Student();
		Ankita.setsId(3);
		Ankita.setsName("Ankita");
		Ankita.setEmail("ankitad@gmail.com");
		Ankita.setAddress("Nimani, Nashik");
		Ankita.setTr(tr);

		Student Rupali = new Student();
		Rupali.setsId(4);
		Rupali.setsName("Rupali");
		Rupali.setEmail("Rupali4545@gmai.com");
		Rupali.setAddress("Satpur, nashik");
		Rupali.setTr(tr);

		List<Student> l = new ArrayList<>();
		l.add(Asha);
		l.add(Rutuja);
		l.add(Ankita);
		l.add(Rupali);

		for (Student x : l) {
			System.out.println(x.getsId());
			System.out.println(x.getsName());
			System.out.println(x.getEmail());
			System.out.println(x.getAddress());
			System.out.println(x.getTr());
		}

	}

}
