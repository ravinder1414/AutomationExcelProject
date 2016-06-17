package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;
import utility.Utils;

public class LoginPage 
{
	private static WebElement element = null;
	public static WebElement txtbx_UserName(WebDriver driver) throws Exception{
		try{
		element = driver.findElement(By.id("username"));
		Log.info("Username text box found");
		}
		catch (Exception e)
		{
			// Printing logs for my report
            Log.error("Report Category button element is not found.");
			// Taking screenshot for defect reporting
			Utils.takeScreenshot(driver,"LoginPage");
			// After doing my work, now i want to stop my test case
            throw(e);
		}
		return element;
	}

	public static WebElement txtbx_Password(WebDriver driver){
		element = driver.findElement(By.id("password"));
		Log.info("Password text box found");
		return element;
	}

	public static WebElement btn_LogIn(WebDriver driver){
		element = driver.findElement(By.id("Login"));
		Log.info("Login button found");
		return element;
	}
}