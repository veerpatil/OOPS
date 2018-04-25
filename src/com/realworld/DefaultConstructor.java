package com.realworld;

public class DefaultConstructor {

	int id;
	String name;
	
	void Display()
	{
		System.out.println("The id is"+ id +"; The name is: " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DefaultConstructor d = new DefaultConstructor();
     d.Display();
     
	}

}
