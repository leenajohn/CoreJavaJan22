package test;

public class ExceptionHandling {
	
	public static void main(String args[])
	{
		
		int num=10;
		
		int[] array1 = {5,10,15,29};
		
		try {
		int result = num/0;
		System.out.println(array1[10]);
		}
		catch(ArithmeticException e) {
			
			System.out.println("Inside Arithmetic Exception");
			
		}catch(ArrayIndexOutOfBoundsException e) {
		
		System.out.println("Inside ArrayIndexOutOfBoundsException");
		
}finally {
	System.out.println("Inside Finally");

}
System.out.println("after try and catch block");
}
}