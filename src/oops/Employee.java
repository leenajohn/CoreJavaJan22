package oops;

public class Employee {
	
	public String Name;
	public int EmployeeId;
	private static int salary= 1000;
	private static String CompanyName="Infosys";
	
	public Employee(String Name,int EmployeeId,int salary) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.salary= salary;
	}
	
	public Employee(String Name,int EmployeeId) {
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		//this.salary= salary;
	}
	public void PrintName() {
		
		System.out.println("Name of the employee is "+this.Name);
	}
		
public void PrintSalary() {
		
		System.out.println("Salary of the employee is "+ Employee.salary);
	}
public static void ChangeCompanyName() {
	Employee.CompanyName= "Infosys Technologies";
}
	
}
