import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AssignmentWrite {
	public static void write(String name) {
		File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".xlsx");
		
		try {
			XSSFWorkbook wb=new XSSFWorkbook();
			XSSFSheet xs=wb.createSheet("Patient Details");
			
			Row ro=xs.createRow(0);
			
			Cell c0=ro.createCell(0);
			Cell c1=ro.createCell(1);
			Cell c2=ro.createCell(2);
			
			Row r1=xs.createRow(1);
			
			Cell c10=r1.createCell(0);
			Cell c11=r1.createCell(1);
			Cell c12=r1.createCell(2);
			
			Row r2=xs.createRow(2);
			Cell c20=r2.createCell(0);
			Cell c21=r2.createCell(1);
			Cell c22=r2.createCell(2);
			
			Row r3=xs.createRow(3);
			Cell c30=r3.createCell(0);
			Cell c31=r3.createCell(1);
			Cell c32=r3.createCell(2);
			
					
		   Row r4=xs.createRow(4);
		   Cell c40=r4.createCell(0);
		   Cell c41=r4.createCell(1);
		   Cell c42=r4.createCell(2);
		   
		   Row r5=xs.createRow(5);
		   Cell c50=r5.createCell(0);
		   Cell c51=r5.createCell(1);
		   Cell c52=r5.createCell(2);
		   
		   Row r6=xs.createRow(6);
		   Cell c60=r6.createCell(0);
		   Cell c61=r6.createCell(1);
		   Cell c62=r6.createCell(2);
		   
		   Row r7=xs.createRow(7);
		   Cell c70=r7.createCell(0);
		   Cell c71=r7.createCell(1);
		   Cell c72=r7.createCell(2);
		   
		   Row r8=xs.createRow(8);
		   
		   Cell c80=r8.createCell(0);
		   Cell c81=r8.createCell(1);
		   Cell c82=r8.createCell(2);
		   
		   
		   Row r9=xs.createRow(9);
		   
		   Cell c90=r9.createCell(0);
		   Cell c91=r9.createCell(1);
		   Cell c92=r9.createCell(2);
		   
		   Row r10=xs.createRow(10);
		   Cell c100=r10.createCell(0);
		   Cell c101=r10.createCell(1);
		   Cell c102=r10.createCell(2);
		   
		   c0.setCellValue("Patient name");
		   
		   c1.setCellValue("Patient id");
		   
		   c2.setCellValue("DOB");
		   
		   c10.setCellValue("John wick");
		   c11.setCellValue("001");
		   c12.setCellValue("19/02/1999");
		   c20.setCellValue("Abhram");
		   c21.setCellValue("002");
		   c22.setCellValue("24/05/1870");
		   c30.setCellValue("Lincoln");
		   c31.setCellValue("003");
		   c32.setCellValue("25/07/1989");
		   c40.setCellValue("Jenny");
		   c41.setCellValue("004");
		   c42.setCellValue("26/02/1967");
		   c50.setCellValue("Iron");
		   c51.setCellValue("005");
		   c52.setCellValue("22/03/1999");
		   c60.setCellValue("Dick");
		   c61.setCellValue("006");
		   c62.setCellValue("21/05/1989");
		   c70.setCellValue("Rick");
		   c71.setCellValue("007");
		   c72.setCellValue("20/08/1995");
		   c80.setCellValue("Ronaldo");
		   c81.setCellValue("008");
		   c82.setCellValue("19/02/1979");
		   c90.setCellValue("Ponting");
		   c91.setCellValue("009");
		   c92.setCellValue("20/06/1978");
		   c100.setCellValue("Donald");
		   c101.setCellValue("010");
		   c102.setCellValue("30/05/1980");
		   
		   FileOutputStream fo=new FileOutputStream(f);
		   wb.write(fo);
		   fo.close();
		   wb.close();
		   
		   System.out.println("File created");
		 
		   	
		}
		catch(Exception e) {
			 e.printStackTrace(); // use this to get exactly what error is
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentWrite.write("Workdaylist");

	}

}
