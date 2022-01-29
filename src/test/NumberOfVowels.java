package test;

public class NumberOfVowels {

	public static void main(String args[])
	{
		String str1 = "Clean India Green India";
		int result =0;
		
		for(int index =0; index < str1.length();index++)
		{
			if (str1.charAt(index)=='a' ||str1.charAt(index)=='e' ||
		str1.charAt(index)=='i'||str1.charAt(index)=='o' ||str1.charAt(index)=='u'){
			result++;
			System.out.println("result" + result);
		}
		}
	}
}
