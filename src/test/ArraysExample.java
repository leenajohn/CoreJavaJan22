package test;

public class ArraysExample {
	public static void main(String args[]){
		int[] num1 = {20,30,40,50};
		System.out.println("Total number of values are "+ num1.length);
		System.out.println("Value at 3rd position "+ num1[2]);
		System.out.println("Length at last position "+ num1[num1.length-1]);
		
		//String array
		
		String[] name1= {"ABC", "def", "ghi", "jkh"};
		System.out.println("Value at 3rd position is  "+ name1[2]);

	    String name = "Clean India Green India";
	    
	    String[] arrWords = name.split(" ");
	    
	    System.out.println("The string at 3rd position "+ arrWords[3]);
	    System.out.println("Total number of words "+ arrWords.length);
	}

	
	
}
