package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.Highlight;

public class PHPTravelsPage {
	
	static WebDriver driver;
	
	public PHPTravelsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//@FindBy(how = How.XPATH, using = "//div[@class='navbar navbar-static-top navbar-default  hidden-lg hidden-md']//ul[@class='nav navbar-nav navbar-side navbar-right sidebar go-left']/li[1]//a[@href='javascript:void(0);']")
	//public static WebElement UserLogo;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'logout') and @xpath='3']")
	public static WebElement LogoutButton;
	
	
	/*
	
	public static void Logout() throws InterruptedException {
		
		Highlight.highLightElement(driver, UserLogo);
		UserLogo.click();
		Thread.sleep(5000); 
		Highlight.highLightElement(driver, LogoutButton);
		LogoutButton.click();
		
	}
	*/

}
