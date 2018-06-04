package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		ar.add(50);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		Employee e1 = new Employee("veer", 31, "QA");
		Employee e2 = new Employee("veera", 32, "KM");
		Employee e3 = new Employee("veer ddd", 33, "DEV");
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		Iterator<Employee> it = emp.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.Dept);
			
		}
		
	}

}
