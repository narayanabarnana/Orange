package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StartPage {
	
	
	static WebDriver driver;
	
	public StartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Basic Auth')]")
	public static WebElement BasicAuth;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Broken Images')]")
	public static WebElement BrokenImages;

	@FindBy(how = How.TAG_NAME, using = "a")
	public static List<WebElement> links;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Challenging DOM')]")
	public static WebElement ChallengingDOM;
	
	////a[@id='bd72bff0-1896-0136-50e0-1ade8d572063']
	@FindBy(how = How.XPATH, using = "//div[@class='large-2 columns']//a[1]")
	public static WebElement baz;
	
	@FindBy(how = How.XPATH, using = "//div[@class='large-10 columns']//table//tbody/tr")
	public static List<WebElement> ChallengingTableRow;
	
	@FindBy(how = How.TAG_NAME, using = "td")
	public static List<WebElement> ChallengingTableCol;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Checkboxes')]")
	public static WebElement Checkbox;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public static List<WebElement> ListCheckbox;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Drag and Drop')]")
	public static WebElement DragDrop;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Dropdown')]")
	public static WebElement Dropdown;
	
	@FindBy(how = How.XPATH, using = "//select[@id='dropdown']")
	public static WebElement dropdownmenu;
}
