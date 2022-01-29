package test;

import java.util.Scanner;

public class NumCheck {
	public static void main(String args[])
	{
		int num1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		
		if (number%2==0)
		{
			System.out.println("The number is even number");
			
			
		}

		else
		{
			System.out.println("The number is odd number");
		}
		 scanner.close();
	}
  
}
