package testCases;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.StartPage;
import utilities.*;

public class ChallengingDOM extends BaseClass{
	
	static StartPage startpage;
	
	@SuppressWarnings("static-access")
	
	@Test(enabled=false,groups="Smoke")
	public static void Challenging_DOM() throws Exception
	{
		
		logger = extent.createTest("ChallengingDOM"); 
		startpage=PageFactory.initElements(driver, StartPage.class);
		Highlight.highLightElement(driver, startpage.ChallengingDOM);
		
		//Clicking on Challenging DOM
		startpage.ChallengingDOM.click();
		
		WebDriverWait wt=new WebDriverWait(driver,50);
		wt.until(ExpectedConditions.visibilityOf(startpage.baz));
		
		Thread.sleep(5000);
		
		Highlight.highLightElement(driver, startpage.baz);
		
		//Highlight.highLightElement(driver, startpage.ChallengingTableRow);
		
		int rowcount=startpage.ChallengingTableRow.size();
		System.out.println("Row count of Table is " + rowcount);
		
		
		for(int i=0;i<rowcount;i++)
		{
			
			
			List<WebElement> Col=startpage.ChallengingTableRow.get(i).findElements(By.tagName("td"));
			int colcount=Col.size();
			System.out.println("Column count for Row " + i + " is " + colcount);
			for(int j=0;j<colcount;j++)
			{
				
				String data=startpage.ChallengingTableRow.get(i).findElements(By.tagName("td")).get(j).getText();
				System.out.println("Cell value for Row " + i + " and for Column " + j +" is " + data);
				
				List<WebElement> Weblinks=startpage.ChallengingTableRow.get(i).findElements(By.tagName("td")).get(j).findElements(By.tagName("a"));
				int Weblinkcount=Weblinks.size();
				
				System.out.println("The no.of links in Row " + i + "and for Column " + j +  " is " + Weblinkcount);
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
