import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedHashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentRead {
	public static void read(String name) {
		File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".xlsx");
		
		try{
			
			FileInputStream fi=new FileInputStream(f);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet xs=wb.getSheet("Patient Details");
			int row=xs.getLastRowNum();
			wb.close();
			
			LinkedHashMap<String,String> count=new LinkedHashMap<String,String>(); 
			{
				for(int i=1;i<=row;i++)
				{
				  Row row1= xs.getRow(i);
				  
				  String s0=row1.getCell(0).getStringCellValue();
				  String s1=row1.getCell(1).getStringCellValue();
				  String s2=row1.getCell(2).getStringCellValue();
				  
		          count.put(s0,s1 + "|"+s2);
				  
				}
				
			}
		   for(String a: count.keySet())
		   {
			   System.out.println(a+"->"+count.get(a));
		   }
		   wb.close();
		  fi.close();
		    	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentRead.read("Workdaylist");
	}

}
