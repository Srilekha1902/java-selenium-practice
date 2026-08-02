package ExcelHandling;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void write(String name)
	{
	File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+ name +".xlsx");
    try {
    	
    	XSSFWorkbook xs=new XSSFWorkbook();
    	XSSFSheet sh=xs.createSheet("Fruits");
    	
    	Row ro=sh.createRow(0);
    	Cell c0=ro.createCell(0);
    	Cell c1=ro.createCell(1);
    	c0.setCellValue("Names");
    	c1.setCellValue("course");
    	
    	Row r1=sh.createRow(1);
    	Cell c10=r1.createCell(0);
    	Cell c11=r1.createCell(1);
    	
    	c10.setCellValue("Sri");
    	c11.setCellValue("python");
    	
    	
    	FileOutputStream fo = new FileOutputStream(f);
    	xs.write(fo);
    	
    	fo.close();
    	xs.close();
    	
    	System.out.println("Done");
    }
	
    catch (Exception e)
    {
        e.printStackTrace();
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WriteExcel.write("Workdaylist");
	}

}
