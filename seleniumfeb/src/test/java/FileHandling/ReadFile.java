package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {
	public static void readfile(String name) {
		File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".txt");
		try{
			Scanner s=new Scanner(f);
			if(s.hasNext())
			{
				
				System.out.println(s.nextLine());
			}
		}
			catch (Exception e)
			{
				System.out.println(e);
			}
		
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadFile.readfile("First one");
	
	}

}
