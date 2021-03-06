package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class SearchResultPage extends BasePage {
	
	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css=".header-primary__title-row .srp-header")
	public WebElement searchHeader;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Maximum Price: $50,000')]")
	public WebElement maxPriceFilter;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Honda')]")
	public WebElement makeFilter;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Pilot')]")
	public WebElement modelFilter;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'Used')]")
	public WebElement usedFilter;
	
	@FindBy(xpath="//label[normalize-space()='New']")
	public WebElement newRadioButton;
	
	@FindBy(xpath="//label[normalize-space()='Used']")
	public WebElement usedRadioButton;
	
	@FindBy(xpath="//header[@class='filter-header']//label[contains(text(),'New')]")
	public WebElement newFilter;
	
	
	
	public void verifyFiltersDisplayed() {
		//Assert.assertEquals(searchHeader, expectedHeader);
		Assert.assertTrue(maxPriceFilter.isDisplayed());
		Assert.assertTrue(makeFilter.isDisplayed());
		Assert.assertTrue(modelFilter.isDisplayed());
		Assert.assertTrue(usedFilter.isDisplayed());
	}
	
	public void verifyNewFilterDisplayedUsedFilterNotDisplayed() {
		newRadioButton.click();
		Assert.assertTrue(newFilter.isDisplayed());
		Assert.assertFalse(usedFilter.isDisplayed());
	}
	

}
