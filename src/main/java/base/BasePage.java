package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pages.LandingPage;

public class BasePage extends BaseTest {
	
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	/****************** OpenApplication ***********************/
	public LandingPage OpenApplication() {
		driver.get("https://www.cars.com/");
		LandingPage landingPage = new LandingPage(driver);
	    PageFactory.initElements(driver, landingPage);
		return landingPage;
	}
	
	public void getTitle(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	}
	
	
	

}
