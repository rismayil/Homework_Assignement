package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.cars.com/");
        driver.manage().window().maximize();
        //System.out.println((driver.getTitle()));
        homePage = new HomePage(driver);

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test(priority=1)
    public void clickSearchButton(){
        homePage.searchUsedCars();
    }

    @Test(priority = 2)
    public void searchResults() {
        var selectedOptions1 = homePage.getSelectedOptions1();

        Assert.assertEquals(selectedOptions1.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions1.contains("Used Cars"), "Used Car is not selected");

    }

}
