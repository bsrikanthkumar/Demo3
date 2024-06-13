package Reusables;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Pages.LoginPageExec;
import Pages.PimAddEmployee;

public class BaseClass 

{
	public static WebDriver driver;

	static Properties props;
	static Select select;
	static Actions action;

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public static void init() throws Exception
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/TestReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);


		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Test Reports");
		htmlReporter.config().setReportName("Test Reports ");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);

		props = new Properties();

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		props.load(fis);

		if(props.getProperty("Browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\others\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(props.getProperty("Browser").equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\others\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		action = new Actions(driver);

		driver.get(props.getProperty("URL"));

		loginFunction(props.getProperty("UserName"),props.getProperty("Password"));

	}
	public static void loginFunction(String UserName, String Password)
	{
		LoginPageExec LoginPageObject = PageFactory.initElements(driver, LoginPageExec.class);

		//	LoginPageObject.UserName.sendKeys(UserName);

		enterData(LoginPageObject.UserName,UserName);

		LoginPageObject.Password.sendKeys(Password);
		LoginPageObject.LoginButton.click();
	}
	public static void enterData(WebElement element, String data)
	{
		element.sendKeys(data);
	}
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void selectByVisibleText(WebElement element, String text)
	{
		select =new Select(element);

		select.selectByVisibleText(text);
	}
	public static void selectByIndex(WebElement element, int index)
	{
		select =new Select(element);

		select.selectByIndex(index);
	}
	public static void selectByValue(WebElement element, String value)
	{
		select =new Select(element);

		select.selectByValue(value);
	}
	//mouseover
	public static void Hover(WebElement element)
	{
		action.moveToElement(element).perform();
	}
	public static void HoverAndClick(WebElement element)
	{
		//action.moveToElement(element).click().build().perform();
		action.moveToElement(element).perform();
		action.click().build().perform();
	}
	public static void Screenshot(WebDriver driver) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);

		String Filepath = System.getProperty("user.dir")+"\\ScreenShot\\Image"+System.currentTimeMillis()+".png";

		File dest = new File(Filepath); 

		FileUtils.copyFile(Src, dest);
	}

	public static void navigateToAddEmployee()
	{
		PimAddEmployee PIMPageObject=PageFactory.initElements(driver, PimAddEmployee.class);

		Hover(PIMPageObject.PIMmenu);
		HoverAndClick(PIMPageObject.AddEmployee);
	}
	public static void AddEmployee(String FirstName, String MiddleName, String LastName)
	{
		PimAddEmployee PIMPageObject=PageFactory.initElements(driver, PimAddEmployee.class);

		Hover(PIMPageObject.PIMmenu);
		HoverAndClick(PIMPageObject.AddEmployee);

		enterData(PIMPageObject.firstName,FirstName);
		enterData(PIMPageObject.middleName,MiddleName);
		enterData(PIMPageObject.lastName,LastName);

		click(PIMPageObject.Save);
	}
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
			test.fail(result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
		}
		else
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}
	@AfterSuite
	public void reportGenerate()
	{ 
		System.out.println("In report Generate"); 
		extent.flush();

	}
}
