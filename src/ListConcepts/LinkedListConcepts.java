package ListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		LinkedList<String> li = new LinkedList<String>();
		li.add("Java");
		li.add("Selenium");
		li.add("Protractor");
		System.out.println("The content of linked list are:" + li);
		li.addFirst("C#");
		li.addLast("Unit Testing");
		System.out.println("The content of linked list are:" + li);
		System.out.println(li.get(4));
		li.set(0, "Veera");
		System.out.println(li.get(0));
		System.out.println("The content of linked list are:" + li);
		//Remove list items
		li.removeFirst();
		li.removeLast();
		System.out.println("The content of linked list are:" + li);
		li.remove(2);
		System.out.println("The content of linked list are:" + li);
		li.addFirst("C#");
		li.addLast("Unit Testing");
		//using for loop
		System.out.println("--------Using For Loop--------");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println("--------Using Advanced For Loop--------");
		for(String s :li)
		{
			System.out.println(s);
		}
		
		System.out.println("--------Using Iterator--------");
		Iterator<String> i = li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("--------Using while--------");
		int num=0;
		while(li.size()>num)
		{
			System.out.println(li.get(num));
			num++;
		}
	}

}
