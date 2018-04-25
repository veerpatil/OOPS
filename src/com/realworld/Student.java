package com.realworld;

public class Student {

	
	String name;
	int age;
	int marksOfMaths;
	int marksOfEnglish;
	int marksOfScience;
	int totalMarks=300;
	int obtainMarks;
	float percentage;
	
	void CalculateTotal()
	{
		obtainMarks=marksOfMaths+ marksOfEnglish+ marksOfScience;
	}
	void CalculatePercentage()
	{
		percentage=(float) obtainMarks/ totalMarks* 100;
	}
	float GetPercentage()
	{
		return percentage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s =new Student();
		s.name= "Peter";
		s.age=23;
		s.marksOfEnglish=99;
		s.marksOfMaths=99;
		s.marksOfScience=99;
		s.CalculateTotal();
		s.CalculatePercentage();
		float peterPercentage= s.GetPercentage();
		
		System.out.println("Student: "+ s.name + " of years " + s.age + " has got percentage:" + peterPercentage);

	}

}
