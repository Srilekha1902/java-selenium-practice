import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class AssignemnentTwoRead {
	//creating excel
	
	public static void excel(String name) {
		File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+ name +".xlsx");
		
		try {
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook();//you should not use f inside while creating because its like reading 
			XSSFSheet xs=wb.createSheet("Movies");
		    Row ro=xs.createRow(0);
			Cell c0=ro.createCell(0);
			
			c0.setCellValue("V1000");
			
			int row=xs.getLastRowNum();//to read
			
			for(int i=0;i<=row;i++)
			{
				String s0=xs.getRow(i).getCell(0).getStringCellValue();	
				System.out.println(s0);
			}
			
			FileOutputStream fo=new FileOutputStream(f);
			wb.write(fo);
			fo.flush();
			wb.close();
			fo.close();
			
			}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignemnentTwoRead.excel("Hobbies");

	}

}
