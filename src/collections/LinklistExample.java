package collections;

import java.util.LinkedList;

public class LinklistExample {
	
	public static void main(String args[]) {
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("Leena");
		list1.add("Donald");
		list1.add("Jack");
		list1.add("Jack");
		list1.addFirst("Rahul");
		
		// adding data in index 2
		
		list1.add(2,"Bharat");
		
		
		System.out.println("List is shown as below"+ list1);
		
		for(int index=0; index <list1.size();index++)
		{
			System.out.println(list1.get(index));
		}
		
	}

}
