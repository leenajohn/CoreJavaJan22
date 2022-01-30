package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main (String args[]) {
	
	ArrayList<String> arraylist1 = new ArrayList<String>();

	arraylist1.add("ABC");
	arraylist1.add("Priya");
	arraylist1.add("Reena");
	arraylist1.add("Rohan");
	
	System.out.println("The size of arraylist is "+ arraylist1.size());
	System.out.println(arraylist1);
	
	//System.out.println("The size of array list is "+get(0));
	
	arraylist1.remove(0);
	
	System.out.println("The size of array list is "+arraylist1.size());
	System.out.println(arraylist1);
	arraylist1.set(1, "Leena");
	
	for(int index =0; index<arraylist1.size();index++) {
		System.out.println(arraylist1.get(index));
	}
   	
	
	for (String name:arraylist1) {
		
		System.out.println("name "+name);
	}
	
	Iterator<String> itr = arraylist1.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	// Sort the array list in ascending order
	
	Collections.sort(arraylist1);
	System.out.println(arraylist1);
	
	// reverse sorting
	Collections.reverse(arraylist1);
	System.out.println("Reverse list"+ arraylist1);
	
	
   }
	

	

}
