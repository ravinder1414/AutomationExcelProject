package ObjectMap;

/******************************************************************************************
 * 		String Path_OR = Constant.Path_OR;
		actionKeywords = new ActionKeywords();
		FileInputStream fs = new FileInputStream(Path_OR);
		OR= new Properties(System.getProperties());
		OR.load(fs);
		method = actionKeywords.getClass().getMethods();

 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;

import org.openqa.selenium.By;

import automationFramework.Reporter;
import utility.Constant;
import utility.Log;

public class OR 
{

	Properties prop;

	public OR (String strPath) {

		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(strPath);
			prop.load(fis);
			fis.close();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public By getLocator(String strElement) throws Exception 
	{
		// retrieve the specified object from the object list
		String locator = prop.getProperty(strElement);
		if (locator!=""){
			// extract the locator type and value from the object
			String locatorType = locator.split(":")[0];
			Constant.Vars.ORvalname = locatorType;
			String locatorValue = locator.split(":")[1];
			Constant.Vars.ORvalue = locatorValue;
			// for testing and debugging purposes
			System.out.println("Retrieving object of type '" + locatorType + "' and value '" + locatorValue + "' from the object map");
			// return a instance of the By class based on the type of the locator
			// this By can be used by the browser object in the actual test
			try{
				if(locatorType.length() > 0 && locatorValue.length() > 0){
					if(locatorType.toLowerCase().equals("id"))
						return By.id(locatorValue);
					else if(locatorType.toLowerCase().equals("name"))
						return By.name(locatorValue);
					else if((locatorType.toLowerCase().equals("classname")) || (locatorType.toLowerCase().equals("class")))
						return By.className(locatorValue);
					else if((locatorType.toLowerCase().equals("tagname")) || (locatorType.toLowerCase().equals("tag")))
						return By.className(locatorValue);
					else if((locatorType.toLowerCase().equals("linktext")) || (locatorType.toLowerCase().equals("link")))
						return By.linkText(locatorValue);
					else if(locatorType.toLowerCase().equals("partiallinktext"))
						return By.partialLinkText(locatorValue);
					else if((locatorType.toLowerCase().equals("cssselector")) || (locatorType.toLowerCase().equals("css")))
						return By.cssSelector(locatorValue);
					else if(locatorType.toLowerCase().equals("xpath"))
						return By.xpath(locatorValue);
					else
						throw new Exception("Unknown locator type '" + locatorType + "'");
				}
			}catch (Exception ex2) {
				Reporter.ReportEvent("objectmiss");
				Log.info("Error Occured in func_FindObj: " +ex2.getMessage());
				System.out.println(ex2.toString());
				Constant.Vars.elem = null;
				return null;
			}
		}
		return null;
	}
}
