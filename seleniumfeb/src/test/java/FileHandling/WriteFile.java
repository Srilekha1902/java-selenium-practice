package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class WriteFile {
	public static void write(String name) {
		File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".txt");
		try {
			FileWriter fw=new FileWriter(f);
			fw.write("Hi this is my First write file handling");
			fw.close();
			System.out.println("Done");
		}
		catch(Exception e) {
			System.out.println("Not done");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteFile.write("First one");
	}

}
