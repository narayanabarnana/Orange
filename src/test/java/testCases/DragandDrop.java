package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;

//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.StartPage;
import utilities.BaseClass;
import utilities.Highlight;

public class DragandDrop extends BaseClass{
	
	static StartPage startpage;
	
	@Test
	public static void DragDrop()
	{
		logger = extent.createTest("ChallengingDOM"); 
		startpage=PageFactory.initElements(driver, StartPage.class);
		Highlight.highLightElement(driver, startpage.DragDrop);
		
		WebDriverWait wt=new WebDriverWait(driver,50);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Elemental Selenium')]")));
		
		
		//Actions act=new Actions(driver);
		
	}

}
