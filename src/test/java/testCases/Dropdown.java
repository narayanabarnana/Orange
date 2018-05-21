package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;

import java.util.List;

//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.StartPage;
import utilities.BaseClass;
import utilities.Highlight;

public class Dropdown extends BaseClass{
	
	static StartPage startpage;
	
	@SuppressWarnings("static-access")
	@Test(groups="Regression")
	public static void DropDown()
	{
		logger = extent.createTest("DropDown"); 
		startpage=PageFactory.initElements(driver, StartPage.class);
		Highlight.highLightElement(driver, startpage.Dropdown);
		
		startpage.Dropdown.click();
		
		WebDriverWait wt=new WebDriverWait(driver,50);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Elemental Selenium')]")));
		
		
		Highlight.highLightElement(driver, startpage.dropdownmenu);
		Select sel=new Select(startpage.dropdownmenu);
		
		List<WebElement> ele=sel.getOptions();
		int elecount=ele.size();
		
		System.out.println("The total of elements in the dropdown are " + elecount);
		
		for(int i=0;i<elecount;i++)
		{
			System.out.println("The element " + i + " in the dropdown is " + ele.get(i).getText());
		}
		
		//selecting the element based on text
		sel.selectByVisibleText("Option 1");
		System.out.println(" Value selected based on text");
		
		//selecting the value based on index
		sel.selectByIndex(2);
		System.out.println(" Value selected based on index");
		
		//selecting the value based on value
		sel.selectByValue("1");
		System.out.println(" Value selected based on value");
		
	}

}
