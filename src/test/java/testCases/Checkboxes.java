package testCases;
import utilities.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.StartPage;
import utilities.Highlight;

public class Checkboxes extends BaseClass{
	
	static StartPage startpage;
	
	@SuppressWarnings("static-access")
	@Test(groups="SmokeTest")
	public static void Checkbox()
	{
		
		logger = extent.createTest("Checkbox"); 
		startpage=PageFactory.initElements(driver, StartPage.class);
		Highlight.highLightElement(driver, startpage.Checkbox);
		
		startpage.Checkbox.click();
		
		WebDriverWait wt=new WebDriverWait(driver,50);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Elemental Selenium')]")));
		
		int checkboxcount=startpage.ListCheckbox.size();
		System.out.println("Total number of checkboxes are " + checkboxcount);
		
		for(int i=0;i<checkboxcount;i++)
		{
			String checkboxdata=startpage.ListCheckbox.get(i).getAttribute("value");
			System.out.println(" The checkbox name is " + checkboxdata);
		}
		
		
		
		
	}

}
