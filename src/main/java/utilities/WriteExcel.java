package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		
		XSSFWorkbook wb;
		XSSFSheet sh;
		
		//Load the excel file
		FileInputStream fis=new FileInputStream("C:\\Users\\Nbarnana\\Desktop\\Zurich\\Selenium.xlsx");
		
		//Load the Workbook
		wb=new XSSFWorkbook(fis);
		
		//Load the sheet
		sh=wb.getSheetAt(0);
		
		//Row count of a sheet
		int rc=sh.getLastRowNum();
		System.out.println("Row count is " + rc);
		
		//for(int i=0;i<=rc;i++)
		//{
			//int cc=sh.getRow(i).getLastCellNum();
			//System.out.println("Column count is " + cc);
			
			//for(int j=0;j<=cc;j++)
			//{
				
				//if(sh.getRow(i).getCell(j).equals(""))
				//{
					//createCell will  create column
					//setCellValue will set the value
					
					sh.getRow(2).createCell(2).setCellValue("Narayana");
					
					
				//}
				
			//}
			
			

			
		//}
		

		 FileOutputStream fout=new FileOutputStream("C:\\Users\\Nbarnana\\Desktop\\Zurich\\Selenium.xlsx");
		 
		// finally write content 
		wb.write(fout);
		
		//close the file
		fout.close();
		
		System.out.println("Updated succesfull");
		

	}

}
