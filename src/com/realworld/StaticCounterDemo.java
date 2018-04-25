package com.realworld;

class Counter
{
	//static int count=0;
	 int count=0;
	Counter()
	{
		count++;
		System.out.println(count);
	}
	
	
}
public class StaticCounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}

}
