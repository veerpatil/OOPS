package com.realworld;

class employee 
{
	float salary=40000;
}
public class Programmer  extends employee{
  int bonus=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Programmer p = new Programmer();
    float total = p.bonus + p.salary;
    System.out.println("The total is:" + total);
    
	}

}
