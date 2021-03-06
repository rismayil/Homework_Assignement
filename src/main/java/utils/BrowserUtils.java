package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

import base.BaseTest;

public class BrowserUtils extends BaseTest{
	
	/****************** Select value From DropDown ***********************/
	public static void selectDropdown(WebElement element, String option){
		try {
        Select dropdownElement = new Select(element);
        dropdownElement.selectByVisibleText(option);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
	/**************************Adding date stamp**************************/
	public static String getTimeStamp(){
		Date date = new Date();
		return date.toString().replaceAll(":", "_").replaceAll(" ", "_");
	}
	
	/****************** Capture Screen Shot ***********************/
	public void takeScreenShotOnFailure() {
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "/ScreenShots/" +  getTimeStamp() + ".png");
		try {
			FileUtils.copyFile(sourceFile, destFile);
			System.getProperty("user.dir" +"/Screenshots/" + getTimeStamp() + ".png");
		

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
