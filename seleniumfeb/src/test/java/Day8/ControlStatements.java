package Day8;

import java.util.Scanner;

public class ControlStatements {
	
	public static void olaPay() 
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the payment mod:");
		String pay=s.nextLine();
		
		if(pay.equalsIgnoreCase("COD"))
				{
			System.out.println("The payment made through Cod");
				}
		else if(pay.equalsIgnoreCase("GPAY")) {
			System.out.println("The payment made through GPAY");
		}
			
		else if(pay.equalsIgnoreCase("Phonepe")) 
			{
				System.out.println("The payment made through Phonepe");
				
			}
		else if(pay.equalsIgnoreCase("BHIM")) {
			System.out.println("The payment made through BHIM");
			
		}
		else {
			System.out.println("The payment unsuccessful");
		}
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControlStatements.olaPay(); 
	}

}
