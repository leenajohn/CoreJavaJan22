package test;

public class LoopsExample {
	
	public static void main(String args[])
	{
	  int	num1 = 1;
	  while(num1 <=10)
	  {
		  if(num1==5) {
			  num1 = num1+1;

				continue;
			}
		  System.out.println(num1);
		  num1 = num1+1;

		 	  }
		for(int count=10; count>=1; count--)
		{
			if (count == 5)
			{
				continue;
				//break;
			}
			System.out.println("inside for loop"+ count);
		}
		//Arrays example
		
		int[] array1 = {20,30,40,50,60};
		
		for(int index = 0; index< array1.length;index++)
		{
			System.out.println("Value inside array"+ array1[index]);
		}
		//for loop 
		for(int var1:array1) {
			System.out.println(var1);
		}
	}

}
