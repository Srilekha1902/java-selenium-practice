package Revision;

public class EmployeeParentClass {
	public void calculateSalary(int basic) {
		System.out.println("Employee salary is :" + basic);
	}


public class Test{
	public void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeParentClass em=new EmployeeParentClass();
		em.calculateSalary(20000);
		
	
	}
}
}
	

