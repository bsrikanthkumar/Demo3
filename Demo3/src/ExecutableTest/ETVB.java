package ExecutableTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.ETVBLinks;

public class ETVB 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();Thread.sleep(1000);

		driver.get("https://www.etvbharat.com/");Thread.sleep(2000);

		ETVBLinks WebsitePage = PageFactory.initElements(driver, ETVBLinks.class);

//		WebsitePage.HindiDropDown.click();Thread.sleep(2000);
//		WebsitePage.UttarPradesh.click();Thread.sleep(4000);
//		WebsitePage.UttaraKhand.click();Thread.sleep(4000);
//		WebsitePage.Chhattisgarh.click();Thread.sleep(4000);
//		WebsitePage.JharKhand.click();Thread.sleep(4000);
//		WebsitePage.Delhi.click();Thread.sleep(4000);
//		WebsitePage.Bihar.click();Thread.sleep(4000);
//		WebsitePage.MadhyaPradesh.click();Thread.sleep(4000);
//		WebsitePage.Rajasthan.click();Thread.sleep(4000);		
//		WebsitePage.Haryana.click();Thread.sleep(4000);
//		WebsitePage.HimachalPradesh.click();Thread.sleep(4000);		
//		WebsitePage.Assam.click();Thread.sleep(4000);
//		WebsitePage.WestBengal.click();Thread.sleep(4000);
//		WebsitePage.Gujarat.click();Thread.sleep(4000);
//		WebsitePage.Karnataka.click();Thread.sleep(4000);
//		WebsitePage.kerala.click();Thread.sleep(4000);
//		WebsitePage.Odissa.click();Thread.sleep(4000);
//		WebsitePage.Maharashtra.click();Thread.sleep(4000);
//		WebsitePage.Punjab.click();Thread.sleep(4000);
//		WebsitePage.TamilNadu.click();Thread.sleep(4000);
//		WebsitePage.TeluguDropdown.click();Thread.sleep(2000);
//		WebsitePage.AndhraPradesh.click();Thread.sleep(4000);
//		WebsitePage.Telangana.click();Thread.sleep(4000);
//		WebsitePage.Urdu.click();Thread.sleep(4000);                 

// ROBOTS.TXT

	/*	driver.get("https://www.etvbharat.com/robots.txt");
		driver.manage().window().maximize();Thread.sleep(3000);
		driver.close();                 


// SITEMAP

		driver.get("https://www.etvbharat.com/sitemap.xml");
		driver.manage().window().maximize();Thread.sleep(3000);
		driver.close();                          */
		
// ENGLISH NATIONAL MENU CATEGORIES 
//		
//		WebsitePage.NationalCategory.click();Thread.sleep(2000);
//		WebsitePage.WorldCategory.click();Thread.sleep(2000);
//		WebsitePage.SportsCategory.click();Thread.sleep(2000);
//		WebsitePage.EntertainmentCategory.click();Thread.sleep(2000);
//		WebsitePage.StateCategory.click();Thread.sleep(2000);
//		WebsitePage.OffbeatCategory.click();Thread.sleep(2000);
//		WebsitePage.BusinessCategory.click();Thread.sleep(2000);
//		WebsitePage.PhotosCategory.click();Thread.sleep(2000);
//		WebsitePage.HealthCategory.click();Thread.sleep(2000);
//		WebsitePage.VideosCategory.click();Thread.sleep(2000);
//		WebsitePage.MoreCategories.click();
//		WebsitePage.TechnologyCategory.click();Thread.sleep(2000);
//		WebsitePage.OpinionCategory.click();Thread.sleep(2000);
//		WebsitePage.AdvertorialCategory.click();Thread.sleep(2000);
//		WebsitePage.PressReleasesCategory.click();Thread.sleep(2000);
//		
//	 UTTARPRADESH MENU CATEGORIES 
		
		WebsitePage.HindiDropDown.click();Thread.sleep(2000);
		WebsitePage.UttarPradesh.click();Thread.sleep(4000);
		WebsitePage.UPStateCategory.click();Thread.sleep(2000);
		WebsitePage.UPBharatCategory.click();Thread.sleep(2000);
		WebsitePage.UPEntertainmentCategory.click();Thread.sleep(2000);
		WebsitePage.UPChampionCategory.click();Thread.sleep(2000);
		WebsitePage.UPSpiritualCategory.click();Thread.sleep(2000);
		WebsitePage.UPEducationCareerCategory.click();Thread.sleep(2000);
		WebsitePage.UPSukhibhavaCategory.click();Thread.sleep(2000);
		WebsitePage.UPPhotoGalleryCategory.click();Thread.sleep(2000);
		WebsitePage.UPVideosCategory.click();Thread.sleep(2000);
		WebsitePage.UPScienceTechCategory.click();Thread.sleep(2000);
		WebsitePage.UPMoreCategories.click();
		WebsitePage.UPBusinessCategory.click();Thread.sleep(2000);
		WebsitePage.UPInternationalCategory.click();Thread.sleep(2000);
		WebsitePage.UPOpinionCategory.click();Thread.sleep(2000);		
		WebsitePage.UPAdvertorialCategory.click();Thread.sleep(2000);
		WebsitePage.UPPressReleasesCategory.click();Thread.sleep(2000);    

//	 UTTARAKHAND MENU CATEGORIES 
		
	/*	WebsitePage.HindiDropDown.click();
		WebsitePage.UttaraKhand.click();
		WebsitePage.UTStateCategory.click();Thread.sleep(2000);
		WebsitePage.UTBharatCategory.click();Thread.sleep(2000);
		WebsitePage.UTEntertainmentCategory.click();Thread.sleep(2000);
		WebsitePage.UTChampionCategory.click();Thread.sleep(2000);
		WebsitePage.UTSpiritualCategory.click();Thread.sleep(2000);
		WebsitePage.UTEducationCareerCategory.click();Thread.sleep(2000);
		WebsitePage.UTSukhibhavaCategory.click();Thread.sleep(2000);
		WebsitePage.UTPhotoGalleryCategory.click();Thread.sleep(2000);
		WebsitePage.UTVideosCategory.click();Thread.sleep(2000);
		WebsitePage.UTScienceTechCategory.click();Thread.sleep(2000);
		WebsitePage.UTMoreCategories.click();
		WebsitePage.UTBusinessCategory.click();Thread.sleep(2000);
		WebsitePage.UTInternationalCategory.click();Thread.sleep(2000);
		WebsitePage.UTOpinionCategory.click();Thread.sleep(2000);		
		WebsitePage.UTAdvertorialCategory.click();Thread.sleep(2000);
		WebsitePage.UTPressReleasesCategory.click();Thread.sleep(2000);   */
		
//	ASSAM MENU CATEGORIES	
		
	//	WebsitePage.ASStateCategory.click();Thread.sleep(2000);

		
		
	}
}
