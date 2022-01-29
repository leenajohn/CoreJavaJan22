package test;

public class ReversalExample {
	public static void main(String args[])
	{
		// reversal of string
		// reversal of Array
		// reversal of number
		
		String str1= "Clean India Green India";
		String revstr1= "";
		for(int index = str1.length()-1;index >=0; index--)
		{
		   revstr1 = revstr1 + str1.charAt(index);
		   
		}
	
	System.out.println("Reversed String "+ revstr1);
	}

}
