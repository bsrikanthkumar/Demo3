package ExecutableTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.ETVBMenuLinks;

public class ETVBMenu 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();Thread.sleep(1000);

		driver.get("https://www.etvbharat.com/");Thread.sleep(2000);

		ETVBMenuLinks WebsitePage = PageFactory.initElements(driver, ETVBMenuLinks.class);

//	 UTTARPRADESH MENU CATEGORIES 
		
		WebsitePage.HindiDropDown.click();Thread.sleep(2000);
		WebsitePage.UttarPradesh.click();Thread.sleep(4000);
		
		WebsitePage.UPStateCategory.click();Thread.sleep(2000);
		
		
	}
}
