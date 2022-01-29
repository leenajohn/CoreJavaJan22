package test;

public class DataTypesExample {

	public static void main(String args[])
	{
		int num1=20;
		int num2=30;
		int sum = num1+num2;
        int sub = num2-num1;
        int mult= num1*num2;
        float div = num2/num1;
		String result = "The sum of 2 numbers "+ sum;
        
                
	    System.out.println("Sum = "+ result);
	    System.out.println("subtraction = "+ sub);
	    System.out.println("multiplication ="+ mult);
	    System.out.println("division="+ div);
	    
	    String name= "Clean India Green India";
	    System.out.println("Total number of chars "+ name.length());
	    
	    char char1 = name.charAt(0);
	    char char2=name.charAt(name.length()-1);
	    System.out.println("Char at first place  "+ char1);
	    System.out.println("char2  "+char2 );
	    
	    System.out.println("Uppercase  "+name.toUpperCase());
	    System.out.println("Lowercase  "+ name.toLowerCase());
	    
	    
	    
	   
	    
	}
}
