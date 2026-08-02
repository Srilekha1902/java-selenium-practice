package Revision;

public class ManagerChildClass extends EmployeeParentClass {
	
		public void calculateSalary(int basic) {
			System.out.println("Manager salary is:" + ( basic + 5000 ));
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		EmployeeParentClass em=new ManagerChildClass();
		em.calculateSalary(20000);

	}

}

