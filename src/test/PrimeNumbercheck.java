package test;

import java.util.Scanner;

public class PrimeNumbercheck {
	
	public static void main(String args[]) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the num");
int num= scanner.nextInt();

       //  int num =100;
         boolean flag = true;
         
         for(int index =2;index <num/2;index++)
         {
        	 int remainder = num%index;
        	 if(remainder ==0) {
        		 flag = false;
        		 break;
        	 }
         }
		//System.out.println("Enter number");
	//	int num = scanner.nextInt();
         if (flag == true) {
        	 System.out.println("The number is prime");
        	 
         }
         else {
        	 System.out.println("The num is not prime");
         }
		
		
	}

}
