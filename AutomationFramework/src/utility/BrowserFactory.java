package utility;
/********************************************************************************************************
 * Usage: 	WebDriver driver = BrowserFactory.getBrowser("Firefox");
 * 			BrowserFactory.closeAllDriver();
 */
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import automationFramework.LocalTC;

public class BrowserFactory extends RemoteWebDriver  {

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	
	/*
	 * Factory method for getting browsers
	 */
	public static WebDriver getBrowser(LocalTC Vars) {
		WebDriver driver = null;

		switch (Vars.getbrowsername()) {
		case "Firefox":
			driver = drivers.get("Firefox");
			if (driver == null) {
				//System.setProperty("webdriver.firefox.bin", "C:\\Users\\mohammad.makki\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
				driver = new FirefoxDriver();
				drivers.put("Firefox", driver);
			}else{
				drivers.put("Firefox", driver);
			}
			break;
		case "IE":
			driver = drivers.get("IE");
			if (driver == null) {
				System.setProperty("webdriver.ie.driver",Constant.ieDriverPath);
				DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
				capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				capability.setCapability("useLegacyInternalServer", true);
				capability.setCapability("nativeEvents", false);
				driver = new InternetExplorerDriver(capability);
				driver.getWindowHandle();
				Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
				Vars.setBrowserVer(cap.getVersion());
				drivers.put("IE", driver);
			}
			break;
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver",Constant.chromeDriverPath);
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
			}
			break;
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}
	}
}