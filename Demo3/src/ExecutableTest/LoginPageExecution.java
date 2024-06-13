package ExecutableTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import Pages.LoginPageExec;

public class LoginPageExecution 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard");

		LoginPageExec LoginPageObject = PageFactory.initElements(driver, LoginPageExec.class);

		LoginPageObject.UserName.sendKeys("Admin");
		LoginPageObject.Password.sendKeys("Qedge123!@#");
		LoginPageObject.LoginButton.click();
	}

}
