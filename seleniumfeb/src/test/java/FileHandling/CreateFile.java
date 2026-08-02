package FileHandling;

import java.io.File;


public class CreateFile {
    //Text file 
	//There are more types of file name 
	//handled by class
	public static void create(String name) {
	//passing argumnts (method overloading concept) 
		
		 File f =new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".txt");
		 //here in the name that is concatinated becaue we can give whatever the file name we want like user defined 
		 //tc01.txt is the file name that we need after copying path write the file name 
		 //before try you should create object and copy the path from src/test/resources 
		 try {
			 
			if(f.createNewFile()) //and in the try block only you should put loop condition
			{
				System.out.println("file is created");
			}
			else {
				System.out.println("file exists");
			}
		 }
		
			catch(Exception e) {
		}
		 
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateFile.create("First one"); 
	}

}
