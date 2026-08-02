package ExcelHandling;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
	public static void createexcel(String name) {
		File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources"+ name +".xlsx");
		try {
			XSSFWorkbook xs=new XSSFWorkbook();
			XSSFSheet sh=xs.createSheet("Fruits");
			FileOutputStream fo=new FileOutputStream(f);
			xs.write(fo);
			xs.close();
			fo.close();
			System.out.println("Done");
	 
	}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateExcel.createexcel("Workdaylist");
	}

}
