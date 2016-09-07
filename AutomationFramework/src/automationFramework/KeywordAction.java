package automationFramework;
/********************************************************************************************************
 *Project Name		: Ignite Automation framework 
 *Author		    : Bharat Sethi
 *Version	    	: V1.0
 *Date of Creation	: 28-04-2016
 *Date Last modified: 04/05/2016
 *Description       : Execution engine : execute all translated steps using selenium web driver
 *Functions			: 
 *CallAction : Filter the function to execute based on Action translated by Translation engine
 *LaunchApp  :
 *ClossApp   : 
 ********************************************************************************************************
 */
import static org.junit.Assert.fail;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import SpiraTest.SpiraReader;
import appModules.functionLibary;
import utility.BrowserFactory;
import utility.Constant;
import utility.ExcelUtils;
/*import utility.Log;*/
import utility.Utils;

/**
 * 
 * @author mohammad.makki
 *
 */
public class KeywordAction extends KeywordLibrary {
	static String Object;
	static String Event;
	static String ObjectType;
	static String ObjectName;
	static String ObjectEvent;
	static String ObjectTestData;
	static String result = "";
	static int conditionline = 0;
	static String sqlquery;
	static Alert dialogSwitch = null;
	/**************
	 * Filter which function to call based on the Action translated by translation engine
	 * @param Vars
	 * @throws Exception
	 */
	public static void CallAction(LocalTC Vars)  {
		try {
			Vars.setScreenshotTypeFlag(1);
			Vars.setExecutionStatus("");
			Vars.ExecutionResult = "";
			Vars.setExceptionVar("");
			SpiraReader SpiraRead = new SpiraReader();
			Constant.Vars = Vars;
			//Switch on Action 
			switch (Vars.Action.toLowerCase()) {
			case Constant.TestCaseID:
				if(Vars.getIntegration() == true)
					SpiraRead.ExtractTestSteps(Vars,Vars.getObj());
				break;
			case Constant.Navigate:
				navigate(Vars);
				break;
			case Constant.Loop:  //start loop
				loop(Vars);
				break;
			case Constant.Endloop:  //end of loop
				endloop(Vars);
				break;
			case Constant.Launchapp:  //Launch a browser as it has been set in test set name
				LaunchApp(Vars);
				break;
			case Constant.Close:      //Close opened application 
				ClossApp(Vars);
				break;
			case Constant.Perform:  //perform different actions
				PerformAction(Vars);
				break;
			case Constant.Callfunction: //call function registration with dt_validation
				callfunction(Vars);
				break;
			case Constant.Wait: //wait for defined time period
				waitfor(Vars);
				break;
			case Constant.Condition: //checking the condition
				condition(Vars);
				break;
			case Constant.Endcondition: // end of the condition
				Vars.conditionSkip = false;
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setRes_type(Constant.Executed);
				break;
			case Constant.Screencaptureoption: //capturing screen shot for perform, check, storevalue
				screenCaptureOption(Vars);
				break;
			case Constant.Importdata:  //importing data from file
				importdata(Vars);
				break;
			case Constant.Fetchdb:  //retrieving data from the database
				fetchdb(Vars);
				break;
			case Constant.Comparedbcell:  //Comparing database
				comparedbcell(Vars);
				break;
			case Constant.Screencapture: //capturing screen shot
				screencapture(Vars);
				break;
			case Constant.Context:
				context(Vars);
				break;
			case Constant.Check: //checking different actions - check value for element obj=username as "bharat.sethi"/#var1
			case Constant.Storevalue:  //storing values
				Vars.setScreenshotTypeFlag(0);
				Constant.Vars.capturecheckvalue = false;
				func_StoreCheck(Vars);
				Constant.Vars.capturecheckvalue = true;
				Vars.setScreenshotTypeFlag(1);
				break;
			case Constant.Upload:  //uploading document into existing path
				if (Vars.getObj().toString() == "") {
					Vars.setRes_type(Constant.FilePathNotFound2);
					doUploadDownload(Constant.Abortupload,Vars);
				} else {
					String strPath = Constant.tempTestReportPath + Vars.getObj();
					strPath = strPath.replace("//", File.separator);
					if (new File(strPath.toString()).exists()) {
						doUploadDownload(Constant.Upload,Vars);
					} else {
						Vars.setRes_type(Constant.FilePathNotFound);
						doUploadDownload(Constant.Abortupload,Vars);
					}
				}
				break;
			case Constant.Download: //download file from the browser
				download(Vars);
				break;
			case Constant.CallAction:
				varCallaction(Vars);
				break;
			case Constant.Arithmetic:
				Vars.setScreenshotTypeFlag(0);
				func_Arith(Vars);
				Vars.setScreenshotTypeFlag(1);
				break;
			case Constant.Extract:
				extract(Vars);
				break;
			case Constant.VerifyData:
				verifyData(Vars);
				break;
			case Constant.Assign_Value:
				result = "Value has been assign";
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				screenShot(Vars);
				Vars.setRes_type(Constant.Executed);
				break;
			case Constant.Swap:
				swap(Vars);
				break;
			default:
				result = "Action is not found";
				Vars.setExecutionResult(result);
				Vars.setExecutionStatus(Constant.Blocked);
				Vars.setRes_type(Constant.Keyword);
				break;
			}
		}
		catch (Exception ex) {
			Vars.setExecutionStatus(Constant.Blocked);
			Vars.setRes_type(Constant.Blocked);
			Vars.setExceptionVar(ex.toString());
			result = "failed  " +ex.getMessage()+ " Current Script:" +  Vars.iTestCaseID + " Current Script:" +  Vars.TestStepID;
			Vars.setExecutionResult(result);
			fail("Cannot test normally by Ignite.");
		}
	}
	/*
	 * @return
	 * @param LocalTC
	 * Method for nevigation back, forward and refresh the browser
	 */
	private static void navigate(LocalTC Vars) {
		switch (Vars.getObj()){
		case Constant.Navigateback:
			Constant.driver.navigate().back();
			result = "Nevigate to back";
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setExecutionResult(result);
			Vars.setRes_type(Constant.Executed);
			break;
		case Constant.Navigateforward:
			Constant.driver.navigate().forward();
			result = "Nevigate to forward";
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setExecutionResult(result);
			Vars.setRes_type(Constant.Executed);
			break;
		case Constant.Browserrefresh:
			Constant.driver.navigate().refresh();
			result = "Nevigate refreshed";
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setExecutionResult(result);
			Vars.setRes_type(Constant.Executed);
			break;
		}
	}
	/***************
	 * Launch app for browser name and url defined in constant that gets updated either from test set or from release 
	 * @param vars
	 * @throws Exception 
	 */
	private static void LaunchApp(LocalTC vars) throws Exception {
		if (Constant.driver == null) {
			Constant.driver = BrowserFactory.getBrowser(vars);
			if(null != vars.getObjProp()){
				Constant.driver.get(vars.getObjProp());
				Constant.driver.get("javascript:document.getElementById('overridelink').click();");
			}

			result = "Driver has been created for " + vars.getbrowsername();
			vars.setExecutionResult(result);
			vars.setExecutionStatus(Constant.Passed);
			vars.ExecutionResult = result;
			screenShot(vars);
			vars.setRes_type(Constant.Executed);
		}
		if(vars.getEvent().equals(Constant.NavigateTo)){
			Constant.driver =BrowserFactory.getBrowser(vars);
			Constant.driver.get(vars.getObjProp());
			result = "Navigated to " + vars.getObjProp();
			vars.setExecutionResult(result);
			vars.ExecutionResult = result;
			vars.setExecutionStatus(Constant.Passed);
			screenShot(vars);
			vars.setRes_type(Constant.Executed);
		}
		Constant.actions = new Actions(Constant.driver);
	}

	/**
	 * @param vars
	 * @throws IOException
	 * browser close
	 */
	private static void ClossApp(LocalTC vars) throws IOException {
		Constant.driver.close();
		Constant.driver = null;
		result = "Browser has been closed";
		vars.setExecutionResult(result);
		vars.setExecutionStatus(Constant.Passed);
		vars.setRes_type(Constant.Executed);
	}

	/**
	 * @param Vars
	 * @throws Exception
	 */
	private static void PerformAction(LocalTC Vars) throws Exception {
		ObjectName = Vars.getObjProp().replace("obj=", "").toLowerCase();
		ObjectType = Vars.getObj(); 
		ObjectEvent = Vars.Event.toLowerCase();
		ObjectTestData=Vars.getTestdata().replace("\"", "");
		if (ObjectTestData.startsWith("#") && !ObjectEvent.equalsIgnoreCase("ok"))
			ObjectTestData = Vars.map.get(ObjectTestData.replace("#", ""));
		if (ObjectName != "")
			Vars.Locator = Vars.obj.getLocator(ObjectName);
		else Vars.Locator = null;
		if(null != Vars.Locator)
			Vars.elem = Vars.obj.findelement(Vars.Locator) ;
		if (Vars.elem !=null || ObjectType.equalsIgnoreCase("alert") || ObjectType.equalsIgnoreCase("dialog"))
			dCellAction(Vars);
		else {
			result="Element is missing";
			Vars.setExecutionStatus(Constant.Blocked);
			Vars.setExecutionResult(result);
			screenShot(Vars);
			Vars.setRes_type(Constant.Blocked);
		}
	}

	/**
	 * @param Vars
	 * @throws Exception
	 * wait for driver to the given specified time
	 */
	private static void waitfor(LocalTC Vars) throws Exception {
		ObjectName = Vars.getObjProp().replace("obj=", "").toLowerCase();
		ObjectType = Vars.getObj(); 
		ObjectEvent = Vars.Event.toLowerCase();
		ObjectTestData=Vars.getTestdata().replace("\"", "");
		if (ObjectTestData.startsWith("#"))
			ObjectTestData = Vars.map.get(ObjectTestData.replace("#", ""));
		By Locator;
		WebDriverWait wdw = new WebDriverWait(Constant.driver, Long.parseLong(Vars.getEvent()));
		if (ObjectName.isEmpty()){
			Thread.sleep(Long.parseLong(Vars.getEvent()));
			result = "waited for " + Vars.getEvent();
			Vars.setExecutionResult(result);
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setRes_type(Constant.Executed);
		}
		else
		{
			Locator = Vars.obj.getLocator(ObjectName);
			wdw.until(ExpectedConditions.elementToBeClickable(Locator));
			result = "waited for object " + ObjectName ;
			Vars.setExecutionResult(result);
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setRes_type(Constant.Executed);
		}
	}

