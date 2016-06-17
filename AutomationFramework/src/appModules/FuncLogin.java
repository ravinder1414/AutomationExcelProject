package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import utility.Log;

public class FuncLogin {

	public static void Execute(WebDriver driver,String sUsername, String sPassword) throws Exception 
	{
		LoginPage.txtbx_UserName(driver).sendKeys(sUsername);
		Log.info("Username entered in the Username text box");
		LoginPage.txtbx_Password(driver).sendKeys(sPassword);
		Log.info("Password entered in the Password text box");
		LoginPage.btn_LogIn(driver).click();
		Log.info("Login button clicked");
		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
		//Home_Page.lnk_LogOut(driver).click(); 
		driver.quit();
		//jdjdjjd
	}

}