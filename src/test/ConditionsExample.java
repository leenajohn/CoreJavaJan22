package test;

import java.util.Scanner;

public class ConditionsExample {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the age");
		int age = scanner.nextInt();
		
		if (age>=18)
		{
			System.out.println("you are eligible for voting");
			
			
		}
		else if (age == 17)
		{
			System.out.println("You are eligible next year");
		}
		else
		{
			System.out.println("you are not eligible for voting");
		}
		 scanner.close();
	}

}
