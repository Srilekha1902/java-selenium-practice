package Day5;

public class Employee {

	   String name;
	   double salary;
	
	public Employee()
	{
		System.out.println("Employee object created");
	}
	
  
	public Employee(String name,double salary) {
	this.name=name;
	this.salary=salary;

		System.out.println("Employee details added");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee c=new Employee();
		Employee e=new Employee("Srilkeha",1000000);
		
		System.out.println("Name:" + e.name);
		System.out.println("Name:" + e.salary);
		

	}

}
