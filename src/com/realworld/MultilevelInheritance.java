package com.realworld;

class Animal 
{
	void eat()
	{
		System.out.println("Eating.....");
	}
}
class Dog extends Animal
{
	void Bark()
	{
		System.out.println("Barking....");
	}
	
}
class Puppy extends Dog
{
	void Weep()
	{
		System.out.println("Weeping.....");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy p = new Puppy();
		p.eat();
		p.Bark();
		p.Weep();
		Dog d = new Dog();
		d.Bark();
		d.eat();
		

	}

}
