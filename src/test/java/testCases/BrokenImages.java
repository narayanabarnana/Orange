package testCases;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.StartPage;
import utilities.*;

public class BrokenImages extends BaseClass{
	
	static StartPage startpage;
	
	
	@SuppressWarnings("static-access")
	@Test(groups="Regression")
	public static void findBrokenImages()
	{
		
		logger = extent.createTest("findBrokenImages"); 
		startpage=PageFactory.initElements(driver, StartPage.class);
		Highlight.highLightElement(driver, startpage.BrokenImages);
		
		//startpage.BrokenImages.click();
		
		//System.out.println("Clicked on broken images");
		
		//WebDriverWait wt=new WebDriverWait(driver,30);
		//wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Elemental Selenium')]")));
		
		System.out.println("Total links are " + startpage.links.size());
		

		for(int i=0;i<startpage.links.size();i++)
		{
			
			WebElement ele= startpage.links.get(i);
			
			//System.out.println("elements are " + ele);
			
			String url=ele.getAttribute("href");
			
			System.out.println(" URL IS "+ url);
			
			verifyLinkActive(url);
			
		}

		
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           
        }
    }


}
