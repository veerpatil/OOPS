package com.realworld;

class student1
{
	int id;
	String name;
	static String college= "KIT";
	
	void addStudent(int id, String n)
	{
		this.id= id;
		this.name=n;
	}
	void display()
	{
		System.out.println("ID is: "+ id + "\n Name is:" + name + "\n College name:"+ college);
	}
}
public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  student1 s = new student1();
	  s.addStudent(100,"Veera");
	  student1 s1 = new student1();
	  s1.addStudent(1001,"Simon");
	  s1.display();
	  s.display();
	  
	  
	}

}
