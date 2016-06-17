package utility;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumWD.ActionKeywords;

public class Utils {


	public static String getTestCaseName(String sTestCase)throws Exception{

		String value = sTestCase;

		try{

			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");	
			value = value.substring(posi + 1);
			return value;
				}catch (Exception e){
			Log.error("Class Utils | Method getTestCaseName | Exception desc : "+e.getMessage());
			throw (e);
					}
			}

	 public static void mouseHoverAction(WebElement mainElement, String subElement){
		 //Actions action = new Actions(driver);
        // action.moveToElement(mainElement).perform();
         if(subElement.equals("Accessories")){
        	// action.moveToElement(driver.findElement(By.linkText("Accessories")));
        	 Log.info("Accessories link is found under Product Category");
         }
         if(subElement.equals("iMacs")){
        	// action.moveToElement(driver.findElement(By.linkText("iMacs")));
        	 Log.info("iMacs link is found under Product Category");
         }
         if(subElement.equals("iPads")){
        	// action.moveToElement(driver.findElement(By.linkText("iPads")));
        	 Log.info("iPads link is found under Product Category");
         }
         if(subElement.equals("iPhones")){
        	// action.moveToElement(driver.findElement(By.linkText("iPhones")));
        	 Log.info("iPhones link is found under Product Category");
         }
        // action.click();
        // action.perform();
         Log.info("Click action is performed on the selected Product Type");
	 }

	 public static void waitForElement(WebElement element){
		// WebDriverWait wait = new WebDriverWait(driver, 10);
	     //wait.until(ExpectedConditions.elementToBeClickable(element));
	 	}

	 public static void takeScreenshot(WebDriver driver, String sTestCaseName) throws Exception{

			try{

				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

				FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + sTestCaseName +".jpg"));	

			} catch (Exception e){

				Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "+e.getMessage());

				throw new Exception();

			}

		}
	 
	 public static String htmlToTextConvertMethod(String readLine){
		 StringBuilder strBuilder = new StringBuilder();
		 String strInLine[] = readLine.split("\n");
		 for(int i=0; i<strInLine.length; i++){
			 strInLine[i] = strInLine[i].replaceAll("&nbsp;","");
			 String temptext = Jsoup.parse(strInLine[i].trim()).text();
			 strBuilder.append(temptext+"\n");
		 }
			return strBuilder.toString();
		}

	}