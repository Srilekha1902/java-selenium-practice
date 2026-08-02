package exceptionClass;

import java.util.Scanner;

public class ExceptionHandling {
	public static void add()
	{
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the first number");
			int a=s.nextInt();
			System.out.println("Enter the Second number");
			int b=s.nextInt();
			int c=a+b;
			System.out.println(c);
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}
	}
	
	public static void sub()
	{
		try
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=s.nextInt();
		System.out.println("Enter the second number");
		int b=s.nextInt();
		int c=a-b;
		System.out.println(c);
	}
		catch(Exception e)
	
		{
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ExceptionHandling.add();
		ExceptionHandling.sub();
		

	}

}
