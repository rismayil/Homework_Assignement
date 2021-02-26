package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    private WebDriver driver;
    private By newAndUsedCarsDropdown = By.name("stockType");
    private By searchButton = By.xpath("//input[@value='Search']");
    private By allMakes = By.name("makeId");
    private By allModels = By.name("modelId");
    private By price = By.name("priceMax");
    private By distance = By.name("radius");
    private By zipCode = By.name("zip");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    public void searchUsedCars(){
        Select dropdownElement = new Select(driver.findElement(newAndUsedCarsDropdown));
        dropdownElement.selectByVisibleText("Used Cars");
        dropdownElement = new Select(driver.findElement(allMakes));
        dropdownElement.selectByVisibleText("Honda");
        dropdownElement = new Select(driver.findElement(allModels));
        dropdownElement.selectByVisibleText("Pilot");
        dropdownElement = new Select(driver.findElement(price));
        dropdownElement.selectByVisibleText("$50,000");
        dropdownElement = new Select(driver.findElement(distance));
        dropdownElement.selectByVisibleText("100 Miles from");
        //dropdownElement = new Select(driver.findElement(zipCode));
        driver.findElement(zipCode).clear();
        driver.findElement(zipCode).sendKeys("60008");
        driver.findElement(searchButton).click();

    }

    public List<String> getSelectedOptions1(){
        List<WebElement> selectedElements1 = findDropdownElement1().getAllSelectedOptions();
        return selectedElements1.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public Select findDropdownElement1(){
        return new Select(driver.findElement(newAndUsedCarsDropdown));
    }











}




