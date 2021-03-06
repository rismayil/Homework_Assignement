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
	
	
	@Test
	public void verifyFiltersDisplayed() {
		
		
		BasePage basePage = new BasePage(driver, logger);
		basePage.invokeBrowser("chrome");
		landingPage = basePage.OpenApplication();
		searchResultsPage=landingPage.searchUsedCars();
		
		searchResultsPage.verifyFiltersDisplayed();
		
	}
	
	@Test
	public void verifyNewFilterDisplayedUsedFilterNotDisplayed() {
		searchResultsPage.verifyNewFilterDisplayedUsedFilterNotDisplayed();
		
	}

}
