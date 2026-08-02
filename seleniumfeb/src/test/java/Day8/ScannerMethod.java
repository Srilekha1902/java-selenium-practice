package Day8;

import java.util.Scanner;

public class ScannerMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your First name:");
		String name1=s.nextLine();
		for(int i=name1.length()-1;i>=0;i--)
		{
			System.out.print(name1.charAt(i));
		}
		System.out.println();
		
		System.out.println("Enter your Second name:");
		String name2=s.nextLine();
		for(int i=name2.length()-1;i>=0;i--)
		{
			System.out.print(name2.charAt(i));
		}
		
		s.close();


	}

}
