package ExecutableTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.CMSLinks;

public class CMS 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();Thread.sleep(1000);
		
	//	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("http://10.10.50.9/etvnewsroom/#/access/login");
		
		CMSLinks LoginPageCMS = PageFactory.initElements(driver, CMSLinks.class);

		LoginPageCMS.UserName.sendKeys("7208500");Thread.sleep(1000);
		LoginPageCMS.Password.sendKeys("welcome");Thread.sleep(1000);
		LoginPageCMS.LoginButton.click();Thread.sleep(5000);
	
//Functionalities 
		
		LoginPageCMS.Ingest.click();Thread.sleep(3000);
		LoginPageCMS.Edit.click();Thread.sleep(3000);
		LoginPageCMS.Publish.click();Thread.sleep(3000);
		LoginPageCMS.PublishPopUp.click();Thread.sleep(2000);
		LoginPageCMS.HandPicks.click();Thread.sleep(5000);
		LoginPageCMS.Logoutoption.click();Thread.sleep(3000);
		LoginPageCMS.Logout.click();Thread.sleep(3000);
		
		
		
	}

}
