package com.realworld;

 class Person {

	int id;
	String name;
	
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
   
	
	void display()
	{
		System.out.println("The id is:"+ id + "The name is:"+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p = new Person(4, "veer");
			Person p1 = new Person(5, "Sandy");
			p.display();
			p1.display();

	}

}
