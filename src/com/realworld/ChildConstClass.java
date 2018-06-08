package com.realworld;

public class ChildConstClass  extends ConstructorConcepts{

	public ChildConstClass() {
		super.age=10;
		super.mark=20;
		super.name="Veer";
		// TODO Auto-generated constructor stub
	}

	public static void main(String []arg)
	{
		ChildConstClass cs = new ChildConstClass();
		cs.Display();
	}
	
}
