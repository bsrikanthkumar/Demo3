package ExecutableTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Reusables.BaseClass;
import Reusables.Excelbase;
import Pages.PimAddEmployee;

public class ExecutionLoginPage2 extends BaseClass
{
	@Test(dataProvider="addEmployee")
	public void addEmployeeTest(String FirstName, String MiddleName, String LastName) throws Exception
	{
		try
		{
			test=extent.createTest("Add Employee");

			PimAddEmployee PIMPageObject=PageFactory.initElements(driver, PimAddEmployee.class);

			Hover(PIMPageObject.PIMmenu);
			HoverAndClick(PIMPageObject.AddEmployee);
			test.log(Status.INFO, "Navigated to Add Employee");

			enterData(PIMPageObject.firstName,FirstName);
			test.log(Status.INFO, "First Name Entered" + FirstName);

			enterData(PIMPageObject.middleName,MiddleName);
			test.log(Status.INFO, "Middle Name Entered" + MiddleName);

			enterData(PIMPageObject.lastName,LastName);
			test.log(Status.INFO, "Last Name Entered" + LastName);

			click(PIMPageObject.Save);
			test.log(Status.INFO, "Clicked on Save");
		}
		catch(Exception e)
		{
			Screenshot (driver);
		}
	}
	@DataProvider
	public Object[][] addEmployee() throws Exception
	{
		String FileName=System.getProperty("user.dir")+"\\TestData\\ExcelWorksheet.xlsx";
		String SheetName="EmployeeData";

		Excelbase obj = new Excelbase();

		return obj.getData(FileName, SheetName);
	}
}
