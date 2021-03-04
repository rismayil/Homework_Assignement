package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {
	
	/****************** Select value From DropDown ***********************/
	public static void selectDropdown(WebElement element, String option){
		try {
        Select dropdownElement = new Select(element);
        dropdownElement.selectByVisibleText(option);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }

}
