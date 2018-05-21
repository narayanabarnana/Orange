package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		
		XSSFWorkbook wb = null;
		XSSFSheet sh1=null;
		
		
		//File file =    new File("C:\\Users\\Nbarnana\\Desktop\\Zurich\\Zurich_TCOE Testing_ CarePoint_Query log.xlsx");
		//load the file
		FileInputStream fis=new FileInputStream("C:\\Users\\Nbarnana\\Desktop\\Zurich\\Zurich_TCOE Testing_ CarePoint_Query log.xlsx");
		
		// Load workbook
		 wb=new XSSFWorkbook(fis);
		
		//Load Sheet
		sh1=wb.getSheetAt(0);
		
		int r=sh1.getLastRowNum();
		System.out.println("Row count is " + r);
		
				
		
		for(int i=0;i<=r;i++)
		{
			int c=sh1.getRow(i).getLastCellNum();
			System.out.println("Column count for Row " + i + " is " + c);
			
			for(int j=0;j<=c;j++)
			{
				System.out.println("Data for Row " + i + " and Column " +  j  + " is "  + sh1.getRow(i).getCell(j));
			}
			
		}
		
		
		

	}

}
