package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageExec 
{ 
	
		@FindBy(xpath="//*[@id='txtUsername']")
		public WebElement UserName;
		
		@FindBy(name="txtPassword")
		public WebElement Password;
		
		@FindBy(id="btnLogin")
		public WebElement LoginButton;

}
