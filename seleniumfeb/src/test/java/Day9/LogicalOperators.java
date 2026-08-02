package Day9;

import java.util.Scanner;

public class LogicalOperators {
    //&&
    //||
	//!=
	
	//if one or more conditions 
    
	public static void verification() {
	Scanner s = new Scanner(System.in);
    Scanner i = new Scanner(System.in);
    
    
    System.out.println("what is your age ?");
    int age=i.nextInt();
    
    
    
    System.out.println("what is your nationality ?");
    String nationality=s.nextLine();
    

    System.out.println("Do you have passport ?");
    String passport=s.nextLine();
    
    if(age>18 && nationality.equalsIgnoreCase("indian")
    		&& passport.equalsIgnoreCase("yes"))
    {
    	System.out.println("Eligible for job");
    }
	
    
    else 
    {
    	System.out.println("Not eligible for job");
    }
	}

    
    
 public static void main(String[] args) {
	
         
		
		// TODO Auto-generated method stub
		
		
	 LogicalOperators.verification();
	 
	 System.out.println(10!=10);
	 System.out.println(10==10);
	}

}
