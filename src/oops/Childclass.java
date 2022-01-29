package oops;

public class Childclass extends Person {
	
	String Profession;
	
	public void print() {
		
	}
	public Childclass() {
		System.out.println("Inside Child class default constructor");
	}
	public Childclass(String Name, int Age, String Profession)
	{
		super(Name,Age);
		this.Profession =Profession;
	}
	
	public void println() {
		System.out.println("Inside Child");
		
		
	}
public void display() {
	
	//super.display();
		
		System.out.println("Inside Child class");
		
	}
}
