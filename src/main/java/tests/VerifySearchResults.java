package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.LandingPage;
import pages.SearchResultPage;

public class VerifySearchResults extends BaseTest {
	
	WebDriver driver;
	
	LandingPage landingPage;
	SearchResultPage searchResultsPage;
	//BasePage basePage = new BasePage(driver);
	
	@Test
	public void verifyFiltersDisplayed() {
		
		BasePage basePage = new BasePage(driver);
		basePage.invokeBrowser("chrome");
		landingPage = basePage.OpenApplication();
		searchResultsPage=landingPage.searchUsedCars();
		//((SearchResultPage) searchResultsPage).verifySearchHeader("Used Honda Pilot for Sale");
		searchResultsPage.verifyFiltersDisplayed();
		
	}
	
	@Test
	public void verifyNewFilterDisplayedUsedFilterNotDisplayed() {
		
		
	}

}
