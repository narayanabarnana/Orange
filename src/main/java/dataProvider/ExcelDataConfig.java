package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	
	XSSFWorkbook wb; 
 	XSSFSheet sheet; 
 	public Row row;
 	
 	//creating a constructor 
 	 	public ExcelDataConfig(String excelPath) { 
 	 		 
 	 		try  
 	 		{ 
 	 			 
 	 			File src=new File(excelPath); 
 	 			FileInputStream fis=new FileInputStream(src); 
 	 			wb = new XSSFWorkbook(fis); 
 	 			sheet = wb.getSheetAt(0); 
 	 		 
 	 		} catch (Exception e) { 
 	 			 
 	 			System.out.println(e.getMessage()); 
 	 		} 
 	 		 
 	 	} 
 	 	
 	 	
 	 	//******************************
 	 //To get the sheet names of an excel sheet 
 	 	public List<String> getSheetnames(){ 
 	 		 
 	 		 
 	 		List<String> sheetnames = new ArrayList<String>(); 
 	 		for (int i=0; i<wb.getNumberOfSheets(); i++) { 
 	 			System.out.println("SheetNames are \t"+wb.getSheetName(i)); 
 	 			sheetnames.add( wb.getSheetName(i) ); 
 	 		} 
 	 		 
 	 		return sheetnames; 
 	 		 
 	 	}
 	 	
 	 	
 	 //**************To get Rowcount for a specific excel sheet******************************** 
 	 	 
 	 	public int getRowcont(String sheetName) { 
 	 		sheet=wb.getSheet(sheetName); 
 	 		int rowcount=sheet.getLastRowNum(); 
 	 		return rowcount+1; 
 	 	} 
 	 	//End of GetRowCount method 
 	 	 
 	 	//******************cell data of a specific sheet******************************** 
 	 	public String getCellData(String sheetName,int rowNum,int ColNum) { 
 	 		 
 	 		sheet=wb.getSheet(sheetName); 
 	 		row=sheet.getRow(rowNum); 
 	 		return row.getCell(ColNum).getStringCellValue(); 
 	 	} 
 	 	
 	 	/*    
 		public String getCellData(String sheetName, String colName, int currentSuiteID) method specification :- 
 		)  Return Data inside a particular cell of a particular column 
 		)  sheetName -> name of the excel sheet.  
 		)  colName -> Refer to the ColumnHeader in xls file 
 		)  currentSuiteID -> Refer to the rowNumber Number in xls file 
 	 	 */
 	 	
 	 	public String getCellData(String sheetName,String colName,int currentSuiteID) { 
 	 		 
 	 		sheet=wb.getSheet(sheetName); 
 	 		row = sheet.getRow(0); 
 	 		int colIndex=0; 
 	 		for(int i=0;i<row.getLastCellNum();i++) 
 	 		{ 
 	 			if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)) { 
 	 				colIndex=row.getCell(i).getColumnIndex(); 
 	 			} 
 	 		} 
 	 		 
 	 		if(sheet.getRow(currentSuiteID-1).getCell(colIndex)!=null){ 
 	 			//return sheet.getRow(currentSuiteId-).getCell(colIndex).getStringCellValue().trim(); 
 	 			String data=sheet.getRow(currentSuiteID-1).getCell(colIndex).getStringCellValue().trim(); 
 	 			System.out.println("The data for the specific Sheet " + sheetName + " and for row " + currentSuiteID +  " and for column " + colName + " is " +  data ); 
 	 			return data; 
 	 		} else { 
 	 			return null; 
 	 		} 
 	 		 
 	 	} 
 	 	
 	 	 public String getData(int sheetNumber,int row,int column)  
 	 	 { 
 	 	 	sheet=wb.getSheetAt(0); 
 	 	 	String data=sheet.getRow(row).getCell(column).getStringCellValue(); 
 	 	 	return data; 
 	 	 	 
 	 	 } 
	
	

}
