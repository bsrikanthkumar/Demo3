package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CMSLinks 
{
	@FindBy(name="email")
	public WebElement UserName;

	@FindBy(name="pwd")
	public WebElement Password;

	@FindBy(xpath="//*[@id=\"login\"]/form/p[6]/button")
	public WebElement LoginButton;

//IngestButton//
	@FindBy(xpath="//*[@id=\"main-menu-wrapper\"]/div[1]/nav/ul/li[2]/a/i/img")
	public WebElement Ingest;  

//EditButton
	@FindBy(xpath="//*[@id=\"main-menu-wrapper\"]/div[1]/nav/ul/li[3]")
	public WebElement Edit;

//PublishButton
	@FindBy(xpath="//*[@id=\"main-menu-wrapper\"]/div[1]/nav/ul/li[4]")
	public WebElement Publish;
		
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/section/header/div/i")
	public WebElement PublishPopUp;
//HandPicks
	@FindBy(xpath="//*[@id=\"main-menu-wrapper\"]/div[1]/nav/ul/li[10]/a/i/img")
	public WebElement HandPicks;
	
//LogoutOption /html/body/div[1]/div[1]/div[2]/div[4]/ul/li[2]/a/img
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[4]/ul/li[2]")
	public WebElement Logoutoption;
	
//LogoutButton
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div[4]/ul/li[2]/ul/div[3]/span")
	public WebElement Logout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
