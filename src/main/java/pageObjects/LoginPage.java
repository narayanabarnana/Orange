package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utilities.BaseClass;
import utilities.Highlight;

public class LoginPage {
	
	static WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
		
	@FindBy(how = How.NAME, using = "username")
	public static WebElement UserName;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement Password;
	
	
	@FindBy(how = How.XPATH, using = "//button[contains(.,'Login')]")
	public static WebElement LoginButton;
	
	
	
	
	
	
	
	public static void PHPTravelsLogin(String user, String Pass)
	{
		Highlight.highLightElement(driver, UserName);
		UserName.sendKeys(user);
		Highlight.highLightElement(driver, Password);
		Password.clear();
		Password.click();
		Password.sendKeys(Pass);
		Highlight.highLightElement(driver, LoginButton);
		LoginButton.click();
	}

}
