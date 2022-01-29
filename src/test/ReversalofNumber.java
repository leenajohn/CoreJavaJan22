package test;

public class ReversalofNumber {

	public static void main(String args[]) {
	
	int num5 = 452356;
	
	int rev=0;
	
	while (num5>0) {
	
	int remainder =num5%10;
	rev = rev*10+ remainder;
	num5 = num5/10;
	//result = 653254;
	
	}
	System.out.println("The reversed value is "+rev);
	}
	}





