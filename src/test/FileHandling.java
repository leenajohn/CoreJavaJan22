package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	
	public static void main(String args[])
	{
		String str1="Order Confirmation 12366677777773434";
		
		FileOutputStream file1;
		try {
			file1 = new FileOutputStream("results.txt");
			file1.write(str1.getBytes());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
