package exceptionClass;

import java.util.Scanner;

public class UserDefinedException {
	
	public static void atm()
	{
		
			int bal=100;
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter the amount to be withdrwan");
			int withdrwan=s.nextInt();
	   try
       {
		if(withdrwan>bal)
		
		{
		throw new UserDefinedInheritance();
		
	}
       }
		catch(Exception e)
		{
		System.out.println(e);
	    }
	}
       
	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedException.atm();
		
	}

}
 