	/**
	 * @param Vars
	 * @throws Exception
	 */
	public static void dCellAction(LocalTC Vars) throws Exception {
		try {
			int windowFound = 0;
			if(Constant.driver == null) {
				Constant.driver =BrowserFactory.getBrowser(Vars);
			}

			if (Vars.elem == null) {
				return;
			} else {
				switch (ObjectEvent) {
				case Constant.GetCount:
					switch (ObjectType.toLowerCase()){
					case Constant.DropDown:
						Select select = new Select(Vars.elem);
						Vars.map.put(ObjectTestData, select.getOptions().size()+"");
						break;
					case "xpath":
						Vars.map.put(ObjectTestData,Constant.driver.findElements(Vars.Locator).size()+"");
						break;
					}
					break;
				case Constant.Set:
					if (ObjectType.equalsIgnoreCase("textbox") || ObjectType.equalsIgnoreCase("textarea")) {
						Vars.elem.click();
						Vars.elem.clear();	
						StringBuffer inputvalue = new StringBuffer();
						if (ObjectTestData == "nodatarow" || ObjectTestData == "") {
							Vars.elem.clear();
							Vars.ExecutionResult = "Unable to entered ";
							Vars.setExecutionStatus(Constant.Caution);
							screenShot(Vars);
							Vars.setRes_type(Constant.Missing);
						} else {
							inputvalue.append(ObjectTestData);
							Vars.elem.sendKeys(org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a"), ObjectTestData);
							//inputvalue.append(ObjectTestData);
							//Vars.elem.sendKeys(org.openqa.selenium.Keys.chord(org.openqa.selenium.Keys.CONTROL, "a"), ObjectTestData);
							result = "Value has been entered";
							Vars.setExecutionStatus(Constant.Passed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Executed);
						}
					} else {
						Vars.elem.sendKeys(ObjectTestData);
						result = "Value has been entered";
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Executed);
					}
					break;
				case Constant.SelectFromSpanDropDown:
					List<WebElement> element = Vars.elem.findElements(By.tagName("li"));
					boolean bflag = false;
					if (ObjectTestData.contains("index:")) {
						String[] index = ObjectTestData.split(":");
						element.get(Integer.parseInt(index[1])).click();
						result = "Index has been selected from a span drop down";
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Executed);
						bflag = true;
						break;
					} else {
						for (int i = 0; i < element.size(); i++) {
							String temp = element.get(i).getText();
							if (temp.equalsIgnoreCase(ObjectTestData)) {
								element.get(i).click();
								result = "Value has been selected from a span drop down";
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
								bflag = true;
								break;
							}
						}
					}
					if (!bflag) {
						element.get(1).click();
						result = "Could not found value in dropdown";
						Vars.setExecutionStatus(Constant.Caution);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Missing);
					}
					break;
				case Constant.Listselect:
					if (Vars.Obj.equalsIgnoreCase("listbox")) {
						int foundCount = 0;
						String str = testObjectTestData(ObjectTestData);
						//ObjectTestData = ObjectTestData.replaceAll("\\s","");
						String[] listvalues = ObjectTestData.split(str);
						List<WebElement> listboxitems = Vars.elem
								.findElements(By.tagName("option"));
						Select chooseoptn = new Select(Vars.elem);
						chooseoptn.deselectAll();
						if (ObjectTestData == "nodatarow") {
							result = "Value could not be selected";
							Vars.setExecutionStatus(Constant.Caution);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Missing);
						} else {
							for (WebElement opt : listboxitems) {
								for (int i = 0; i < listvalues.length; i++) {
									if (opt.getText().equalsIgnoreCase(listvalues[i].trim())) {
										chooseoptn.selectByVisibleText(opt.getText());
										foundCount = foundCount + 1;
									}
								}
							}
							if (foundCount == 0	&& ObjectTestData.contains(""))
							{   
								result="Value not available";
								Vars.setExecutionStatus(Constant.Failed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.NoBlankAvailable);
							} else {
								result="Value has been selected executed for " + ObjectEvent + " on " + Vars.Testdata;
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							}
						}
					} else {
						//Log.info(Constant.Action1);
					}
					break;

				case Constant.Select: // select "text" from obj=select ; select "index:1" from obj=select
					if (Vars.Obj.equalsIgnoreCase("combobox")) {
						if (!ObjectTestData.isEmpty()) {
							if(ObjectTestData.contains("index:"))
							{
								String[] index = ObjectTestData.split(":");
								new Select(Vars.elem).selectByIndex(Integer.parseInt(index[1]));
							}
							else
								new Select(Vars.elem).selectByVisibleText(ObjectTestData);
							result="Value selected";
							Vars.setExecutionStatus(Constant.Passed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Executed);
						} else if (ObjectTestData == "nodatarow") {
							screenShot(Vars);
							result = "Value could not be selected - missing " ;
							Vars.setExecutionStatus(Constant.Caution);
							Vars.setExecutionResult(result);
							Vars.setRes_type(Constant.Missing);
						}
						else {
							if (new Select(Vars.elem).getOptions().toString()
									.contains("") == true) {
								try {
									new Select(Vars.elem)
									.selectByVisibleText("");
									Vars.setExecutionStatus(Constant.Passed);
									result = "Value selected " ;
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.Executed);
								} catch (Exception e) {
									result = "Value could not be selected " ;
									Vars.setExecutionStatus(Constant.Failed);
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.NoBlankAvailable);
								}
							} else {
								result = "Value could not be selected " ;
								Vars.setExecutionStatus(Constant.Failed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.NoBlankAvailable);
							}
						}
					} else {
						result = "Object not available" ;
						Vars.setExecutionStatus(Constant.Blocked);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Blocked);
					}
					break;
				case Constant.Check:
					if (ObjectTestData == "nodatarow") {
						result = "data is missing " ;
						Vars.setExecutionStatus(Constant.Caution);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Missing);
					} else {
						if (Vars.Obj.equalsIgnoreCase("checkbox")) {
							if (Vars.elem.isSelected()	&& ObjectTestData.equalsIgnoreCase("On")) {
								result =   "Value has been checked";
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							} else if ((Vars.elem.isSelected() && ObjectTestData.equalsIgnoreCase("off"))) {
								Vars.elem.click();
								Vars.setExecutionStatus(Constant.Passed);
								result =   "Value has been checked";
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							} else if (ObjectTestData.equalsIgnoreCase("on")) {
								Vars.elem.click();
								Vars.setExecutionStatus(Constant.Passed);
								result =   "Value has been checked";
								screenShot(Vars);
								Vars.setExecutionResult(result);
								Vars.setRes_type(Constant.Executed);
							} else if ((ObjectTestData
									.equalsIgnoreCase("off"))) {
								Vars.setExecutionStatus(Constant.Passed);
								result =   "Value has been checked";
								screenShot(Vars);
								Vars.setExecutionResult(result);
								Vars.setRes_type(Constant.Executed);
							} else {
								result =   "Could not be checked";
								Vars.setExecutionStatus(Constant.Failed);
								screenShot(Vars);
								Vars.setExecutionResult(result);
								Vars.setRes_type(Constant.Failed);
							}
						} else {
							result =   "Could not be checked";
							Vars.setExecutionStatus(Constant.Failed);
							screenShot(Vars);
							Vars.setExecutionResult(result);
							Vars.setRes_type(Constant.Action1);
						}  
					}
					break;
				case Constant.Click: //Click on obj="object" 
					//parentWindowHandle1 = driver.getWindowHandle();
					try {
						//click on table obj=webtable in column 7 with "title:contains(Extend)"
						//click on table obj=webtable in column 7 with "title:#Extend"
						//search in 7th column and click on 12th column 
						//click on table obj=webtable in column 7 with "text:#Extend:12"
						//click on table obj=webtable in column 7 index 3 for 7 times/rows with "text:#Extend:12"
						//click on table obj=webtable in column 7 with "value:Extend"
						if(ObjectType.equalsIgnoreCase("table")) {
							int row,j=1;//,rowindex; // to hold number of rows in the webtable
							boolean foundtext=false;
							boolean fcontains=false;
							String elementText =""; // to hold the text of the element in a cell
							int column=0,index = 0; //holds column to click on
							int rowcount=0,rowcounter=0; //How many rows to select
							int rowtoread; //hold which row to read from
							WebElement clickonelement; // hold the element in cell
							List<WebElement> childelementstoread,colelements; // hold the list of elements in column and cell
							//List<WebElement> childelementstoclick;
							String[] arr;
							List<WebElement> rows = Vars.elem.findElements(By.tagName("tr")); // get all row element
							row = rows.size(); //count number of rows
							String[] attribute = ObjectTestData.split(":"); //get on what property should we compare
							/*       Pattern pattern = Pattern.compile("[0-9]+");
						       Matcher matcher = pattern.matcher(Vars.sTestStep);
						       if(matcher.find()){
						    	   column = Integer.parseInt(matcher.group(0));
						    	   if (matcher.groupCount() >1)
						    		   if (Vars.sTestStep.toLowerCase().contains("index"))
						    			   index = 	Integer.parseInt(matcher.group(1));   
					       }*/
							elementText = Vars.sTestStep.replaceAll("[^-?0-9]+", " ");
							arr = elementText.trim().split(" ");
							column = Integer.parseInt(arr[0]);
							if (Vars.sTestStep.toLowerCase().contains("contains"))
								fcontains = true;
							if (Vars.sTestStep.toLowerCase().contains("index")){
								index = Integer.parseInt(arr[1]);
								if(arr.length > 2)
									rowcount = Integer.parseInt(arr[2]);
							}
							else
								if (Vars.sTestStep.toLowerCase().contains(" rows ") || Vars.sTestStep.toLowerCase().contains(" times ")) 
									rowcount = Integer.parseInt(arr[1]); 
							if(attribute.length > 2)
								rowtoread = Integer.parseInt(attribute[2]);
							else
								rowtoread = column;
							if(attribute[1].contains("#"))
								attribute[1] = Vars.map.get(attribute[1].replace("#", ""));
							for(int i=1; i<=row;i++){
								//if(rowindex == 0 && row > rowindex)
								colelements = rows.get(i).findElements(By.tagName("td"));
								//else
								// colelements = rows.get(rowindex).findElements(By.tagName("td"));
								elementText=colelements.get(rowtoread-1).getText().toLowerCase();
								if(elementText.equalsIgnoreCase("")){
									childelementstoread = colelements.get(rowtoread-1).findElements(By.xpath(".//*"));
									for(j=1;j<=childelementstoread.size();j++){
										clickonelement = childelementstoread.get(j-1);
										if(attribute[0].contains("text"))
											elementText=clickonelement.getText().toLowerCase();
										else
											elementText=clickonelement.getAttribute(attribute[0]).toLowerCase();
									}
								}
								if(fcontains){
								if (elementText.contains(attribute[1].trim()))
									foundtext = true;
								}
								else
								if (elementText.equalsIgnoreCase(attribute[1].trim()))
									foundtext = true;
								if (foundtext == true){
									clickonelement = colelements.get(column-1).findElements(By.xpath(".//*")).get(index);
									Constant.actions.moveToElement(clickonelement).click().perform();
									rowcounter++;
									if(rowcounter>=rowcount){
										i = row+1; // break the for loop for row
										//j = childelementstoread.size()+1; // break the for loop for childs in cell
									}
								}
							}
						}
						else {  
							if (Vars.elem.getAttribute("type") !=null){
								if (Vars.elem.getAttribute("type").toLowerCase().equals("file")
										&& Vars.getbrowsername().equalsIgnoreCase("firefox")) {
									JavascriptExecutor executor = (JavascriptExecutor) Constant.driver;
									executor.executeScript("arguments[0].click();",Vars.elem);
									result="Clicked on file type object in firefox";
									Vars.setExecutionStatus(Constant.Passed);
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.Executed);
									break;
								} else if (Vars.elem.getAttribute("type").toLowerCase().equals("file")
										&& Vars.getbrowsername().equalsIgnoreCase("ie")
										&& Integer.parseInt(Vars.getBrowserVer()) == 8) {
									result="Clicked on file type object in IE";
									Vars.setExecutionStatus(Constant.Passed);
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.Executed);
								}
								else{
									Vars.elem.click();
									result="Clicked on object";
									Vars.setExecutionStatus(Constant.Passed);
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.Executed);
								}
							}
							else{
								Vars.elem.click();
								result="Clicked on object";
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							}
						}
					} catch (Exception exp1) {
						Vars.elem.click();
						result="Clicked with exception :" + exp1.getMessage();
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Executed);
					}
					break;
				case Constant.Hover:
					JavascriptExecutor js = (JavascriptExecutor) Constant.driver;
					String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
					js.executeScript(mouseOverScript, Vars.elem);
					result="Mouse hover action has been performed";
					Vars.setExecutionStatus(Constant.Passed);
					Vars.setExecutionResult(result);
					screenShot(Vars);
					Vars.setRes_type(Constant.Executed);
					break;
				case Constant.Altclick:
					JavascriptExecutor executor = (JavascriptExecutor) Constant.driver;
					executor.executeScript("arguments[0].click();", Vars.elem);
					result="Alt clicked";
					Vars.setExecutionStatus(Constant.Passed);
					Vars.setExecutionResult(result);
					screenShot(Vars);
					Vars.setRes_type(Constant.Executed);
					break;
				case Constant.Enter:
					Vars.elem.sendKeys(org.openqa.selenium.Keys.ENTER);
					result="Hit the enter button";
					Vars.setExecutionStatus(Constant.Passed);
					Vars.setExecutionResult(result);
					screenShot(Vars);
					Vars.setRes_type(Constant.Executed);
					break;
				case Constant.Tab:
					Vars.elem.sendKeys(org.openqa.selenium.Keys.TAB);
					result="Tab the tab button";
					Vars.setExecutionStatus(Constant.Passed);
					Vars.setExecutionResult(result);
					screenShot(Vars);
					Vars.setRes_type(Constant.Executed);
					break;
				case Constant.Setdate:
					Robot robot1 = new Robot();
					ObjectName.toLowerCase();
					if (ObjectType.equalsIgnoreCase("calendar")) {
						try {
							String[] datearray = ObjectTestData.split("-");
							String mm = datearray[0];
							String dd = datearray[1];
							String yyyy = datearray[2];
							if (Integer.parseInt(mm) > 12
									|| Integer.parseInt(mm) < 1
									|| Integer.parseInt(yyyy) < 1000
									|| Integer.parseInt(yyyy) > 2999
									|| Integer.parseInt(yyyy) < 1700
									|| ((Integer.parseInt(dd) > 30) && (Integer
											.parseInt(dd) == 2
											|| Integer.parseInt(dd) == 4
											|| Integer.parseInt(dd) == 6
											|| Integer.parseInt(dd) == 9 || Integer
											.parseInt(dd) == 11))
									|| (Integer.parseInt(dd) > 28
											&& Integer.parseInt(mm) == 2 && (Integer
													.parseInt(yyyy) % 4 != 0))) {
								result="Invalida Date";
								Vars.setExecutionStatus(Constant.Blocked);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Invaliddate1);
							} else {
								Vars.obj.selectDate(mm, dd, yyyy);
							}

						} catch (Exception e) {
							result="Invalida Date";
							Vars.setExecutionStatus(Constant.Blocked);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Invaliddate1);
							robot1.keyPress(KeyEvent.VK_ESCAPE);
							robot1.keyRelease(KeyEvent.VK_ESCAPE);
						}
					} else {
						result="Invalida Date";
						Vars.setExecutionStatus(Constant.Blocked);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Calendaraction);
					}
					break;
				case Constant.Ok:
					if (ObjectType.equalsIgnoreCase("dialog")
							|| ObjectType.equalsIgnoreCase("dialog;")
							|| ObjectType.equalsIgnoreCase("alert")) {
						dialogSwitch = Constant.driver.switchTo().alert();
						String dialogSwitchText = dialogSwitch.getText();
						String VarTestData = Vars.getTestdata().replace("#", "");
						if (! VarTestData.equals(""))
							Vars.map.put(VarTestData, dialogSwitchText);
						dialogSwitch.accept();
						result="Ok has been performed on alert with text " + dialogSwitchText ;
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Executed);
					}
					break;
				case Constant.Cancel:
					if (ObjectType.equalsIgnoreCase("dialog")
							|| ObjectType.equalsIgnoreCase("dialog;")
							|| ObjectType.equalsIgnoreCase("alert")) {
						dialogSwitch = Constant.driver.switchTo().alert();
						String VarTestData = Vars.getTestdata().replace("#", "");
						if (! VarTestData.equals(""))
							Vars.map.put(VarTestData, dialogSwitch.getText());
						dialogSwitch.dismiss();
						result="cancle has been performed on alert with text " + dialogSwitch.getText() ;
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Executed);
					}
					break;

				case Constant.Close:
					if (ObjectType.equalsIgnoreCase("dialog")
							|| ObjectType.equalsIgnoreCase("dialog;")
							|| ObjectType.equalsIgnoreCase("alert")) {

						dialogSwitch = Constant.driver.switchTo().alert();
						dialogSwitch.dismiss();
						result="Dialog has been closed";
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						Vars.setRes_type(Constant.Executed);
						if (Vars.captureperform == true) {
							screenShot(Vars);
						}
					}
					else {
						windowFound = 0;
						int windowNums = 0;
						int windowItr = 0;
						String currentWindowHandle = Constant.driver.getWindowHandle();
						WebDriver newWindow = null;
						Set<String> al = new HashSet<String>();
						al = Constant.driver.getWindowHandles();
						windowNums = al.size();
						Iterator<String> windowIterator = al.iterator();
						if (ObjectName.equalsIgnoreCase("page;")
								|| ObjectName.equalsIgnoreCase("page")) {
							if (windowNums == 1) {
								Constant.driver.close();
								result="Dialog has been closed";
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
								windowFound = 1;
							} else {
								int winItr1 = 0;
								String windowHandle = null;
								String tempWindowHandle = null;
								while (winItr1 != windowNums) {
									tempWindowHandle = windowHandle;
									windowHandle = windowIterator.next();
									newWindow = Constant.driver.switchTo().window(
											windowHandle);
									if (currentWindowHandle
											.equalsIgnoreCase(windowHandle)) {
										if (winItr1 == 0) {
											Constant.driver.close();
											windowHandle = windowIterator
													.next();
											Constant.driver.switchTo().window(windowHandle);
											result="Dialog has been closed";
											Vars.setExecutionStatus(Constant.Passed);
											Vars.setExecutionResult(result);
											screenShot(Vars);
											Vars.setRes_type(Constant.Executed);
											windowFound = 1;
											break;
										} else {
											Constant.driver.close();
											Constant.driver.switchTo().window(
													tempWindowHandle);
											result="Dialog has been closed";
											Vars.setExecutionStatus(Constant.Passed);
											Vars.setExecutionResult(result);
											screenShot(Vars);
											Vars.setRes_type(Constant.Executed);
											windowFound = 1;
											break;
										}
									}
									winItr1++;
								}
							}
						} else {
							if (windowNums == 1) {
								if (Constant.driver.getTitle().toString()
										.equalsIgnoreCase(ObjectTestData) == true) {
									if (Vars.captureperform == true) {
										screenShot(Vars);
									}
									Constant.driver.close();
									result="Dialog has been closed";
									Vars.setExecutionStatus(Constant.Passed);
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.Executed);
									windowFound = 1;
								}
							} else {
								if (ObjectType.equalsIgnoreCase("page")
										&& Constant.driver.getTitle().equalsIgnoreCase(
												ObjectName) == false) {
									for (windowItr = 0; windowItr < windowNums; windowItr++) {
										String windowHandle = windowIterator.next();
										newWindow = Constant.driver.switchTo().window(
												windowHandle);
										if (newWindow.getTitle()
												.equalsIgnoreCase(ObjectName)) {
											if (Vars.captureperform == true) {
												screenShot(Vars);
											}
											newWindow.close();
											result="Dialog has been closed";
											Vars.setExecutionStatus(Constant.Passed);
											Vars.setExecutionResult(result);
											screenShot(Vars);
											Vars.setRes_type(Constant.Executed);
											Constant.driver.switchTo().window(
													currentWindowHandle);
											windowFound = 1;
											break;
										}
									}

								} else {
									if (ObjectType.equalsIgnoreCase("page")
											&& Constant.driver.getTitle()
											.toString()
											.equalsIgnoreCase(
													ObjectName) == true) {
										int winItr1 = 0;
										String windowHandle = null;
										String tempWindowHandle = null;
										while (winItr1 != windowNums) {
											tempWindowHandle = windowHandle;
											windowHandle = windowIterator
													.next();
											newWindow = Constant.driver.switchTo().window(
													windowHandle);
											if (currentWindowHandle
													.equalsIgnoreCase(windowHandle)) {
												if (winItr1 == 0) {
													if (Vars.captureperform == true) {
														screenShot(Vars);
													}
													Constant.driver.close();
													windowHandle = windowIterator
															.next();
													Constant.driver.switchTo().window(
															windowHandle);
													result="Dialog has been closed";
													Vars.setExecutionStatus(Constant.Passed);
													Vars.setExecutionResult(result);
													screenShot(Vars);
													Vars.setRes_type(Constant.Executed);
													windowFound = 1;
													break;
												} else {
													Constant.driver.close();
													Constant.driver.switchTo().window(
															tempWindowHandle);
													result="Dialog has been closed";
													Vars.setExecutionStatus(Constant.Passed);
													Vars.setExecutionResult(result);
													screenShot(Vars);
													Vars.setRes_type(Constant.Executed);
													windowFound = 1;
													break;

												}
											}

											winItr1++;
										}

									}
								}
							}
						}
						if (windowFound != 1) {
							result="Dialog has not been closed";
							Vars.setExecutionStatus(Constant.Blocked);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.NoWindowFound);
						}
					}
					break;
				default:
					result="No action available";
					Vars.setExecutionStatus(Constant.Blocked);
					Vars.setExecutionResult(result);
					screenShot(Vars);
					Vars.setRes_type(Constant.Action);
					break;
				}
			}
		} catch (Exception e) {
			result="No action available";
			Vars.setExecutionStatus(Constant.Blocked);
			Vars.setExecutionResult(result);
			screenShot(Vars);
			Vars.setRes_type(Constant.Blocked);
			Vars.setExceptionVar(e.toString());
		}
	}

	/**
	 * @param functionName
	 * @param argumentlist
	 * @throws IOException
	 */
	public static void func_InvokeFunction(String functionName,	String argumentlist) throws IOException 
	{
		Object[] argument_list = null;
		int checkNULL = 0;
		int CheckONE = 0;
		Class[] parameterTypes = null;
		Constant.Vars.setTestdata(argumentlist);
		if (argumentlist.isEmpty()) {
			checkNULL = 1;
		} else if (argumentlist.contains("#&")) {
			argument_list = argumentlist.split("#&");
			Constant.Vars.setTestdata(argumentlist); 
		} else {
			CheckONE = 1;
		}
		String function_name = functionName;
		try {
			functionLibary s1 = new functionLibary();
			Method[] declaredMethods = functionLibary.class.getDeclaredMethods();
			for (Method m : declaredMethods) {
				if (checkNULL != 1) {
					parameterTypes = m.getParameterTypes();
				}
				if (checkNULL == 0) {
					if ((m.getName()).equals(function_name)) {
						if (parameterTypes.length > 1) {
							if (parameterTypes.length == argument_list.length) {
								try {
									m.invoke(s1, argument_list);
									result="Function called";
									Constant.Vars.setExecutionStatus(Constant.Passed);
									Constant.Vars.setExecutionResult(result);
									Constant.Vars.setRes_type(Constant.Executed);
								} catch (Exception e) {
									result="User defined error: Direcotry is already Created";
									Constant.Vars.setExecutionStatus(Constant.Caution);
									Constant.Vars.setExecutionResult(result);
									Constant.Vars.setRes_type(Constant.Userdefined);
								}
								break;
							}

						} else if ((m.getName()).equals(function_name)
								&& CheckONE == 1 && parameterTypes.length == 1) {
							try {
								m.invoke(s1, argumentlist);
								result="Function called";
								Constant.Vars.setExecutionStatus(Constant.Passed);
								Constant.Vars.setExecutionResult(result);
								Constant.Vars.setRes_type(Constant.Executed);
								Constant.Vars.setExecutionStatus(Constant.Passed);
							} catch (Exception e) {
								result="function failed to called";
								Constant.Vars.setExecutionStatus(Constant.Failed);
								Constant.Vars.setExecutionResult(result);
								Constant.Vars.setRes_type(Constant.Failed);
							}
							break;
						}
					}
				} else if (m.getName().equals(function_name) && checkNULL == 1) {
					try {
						m.invoke(s1);
						result="Function called";
						Constant.Vars.setExecutionStatus(Constant.Passed);
						Constant.Vars.setExecutionResult(result);
						Constant.Vars.setRes_type(Constant.Executed);
					} catch (Exception e) {
						result="function failed to called";
						Constant.Vars.setExecutionStatus(Constant.Failed);
						Constant.Vars.setExecutionResult(result);
						Constant.Vars.setRes_type(Constant.Failed);
					}
					break;
				}
			}
		} catch (Exception e) {
			result="Calling function is failed" + e.getMessage();
			Constant.Vars.setExecutionStatus(Constant.Failed);
			Constant.Vars.setExecutionResult(result);
			Constant.Vars.setRes_type(Constant.Failed);
			Constant.Vars.setExceptionVar(e.toString());
		}
	}
	
	/**
	 * resettig the loop
	 */
	public static void Resetloop(){
		Constant.Vars.startrow = -1;                    
		Constant.Vars.dtrownum = 1;					
		Constant.Vars.loopnum = -1;  
		Constant.Vars.loopsize = -1;
		for (int z = 0; z < 1; z++) 
		{
			Constant.Vars.loopstart[z] = 0;
			Constant.Vars.loopend[z] = 0;
			Constant.Vars.loopcnt[z] = 0;
			Constant.Vars.dtrownumloop[z] = 1;
			Constant.Vars.loopcount[z] = 0;
			Constant.Vars.loopTestCases[z] = "";
			Constant.Vars.loopTestData[z] = "";
			Constant.Vars.loopTestStepID[z] = "";
		}
	}

	/**
	 * @param Vars
	 * @throws Exception
	 * method for performing arithmetic operation
	 */
	private static void func_Arith(LocalTC Vars) throws Exception {
		String objectType = Vars.getObj().replace("#", "");     
		String ObjectValCh = Vars.getObjProp().replace("#", "");
		String ObjectEventCh = Vars.getEvent();                             
		String ObjectTestDataCh = Vars.getTestdata().replace("#", "");
		String result = "";
		if (Vars.map.containsKey(ObjectValCh)) 
			ObjectValCh = Vars.map.get(ObjectValCh);
		else if(! Utils.isInteger(ObjectValCh)){
			Vars.map.put(ObjectValCh,"0");
			ObjectValCh = "0";
		}
		if (Vars.map.containsKey(ObjectTestDataCh)) 
			ObjectTestDataCh = Vars.map.get(ObjectTestDataCh);
		else if(! Utils.isInteger(ObjectTestDataCh)){
			Vars.map.put(ObjectTestDataCh,"0");
			ObjectTestDataCh = "0";
		}
		if (Vars.map.containsKey(objectType)) 
			Vars.map.remove(objectType);
		else if(! Utils.isInteger(objectType))
			Vars.map.put(objectType,"0");

		switch (ObjectEventCh) {
		case "+":
			if(ObjectValCh.contains("_")){
				SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
				Calendar c = Calendar.getInstance();
				c.setTime(sdf.parse(ObjectEventCh));
				c.add(Calendar.DATE, Integer.parseInt(ObjectTestDataCh));  // number of days to add
				result = sdf.format(c.getTime());  // dt is now the new date
			}
			else
				result = Integer.parseInt(ObjectValCh) + Integer.parseInt(ObjectTestDataCh) + "";
			break;
		case "-":
			if(ObjectValCh.contains("_")){
				SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
				Calendar c = Calendar.getInstance();
				c.setTime(sdf.parse(ObjectEventCh));
				c.add(Calendar.DATE, Integer.parseInt(ObjectEventCh+ObjectTestDataCh));  // number of days to subtract
				result = sdf.format(c.getTime());  // dt is now the new date
			}
			else
				result = Integer.parseInt(ObjectValCh) - Integer.parseInt(ObjectTestDataCh) + "";
			break;
		case "/":
			result = Integer.parseInt(ObjectValCh) / Integer.parseInt(ObjectTestDataCh) + "";
			break;
		case "*":
			result = Integer.parseInt(ObjectValCh) * Integer.parseInt(ObjectTestDataCh) + "";
			break;
		case "%":
			result = Integer.parseInt(ObjectValCh) *  Integer.parseInt(ObjectTestDataCh) / 100 + "";
			break;
		}
		result = "Arithmetic expression has been performed";
		Vars.setExecutionStatus(Constant.Passed);
		Vars.setExecutionResult(result);
		screenShot(Vars);
		Vars.setRes_type(Constant.Executed);
		Vars.map.put(objectType, result + "");
	}

	/**
	 * @param Vars
	 * @throws Exception
	 */
	private static void func_StoreCheck(LocalTC Vars) throws Exception {
		//checking different actions - check value for element obj=username as "bharat.sethi"/#var1
		try {
			String actval = null;
			String expval = null;
			Boolean boolval = null;
			String varname;
			boolean bFound = false;
			int iflag =0;
			String objectType = Vars.getObj();     
			String ObjectValCh = Vars.getObjProp();
			String ObjectEventCh = Vars.getEvent();                             
			String ObjectTestDataCh = Vars.getTestdata();
			int DTcolumncountCh = 0;
			expval = ObjectTestDataCh;
			if (!ObjectTestDataCh.isEmpty() && ObjectTestDataCh.substring(0, 1).equalsIgnoreCase("#") && Vars.getAction().equals("check")) {
				if (Vars.map.get(ObjectTestDataCh.substring(1,(ObjectTestDataCh.length()))) != null) {
					ObjectTestDataCh = Vars.map.get(ObjectTestDataCh.substring(1,(ObjectTestDataCh.length())));
				}
			}
			if (objectType.equalsIgnoreCase("page")|| objectType.equalsIgnoreCase("dialog")) {
				Vars.objFoundFlag = 1;
			} else

			{
				bFound = true;
				if(ObjectValCh.equalsIgnoreCase("contains") || ObjectValCh.equalsIgnoreCase("equals") || ObjectValCh.equalsIgnoreCase(" not equals"))
				{
					if (Vars.map.get(objectType.substring(1,(objectType.length()))) != null) {
						objectType = Vars.map.get(objectType.substring(1,(objectType.length())));
					} else {
						objectType = "";
					}
					if (Vars.map.get(ObjectEventCh.substring(1,(ObjectEventCh.length()))) != null) {
						ObjectEventCh = Vars.map.get(ObjectEventCh.substring(1,(ObjectEventCh.length())));
					} else {
						ObjectEventCh = "";
					}
					actval = objectType;
					expval =  ObjectEventCh;
					switch(ObjectValCh){
					case "contains":
						if (actval.contains(expval)) {
							result = "Actual value contains expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval;
							Vars.setExecutionStatus(Constant.Passed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Executed);
						}
						else{
							result = "Actual value does not contain expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval;
							Vars.setExecutionStatus(Constant.Failed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Failed);
						}
						break;
					case "equals":
						if (actval.equalsIgnoreCase(expval)) {
							result = "Actual value equals expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval;
							Vars.setExecutionStatus(Constant.Passed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Executed);
						}
						else{
							result = "Actual value is not matching expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval;
							Vars.setExecutionStatus(Constant.Failed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Failed);
						}							
						break;
					case "not equals":
						if (! actval.equalsIgnoreCase(expval)) {
							result = "Actual value is not matching expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval;
							Vars.setExecutionStatus(Constant.Passed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Executed);
						}
						else{
							result = "Actual value matches expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval;
							Vars.setExecutionStatus(Constant.Failed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Failed);
						}
						break;	
					}
				}else if (ObjectValCh.equals("displayed") || ObjectValCh.equals("display")) {
					List<WebElement> listDisplay = Constant.driver
							.findElements(By.xpath("//*[contains(text(),'" + ObjectTestDataCh + "')]"));
					if (listDisplay.size() == 0) {
						listDisplay = Constant.driver
								.findElements(By.xpath("//*[contains(@value,'" + ObjectTestDataCh + "')]"));
					}
					if(listDisplay.size()>0){
						result = "\"" + ObjectTestDataCh + "\" is found";
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Executed);
					}else{
						result = "\"" + ObjectTestDataCh + "\" is not found";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
					}
				}
				else {
					Vars.elem = Vars.obj.findelement(Vars.obj.getLocator(ObjectValCh)) ;
					if (Vars.elem != null) {
						Vars.objFoundFlag = 1;
						if (ObjectEventCh.equalsIgnoreCase(Constant.Equals) || ObjectEventCh.equalsIgnoreCase(Constant.NotEquals)
								|| ObjectEventCh.equalsIgnoreCase(Constant.Contains) || ObjectEventCh.equalsIgnoreCase(Constant.Getattribute)) {
							boolean bflag = false;
							String elemAttribute = Vars.elem.getAttribute(objectType);
							if(objectType.equals("href") && elemAttribute.contains("mailto:")){
								elemAttribute = elemAttribute.split(":")[1];
							}
							if(ObjectTestDataCh.contains("#")){
								ObjectTestDataCh = Vars.getTestdata().replace("#", "");
							}
							if (null != ObjectTestDataCh || !ObjectTestDataCh.isEmpty()) {
								Vars.map.put(ObjectTestDataCh, elemAttribute);
								bflag = true;
							} else {
								Vars.map.put(objectType, elemAttribute);
								bflag = true;
							}
							if (bflag) {
								result = "Attribute has been found";
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							} else {
								result = "Attribute has not found";
								Vars.setExecutionStatus(Constant.Failed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Failed);
							}
						}
					}

					else {
							switch (ObjectEventCh.toLowerCase()) {
							case Constant.Visible:
								actval = "false";
								break;
							case Constant.Exist:
								actval = "false";
								break;
							default:
								result = "Object not found";
								Vars.setExecutionStatus(Constant.Caution);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Missing);
								break;
							}
							if (expval.equalsIgnoreCase(actval)) {
								result = "Actual value matches with expected value. " + " Actual Value is " + actval
										+ " and expected value is " + expval;
								Vars.setExecutionResult(result);
								Vars.setExecutionStatus(Constant.Passed);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							} else {
								result = "Actual value does not matche with expected value. " + " Actual Value is "
										+ actval + " and expected value is " + expval;
								Vars.setExecutionResult(result);
								Vars.setExecutionStatus(Constant.Failed);
								screenShot(Vars);
								Vars.setRes_type(Constant.Failed);
							}
						
					}
				}
			}
			//DEAD CODE WILL NEVER BE CALLED
			//READING DATA FROM EXCEL CONSIDERING ALL THE VALUES ARE STORED THERE
			if (Vars.objFoundFlag == 1) {
				Vars.objFoundFlag = 0;
				if (!ObjectTestDataCh.isEmpty() && ObjectTestDataCh.contains("dt_")) {
					iflag = 0;
					String ObjectTestDatatableheader[] = ObjectTestDataCh.split("_");
					int column = 0;
					String Searchtext = ObjectTestDatatableheader[1];
					try {
						DTcolumncountCh = Vars.TestData.getColCount();
					} catch (NullPointerException e) {
						return;
					}
					for (column = 0; column < DTcolumncountCh; column++) {
						if(Searchtext.equalsIgnoreCase(Vars.TestData.getCellData(0, column))==true)
						{
							ObjectTestDataCh = Vars.TestData.getCellData(Vars.row, column);
							iflag = 1;
							if (ObjectTestDataCh.length() == 0) {
								ObjectTestDataCh = "";
							}  
						}
					}
					if (iflag == 0) {
						ObjectTestDataCh = "nodatarow";
						Vars.ORvalname = "exit";
					}
				}
				///////////////DEAD CODE
				switch (ObjectEventCh.toLowerCase()) {
				case Constant.Enabled:
					if (objectType.equalsIgnoreCase("textbox")
							|| objectType.equalsIgnoreCase("combobox")
							|| objectType.equalsIgnoreCase("listbox")
							|| objectType.equalsIgnoreCase("radiobutton")
							|| objectType.equalsIgnoreCase("button")
							|| objectType.equalsIgnoreCase("checkbox")
							|| objectType.equalsIgnoreCase("textarea")
							|| objectType.equalsIgnoreCase("image")
							|| objectType.equalsIgnoreCase("table")
							|| objectType.equalsIgnoreCase("link")
							|| objectType.equalsIgnoreCase("element")) {
						boolval = Vars.elem.isEnabled();
						actval = boolval.toString();
					} else {
						result="Object not found";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
					}
					break;
				case Constant.Text:
					// Specifications change for STH 
					if (objectType.equalsIgnoreCase("button")) {
						if (Vars.elem.getTagName().equalsIgnoreCase("button")) {
							actval = Vars.elem.getText();
						} else if (Vars.elem.getTagName().equalsIgnoreCase("input")) {
							actval = Vars.elem.getAttribute("value");
						} else {
							result="Object not found";
							Vars.setExecutionStatus(Constant.Failed);
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setRes_type(Constant.Failed);
						}
					} else if (objectType.equalsIgnoreCase("textbox")
							|| objectType.equalsIgnoreCase("textarea")) {
						actval = Vars.elem.getAttribute("value");

					} else if (objectType.equalsIgnoreCase("textelement")
							|| objectType.equalsIgnoreCase("element")) {
						actval = Vars.elem.getText();
						if(!expval.equals(actval))
							ObjectEventCh = "contains";

					} else if (objectType.equalsIgnoreCase("combobox")
							|| objectType.equalsIgnoreCase("listbox")) {
						List<WebElement> selectedList = new Select(Vars.elem).getAllSelectedOptions();
						actval = selectedList.get(0).getText();
						if(selectedList.size() > 1) {
							for(int i = 1; i < selectedList.size(); i++) {
								actval += ":" + selectedList.get(i).getText();
							}
						}
					} else {
						result="Object not found";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
					}
					break;
				case Constant.Value: //check/store value/text/enable/visible listbox/checkbox/radiobox/textbox/link as "ram:shayam:xx:yy:zz"
					if(objectType.equalsIgnoreCase("checkbox")
							|| objectType.equalsIgnoreCase("combobox")
							|| objectType.equalsIgnoreCase("radiobutton")
							|| objectType.equalsIgnoreCase("textbox")) {
						actval = Vars.elem.getAttribute("value");
					} else if(objectType.equalsIgnoreCase("listbox")) {
						List<WebElement> selectedList = new Select(Vars.elem).getAllSelectedOptions();
						actval = selectedList.get(0).getAttribute("value");
						if(selectedList.size() > 1) {
							for (int i = 1; i < selectedList.size(); i++) {
								actval += ":" + selectedList.get(i).getAttribute("value");
							}
						}
					} else {
						result="Value property not support for the object";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
					}
					break;
				case Constant.Visible:
					if (objectType.equalsIgnoreCase("textbox")
							|| objectType.equalsIgnoreCase("combobox")
							|| objectType.equalsIgnoreCase("listbox")
							|| objectType.equalsIgnoreCase("radiobutton")
							|| objectType.equalsIgnoreCase("button")
							|| objectType.equalsIgnoreCase("checkbox")
							|| objectType.equalsIgnoreCase("textarea")
							|| objectType.equalsIgnoreCase("image")
							|| objectType.equalsIgnoreCase("table")
							|| objectType.equalsIgnoreCase("link")
							|| objectType.equalsIgnoreCase("element")) {
						boolval = Vars.elem.isDisplayed();
						actval = boolval.toString();
					} else {
						result="Object not Found";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
					}
					break;
				case Constant.Checked:
					if ((objectType.equalsIgnoreCase("radiobutton")
							|| objectType.equalsIgnoreCase("checkbox") || objectType
							.equalsIgnoreCase("element"))) {
						boolval = Vars.elem.isSelected();
						actval = boolval.toString();

					} else {
						result="Object not selected";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
					}
					break;
				case Constant.Linktext:
					if (objectType.equalsIgnoreCase("link")) {
						actval = Vars.elem.getText();
					} else {
						result="Link not found";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
					}
					break;
				case Constant.Pagetitle:
					if (ObjectValCh != "") {
						actval = ObjectValCh;
					} else {
						actval = Constant.driver.getTitle();
					}
					break;

				case Constant.Exist:
					boolval = false;
					actval = boolval.toString();

					if ((objectType.equalsIgnoreCase("page")) == true

							&& (Constant.driver.getTitle().toString()
									.equalsIgnoreCase(ObjectValCh)) == true) {
						actval = "true";
					} else {
						if (objectType.equalsIgnoreCase("page")) {
							String currentWindowHandle = Constant.driver.getWindowHandle();
							int windowFound = 0;
							WebDriver newWindow = null;
							Set<String> al = new HashSet<String>();
							al = Constant.driver.getWindowHandles();
							Iterator<String> windowIterator = al.iterator();
							if (Constant.driver.getTitle().toString()
									.equalsIgnoreCase(ObjectValCh) != true) {
								while (windowIterator.hasNext()) {
									String windowHandle = windowIterator.next();
									newWindow = Constant.driver.switchTo().window(
											windowHandle);
									if (newWindow.getTitle().toString()
											.equalsIgnoreCase(ObjectValCh) == true) {
										boolval = true;
										actval = boolval.toString();
										windowFound = 1;
										break;
									}
								}
								if (windowFound != 1) {
									boolval = false;
									actval = boolval.toString();
								}
								Constant.driver.switchTo().window(currentWindowHandle);
							}
						} else {

							if (objectType.equalsIgnoreCase("dialog") == true) {
								try {

									Alert dialogExist = null;
									dialogExist = Constant.driver.switchTo().alert();
									if (dialogExist.toString() != null) {
										boolval = true;
										actval = boolval.toString();
									} else {
										boolval = false;
										actval = boolval.toString();
									}
								} catch (NoAlertPresentException e) {
									boolval = false;
									actval = boolval.toString();
								}
							}
						}
					}
					break;
				case Constant.Rowcount:
					List<WebElement> rows = Vars.elem.findElements(By.tagName("tr"));
					Integer rowCount = rows.size();
					if (rowCount == 0) {
						// WebElement rows1=elem.findElement(By.tagName("tr"));
						rowCount = 1;
					}
					actval = rowCount.toString();
					break;
				case Constant.Columncount:
					WebElement headerRow = null;
					List<WebElement> rows1 = Vars.elem
							.findElements(By.tagName("tr"));
					try {
						headerRow = rows1.get(rows1.size()-2);
					} catch (Exception Ed) {
						try
						{
							headerRow = rows1.get(1);
						}
						catch(Exception Ed1)
						{
							headerRow = rows1.get(0);
						}
					}

					List<WebElement> columns = headerRow.findElements(By
							.tagName("th"));
					Integer colCount = columns.size();
					if (colCount == 0) {
						List<WebElement> columns0 = headerRow.findElements(By
								.tagName("td"));
						colCount = columns0.size();
						if (colCount == 0) {
							WebElement columns1 = headerRow.findElement(By
									.tagName("th"));
							if (columns1 != null) {
								colCount = 1;
							} else {
								WebElement columns2 = headerRow.findElement(By
										.tagName("td"));
								if (columns2 != null) {
									colCount = 1;
								}
							}
						}
					}
					actval = colCount.toString();
					break;
				case Constant.Getcelldata:
					try {
						List<WebElement> cellRows = Vars.elem.findElements(By
								.tagName("tr"));
						String cellData = "";
						int rowNumber = Integer.parseInt(ObjectEventCh);
						int colNumber = Integer.parseInt(ObjectTestDataCh);
						WebElement reqrow = cellRows.get(rowNumber - 1);
						List<WebElement> reqcolmns = reqrow.findElements(By
								.tagName("td"));
						WebElement reqcellData = reqcolmns.get(colNumber - 1);
						cellData = reqcellData.getText();
						actval = cellData.toString();
						result="Cell data has been found, rownum- "+ rowNumber
								+ "  col num - " + colNumber;
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Executed);
					} catch (Exception e) {
						result="No cell data available";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Failed);
						Vars.setExceptionVar(e.toString());
					}
					break;
				case Constant.Getattribute:
					break;
				default:
					actval = "Invalid syntax";
					result="Invalid syntax";
					Vars.setExecutionStatus(Constant.Blocked);
					Vars.setExecutionResult(result);
					screenShot(Vars);
					Vars.setRes_type(Constant.Property);
					break;
				}
				if ((Vars.getAction()).equalsIgnoreCase("check")) {
					expval = ObjectTestDataCh;
					if (objectType.equalsIgnoreCase("radiobutton")) {
						if (expval.equalsIgnoreCase("On")) {
							expval = "True";
						} else if (expval.equalsIgnoreCase("Off")) {
							expval = "False";
						}
					}
					if (ObjectEventCh.equalsIgnoreCase("checked") 
							|| ObjectEventCh.equalsIgnoreCase("visible")
							|| ObjectEventCh.equalsIgnoreCase("enabled")
							|| ObjectEventCh.equalsIgnoreCase("exist")) {
						if (expval.equalsIgnoreCase(actval)) {
							result = "Actual value matches with expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval;
							if (ObjectEventCh.equalsIgnoreCase("getcelldata")) {
								result="Object is visible";
								screenShot(Vars);
							}
							Vars.setExecutionResult(result);
							Vars.setExecutionStatus(Constant.Passed);
							Vars.setRes_type(Constant.Executed);
							/*else {
								result="Object not found";
								Vars.setExecutionStatus(Constant.Failed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Failed);
							}*/
							if (Constant.Vars.capturecheckvalue == true) {
								screenShot(Vars);
							}	
						} else {
							result = "Actual value doesn't match with expected value. Actual value is "
									+ actval
									+ " expected value is "
									+ expval;
							Vars.setExecutionResult(result);
							if (Vars.ORvalname == "exit") {
								result="Object is missing ";
								Vars.setExecutionStatus(Constant.Caution);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Missing);
							} 
						}
					} else {
						if (ObjectEventCh.toLowerCase().contains("contains")){
							if(actval.contains(expval)){
								result="expected value contained in Actual value. "
										+ " Actual Value is " + actval 
										+ " and expected value is " + expval;
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							}
							else{
								result="Expected value does not contained in actual. "
										+ " Actual Value is " + actval 
										+ " and expected value is " + expval;
								Vars.setExecutionStatus(Constant.Failed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Failed);
							}
						}
						else
							if (expval.equals(actval)) {
								result = "Actual value matches with expected value. "
										+ " Actual Value is " + actval 
										+ " and expected value is " + expval;
								if (ObjectEventCh.equalsIgnoreCase("getcelldata")) {
									result="Expected value matched with actual";
									screenShot(Vars);
								}
								Vars.setExecutionResult(result);
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setRes_type(Constant.Executed);
								/*else {
									result="Expected value does not matched with actual";
									Vars.setExecutionStatus(Constant.Failed);
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.Failed);
								}*/
							} 
							else if(ObjectEventCh.equalsIgnoreCase(Constant.Getattribute)){

							}
							else {
								result = "Actual value doesn't match with expected value. Actual value is "
										+ actval
										+ " expected value is "
										+ expval;
								Vars.setExecutionResult(result);
								if (Vars.ORvalname == "exit") {

									result="Object is missing";
									Vars.setExecutionStatus(Constant.Caution);
									Vars.setExecutionResult(result);
									screenShot(Vars);
									Vars.setRes_type(Constant.Missing);
								} else {
									if (ObjectEventCh.equalsIgnoreCase("getcelldata")) {
										result="No cell data available";
										Vars.setExecutionStatus(Constant.Failed);
										Vars.setExecutionResult(result);
										screenShot(Vars);
										Vars.setRes_type(Constant.Failed);
									} else {
										result="Can't read cell data" + ObjectEventCh + "and" + ObjectTestDataCh;
										Vars.setExecutionStatus(Constant.Failed);
										Vars.setExecutionResult(result);
										screenShot(Vars);
										Vars.setRes_type(Constant.Failed);
									}
								}
							}						
					}
				} else if ((Vars.getAction()).equalsIgnoreCase("storevalue")) {
					varname = ObjectTestDataCh.replace("#", "");
					if (actval.equalsIgnoreCase("Invalid syntax")) {
						result="Object is missing";
						Vars.setExecutionStatus(Constant.Caution);
						Vars.setExecutionResult(result);
						screenShot(Vars);
						Vars.setRes_type(Constant.Missing);
					} else {
						if (Vars.map.containsKey(varname)) {
							Vars.map.remove(varname);
							Vars.map.put(varname, actval);
							if (ObjectEventCh.equalsIgnoreCase(Constant.Getcelldata)) {
								result="Value has been selected";
								Vars.setExecutionStatus(Constant.Passed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Executed);
							} else {
								result="Value has not been selected";
								Vars.setExecutionStatus(Constant.Failed);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Failed);
							}
							/*Log.info("Overwriting the value of the variable : "
									+ varname
									+ " to store the value as : "
									+ Vars.map.get(varname));*/
						} else {
							Vars.map.put(varname, actval);
							result="Value has been stored in the variable" + ObjectEventCh + "and" + ObjectTestDataCh;
							Vars.setExecutionResult(result);
							screenShot(Vars);
							Vars.setExecutionStatus(Constant.Passed);
							Vars.setRes_type(Constant.Executed);
							/*else{
								Vars.setExecutionStatus(Constant.Blocked);
								Vars.setRes_type(Constant.Blocked);
							}*/

							/*Log.info("Overwriting the value of the variable : "
									+ varname
									+ " to store the value as : "
									+ Vars.map.get(varname));*/
							if (ObjectTestDataCh.equals("nodatarow")) {

								result="Data is missing";
								Vars.setExecutionStatus(Constant.Caution);
								Vars.setExecutionResult(result);
								screenShot(Vars);
								Vars.setRes_type(Constant.Missing);
							} else {

							}
						}
					}
				}
			} else if(Vars.objFoundFlag == 0 && !bFound){
				result="Element is missing in object repository";
				Vars.setExecutionStatus(Constant.Caution);
				Vars.setExecutionResult(result);
				screenShot(Vars);
				Vars.setRes_type(Constant.Caution);
			}

		} catch (Exception e) {
			result="Object not found";
			Vars.setExecutionStatus(Constant.Blocked);
			Vars.setExecutionResult(result);
			screenShot(Vars);
			Vars.setRes_type(Constant.Blocked);
			Vars.setExceptionVar(e.toString());
		}
	}


	/**
	 * @param strOperation
	 * @return
	 * @throws Exception
	 */
	public static String func_IfCondition(String strOperation) throws Exception {

		int iFlag = 1;
		String value1 = Constant.Vars.Obj;
		String value2 = Constant.Vars.Event.replaceAll("\"","");
		if(value2.contains("#")){
			value2=Constant.Vars.map.get(value2.replace("#", ""));
			if( value2==null){
				value2="";				
			}
		}
		strOperation = strOperation.toLowerCase().trim();
		switch (strOperation.toLowerCase()) {
		case "contains":
			if (value1.substring(0, 1).equalsIgnoreCase("#")) {

				value1 = Constant.Vars.map.get(value1.substring(1, (value1.length())));
				result = "Variable used in condition statement has value: "
						+ value1;
				Constant.Vars.setExecutionStatus(result);
				if (null != value1 && value1.trim().contains(value2.trim())) {
					iFlag = 0;
				}
			} else if (value1.trim().contains(value2.trim())) {
				iFlag = 0;
			}
			break;
		case "=":
		case "equals to":
		case Constant.Equals:
			if (value1.substring(0, 1).equalsIgnoreCase("#")) {

				value1 = Constant.Vars.map.get(value1.substring(1, (value1.length())));
				result = "Variable used in condition statement has value: "
						+ value1;
				Constant.Vars.setExecutionStatus(result);
				if (null != value1 && value1.trim().equalsIgnoreCase(value2.trim())) {

					iFlag = 0;
				}
			} else if (value1.trim().equalsIgnoreCase(value2.trim())) {
				iFlag = 0;
			}
			break;
		case "!=":
		case Constant.Notequals:
			if (value1.substring(0, 1).equalsIgnoreCase("#")) {
				value1 = Constant.Vars.map.get(value1.substring(1, (value1.length())));
				result  = "Variable used in condition statement has values: "
						+ value1;
				Constant.Vars.setExecutionStatus(result);
				if (!value1.trim().equalsIgnoreCase(value2.trim())) {

					iFlag = 0;
				}

			} else if (!value1.trim().equals(value2.trim())) {
				iFlag = 0;
			}
			break;
		case ">":
		case Constant.Greater_than:
		case Constant.Greaterthan:
			if (value1.substring(0, 1).equalsIgnoreCase("#")) {
				value1 = Constant.Vars.map.get(value1.substring(1, (value1.length())));
				if (isInteger(value1) && isInteger(value2)) {
					if (Integer.parseInt(value1) > Integer.parseInt(value2)) {
						iFlag = 0;
					}
				}
			}

			else if (isInteger(value1) && isInteger(value2)) {
				if (Integer.parseInt(value1) > Integer.parseInt(value2)) {
					iFlag = 0;
				}
			}

			else {
				result="Give Only Integers for Compare";
				Constant.Vars.setExecutionStatus(Constant.Failed);
				Constant.Vars.setExecutionResult(result);
				Constant.Vars.setRes_type(Constant.Failed);
			}
			break;
		case "<":
		case Constant.Less_than:
		case Constant.Lessthan:
			if (value1.substring(0, 1).equalsIgnoreCase("#")) {
				value1 = Constant.Vars.map.get(value1.substring(1, (value1.length())));
				if (isInteger(value1) && isInteger(value2)) {
					if (Integer.parseInt(value1) < Integer.parseInt(value2)) {
						iFlag = 0;
					}
				}
			}

			else if (isInteger(value1) && isInteger(value2)) {
				if (Integer.parseInt(value1) < Integer.parseInt(value2)) {
					iFlag = 0;
				}
			}

			else {
				result="Error Occured in lessthan : Give Only Integers for Compare";
				Constant.Vars.setExecutionStatus(Constant.Failed);
				Constant.Vars.setExecutionResult(result);
				Constant.Vars.setRes_type(Constant.Failed);
			}
			break;
		default:
			result="Object is missing";
			Constant.Vars.setExecutionStatus(Constant.Caution);
			Constant.Vars.setExecutionResult(result);
			Constant.Vars.setRes_type(Constant.Missing);
			break;
		}
		if (iFlag == 0) {
			result="Compare Successfull for " +value1;
			Constant.Vars.setExecutionStatus(Constant.Passed);
			Constant.Vars.setExecutionResult(result);
			Constant.Vars.setRes_type(Constant.Executed);
			return "true";
		} else {
			result="Compare failed for " +value1;
			Constant.Vars.setExecutionResult(result);
			return "false";
		}
	}

	/**
	 * @param action1
	 * @param Vars
	 * @throws Exception
	 */
	private static void doUploadDownload(String action1,LocalTC Vars) throws Exception {
		// Robot robot = new Robot();
		String browserName = Vars.getbrowsername();
		String cCellData = Vars.getObj();
		if (browserName.equalsIgnoreCase("firefox")) {
			switch (action1) {
			case Constant.Upload: //uploading the external file in browser
				try {
					Thread.sleep(2000);
					/*
					 * Runtime.getRuntime().exec( Constant.execpath +
					 * " 2 upload " + cCellData + " " +
					 * browserName.toLowerCase());
					 */
					cCellData = Constant.tempTestReportPath + cCellData;
					cCellData = cCellData.replace("//", File.separator);
					StringSelection strSelection = new StringSelection(cCellData);
					Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_CONTROL);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_CONTROL);
					robot.delay(1000);
					robot.keyPress(KeyEvent.VK_ENTER);
					robot.keyRelease(KeyEvent.VK_ENTER);
					result = "File Uploaded";
					Vars.setExecutionStatus(Constant.Passed);
					Vars.setExecutionResult(result);
					Vars.setRes_type(Constant.Executed);
				} catch (Exception e) {
					result = "Exception Occured in upload";
					Vars.setExecutionStatus(Constant.Failed);
					Vars.setExecutionResult(result);
					Vars.setRes_type(Constant.Failed);
				}
				break;
			case Constant.Abortupload: //abort uploading file
				result="File upload aborted";
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				Vars.setRes_type(Constant.Executed);
				break;

			case Constant.Cancelupload:
				/*Runtime.getRuntime().exec(
						Constant.execpath + " 2 cancelupload " + cCellData + " "
								+ browserName.toLowerCase());*/
				result="File upload canceled";
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				Vars.setRes_type(Constant.Executed);
				break;

			case Constant.Download:
				/*Runtime.getRuntime().exec(
						Constant.execpath + " 2 download " + ObjectEvent + " "
								+ browserName.toLowerCase() + " "
								+ Vars.elem.getAttribute("href"));*/
				Constant.Vars.elem.click();
				Thread.sleep(4000);
				result="File Downloaded";
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				Vars.setRes_type(Constant.Executed);
				break;
			default:
				result = "Action not supported";
				Vars.setExecutionStatus(Constant.Blocked);
				Vars.setExecutionResult(result);
				Vars.setRes_type(Constant.Blocked);
				break;
			}
		} else if (browserName.equalsIgnoreCase("ie")) {
			switch (action1) {
			case Constant.Upload:
				if (Integer.parseInt(Vars.getBrowserVer()) != 8) {
					try {
						/*Runtime.getRuntime().exec(
								Constant.execpath + " 2 upload " + cCellData + " "
										+ browserName.toLowerCase());*/
						StringSelection strSelection = new StringSelection(cCellData);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
						Robot robot = new Robot();
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						robot.delay(1000);
						//press and release control and paste
						robot.keyPress(KeyEvent.VK_CONTROL);
						robot.keyPress(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_V);
						robot.keyRelease(KeyEvent.VK_CONTROL);
						robot.delay(1000);
						//press and release enter
						robot.keyPress(KeyEvent.VK_ENTER);
						robot.keyRelease(KeyEvent.VK_ENTER);
						result="IE Browser loaded";
						Vars.setExecutionStatus(Constant.Passed);
						Vars.setExecutionResult(result);
						Vars.setRes_type(Constant.Executed);
					} catch (Exception e) {
						result="IOException Occured in upload";
						Vars.setExecutionStatus(Constant.Failed);
						Vars.setExecutionResult(result);
						Vars.setRes_type(Constant.Failed);
					}
				} else {
					Vars.elem.sendKeys(cCellData);
				}
				break;
			case Constant.Closeupload:
				/*Runtime.getRuntime().exec(
						Constant.execpath + " 2 closeupload " + cCellData + " "
								+ browserName.toLowerCase());*/
				result="File upload canceled";
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				Vars.setRes_type(Constant.Executed);
				break;
			case Constant.Cancelupload:
				/*Runtime.getRuntime().exec(
						Constant.execpath + " 2 cancelupload " + cCellData + " "
								+ browserName.toLowerCase());*/
				result="Canceled uploaded file";
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				Vars.setRes_type(Constant.Executed);
				break;
			case Constant.Download:
				/*Runtime.getRuntime().exec(
						Constant.execpath + " 2 download " + ObjectEvent + " "
								+ browserName.toLowerCase() + " "
								+ Vars.elem.getAttribute("href"));*/
				Constant.Vars.elem.click();
				result="File Downloaded";
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				Vars.setRes_type(Constant.Executed);
				break;
			}
		}
		if (Vars.captureperform == true) {
			screenShot(Vars);
		}
	}
	/*
	 * @return
	 * @param LocalTC
	 * Method for loop start
	 */ 
	public static void loop(LocalTC Vars) throws IOException{
		Vars.loopsize++; //Counter for counting the start of loops Total loops  
		Vars.loopnum++;  //Counter to count start and end of it 
		//Vars.dtrownum=1; //Reset the data row 
		if (Vars.loopsize >= 0) {
			arrayreSize();
		}
		Vars.loopflag = 1;
		Vars.dtrownumloop[Vars.loopsize] = 1;
		Vars.loopcount[Vars.loopsize] = Integer.parseInt(Vars.getObj());
		Vars.loopstart[Vars.loopsize] = ++Vars.startrow;
		Vars.loopcnt[Vars.loopsize] = 0;
		Vars.loopTestData[Vars.loopsize] = Vars.getSampleData().replace("dt_", "");
		result="loop : " + "Start of loop : " + (Vars.loopsize + 1);
		Vars.setExecutionStatus(Constant.Passed);
		Vars.setExecutionResult(result);
		Vars.setRes_type(Constant.Executed);
	}

	public static void arrayreSize() {
		if (Constant.Vars.loopstart.length <= Constant.Vars.loopsize) {
			Constant.Vars.loopstart = Arrays.copyOf(Constant.Vars.loopstart, Constant.Vars.loopstart.length + 1);
			Constant.Vars.loopend = Arrays.copyOf(Constant.Vars.loopend, Constant.Vars.loopend.length + 1);
			Constant.Vars.loopcnt = Arrays.copyOf(Constant.Vars.loopcnt, Constant.Vars.loopcnt.length + 1);
			Constant.Vars.dtrownumloop = Arrays.copyOf(Constant.Vars.dtrownumloop, Constant.Vars.dtrownumloop.length + 1);
			Constant.Vars.loopcount = Arrays.copyOf(Constant.Vars.loopcount, Constant.Vars.loopcount.length + 1);
			Constant.Vars.loopTestData = Arrays.copyOf(Constant.Vars.loopTestData, Constant.Vars.loopcount.length + 1);
		}
	}

	/*
	 * @return
	 * @param LocalTC
	 * Method for loop end
	 */
	public static void endloop(LocalTC Vars) throws Exception{
		Vars.loopend[Vars.loopnum] = Vars.startrow;
		Vars.dtrownumloop[Vars.loopnum] = Vars.startrow + 1;
		Vars.loopnum = Vars.loopnum - 1;
		//Log.info("End of Loop : " + Vars.loopsize +1 + " : Loop count : " + Vars.loopcount[Vars.loopsize]);
		if (Vars.loopnum == -1){
			Vars.loopflag = 0;
			Vars.loopnum  = 0;
			KeywordLibrary.execloopsteps(Vars,0,Vars.startrow-1,Vars.loopcount[0]);
			Resetloop();
		}
		result="End of Loop : " + Vars.loopsize +1 + " : Loop count : " + Vars.loopcount[Vars.loopsize];
		Vars.setExecutionStatus(Constant.Passed);
		Vars.setExecutionResult(result);
		Vars.setRes_type(Constant.Executed);
	}
	/**
	 * @param vars
	 * @throws Exception
	 * method for creating condition as per the teststep
	 */
	private static void condition(LocalTC vars) throws Exception {
		String strConditionStatus = func_IfCondition(vars.getObjProp());
		if (strConditionStatus.equalsIgnoreCase("false"))
		{
			Constant.Vars.conditionSkip = true;
			result="Condition is false ";
			vars.setExecutionStatus("Skipped");
			vars.setExecutionResult(result);
			vars.setRes_type(Constant.CondFailed);
		} else {
			result="Condition is true ";
			vars.setExecutionStatus(Constant.Passed);
			vars.setExecutionResult(result);
			screenShot(vars);
			vars.setRes_type(Constant.Executed);
		}
	}
	/**
	 * @param vars
	 * @throws IOException
	 * Method for the screen capture
	 */
	public static void screenCaptureOption(LocalTC vars) throws IOException{
		if (vars.getObjProp().equalsIgnoreCase(Constant.Perform)) {
			Constant.Vars.captureperform = true;
		}
		if (vars.getObjProp().equalsIgnoreCase(Constant.Storevalue)) {
			Constant.Vars.capturestorevalue = true;
		}
		if (vars.getObjProp().equalsIgnoreCase(Constant.Check)) {
			Constant.Vars.capturecheckvalue = true;
		}
		Constant.Vars.setRes_type(Constant.Executed);
		vars.setExecutionStatus(Constant.Passed);
	}
	/**
	 * @param vars
	 * @throws IOException
	 * method for importing data from given file path
	 */
	public static void importdata(LocalTC vars) throws IOException {
		FileInputStream fs3 = null;
		XSSFWorkbook DTworkbook = null;
		try {
			String xcelpath = vars.getObj().replaceAll("\"", "").trim();
			fs3 = new FileInputStream(new File(xcelpath));
			DTworkbook = new XSSFWorkbook(fs3);
			FormulaEvaluator DTevaluator = DTworkbook.getCreationHelper().createFormulaEvaluator();
			// if(Constant.Vars.update.equalsIgnoreCase("yes")){
			DTevaluator.evaluateAll();
			// }
			LocalTC.ws = DTworkbook.getSheetAt(0);
			result="Data table found ";
			vars.setExecutionStatus(Constant.Passed);
			vars.setExecutionResult(result);
			vars.setRes_type(Constant.Executed);

		} catch (Exception e) {
			result="Error Occured in importdata : No Data table found  ";
			vars.setExecutionStatus(Constant.Blocked);
			vars.setExecutionResult(result);
			vars.setRes_type(Constant.Nodatatable);
		}finally {
			if(fs3 != null){
				fs3.close();
			}if(DTworkbook != null){
				DTworkbook.close();
			}
		}
	}

	
	/**
	 * @param vars
	 * Method for fetching data form database
	 */
	public static void fetchdb(LocalTC vars){
		try{
			boolean parameter = false;
			String sqlquery = vars.getObj();
			if((vars.database.equalsIgnoreCase("mssql"))||(vars.database.equalsIgnoreCase("mysql"))){
				vars.isinvaliddb = true;
			}else{
				vars.isinvaliddb=false;
				result="Database connection is not established ";
				vars.setExecutionStatus(Constant.Blocked);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.InvalidConnection);
				return;
			}
			if(vars.host_name.length()==0){
				vars.isinvaliddb=false;
				result="Database connection is not established, Host Name is empty ";
				vars.setExecutionStatus(Constant.Blocked);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.InvalidConnection);
				return;
			}
			if((vars.schemaname.length()==0)){
				vars.isinvaliddb=false;
				result="Database connection is not established, schema name is empty ";
				vars.setExecutionStatus(Constant.Blocked);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.InvalidConnection);
				return;
			}
			(sqlquery.trim()).substring(0,6);
			if(sqlquery.length()>0){
				String query = sqlquery.trim();
				String isSelect = query.substring(0, 6);
				if((!isSelect.equalsIgnoreCase("select"))){
					parameter=true;
				}
			}else{
				result="SQLquery is not correct";
				vars.setExecutionStatus(Constant.Blocked);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.InvalidQuery);
				return;
			}
			if(parameter == true){
				result="SQLquery is not correct ";
				vars.setExecutionStatus(Constant.Blocked);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.InvalidQuery);
				return;
			}
			String url =KeywordLibrary.createConnection(vars, vars.database, vars.schemaname, vars.username, vars.password);
			if(url.length()>0){
				vars.isconnected = KeywordLibrary.getConnection(url);	
			}
			if(vars.isconnected){
				executeQuery(Constant.Vars.rs);
				result="Database connection is established ";
				vars.setExecutionStatus(Constant.Passed);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.Executed);
			}else{
				result="Database connection is not established ";
				vars.setExecutionStatus(Constant.Blocked);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.InvalidConnection);
				vars.isinvaliddb = false;
			}
		}catch (Exception e){
			result="failed  " +e.getMessage() ;
			vars.setExecutionStatus(Constant.Blocked);
			vars.setExecutionResult(result);
			vars.setRes_type(Constant.InvalidConnection);
		}
	}
	/**
	 * @param Vars
	 */
	public static void callfunction(LocalTC Vars){
		try {
			if(Vars.getObjProp().contains("#")){}
			else if(Vars.getObjProp().contains("dt_")){
				String Params;
				Vars.TestData.setExcelFile(Constant.Path_TestData, Vars.getObjProp().replace("dt_", ""));
				int retRowCount=Vars.TestData.getRowCount();
				int retColCount =Vars.TestData.getColCount();
				for(int rowItr=1;rowItr<retRowCount;rowItr++)
				{
					Params = "";
					for(int colItr=0;colItr<retColCount;colItr++){
						if(Vars.TestData.getCellData(rowItr, colItr) == null){
							if(Params.isEmpty()){
								Params = null;
							}
							else if(null != Params)
								Params = Params + "#&" + null;
						}
						else
							if(null != Params && Params.isEmpty())
								Params = Vars.TestData.getCellData(rowItr, colItr);
							else
								Params = Params + "#&" + Vars.TestData.getCellData(rowItr, colItr) ;
					}
					func_InvokeFunction(Vars.getObj(), Params);
				}
			}
			else func_InvokeFunction(Vars.getObj(), Vars.getObjProp());
		} catch (Exception e) {
		}
	}
	/**
	 * @param vars
	 */
	public static void comparedbcell(LocalTC vars){
		try{
			if(vars.isinvaliddb){
				vars.setScreenshotTypeFlag(0);
				WebElement getElement = getWebElement();
				if(getElement==null){
					result="No matching Element found in Object Repository";
					vars.setExecutionStatus(Constant.Blocked);
					vars.setExecutionResult(result);
					screenShot(vars);
					vars.setRes_type(Constant.ObjectNotFound);
					return;
				}
				String toSearch = getElement.getText();
				boolean isfound = search_Excel(toSearch);
				if(isfound){
					result="Object found";
					vars.setExecutionStatus(Constant.Passed);
					vars.setExecutionResult(result);
					vars.setRes_type(Constant.Executed);
				}else{
					result="Data is not matching with data table";
					vars.setExecutionStatus(Constant.Blocked);
					vars.setExecutionResult(result);
					vars.setRes_type(Constant.NoMatchinDataTable);
				}
			}else{
				result="Invalid parameters";
				vars.setExecutionStatus(Constant.Blocked);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.InvalidConnection);
			}
		}
		catch(Exception e){
			result="Exception Occured in comparedbcell : No Data table found  " +e.getMessage();
			vars.setExecutionStatus(Constant.Blocked);
			vars.setExecutionResult(result);
			vars.setRes_type(Constant.InvalidConnection);
		}
	}
	/**
	 * @return
	 */
	public static WebElement getWebElement(){
		try{
			Constant.Vars.getObj();     
			String ObjectValCh = Constant.Vars.getObjProp();
			try {
				Constant.Vars.elem = Constant.Vars.obj.findelement(Constant.Vars.obj.getLocator(ObjectValCh));
				return Constant.Vars.elem;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e){
			//Log.info( "Exception Occured as- " +e.getMessage());
			e.printStackTrace();
		}
		return Constant.Vars.elem;
	}
	/**
	 * @param toSearch
	 * @return
	 */
	public static boolean search_Excel(String toSearch){
		boolean isfound=false;
		Constant.Vars.getEvent();                             
		String ObjectTestDataCh = Constant.Vars.getTestdata();
		boolean columnFound = false;
		int columnno =0;
		String getColumn = null;
		if (ObjectTestDataCh.contains("dt_")) {
			Constant.Vars.iflag = 0;
			String ObjectTestDatatableheader[] = ObjectTestDataCh
					.split("_",2);
			String Searchincolumn = ObjectTestDatatableheader[1];
			Row row = LocalTC.ws.getRow(0);
			int cell = row.getLastCellNum();
			for(int i=0;i<cell;i++){
				getColumn = (LocalTC.ws.getRow(0).getCell(i).getStringCellValue());
				if(getColumn.equalsIgnoreCase(Searchincolumn)){
					columnFound = true;
					break;
				}
			}                                                            
			if((columnFound == true)&&(columnno!=0)){
				int rowcnt = 0;
				for(Row r : LocalTC.ws){
					rowcnt= LocalTC.ws.getLastRowNum();
				}
				//Log.info("Row Count is  "+rowcnt);
				for(int i=0;i<rowcnt;i++){
					String getCelldata = LocalTC.ws.getRow(i).getCell(columnno).getStringCellValue();
					if(getCelldata.equalsIgnoreCase(toSearch)){
						//Log.info("Script Found  "+getCelldata);
						isfound = true;
					}
				}
			}
		}
		return isfound;
	}

	/**
	 * @param vars
	 * @throws Exception
	 */
	public static void screencapture(LocalTC vars) throws Exception{
		vars.setScreenshotTypeFlag(0);
		screenShot(vars);
		result="Screenshot is captured";
		vars.setExecutionStatus(Constant.Passed);
		vars.setExecutionResult(result);
		vars.setRes_type(Constant.Executed);
	}

	/**
	 * @param vars
	 * Downloading the file from the browser
	 */
	public static void download(LocalTC vars){
		ObjectName = vars.getObjProp().replace("obj=", "").toLowerCase();
		ObjectType = vars.getObj(); 
		ObjectEvent = vars.Event.toLowerCase();
		ObjectTestData=vars.getTestdata().replace("\"", "");
		String[] ObjectEvent1=null;
		String ObjectEvent2 = "";
		try {
			readAttributeforPerform();
			vars.elem = vars.obj.findelement(vars.obj.getLocator(ObjectName));
			if (vars.elem == null) {
				return;
			} else {
				/*if (ObjectEvent == "") {
					vars.setRes_type(Constant.FilePathNotFound2);
					//Reporter.ReportEvent(Constant.FilePathNotFound2);
					vars.setExecutionStatus("Failed");
				} else {*/
				try {
					ObjectEvent1 = ObjectEvent.split("\\\\");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				for (int i = 0; i < ObjectEvent1.length; i++) {
					ObjectEvent2 = ObjectEvent2 + ObjectEvent1[i] + "\\";
				}
				if (new File(ObjectEvent2.toString()).exists()) {
					doUploadDownload(Constant.Download,vars);
				} else {

					result="File path is not found";
					vars.setExecutionStatus(Constant.Blocked);
					vars.setExecutionResult(result);
					vars.setRes_type(Constant.FilePathNotFound1);
				}
				ObjectEvent2 = "";
				ObjectEvent1 = null;
			}
		} catch (Exception e) {
			result="Error Occured in Download :   " +e.getMessage() ;
			vars.setExecutionStatus(Constant.Blocked);
			vars.setExecutionResult(result);
			vars.setRes_type(Constant.FilePathNotFound1);
		}
	}
	/**
	 * 
	 */
	public static void readAttributeforPerform(){
		try {
			int DTcolumncount =0;
			if (ObjectTestData.length() > 0)
			{
				if (ObjectTestData.substring(0, 1).equalsIgnoreCase("#")) {
					if (Constant.Vars.map.get(ObjectTestData.substring(1,
							(ObjectTestData.length()))) != null) {
						ObjectTestData = Constant.Vars.map.get(ObjectTestData.substring(1,
								(ObjectTestData.length())));
					} else {
						ObjectTestData = "";
					}
				} else if (ObjectTestData.contains("dt_")) {
					DTcolumncount = Constant.Vars.DTsheet.getColCount();
					Constant.Vars.iflag = 0;
					String ObjectTestDatatableheader[] = ObjectTestData.split("_");
					int column = 0;
					String Searchtext = ObjectTestDatatableheader[1];
					for (column = 0; column < DTcolumncount; column++) {
						if(Searchtext.equalsIgnoreCase(Constant.Vars.DTsheet.getCellData(Constant.Vars.row,column))==true)
						{
							ObjectTestData = Constant.Vars.DTsheet.getCellData(Constant.Vars.row,column);;
							if (ObjectTestData.length() == 0) {
								ObjectTestData = "";
							}
							Constant.Vars.iflag = 1;
						}
					}
					if (Constant.Vars.iflag != 1) {
						ObjectTestData = "nodatarow";
					}
					else {
						result="Object not found";
						Constant.Vars.setExecutionStatus(Constant.Blocked);
						Constant.Vars.setExecutionResult(result);
						Constant.Vars.setRes_type(Constant.TooManyArguments);
					}
				}
			}
		} catch (Exception e) {
			result="Exception Occured while Reading Attribute for Perform- " +e.getMessage();
			Constant.Vars.setExecutionStatus(Constant.Failed);
			Constant.Vars.setExecutionResult(result);
			Constant.Vars.setRes_type(Constant.Failed);
		}
	}
	/**
	 * @param vars
	 * @throws Exception
	 */
	public static void varCallaction(LocalTC vars) throws Exception{
		vars.reporttype = 1;
		vars.exeStatus = "Pass";
		//String ComponentPath = vars.reusableComponents + cCellData;
		if (vars.getObj().contains("xlsx")) {
			String ComponentName = vars.getObj().split(".xlsx")[0];
			FileInputStream ComponentFile1 = null;
			XSSFWorkbook  ComponentWorkBook = null;
			try {
				ComponentFile1 = new FileInputStream(new File(vars.getObj()));
				ComponentWorkBook = new XSSFWorkbook(ComponentFile1);
				XSSFSheet ComponentSheet = ComponentWorkBook.getSheetAt(0);
				int ComponentRowCount = 0;
				int introwcnt = 0;
				int introwcntStore = vars.row;
				result="Function called";
				vars.setExecutionStatus(Constant.Passed);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.Executed);
				vars.row = vars.row + 1;
				Stack<String> ComponentStack = new Stack<String>();
				vars.setObj(ComponentName);
				ComponentStack.push(ComponentName);
				/*vars.setRes_type(Constant.Callactionstart);*/
				ComponentRowCount = ComponentSheet.getLastRowNum();
				introwcnt = 0;
				for (int jloop = 0; jloop < ComponentRowCount; jloop++) {
					introwcnt = introwcnt + 1;
					vars.row = jloop;
					String CTValidate = "r";
					if(((ComponentSheet.getRow(jloop).getCell(0).getStringCellValue()).equalsIgnoreCase(CTValidate)==true))
					{
						vars.Action = getCellData(ComponentWorkBook, ComponentSheet.getRow(jloop).getCell(1));
						vars.setObj(getCellData(ComponentWorkBook, ComponentSheet.getRow(jloop).getCell(2)));
						vars.setObjProp(getCellData(ComponentWorkBook, ComponentSheet.getRow(jloop).getCell(3)));

						//String ORPath = vars.objectRepository;
						//FileInputStream ComponentFile2 = null;

						try {
							//ComponentFile2 = new FileInputStream(
							//		new File(ORPath));

						} catch (Exception e) {
							e.printStackTrace();
						}
						try {

							//XSSFWorkbook ORworkbook = new XSSFWorkbook(ComponentFile2);
							//ORsheet = ORworkbook.getSheetAt(0);
							//ORrowcount = ORsheet.getLastRowNum();
							//vars.ActionVal = Action.toLowerCase();
							vars.iflag = 0;
						} catch (Exception e) {
							fail("Excel file of Ignite is not correct.");
						}
						CallAction(vars);
						//bCellAction(scriptName);
						jloop = vars.row;
					}// End of Execution
				}// End of If that get all rows in Test Script
				vars.setObj(ComponentStack.pop());

				/*result="Function not called";
				Constant.Vars.setExecutionStatus("Failed");
				Constant.Vars.setExecutionResult(result);
				vars.setRes_type(Constant.Callactionend);*/
				//Reporter.ReportEvent(Constant.Callactionend);
				//Constant.Vars.setExecutionStatus("Failed");
				vars.row = introwcntStore;
				vars.reporttype = 0;
				//TScsheet = TestScriptSheet;
			} catch (FileNotFoundException FNF1) {
				result="Function not called";
				Constant.Vars.setExecutionStatus(Constant.Blocked);
				Constant.Vars.setExecutionResult(result);
				vars.setRes_type(Constant.Callactionfnf);
				//Reporter.ReportEvent(Constant.Callactionfnf);
			}finally{
				if (ComponentFile1!=null) {
					ComponentFile1.close();
				}if(ComponentWorkBook != null){
					ComponentWorkBook.close();
				}
			}
		} else {
			result="Function not called";
			Constant.Vars.setExecutionStatus(Constant.Failed);
			Constant.Vars.setExecutionResult(result);
			vars.setRes_type(Constant.Failed);
		}
	}
	/**
	 * @param xWB
	 * @param tCell
	 * @return
	 * Return
	 */
	public static String getCellData(XSSFWorkbook xWB, XSSFCell tCell) {
		String cellStr = null;
		switch (tCell.getCellType()) {
		case XSSFCell.CELL_TYPE_STRING :
			cellStr = tCell.getStringCellValue();
			break;
		case XSSFCell.CELL_TYPE_NUMERIC :
			double dNum = tCell.getNumericCellValue();
			int iNum = (int) dNum;
			cellStr = String.valueOf(iNum);
			break;
		case XSSFCell.CELL_TYPE_FORMULA :
			FormulaEvaluator evaluator = xWB.getCreationHelper().createFormulaEvaluator();
			evaluator.evaluateFormulaCell(tCell);
			cellStr = tCell.getStringCellValue();
			break;
		case XSSFCell.CELL_TYPE_BOOLEAN :
			cellStr = String.valueOf(tCell.getBooleanCellValue());
		default:
			cellStr = "";
		}
		return cellStr;
	}

	/**
	 * @param vars
	 * @throws Exception
	 */
	public static void context(LocalTC vars) throws Exception {
		ObjectName = vars.getObjProp().replace("obj=", "").toLowerCase();
		ObjectType = vars.getObj();
		ObjectEvent = vars.getEvent();
		ObjectTestData = vars.getTestdata();
		int DTcolumncountCh = 0;
		String parentWindowHandle = null;
		int windowFound = 0;
		if (ObjectType.equalsIgnoreCase("frame") || ObjectType.equalsIgnoreCase("iframe")) {
			Constant.driver.switchTo().parentFrame();
			result="Frame Identified";
			vars.setExecutionStatus(Constant.Passed);
			vars.setExecutionResult(result);
			vars.setRes_type(Constant.Executed);
			if ("default".equals(ObjectName)) {
				Constant.driver.switchTo().defaultContent();
				result="Frame Identified";
				vars.setExecutionStatus(Constant.Passed);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.Executed);
			} else if (ObjectName.matches("^[0-9]+") == true) {
				Constant.driver.switchTo().frame(new Integer(ObjectName));
				result="Frame Identified";
				vars.setExecutionStatus(Constant.Passed);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.Executed);
			} else {
				vars.elem =  vars.obj.findelement(vars.obj.getLocator(ObjectName));
				if (vars.elem == null) {
					return;
				} else {
					Constant.driver.switchTo().frame(vars.elem);
					result="Frame Identified";
					vars.setExecutionStatus(Constant.Passed);
					vars.setExecutionResult(result);
					vars.setRes_type(Constant.Executed);
				}
			}
		} else {
			try {
				if (ObjectTestData.substring(0, 1).equalsIgnoreCase("#")) {
					if (vars.map.get(ObjectTestData.substring(1, (ObjectTestData.length()))) != null) {
						ObjectTestData = vars.map.get(ObjectTestData.substring(1, (ObjectTestData.length())));
					} else {
						ObjectTestData = "";
					}
				} else if (ObjectTestData.contains("dt_")) {
					vars.iflag = 0;
					String ObjectTestDatatableheader[] = ObjectTestData.split("_");
					int column = 0;
					String Searchtext = ObjectTestDatatableheader[1];
					try {
						DTcolumncountCh = vars.DTsheet.getColCount();

					} catch (NullPointerException e) {
						return;
					}
					for (column = 0; column < DTcolumncountCh; column++) {
						if (Searchtext.equalsIgnoreCase(vars.DTsheet.getCellData(0, column)) == true) {
							ObjectTestData = vars.DTsheet.getCellData(vars.row, column);
							vars.iflag = 1;
							if (ObjectTestData.length() == 0) {
								ObjectTestData = "";
							}
						}
					}
					if ((!ObjectEvent.equalsIgnoreCase("dialog;"))
							&& ((ObjectEvent.equalsIgnoreCase("page") || ObjectEvent.equalsIgnoreCase("page;"))
									&& !ObjectTestData.contains("::")
									|| !ObjectEvent.equalsIgnoreCase("page;WindowRtn;"))) {
						int windowNums = 0;
						int windowItr = 0;
						WebDriver newWindow = null;
						Set<String> al = new HashSet<String>();
						al = Constant.driver.getWindowHandles();
						windowNums = al.size(); // get the number of window
						Iterator<String> windowIterator = al.iterator();
						if (windowNums == 1) {
							// Switch the hundle, if number of available hundle
							// is 1.
							String handle = windowIterator.next();
							Constant.driver.switchTo().window(handle);
							// Reset Iterator
							windowIterator = al.iterator();
						} else {
							// save the current window handle.
							parentWindowHandle = Constant.driver.getWindowHandle();
						}
						if (Constant.driver.getTitle().toString().equalsIgnoreCase(ObjectTestData) == true) {

							result="Window Identified";
							vars.setExecutionStatus(Constant.Passed);
							vars.setExecutionResult(result);
							vars.setRes_type(Constant.Executed);
						} else {
							if (!((ObjectTestData.equalsIgnoreCase("page") || (ObjectTestData.equalsIgnoreCase("page;")))
									|| (ObjectTestData.toString() == ""))) {
								if (Constant.driver.getTitle().toString().equalsIgnoreCase(ObjectTestData) == false) {
									for (windowItr = 0; windowItr < windowNums; windowItr++) {
										String windowHandle = windowIterator.next();
										newWindow = Constant.driver.switchTo().window(windowHandle);
										if (newWindow.getTitle().toString().equalsIgnoreCase(ObjectTestData)) {
											windowFound = 1;
											result="Window Identified for " + ObjectEvent + "new window is " +ObjectTestData;
											vars.setExecutionStatus(Constant.Passed);
											vars.setExecutionResult(result);
											vars.setRes_type(Constant.Executed);
											break;
										}
									}
									if (windowFound != 1) {
										result="Window not Identified";
										vars.setExecutionStatus(Constant.Blocked);
										vars.setExecutionResult(result);
										vars.setRes_type(Constant.NoWindowFound);
									}
								}
							} else {
								if (windowNums == 1) {
									result="Window Identified";
									vars.setExecutionStatus(Constant.Passed);
									vars.setExecutionResult(result);
									vars.setRes_type(Constant.Executed);

								} else {
									int winItr1 = 0;
									String windowHandle = null;
									while (winItr1 != windowNums) {
										windowHandle = windowIterator.next();
										newWindow = Constant.driver.switchTo().window(windowHandle);
										if (parentWindowHandle.equalsIgnoreCase(windowHandle)) {
											if (winItr1 != windowNums - 1) {
												windowHandle = windowIterator.next();
												Constant.driver.switchTo().window(windowHandle);
												result="Window Identified";
												vars.setExecutionStatus(Constant.Passed);
												vars.setExecutionResult(result);
												vars.setRes_type(Constant.Executed);
												windowFound = 1;
												break;
											} else {
												Iterator<String> windowIterator1 = al.iterator();
												windowHandle = windowIterator1.next();
												Constant.driver.switchTo().window(windowHandle);
												result="Window Identified";
												vars.setExecutionStatus(Constant.Passed);
												vars.setExecutionResult(result);
												vars.setRes_type(Constant.Executed);
												windowFound = 1;
												break;
											}
										}
										winItr1++;
									}
									if (windowFound != 1) {
										result="Window not Identified";
										vars.setExecutionStatus(Constant.Blocked);
										vars.setExecutionResult(result);
										vars.setRes_type(Constant.NoWindowFound);
									}
								}
							}
						}
					} else if (ObjectEvent.equalsIgnoreCase("page;WindowRtn;")) {
						Constant.driver.switchTo().window(parentWindowHandle);
						result="Window Identified";
						vars.setExecutionStatus(Constant.Passed);
						vars.setExecutionResult(result);
						vars.setRes_type(Constant.Executed);
					}
					if ((ObjectEvent.equalsIgnoreCase("dialog") || ObjectEvent.equalsIgnoreCase("dialog;"))) {
						Constant.driver.switchTo().alert();
						result="Dialog box Identified";
						vars.setExecutionStatus(Constant.Passed);
						vars.setExecutionResult(result);
						vars.setRes_type(Constant.Executed);
					}
				}
			} catch (Exception e) {
				result="Dialog box not Identified" + e.getMessage();
				vars.setExecutionStatus(Constant.Failed);
				vars.setExecutionResult(result);
				vars.setRes_type(Constant.Failed);
				vars.setExceptionVar(e.toString());
			}

		}
	}
	/**
	 * @param source
	 * @return
	 */
	public static String testObjectTestData(String source) {
		Pattern pt = Pattern.compile(",|and",Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(source);
		String returnValue = null;
		if (mt.find()){
			if(mt.group(0).equals("and"))
				returnValue =  " "+mt.group(0)+" ";
			else if(mt.group(0).equals(","))
				returnValue = mt.group(0);
			return returnValue;
		}

		else {
			return null;
		}
	}

	/**
	 * @param Vars
	 * @throws Exception
	 * extract data from the given string and store it into map
	 */
	public static void extract(LocalTC Vars) throws Exception {
		String strObjProp = Vars.getObjProp().replace("#", "");
		String strObj = Vars.getObj().replace("#", "");
		String strTestData = Vars.getTestdata().replace("regex:", "");
		String strText = "";
		String strNumber = "";
		try {
			if (null != strObj) {
				strText = Vars.map.get(strObj);
				Pattern pt = Pattern.compile(strTestData, Pattern.CASE_INSENSITIVE);
				Matcher mt = null;
				if (!strText.isEmpty()) {
					mt = pt.matcher(strText);
				}
				if (mt.find()) {
					strNumber = mt.group(0);
				}else{
					result = "Number not found in " +strText;
					Vars.setExecutionStatus(Constant.Failed);
					Vars.setExecutionResult(result);
					screenShot(Vars);
					Vars.setRes_type(Constant.Failed);
				}
				
			}
			if (null != strObjProp) {
				Vars.map.put(strObjProp, strNumber);
				result = strNumber + " has been extracted and store into " +strObjProp;
				Vars.setExecutionStatus(Constant.Passed);
				Vars.setExecutionResult(result);
				screenShot(Vars);
				Vars.setRes_type(Constant.Executed);
			}
		
		} catch (Exception ex) {
			result = "error in Extract text";
			Vars.setExecutionStatus(Constant.Failed);
			Vars.setExecutionResult(result);
			screenShot(Vars);
			Vars.setRes_type(Constant.Failed);
		}

	}
	/**
	 * @param Vars
	 * @throws Exception
	 * Verifying the data from the file (pdf, xls. csv)
	 */
	public static void verifyData(LocalTC Vars) throws Exception{
		String objectType = Vars.getObj();     
		String ObjectValCh = Vars.getObjProp();
		String ObjectEventCh = Vars.getEvent();                             
		String ObjectTestDataCh = Vars.getTestdata();
		boolean bflag = false;
		int col = 0,row = 0;
		if(objectType.contains("column")){
			col = Integer.parseInt(objectType.split(" ")[1].trim()); 
		}
		if(objectType.contains("row")){
			row = Integer.parseInt(objectType.split(" ")[1].trim()); 
		}
		if (ObjectEventCh.contains("#") && Vars.map.get(ObjectEventCh.substring(1,(ObjectEventCh.length()))) != null) {
			ObjectEventCh = Vars.map.get(ObjectEventCh.substring(1,(ObjectEventCh.length())));
		}
		if (ObjectValCh.contains("#") && Vars.map.get(ObjectValCh.substring(1,(ObjectValCh.length()))) != null) {
			ObjectValCh = Vars.map.get(ObjectValCh.substring(1,(ObjectValCh.length())));
		}
		bflag = ExcelUtils.readDataFromFile(ObjectTestDataCh, row, col, ObjectEventCh, ObjectValCh);
		if(bflag){
			result = "Object found from file";
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setExecutionResult(result);
			screenShot(Vars);
			Vars.setRes_type(Constant.Executed);	
		}else{
			result = "object not found from sheet";
			Vars.setExecutionStatus(Constant.Failed);
			Vars.setExecutionResult(result);
			screenShot(Vars);
			Vars.setRes_type(Constant.Failed);
		}
	}
	/**
	 * @param Vars
	 * @throws Exception
	 * swapping words and storing into variable
	 */
	public static void swap(LocalTC Vars) throws Exception {
		String objectType = Vars.getObj().replace("#", "");
		String ObjectValCh = Vars.getObjProp();
		String strSwapValue = "";
		if (ObjectValCh.contains("#")) {
			ObjectValCh = Vars.map.get(ObjectValCh.substring(1, (ObjectValCh.length())));
		}
		String strSwap[] = ObjectValCh.split(" ");
		for (int i = strSwap.length - 1; i>=0; i--) {
			if (strSwapValue.isEmpty())
				strSwapValue = strSwapValue + strSwap[i];
			else
				strSwapValue = strSwapValue + ", " + strSwap[i];
		}
		Vars.map.put(objectType, strSwapValue);
		result = "Object has been swap and store into " + objectType;
		Vars.setExecutionStatus(Constant.Passed);
		Vars.setExecutionResult(result);
		screenShot(Vars);
		Vars.setRes_type(Constant.Executed);
	}
}
