package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pageObjects.LoginPage;
import pageObjects.PHPTravelsPage;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentReports extent; 
	public static ExtentTest logger; 
	public static ExtentHtmlReporter htmlReporter; 

	
	
	
	@BeforeSuite 
		public void setUp() 
		{ 
			htmlReporter = new ExtentHtmlReporter("./Reports/Regression Test Repoprt.html"); 
			extent = new ExtentReports(); 
			extent.config(); 
			extent.attachReporter(htmlReporter); 
			
			htmlReporter.config().setReportName("Report"); 
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); 
			htmlReporter.config().setTheme(Theme.STANDARD); 
		} 

	
	@SuppressWarnings("static-access")
	
	@BeforeClass
	public static void PHPTravelsLogin() throws Exception
	{
		
		//logger = extent.createTest("AppOrangeHRMLogin");
		
		driver = BrowserFactory.getBrowser("IE");
		driver.get(DataProviderFactory.getConfig().getApplicationurl());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//LoginPage Login=PageFactory.initElements(driver, LoginPage.class);
		
		//Login.PHPTravelsLogin(DataProviderFactory.getConfig().getusername(), DataProviderFactory.getConfig().getpassword());
		
	}
	
	
	@AfterMethod 
	public void getResult(ITestResult result) throws Exception{ 
		
		if(result.getStatus()==ITestResult.FAILURE) 
		{ 
				System.out.println(result.getName()); 
				System.out.println(driver); 
				String screenshotPath=GetScreenshot.capture(driver, result.getName()); 
				//logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "test case failed due to below issues", ExtentColor.RED)); 
				logger.fail(MarkupHelper.createLabel(result.getName() + "test case failed due to below issues", ExtentColor.RED)); 
				logger.fail(result.getThrowable()); 
				//String screenshotPath=GetScreenshot.capture(driver, result.getName()); 
				logger.fail("Screenshot below" + logger.addScreenCaptureFromPath(screenshotPath)); 
		} 
		else if(result.getStatus()==ITestResult.SUCCESS) 
		{ 		
				System.out.println("The result name is "+ result.getName());
				System.out.println("Result status is "+ result.getStatus());
				System.out.println(" Driver is " + driver);
				
				logger.pass(MarkupHelper.createLabel(result.getName() + "test case Passed", ExtentColor.GREEN)); 
		} 
		else 
		{ 
					//logger.skip(Status.SKIP, MarkupHelper.createLabel(result.getName() + "test case Passed", ExtentColor.YELLOW)); 
					logger.skip(MarkupHelper.createLabel(result.getName() + "test case Skipped", ExtentColor.YELLOW)); 
					logger.skip(result.getThrowable()); 
		} 
		 
	
	} 
	
	
				@AfterClass 
				public static void CloseApp() throws InterruptedException
				{ 
				
				//PHPTravelsPage Travelspage;
				//Travelspage=PageFactory.initElements(driver, PHPTravelsPage.class);
				 
				//PHPTravelsPage.Logout();
					
					driver.quit(); 
				
				} 

	 
	
	 
			@AfterSuite 
			public void teardown() 
			{ 
				extent.flush(); 
			}
	
	
	
	

}
