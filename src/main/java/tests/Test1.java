package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.LandingPage;
import pages.SearchResultPage;

public class Test1 extends BaseTest {
	
	WebDriver driver;
	
	LandingPage landingPage;
	SearchResultPage searchResultsPage;
	//BasePage basePage = new BasePage(driver);
	
	@Test
	public void searchCars() {
		
		BasePage basePage = new BasePage(driver);
		basePage.invokeBrowser("Mozila");
		landingPage = basePage.OpenApplication();
		searchResultsPage=landingPage.searchUsedCars();
		((SearchResultPage) searchResultsPage).verifySearchHeader("Used Honda Pilot for Sale");
		
	}

}
