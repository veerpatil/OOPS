
class Employee
{
	int id;
	float salary;
	String name;
	void InserRecord(int id, float salary, String name) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	void Display()
	{
		System.out.println("The ID is: "+ id);
		System.out.println("The Name is: "+ name);
		System.out.println("The salary is:"+ salary);
	}
	

	
}
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.InserRecord(5,45000, "Sam Deo");
		e.Display();
		
		Employee e1 = new Employee();
		e1.InserRecord(6,35000, "Tom Deo");
		e1.Display();
		
		Employee e2 = new Employee();
		e2.InserRecord(7,55000, "Pom Deo");
		e2.Display();
		
		 new Employee().InserRecord(60,5000, "Anonymus");
	}

}
