package utility;

/********************************************************************************************************
 * Usage: 	WebDriver driver = BrowserFactory.getBrowser("Firefox");
 * 			BrowserFactory.closeAllDriver();
 * 			using browser stack to run test on different browsers https://www.browserstack.com/automate/java
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.Platform;
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
				FirefoxProfile profile = new FirefoxProfile();
				profile.setPreference("browser.download.folderList", 2);
				profile.setPreference("browser.download.dir", Constant.File_DownloadPath);
				profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
				profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/octet-stream/application/xml,text/plain,text/xml,image/jpeg,text/csv");
				profile.setPreference("browser.download.manager.showWhenStarting", false);
				profile.setPreference("browser.download.manager.focusWhenStarting", false);  
				profile.setPreference("browser.download.useDownloadDir", true);
				profile.setPreference("browser.helperApps.alwaysAsk.force", false);
				profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
				profile.setPreference("browser.download.manager.closeWhenDone", true);
				profile.setPreference("browser.download.manager.showAlertOnComplete", false);
				profile.setPreference("browser.download.manager.useWindow", false);
				profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
				profile.setPreference("pdfjs.disabled", true);
				DesiredCapabilities dc = DesiredCapabilities.firefox();
				dc.setJavascriptEnabled(true);
				dc.setCapability(FirefoxDriver.PROFILE, profile);
				driver = new FirefoxDriver(dc);
				drivers.put("Firefox", driver);
				//HtmlUnitDriver unitDriver = new HtmlUnitDriver();
			}
			break;
		case "IE":
			driver = drivers.get("IE");
			if (driver == null) {
				System.setProperty("webdriver.ie.driver",Constant.ieDriverPath);
				DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
				capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
				capability.setCapability("ignoreZoomSetting", true);
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
		case "BS-IE8":
			driver = drivers.get("BS-IE8");
			if (driver ==null){

			}
			break;
		case "BS-IE9":
			driver = drivers.get("BS-IE9");
			if (driver ==null){

			}
			break;
		case "BS-Firefox":
			driver = drivers.get("BS-Firefox");
			if (driver ==null){

			}
			break;
		case "BS-Chrome":
			driver = drivers.get("BS-Chrome");
			if (driver ==null){

			}
			break;
		case "BS-IE10":
			driver = drivers.get("BS-IE10");
			if (driver ==null){
			    DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("browser", "IE");
			    caps.setCapability("browser_version", "10.0");
			    caps.setCapability("os", "Windows");
			    caps.setCapability("os_version", "XP");
			    caps.setCapability("browserstack.debug", "true");
			    try {
					driver = new RemoteWebDriver(new URL(Constant.BS_URL), caps);
					drivers.put("BS-IE10", driver);
				} catch (MalformedURLException e) {
					Log.info(e.getMessage());
				}
			}
			break;
		case "BS-IE11":
			driver = drivers.get("BS-IE11");
			if (driver ==null){

			}
			break;
		}


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static void closeAllDriver() {
		Set<String> Keys = drivers.keySet();
		try{
			for (String key : Keys) {
				drivers.get(key).quit();
			}
		}
		catch(Exception e){
			Log.fatal("Error occured while closing the browser " + e.getMessage());
			throw e;
		}
	}
}