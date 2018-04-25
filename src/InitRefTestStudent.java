class Person
{
	int id;
	String name;
}


public class InitRefTestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.id=4;
		p.name="Veer";
		
		System.out.println("The id is:"+ p.id);
		System.out.println("The name is:"+ p.name);
		
		
		Person p1 = new Person();
		p1.id=50;
		p1.name="Veerkumar Patil";
		
		System.out.println("The id is:"+ p1.id);
		System.out.println("The name is:"+ p1.name);
		
		
		
	}

}
