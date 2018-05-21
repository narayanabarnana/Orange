package factory;

import dataProvider.ConfigDataProvider;
import dataProvider.ExcelDataConfig;

public class DataProviderFactory {
	
	
	
	
	public static ConfigDataProvider getConfig() throws Exception 
	{ 
	
			ConfigDataProvider config=new ConfigDataProvider(); 
			return config; 
			
	} 
	
	public static ExcelDataConfig getExcel() 
	{ 
	
	ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\Nbarnana\\Desktop\\TestData\\TestSelenium.xlsx"); 
	return excel; 
		 
	} 

	

}
