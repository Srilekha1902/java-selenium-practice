package ExcelHandling;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelOne {
	public static void writeOne(String name)
	{
	 File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+ name +".xlsx");
	
	 try {
		
		 XSSFWorkbook wb=new XSSFWorkbook();
		 XSSFSheet xs=wb.createSheet("Studentlist");
		 
		 Row ro=xs.createRow(0);
		 
		 Cell c0=ro.createCell(0);
		 Cell c1=ro.createCell(1);
		 
		 Row r1=xs.createRow(1);
		 
		 Cell c10=r1.createCell(0);
		 Cell c11=r1.createCell(1);
		 
		 Row r2=xs.createRow(2);
		 
		 Cell c20=r2.createCell(0);
		 Cell c21=r2.createCell(1);
		 
		 Row r3=xs.createRow(3);
		 
		 Cell c30=r3.createCell(0);
		 Cell c31=r3.createCell(1);
		 
		 
		 c0.setCellValue("Name");
		 c1.setCellValue("Course");
		 c10.setCellValue("Sri");
		 c11.setCellValue("Python");
		 c20.setCellValue("Hari");
		 c21.setCellValue("java");
		 c30.setCellValue("Soundarya");
		 c31.setCellValue("UI");
		 		
		 FileOutputStream fo=new FileOutputStream(f);
		 wb.write(fo);
		 
		 wb.close();
		 System.out.println("Done");
		 
		}
	 catch(Exception e) {
		 System.out.println("File is not created and Input is not given");
	 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WriteExcelOne.writeOne("Workdaylist");
	}

}
