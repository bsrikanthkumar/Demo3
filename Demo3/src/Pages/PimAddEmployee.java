package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PimAddEmployee 
{
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIMmenu;

	//AddEmployee

	@FindBy(id="menu_pim_addEmployee")
	public WebElement AddEmployee;

	@FindBy(id="firstName")
	public WebElement firstName;

	@FindBy(id="middleName")
	public WebElement middleName;

	@FindBy(id="lastName")
	public WebElement lastName;

	@FindBy(id="btnSave")
	public WebElement Save;

}
