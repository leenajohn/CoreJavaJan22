package test;

import java.util.Scanner;

public class SwitchExample {
	public static void main(String args[]) {
	
//	String str1="Clean World Green World";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string");
		String str= scanner.nextLine();

		
	int vowelCount = 0;

for(int index =0;index<str.length();index++) {
	char temp=str.charAt(index);
	
	switch(temp) {
	
	case 'a' :
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'O':
	case 'I':
	case 'U':
		
		vowelCount = vowelCount+1;
        
		break;
	
//default:
	
//	System.out.println("Inside default");
	
	
	}
	
}
System.out.println("The count of vowels are "+ vowelCount);
scanner.close();

}
}
