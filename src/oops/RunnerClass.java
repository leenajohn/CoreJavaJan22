package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public Employee(){
		//}
		
		/*Employee emp = new Employee();
		emp.Name="Leena";
		emp.EmployeeId=42423;
		emp.salary=1000;


		//System.out.println(" Employee Name  = "+ emp.Name);
		//System.out.println("EmployeeId = "+ emp.EmployeeId);
        //System.out.println("Employee Salary = "+ emp.salary);
        
        Employee emp1 = new Employee();
		emp1.Name="ZZZ";
		emp1.EmployeeId=4000;
		emp1.salary=10054; */
		
		
		//Employee emp = new Employee("Leena",243345,1000);
		//Employee emp1= new Employee("ZZZ", 44444,2000);
		//emp.PrintName();
		//emp1.PrintName();

	   
		Employee emp3 = new Employee("Sachin",89087);
		//Employee.salary=2000;
		
		//Employee emp4 = new Employee();
		Person per = new Person();
		
		Childclass child1 = new Childclass("Rahul", 20, "Actor");
		child1.display();
		child1.print();
		
		//Employee emp4 = new Employee();
		//Person per= new Person();
		//System.out.println(" Employee Name  = "+ emp1.Name);
		//System.out.println("EmployeeId = "+ emp1.EmployeeId);
        //System.out.println("Employee Salary = "+ emp1.salary);
        
	/*MethodOverloadingExample obj = MethodOverloadingExample();
		obj.sum(4,6);
		obj.sum(4,6,7);
	
	}*/
		

	

/*	private static MethodOverloadingExample MethodOverloadingExample() {
		// TODO Auto-generated method stub
		return null;
	}*/
		
		ICICIBank bank1 = new ICICIBank();
		
		EncapsulationExample obj10 = new EncapsulationExample();
		obj10.setFirstName("Leena");
		System.out.println(obj10.getFirstName());
				
	}
	
}

