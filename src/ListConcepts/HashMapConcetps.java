package ListConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcetps {
	public static void main(String[]args)
	{
		HashMap<Integer, String> hs= new HashMap<Integer, String>();
		hs.put(1,"Veer");
		hs.put(2,"Vipul");
		hs.put(3,"Jayraj");
		hs.put(4,"Sayali");
		
		System.out.println(hs.get(1));
		for(Entry m: hs.entrySet() )
		{
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		hs.remove(4);
		System.out.println(hs);
		
		HashMap<Integer, Employee> emp = new HashMap<Integer,Employee>();
		Employee e1 = new Employee("veer", 31, "QA");
		Employee e2 = new Employee("veera", 32, "KM");
		Employee e3 = new Employee("veer ddd", 33, "DEV");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		for(Entry <Integer,Employee>e: emp.entrySet())
		{
			int key=e.getKey();
			Employee es=e.getValue();
			System.out.println(key);
			System.out.println(es.age +" " + es.Dept +" "+ es.name);
			
		}
		
	}

}
