package automationFramework;

import static org.junit.Assert.fail;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
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
import org.openqa.selenium.support.ui.Select;

import appModules.functionLibary;
import utility.BrowserFactory;
import utility.Constant;
import utility.Log;

public class KeywordAction extends KeywordLibrary {
	static WebDriver driver;
	static String Object;
	static String Event;
	static String cCellObjType;
	static String cCellObjName;
	static String ObjectSet;
	static String ObjectSetVal;
	static String result = "";
	///////////////////////////////Running loop///////////////////////////////////////
	static int loopsize = -1;
	static int[] loopstart = new int[1];
	static int[] loopcount = new int[1];
	static int[] loopend = new int[1];
	static int[] loopcnt = new int[1];
	static int[] dtrownumloop = new int[1];
	static int startrow = 0;
	static int j = 0;
	static int dtrownum = 1;
	static int loopnum = 1;
	static int rowcnt;
	static int loopflag = 0;
	//////////////////////////////////////////////////////////////////////////////////
	static int conditionline = 0;
	static XSSFSheet XSSDTsheet = null;
	static String sqlquery;

	public static void CallAction(LocalTC Vars) throws Exception {
		try {
			
			Constant.Vars = Vars;
			switch (Vars.Action.toLowerCase()) {
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
			case Constant.Endcondition:
				Reporter.ReportEvent(Constant.Executed);
				break;
			case Constant.Screencaptureoption: //capturing screen shot
				screenCaptureOption(Vars);
				break;
			case Constant.Importdata:  //importing data from file
				importdata(Vars);
				break;
			case Constant.Fetchdb:  //fetching data from the database
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
			case Constant.Check: //checking different actions
				Vars.setScreenshotTypeFlag(0);
				func_StoreCheck(Vars);
				break;
			case Constant.Storevalue:  //storing values
				Vars.setScreenshotTypeFlag(0);
				func_StoreCheck(Vars);
				break;
			case Constant.Upload:  //uploading document into existing path
				if (Vars.getObj().toString() == "") {
					Reporter.ReportEvent(Constant.FilePathNotFound2);
					doUploadDownload(Constant.Abortupload,Vars);
				} else {
					if (new File(Vars.getObj().toString()).exists()) {
						// System.out.println(cCellData.toString());
						doUploadDownload(Constant.Upload,Vars);
					} else {
						Reporter.ReportEvent(Constant.FilePathNotFound);
						doUploadDownload(Constant.Abortupload,Vars);
					}
				}
				break;
			case Constant.Download: //download from given path
				download(Vars);
				break;
			case Constant.CallAction:
				varCallaction(Vars);
				break;
			default:
				Reporter.ReportEvent(Constant.Failed);
				break;
			}
		}
		catch (Exception ex) {
			Log.info("failed  " +ex.getMessage() );
			Log.info("------Error Information : Ignite------- "  );
			Log.info("Current Script:" +  Vars.iTestCaseID);
			Log.info("Current Script:" +  Vars.TestStepID);
			fail("Cannot test normally by Ignite.");
		}
	}

	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			//Log.error(Level.SEVERE, " Exception Occured in isInteger- " +e.getMessage()); 
			return false;
		}
	}

	private static void LaunchApp(LocalTC vars) throws IOException {
		if(driver == null) {
			driver =BrowserFactory.getBrowser(vars);
			driver.get(vars.getObjProp());
			Constant.driver = driver;
			result = "Driver has been created for " + vars.getbrowsername();
		}
		if(vars.getEvent().equals(Constant.NavigateTo)){
			driver =BrowserFactory.getBrowser(vars);
			driver.get(vars.getObjProp());
			Constant.driver = driver;
			result = "Navigated to " + vars.getObjProp();
		}
		vars.setExecutionResult(result);
		System.out.println(result);
		Log.info(result);
		Reporter.ReportEvent(Constant.Executed);
		vars.ExecutionStatus = "Passed";
	}

	private static void ClossApp(LocalTC vars) throws IOException {
		driver.close();
		driver = null;
		String result = "Browser has been closed";
		vars.setExecutionResult(result);
		System.out.println(result);
		Log.info(result);
		Reporter.ReportEvent(Constant.Executed);
		vars.ExecutionStatus = "Passed";
	}

	private static void PerformAction(LocalTC Vars) throws Exception {
		//ScreenshotTypeFlag = 0;
		By Locator;
		cCellObjName = Vars.getObjProp().replace("obj=", "").toLowerCase();
		cCellObjType = Vars.getObj(); 
		ObjectSet = Vars.Event.toLowerCase();
		ObjectSetVal=Vars.getTestdata().replace("\"", "");
		//if (ObjectSetVal.startsWith("dt_") || ObjectSetVal.startsWith("#"))
		Locator = Vars.obj.getLocator(cCellObjName);
		if(null != Locator)
			Vars.elem = Constant.driver.findElement(Locator) ;
		if (Vars.elem !=null)
			dCellAction(Vars);
		else Reporter.ReportEvent(Constant.Missing);
	}

	private static void waitfor(LocalTC vars) throws NumberFormatException, InterruptedException, IOException {
		if (vars.getObj().isEmpty()){
			Thread.sleep(Long.parseLong(vars.getEvent()));
			Log.info("Waited for " + vars.ObjProp);
			Reporter.ReportEvent(Constant.Executed);
		}
		else
		{
			Reporter.ReportEvent(Constant.Executed);
			//dynamic wait for object to appear
			//Look for element to be available on the screen if not then wait for some time
		}
	}

	public static void dCellAction(LocalTC Vars) throws Exception {
		try {
			//String objectType = Vars.getObjProp();
			if(driver == null) {
				driver =BrowserFactory.getBrowser(Vars);
			}
			//OR obj =new OR("ObjectRepository/OR.Properties");
			//elem =driver.findElement(obj.getLocator(cCellObjType)) ;

			if (Vars.elem == null) {
				return;
			} else {
				switch (ObjectSet) {
				case Constant.Set:
					if (cCellObjType.equalsIgnoreCase("textbox") || cCellObjType.equalsIgnoreCase("textarea")) {
						Vars.elem.clear();
						StringBuffer inputvalue = new StringBuffer();
						if (ObjectSetVal == "nodatarow") {
							//Reporter.ReportEvent("missing", Vars);
							Reporter.ReportEvent(Constant.Missing);
						} else {
							inputvalue.append(ObjectSetVal);
							Vars.elem.sendKeys(ObjectSetVal);
						}
						//if (Vars.captureperform == true) {
						screenShot(Vars);
						//}
					} else {
					}
					break;
				case Constant.Listselect:
					if (Vars.Obj.equalsIgnoreCase("listbox")) {
						int foundCount = 0;
						String str = testObjectSetValue(ObjectSetVal);
						//ObjectSetVal = ObjectSetVal.replaceAll("\\s","");
						String[] listvalues = ObjectSetVal.split(str);
						List<WebElement> listboxitems = Vars.elem
								.findElements(By.tagName("option"));
						Select chooseoptn = new Select(Vars.elem);
						chooseoptn.deselectAll();
						if (ObjectSetVal == "nodatarow") {
							Reporter.ReportEvent(Constant.Missing);
						} else {
							for (WebElement opt : listboxitems) {
								for (int i = 0; i < listvalues.length; i++) {
									if (opt.getText().equalsIgnoreCase(listvalues[i].trim())) {
										chooseoptn.selectByVisibleText(opt.getText());
										foundCount = foundCount + 1;
									}
								}
							}
							if (foundCount == 0
									&& ObjectSetVal.contains(""))
							{
								Reporter.ReportEvent(Constant.NoBlankAvailable);
							} else {
								Reporter.ReportEvent(Constant.Executed, ObjectSet,Vars.Testdata);
								Log.info("executed for " +  ObjectSet +" on " + Vars.Testdata);
							}
							//if (Vars.captureperform == true) {
							screenShot(Vars);
							//}
						}
					} else {
						Log.info(Constant.Action1);
					}
					break;

				case Constant.Select:
					if (Vars.Obj.equalsIgnoreCase("combobox")) {
						if (!ObjectSetVal.isEmpty()) {
							new Select(Vars.elem)
							.selectByVisibleText(ObjectSetVal);
							Reporter.ReportEvent(Constant.Executed, ObjectSet,ObjectSetVal);
						} else if (ObjectSetVal == "nodatarow") {
							Reporter.ReportEvent(Constant.Missing);
						}

						else {
							if (new Select(Vars.elem).getOptions().toString()
									.contains("") == true) {
								try {
									new Select(Vars.elem)
									.selectByVisibleText("");
									Reporter.ReportEvent(Constant.Executed, ObjectSet,Vars.Testdata);
								} catch (Exception e) {
									Reporter.ReportEvent(Constant.NoBlankAvailable);
								}
							} else {
								Reporter.ReportEvent(Constant.NoBlankAvailable);
							}
						}
						//if (Vars.captureperform == true) {
						screenShot(Vars);
						//}
					} else {
						Reporter.ReportEvent(Constant.Action1);
					}
					break;
				case Constant.Check:
					if (ObjectSetVal == "nodatarow") {
						//Reporter.ReportEvent("missing");
					} else {
						if (Vars.Obj.equalsIgnoreCase("checkbox")) {
							if (Vars.elem.isSelected()
									&& ObjectSetVal.equalsIgnoreCase("On")) {
								Reporter.ReportEvent(Constant.Executed, ObjectSet,Vars.Testdata);
							} else if ((Vars.elem.isSelected() && ObjectSetVal
									.equalsIgnoreCase("off"))) {
								Vars.elem.click();
								Reporter.ReportEvent(Constant.Executed, ObjectSet,Vars.Testdata);
							} else if (ObjectSetVal.equalsIgnoreCase("on")) {
								Vars.elem.click();
								Reporter.ReportEvent(Constant.Executed, ObjectSet,Vars.Testdata);
							} else if ((ObjectSetVal
									.equalsIgnoreCase("off"))) {
								Reporter.ReportEvent(Constant.Executed, ObjectSet,Vars.Testdata);
							} else {
								Reporter.ReportEvent(Constant.Failed, ObjectSet,Vars.Testdata);
							}
							//if (Vars.captureperform == true) {
							screenShot(Vars);
							//}
						} else {
							Reporter.ReportEvent(Constant.Action1);
						}
					}
					break;
				case Constant.Click:
					//parentWindowHandle1 = driver.getWindowHandle();
					try {

						if (Vars.elem.getAttribute("type").toLowerCase()
								.equals("file")
								&& Vars.getbrowsername().equalsIgnoreCase("ff")) {

							JavascriptExecutor executor = (JavascriptExecutor) driver;
							executor.executeScript("arguments[0].click();",Vars.elem);

							Reporter.ReportEvent(Constant.Executed);
							break;

						} else if (Vars.elem.getAttribute("type").toLowerCase().equals("file")
								&& Vars.getbrowsername().equalsIgnoreCase("ie")
								&& Integer.parseInt(Vars.getBrowserVer()) == 8) {
							Reporter.ReportEvent(Constant.Executed);
						} else {
							Vars.elem.click();
							Reporter.ReportEvent(Constant.Executed);
						}
					} catch (Exception exp1) {
						Vars.elem.click();
						Reporter.ReportEvent(Constant.Executed);
					}
					//if (Vars.captureperform == true) {
					screenShot(Vars);
					//}
					break;
				case Constant.Hover:
					JavascriptExecutor js = (JavascriptExecutor) driver;
					String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
					js.executeScript(mouseOverScript, Vars.elem);
					Reporter.ReportEvent(Constant.Executed);
					break;

				case Constant.Altclick:
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", Vars.elem);
					Reporter.ReportEvent(Constant.Executed);
					break;
				case Constant.Enter:
					Vars.elem.sendKeys(org.openqa.selenium.Keys.ENTER);
					Reporter.ReportEvent(Constant.Executed);
					//if (Vars.captureperform == true) {
					screenShot(Vars);
					//}
					break;
				case Constant.Setdate:

					Robot robot1 = new Robot();
					//ScreenshotTypeFlag = 1;
					String calstring = cCellObjName.toLowerCase();
					if (cCellObjType.equalsIgnoreCase("calendar")
							&& calstring.startsWith("cal_")) {
						try {

							String[] datearray = ObjectSetVal.split("-");
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
								Reporter.ReportEvent(Constant.Invaliddate1);
							} else {
								//selectDate(mm, dd, yyyy);
							}

						} catch (Exception e) {
							Reporter.ReportEvent(Constant.Invaliddate1);
							robot1.keyPress(KeyEvent.VK_ESCAPE);
							robot1.keyRelease(KeyEvent.VK_ESCAPE);
						}
					} else {
						Reporter.ReportEvent(Constant.Calendaraction);
					}
					break;
				default:
					Reporter.ReportEvent(Constant.Action);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			Reporter.ReportEvent(Constant.Failed, e);
		}
	}

	public static void func_InvokeFunction(String functionName,	String argumentlist) throws IOException 
	{
		Object[] argument_list = null;
		int checkNULL = 0;
		int CheckONE = 0;
		Class[] parameterTypes = null;
		Constant.Vars.setTestdata(argumentlist);
		//if (argumentlist == "") {
		if (argumentlist.isEmpty()) {
			checkNULL = 1;
		} else if (argumentlist.contains(",")) {
			argument_list = argumentlist.split(",");
			Constant.Vars.setTestdata(argumentlist); 
		} else {
			CheckONE = 1;
		}
		String function_name = functionName;
		try {
			functionLibary s1 = new functionLibary();
			Method[] declaredMethods = functionLibary.class.getDeclaredMethods();
			for (Method m : declaredMethods) {
				System.out.println(m.getName());
				if (checkNULL != 1) {
					parameterTypes = m.getParameterTypes();
				}
				if (checkNULL == 0) {
					if ((m.getName()).equals(function_name)) {
						if (parameterTypes.length > 1) {
							if (parameterTypes.length == argument_list.length) {
								try {
									m.invoke(s1, argument_list);
									Log.info("executed : Direcotry is already Created");
									Reporter.ReportEvent(Constant.Executed);
								} catch (Exception e) {
									Log.error("userdefined : Direcotry is already Created");
									Reporter.ReportEvent(Constant.Userdefined);
								}
								break;
							}
							
						} else if ((m.getName()).equals(function_name)
								&& CheckONE == 1 && parameterTypes.length == 1) {
							try {
								m.invoke(s1, argumentlist);
								Reporter.ReportEvent(Constant.Executed);
							} catch (Exception e) {
								Reporter.ReportEvent(Constant.Userdefined);
							}
							break;
						}
					}
				} else if (m.getName().equals(function_name) && checkNULL == 1) {
					try {
						m.invoke(s1);
						Reporter.ReportEvent(Constant.Executed);
					} catch (Exception e) {
						Reporter.ReportEvent(Constant.Userdefined);
					}
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			Reporter.ReportEvent(Constant.Failed, e);
			//Log.info(Level.SEVERE, " Exception Occured in func_InvokeFunction- " +e.getMessage()); 
		}
	}
	public static void Resetloop(){
		for (int z = 0; z < 1; z++) 
		{
			loopstart[z] = 0;
			loopend[z] = 0;
			loopcnt[z] = 0;
			dtrownumloop[z] = 1;
			loopcount[z] = 0;
		}
	}

	private static void func_StoreCheck(LocalTC Vars) throws Exception {
		try {
			String actval = null;
			String expval = null;
			Boolean boolval = null;
			String varname;
			int iflag =0;
			String objectType = Vars.getObj();     
			String ObjectValCh = Vars.getObjProp();
			String ObjectSetCh = Vars.getEvent();                             
			String ObjectSetValCh = Vars.getTestdata();
			int DTcolumncountCh = 0;
			if (!ObjectSetValCh.isEmpty() && ObjectSetValCh.substring(0, 1).equalsIgnoreCase("#")) {
				System.out.println("In #");
				if (Vars.map.get(ObjectSetValCh.substring(1,(ObjectSetValCh.length()))) != null) {
					ObjectSetValCh = Vars.map.get(ObjectSetValCh.substring(1,(ObjectSetValCh.length())));
				} else {
					ObjectSetValCh = "";
				}
			}
			if (objectType.equalsIgnoreCase("page")|| objectType.equalsIgnoreCase("dialog")) {
				Vars.objFoundFlag = 1;
			} else

			{
				Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
				if (Vars.elem !=null)
					Vars.objFoundFlag = 1;
				else Reporter.ReportEvent(Constant.Missing);
			}

			if (Vars.objFoundFlag == 1) {
				Vars.objFoundFlag = 0;

				if (!ObjectSetValCh.isEmpty() && ObjectSetValCh.contains("dt_")) {
					iflag = 0;
					String ObjectSetValtableheader[] = ObjectSetValCh.split("_");
					int column = 0;
					String Searchtext = ObjectSetValtableheader[1];
					try {
						DTcolumncountCh = Vars.DTsheet.getColCount();

					} catch (NullPointerException e) {
						return;
					}
					for (column = 0; column < DTcolumncountCh; column++) {
						if(Searchtext.equalsIgnoreCase(Vars.DTsheet.getCellData(0, column))==true)
						{
							ObjectSetValCh = Vars.DTsheet.getCellData(Vars.row, column);
							iflag = 1;
							if (ObjectSetValCh.length() == 0) {
								ObjectSetValCh = "";
							}  
						}
					}
					if (iflag == 0) {
						ObjectSetValCh = "nodatarow";
						Vars.ORvalname = "exit";
					}
				}

				/*if (ObjectSetValCh.contains("dt_")) {
					String ObjectSetValtableheader[] = ObjectSetValCh
							.split("_");
					int column = 0;
					String Searchtext = ObjectSetValtableheader[1];
					DTcolumncountCh =Vars.DTsheet.getColCount();
					for (column = 0; column < DTcolumncountCh; column++) {
						if(Searchtext.equalsIgnoreCase(Vars.DTsheet.getCellData(0,column))==true)
						{
							ObjectSetValCh = Vars.DTsheet.getCellData(Vars.row,column);
							iflag = 1;
							if (ObjectSetValCh.length() == 0) {
								ObjectSetValCh = "";
							}
						}
					}
					if (iflag == 0) {
						Vars.ORvalname = "exit";
					}
				}*/

				switch (ObjectSetCh.toLowerCase()) {
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
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						boolval = Vars.elem.isEnabled();
						actval = boolval.toString();
					} else {
						Reporter.ReportEvent(Constant.Property1);
					}
					break;
				case Constant.Text:
					// Specifications change for STH 
					if (objectType.equalsIgnoreCase("button")) {
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						if (Vars.elem.getTagName().equalsIgnoreCase("button")) {
							actval = Vars.elem.getText();
						} else if (Vars.elem.getTagName().equalsIgnoreCase("input")) {
							actval = Vars.elem.getAttribute("value");
						} else {
							Reporter.ReportEvent(Constant.Property1);
						}
					} else if (objectType.equalsIgnoreCase("textbox")
							|| objectType.equalsIgnoreCase("textarea")) {

						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						actval = Vars.elem.getAttribute("value");

					} else if (objectType.equalsIgnoreCase("textelement")
							|| objectType.equalsIgnoreCase("element")) {

						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						actval = Vars.elem.getText();

					} else if (objectType.equalsIgnoreCase("combobox")
							|| objectType.equalsIgnoreCase("listbox")
							) {
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						// 2016-03-23 Multiple Selected Check Support
						List<WebElement> selectedList = new Select(Vars.elem).getAllSelectedOptions();
						actval = selectedList.get(0).getText();
						if(selectedList.size() > 1) {
							for(int i = 1; i < selectedList.size(); i++) {
								actval += ":" + selectedList.get(i).getText();
							}
						}
						/*
						actval = new Select(elem).getFirstSelectedOption()
								.getText().toString();
						 */
					} else {

						Reporter.ReportEvent(Constant.Property1);
					}
					break;
				case Constant.Value:
					// Specifications change for STH
					if(objectType.equalsIgnoreCase("checkbox")
							|| objectType.equalsIgnoreCase("combobox")
							|| objectType.equalsIgnoreCase("radiobutton")) {
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						actval = Vars.elem.getAttribute("value");
					} else if(objectType.equalsIgnoreCase("listbox")) {
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						List<WebElement> selectedList = new Select(Vars.elem).getAllSelectedOptions();
						actval = selectedList.get(0).getAttribute("value");
						if(selectedList.size() > 1) {
							for (int i = 1; i < selectedList.size(); i++) {
								actval += ":" + selectedList.get(i).getAttribute("value");
							}
						}
					} else {
						Reporter.ReportEvent(Constant.Property1);
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
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						boolval = Vars.elem.isDisplayed();
						actval = boolval.toString();
					} else {
						Reporter.ReportEvent(Constant.Property1);
					}

					break;
				case Constant.Checked:
					if ((objectType.equalsIgnoreCase("radiobutton")
							|| objectType.equalsIgnoreCase("checkbox") || objectType
							.equalsIgnoreCase("element"))) {
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
						boolval = Vars.elem.isSelected();
						actval = boolval.toString();

					} else {
						Reporter.ReportEvent(Constant.Property1);
					}
					break;
				case Constant.Linktext:
					if (objectType.equalsIgnoreCase("link")) {
						Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;

						actval = Vars.elem.getText();
					} else {
						Reporter.ReportEvent(Constant.Property1);
					}
					break;
				case Constant.Pagetitle:
					if (ObjectValCh != "") {
						actval = ObjectValCh;
					} else {
						actval = driver.getTitle();
					}
					break;

				case Constant.Exist:
					boolval = false;
					actval = boolval.toString();

					if ((objectType.equalsIgnoreCase("page")) == true

							&& (driver.getTitle().toString()
									.equalsIgnoreCase(ObjectValCh)) == true) {

						actval = "true";
					} else {
						if (objectType.equalsIgnoreCase("page")) {

							String currentWindowHandle = driver.getWindowHandle();
							int windowFound = 0;
							WebDriver newWindow = null;
							Set<String> al = new HashSet<String>();
							al = driver.getWindowHandles();
							Iterator<String> windowIterator = al.iterator();

							if (driver.getTitle().toString()
									.equalsIgnoreCase(ObjectValCh) != true) {
								while (windowIterator.hasNext()) {
									String windowHandle = windowIterator.next();
									newWindow = driver.switchTo().window(
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
								driver.switchTo().window(currentWindowHandle);
							}

						} else {

							if (objectType.equalsIgnoreCase("dialog") == true) {
								try {

									Alert dialogExist = null;
									dialogExist = driver.switchTo().alert();
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
					Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
					List<WebElement> rows = Vars.elem.findElements(By.tagName("tr"));
					Integer rowCount = rows.size();
					if (rowCount == 0) {
						// WebElement rows1=elem.findElement(By.tagName("tr"));
						rowCount = 1;
					}
					actval = rowCount.toString();
					Reporter.ReportEvent(Constant.Property1);
					break;

				case Constant.Columncount:
					WebElement headerRow = null;
					Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
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
					Reporter.ReportEvent(Constant.Property1);
					break;
				case Constant.Getcelldata:

					Vars.elem = driver.findElement(Vars.obj.getLocator(ObjectValCh)) ;
					try {
						List<WebElement> cellRows = Vars.elem.findElements(By
								.tagName("tr"));
						String cellData = "";
						int rowNumber = Integer.parseInt(ObjectSetCh);
						int colNumber = Integer.parseInt(ObjectSetValCh);
						System.out.println("rownum - " + rowNumber
								+ "  col num - " + colNumber);
						WebElement reqrow = cellRows.get(rowNumber - 1);
						List<WebElement> reqcolmns = reqrow.findElements(By
								.tagName("td"));
						WebElement reqcellData = reqcolmns.get(colNumber - 1);
						cellData = reqcellData.getText();
						actval = cellData.toString();
						//ObjectSetValCh = getCellArray[1];
					} catch (Exception e) {
						Reporter.ReportEvent(Constant.Getcelldata);
					}
					break;

				default:
					actval = "Invalid syntax";
					Reporter.ReportEvent(Constant.Property);
					break;
				}

				if ((Vars.getAction()).equalsIgnoreCase("check")) {
					expval = ObjectSetValCh;
					// Specifications change for STH 
					if (objectType.equalsIgnoreCase("radiobutton")) {
						if (expval.equalsIgnoreCase("On")) {
							expval = "True";
						} else if (expval.equalsIgnoreCase("Off")) {
							expval = "False";
						}
					}

					if (ObjectSetCh.equalsIgnoreCase("checked") 
							|| ObjectSetCh.equalsIgnoreCase("visible")
							|| ObjectSetCh.equalsIgnoreCase("enabled")
							|| ObjectSetCh.equalsIgnoreCase("exist")) {
						if (expval.equalsIgnoreCase(actval)) {
							// Specifications change for STH 

							System.out
							.println("Actual value matches with expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval);

							if (ObjectSetCh.equalsIgnoreCase("getcelldata")) {

								Reporter.ReportEvent(Constant.Executed);
							} else {
								Reporter.ReportEvent(Constant.Executed, ObjectSetCh,
										ObjectSetValCh);
							}
							if (Constant.Vars.capturecheckvalue == true) {
								screenShot(Vars);
							}	
						} else {

							System.out
							.println("Actual value doesn't match with expected value. Actual value is "
									+ actval
									+ " expected value is "
									+ expval);

							if (Vars.ORvalname == "exit") {
								Reporter.ReportEvent(Constant.Missing, ObjectSetCh,
										ObjectSetValCh);

							} else {
								if (ObjectSetCh.equalsIgnoreCase("getcelldata")) {
									Reporter.ReportEvent(Constant.Failed);
								} else {
									Reporter.ReportEvent(Constant.Failed, ObjectSetCh,
											ObjectSetValCh);
								}

							}
							if (Vars.capturecheckvalue == true) {
								screenShot(Vars);
							}
						}
					} else {
						if (expval.equals(actval)) {
							// Specifications change for STH 
							System.out
							.println("Actual value matches with expected value. "
									+ " Actual Value is " + actval 
									+ " and expected value is " + expval);
							if (ObjectSetCh.equalsIgnoreCase("getcelldata")) {

								Reporter.ReportEvent(Constant.Executed);
							} else {
								Reporter.ReportEvent(Constant.Executed, ObjectSetCh,
										ObjectSetValCh);
							}
							if (Vars.capturecheckvalue == true) {
								screenShot(Vars);
							}	
						} else {
							System.out
							.println("Actual value doesn't match with expected value. Actual value is "
									+ actval
									+ " expected value is "
									+ expval);

							if (Vars.ORvalname == "exit") {
								Reporter.ReportEvent(Constant.Missing, ObjectSetCh,
										ObjectSetValCh);

							} else {
								if (ObjectSetCh.equalsIgnoreCase("getcelldata")) {
									Reporter.ReportEvent("failed");
								} else {
									Reporter.ReportEvent(Constant.Failed, ObjectSetCh,
											ObjectSetValCh);
								}
							}
							if (Vars.capturecheckvalue == true) {
								screenShot(Vars);
							}
						}						
					}
				} else if ((Vars.getAction()).equalsIgnoreCase("storevalue"))

				{
					varname = ObjectSetValCh;

					if (actval.equalsIgnoreCase("Invalid syntax")) {
						Reporter.ReportEvent(Constant.Missing, ObjectSetCh, ObjectSetValCh);

					} else {
						if (Vars.map.containsKey(varname)) {
							Vars.map.remove(varname);
							Vars.map.put(varname, actval);

							if (ObjectSetCh.equalsIgnoreCase(Constant.Getcelldata)) {
								Reporter.ReportEvent(Constant.Executed);
							} else {
								Reporter.ReportEvent(Constant.Executed, ObjectSetCh,
										ObjectSetValCh);
							}
							System.out
							.println("Overwriting the value of the variable "
									+ varname
									+ " to store the value as mentioned in the test case row number"
									+ Vars.row);
						} else {
							Vars.map.put(varname, actval);
							if (ObjectSetCh.equalsIgnoreCase(Constant.Getcelldata)) {
								Reporter.ReportEvent(Constant.Executed);
							} else {
								Reporter.ReportEvent(Constant.Executed, ObjectSetCh,
										ObjectSetValCh);
							}
							System.out
							.println("Overwriting the value of the variable "
									+ varname
									+ " to store the value as mentioned in the test case row number"
									+ Vars.row);
							if (ObjectSetValCh.equals("nodatarow")) {
								Reporter.ReportEvent(Constant.Missing);
							} else {

							}
						}
					}
					if (Constant.Vars.capturestorevalue == true) {
						screenShot(Vars);
					}
				}

			} else {
				Reporter.ReportEvent(Constant.ObjectNotFound);
			}

		} catch (Exception e) {
			//	if (locatorError == 1) {

			//	} else {

			Reporter.ReportEvent(Constant.Failed, e);
			//}
		}

	}

	public static int ifContidionSkipper(String strifConditionStatus)
			throws Exception {
		try {
			String strKeyword;
			int intIfEndConditionCount, intIfConditionCount;
			// String strKeyWord;
			intIfConditionCount = 1;
			intIfEndConditionCount = 0;

			if (strifConditionStatus.equalsIgnoreCase("false")) {
				// intLogicStartRow = j;

				do {
					Constant.Vars.row = Constant.Vars.row + 1;
					strKeyword =Constant.Vars.TestRun.getCellData(Constant.Vars.row,1);
					if (strKeyword.equalsIgnoreCase(Constant.Condition)) {
						intIfConditionCount = intIfConditionCount + 1;
					}

					if (strKeyword.equalsIgnoreCase(Constant.Endcondition)) {
						intIfEndConditionCount = intIfEndConditionCount + 1;

						if (intIfConditionCount == intIfEndConditionCount) {
							Constant.Vars.row= Constant.Vars.row + 1;
							break;
						}
					}

				} while (true);
			}
		} catch (Exception e) {
			System.out.println(e);
			Log.info( "Error Occured  in  ifContidionSkipper: " +e.getMessage());

		}
		return Constant.Vars.row;
	}


	public static String func_IfCondition(String strOperation) throws Exception {

		int iFlag = 1;
		//String str[] = strConditionArgs.split(";");
		//String value1 = str[0];
		String value1 = Constant.Vars.Obj;
		String value2 = Constant.Vars.Event.replaceAll("\"","");
		//String strOperation = Constant.Vars.;
		strOperation = strOperation.toLowerCase().trim();
		switch (strOperation.toLowerCase()) {
		case "=":
		case "equals to":
		case Constant.Equals:
			if (value1.substring(0, 1).equalsIgnoreCase("#")) {

				value1 = Constant.Vars.map.get(value1.substring(1, (value1.length())));
				System.out
				.println("Variable used in condition statement has value: "
						+ value1);


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
				System.out
				.println("Variable used in condition statement has values: "
						+ value1);
				if (!value1.trim().equalsIgnoreCase(value2.trim())) {

					iFlag = 0;
				}

			} else if (!value1.trim().equals(value2.trim())) {
				iFlag = 0;
			}
			break;
		case ">":
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
				System.out.println("Give Only Integers for Compare ");
			}
			break;
		case "<":
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
				Log.info( "Error Occured in lessthan : Give Only Integers for Compare" );
				System.out.println("Give Only Integers for Compare ");
			}
			break;
		default:
			Reporter.ReportEvent(Constant.Missing);
			break;
		}
		if (iFlag == 0) {

			return "true";

		} else {
			return "false";
		}

	}

	public static void arrayreSize() {
		if (loopstart.length <= loopsize) {
			loopstart = Arrays.copyOf(loopstart, loopstart.length + 1);
			loopend = Arrays.copyOf(loopend, loopend.length + 1);
			loopcnt = Arrays.copyOf(loopcnt, loopcnt.length + 1);
			dtrownumloop = Arrays.copyOf(dtrownumloop, dtrownumloop.length + 1);
			loopcount = Arrays.copyOf(loopcount, loopcount.length + 1);
		}
	}

	private static void doUploadDownload(String action1,LocalTC Vars) throws Exception {
		// Robot robot = new Robot();
		String browserName = Vars.getbrowsername();
		String cCellData = Vars.getObj();
		if (browserName.equalsIgnoreCase("firefox")) {
			switch (action1) {
			case Constant.Upload:
				try {
					Thread.sleep(2000);
					Runtime.getRuntime().exec(
							Constant.execpath + " 2 upload " + cCellData + " "
									+ browserName.toLowerCase());
					Reporter.ReportEvent("executed");
				} catch (IOException e) {
					Log.info("Exception Occured: " +e.getMessage());
					System.out.println(e);
				}
				break;
			case Constant.Abortupload:
				try {
					Runtime.getRuntime().exec(
							Constant.execpath + " 2 closeupload " + "abort" + " "
									+ browserName.toLowerCase());

				} catch (IOException e) {
					Log.info( "Exception Occured in abortupload- " +e.getMessage());
					System.out.println(e);
				}
				break;

			case Constant.Cancelupload:
				try {
					Runtime.getRuntime().exec(
							Constant.execpath + " 2 cancelupload " + cCellData + " "
									+ browserName.toLowerCase());
					Reporter.ReportEvent("executed");
				} catch (IOException e) {
					Log.info( "Exception Occured in cancelupload- " +e.getMessage());
					System.out.println(e);
				}
				break;

			case Constant.Download:
				try {
					Runtime.getRuntime().exec(
							Constant.execpath + " 2 download " + ObjectSet + " "
									+ browserName.toLowerCase() + " "
									+ Vars.elem.getAttribute("href"));
					Thread.sleep(4000);
					Reporter.ReportEvent("executed");
				} catch (IOException e) {
					System.out.println("Error Occured in Dowload keyword execution  "+e.getMessage());
					Log.info( "IOException Occured in download- " +e.getMessage()); 
				}
				break;
			default:
				System.out.println("Action not supported");
				break;
			}
		} else if (browserName.equalsIgnoreCase("ie")) {
			switch (action1) {
			case Constant.Upload:
				if (Integer.parseInt(Vars.getBrowserVer()) != 8) {
					try {
						Runtime.getRuntime().exec(
								Constant.execpath + " 2 upload " + cCellData + " "
										+ browserName.toLowerCase());
						Reporter.ReportEvent("executed");
					} catch (IOException e) {
						Log.info( "IOException Occured in upload- " +e.getMessage()); 
						System.out.println(e);
					}
				} else {
					Vars.elem.sendKeys(cCellData);
				}
				break;
			case Constant.Closeupload:
				try {
					Runtime.getRuntime().exec(
							Constant.execpath + " 2 closeupload " + cCellData + " "
									+ browserName.toLowerCase());
					Reporter.ReportEvent("executed");
				} catch (IOException e) {
					Log.info( "IOException Occured in closeupload- " +e.getMessage()); 
					System.out.println(e);
				}
				break;
			case Constant.Cancelupload:
				try {
					Runtime.getRuntime().exec(
							Constant.execpath + " 2 cancelupload " + cCellData + " "
									+ browserName.toLowerCase());
					Reporter.ReportEvent("executed");
				} catch (IOException e) {
					Log.info( "IOException Occured in cancelupload- " +e.getMessage()); 
					System.out.println(e);
				}
				break;
			case Constant.Download:
				try {
					Runtime.getRuntime().exec(
							Constant.execpath + " 2 download " + ObjectSet + " "
									+ browserName.toLowerCase() + " "
									+ Vars.elem.getAttribute("href"));
					Reporter.ReportEvent("executed");
				} catch (IOException e) {
					System.out.println("IO exception occured in   download key woard "+e.getMessage());
					Log.info( "IOException Occured in download- " +e.getMessage()); 
				}
				break;
			}
		}
		if (Vars.captureperform == true) {
			screenShot(Vars);
		}
	}
	/*
	 * Method for loop start
	 */
	public static void loop(LocalTC Vars) throws IOException{
		startrow = Vars.row;
		dtrownum = 1;
		loopsize = loopsize + 1;
		if (loopsize >= 1) {
			arrayreSize();
		}
		loopflag = 1;
		loopcount[loopsize] = Integer.parseInt(Vars.getObj());
		loopstart[loopsize] = Vars.row;
		loopcnt[loopsize] = 0;
		dtrownumloop[loopsize] = dtrownum;
		Reporter.ReportEvent("loop : " + "Start of loop : " + (loopsize + 1));
		Reporter.ReportEvent(Constant.Executed);
	}
	
	/*
	 * Method for loop end
	 */
	public static void endloop(LocalTC Vars) throws IOException{
		loopcnt[loopsize] = loopcnt[loopsize] + 1;
		loopnum = loopnum + 1;
		if (loopcnt[loopsize] == loopcount[loopsize]) {
			Reporter.ReportEvent(
					"loop" + " End of Loop : " + (loopsize + 1) + " : Loop count : " + loopcnt[loopsize]);
			loopsize = loopsize - 1;
			if (loopsize >= 0)
				dtrownum = dtrownumloop[loopsize];
			else {
				dtrownum = 1;
				loopflag = 0;
			}
			Reporter.ReportEvent(Constant.Executed);
		} else {
			Vars.row = loopstart[loopsize];
			dtrownum = dtrownum + 1;
			dtrownumloop[loopsize] = dtrownum;
			Reporter.ReportEvent(
					"loop" + " End of Loop : " + (loopsize + 1) + " : Loop count : " + loopcnt[loopsize]);
		}
		rowcnt = 1;
	}
	/*
	 * method for creating condition as per the teststep
	 */
	private static void condition(LocalTC vars) throws Exception {
		String strConditionStatus = func_IfCondition(vars.getObjProp());
		if (strConditionStatus.equalsIgnoreCase("false")) {
			conditionline = vars.row;
			vars.row = ifContidionSkipper(strConditionStatus);
			vars.row = vars.row - 1;
		}
		if (strConditionStatus.equalsIgnoreCase("false")) {
			Reporter.ReportEvent(Constant.CondFailed);
		} else {
			Reporter.ReportEvent(Constant.Executed);
		}
	}
	/*
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
		Reporter.ReportEvent(Constant.Executed);
	}
	/*
	 * method for importing data from given path
	 */
	public static void importdata(LocalTC vars) throws IOException {
		try {
			String xcelpath = vars.getObj().replaceAll("\"", "").trim();
			FileInputStream fs3 = null;
			fs3 = new FileInputStream(new File(xcelpath));
			XSSFWorkbook DTworkbook = new XSSFWorkbook(fs3);
			FormulaEvaluator DTevaluator = DTworkbook.getCreationHelper().createFormulaEvaluator();
			// if(Constant.Vars.update.equalsIgnoreCase("yes")){
			DTevaluator.evaluateAll();
			// }
			vars.ws = DTworkbook.getSheetAt(0);
			Reporter.ReportEvent(Constant.Executed);
		} catch (Exception e) {
			Log.info("Error Occured in importdata : No Data table found  " + e.getMessage());
			Reporter.ReportEvent(Constant.Nodatatable);
		}
	}
	
	/*
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
				Reporter.ReportEvent(Constant.InvalidConnection);
				return;
			}
			if(vars.host_name.length()==0){
				System.out.println("Please Enter Host Name");
				vars.isinvaliddb=false;
				Reporter.ReportEvent(Constant.InvalidConnection);
				return;
			}
			if((vars.schemaname.length()==0)){
				System.out.println("Please Enter Schema Name");
				vars.isinvaliddb=false;
				Reporter.ReportEvent(Constant.InvalidConnection);
				return;
			}
			String substr_query = (sqlquery.trim()).substring(0,6);
			System.out.println("Query is  "+sqlquery);
			if(sqlquery.length()>0){
				String query = sqlquery.trim();
				String isSelect = query.substring(0, 6);
				if((!isSelect.equalsIgnoreCase("select"))){
					parameter=true;
				}
			}else{
				System.out.println("SQL query is not given, Please enter SQL query ");
				Reporter.ReportEvent(Constant.InvalidQuery);
				return;
			}
			if(parameter == true){
				Reporter.ReportEvent(Constant.InvalidQuery);
				return;
			}
			String url =KeywordLibrary.createConnection(vars, vars.database, vars.schemaname, vars.username, vars.password);
			if(url.length()>0){
				vars.isconnected = KeywordLibrary.getConnection(url);	
			}
			if(vars.isconnected){
				executeQuery(Constant.Vars.rs);
				Reporter.ReportEvent(Constant.Executed);
			}else{
				Reporter.ReportEvent(Constant.InvalidConnection);
				vars.isinvaliddb = false;
			}
		}catch (Exception e){
			Log.info("failed  " +e.getMessage() );
			System.out.println(e.getMessage());
		}
	}
	public static void callfunction(LocalTC Vars){
		try {
			if(Vars.getObjProp().contains("#")){}
			else if(Vars.getObjProp().contains("dt_")){
				String Params;
				Vars.TestData.setExcelFile(Constant.Path_TestData, Vars.getObjProp().replace("dt_", ""));
				int retRowCount=Vars.TestData.getRowCount();
				int retColCount =Vars.TestData.getColCount();
				//Params = Vars.TestData.getCellData(1, 0);
				for(int rowItr=1;rowItr<retRowCount;rowItr++)
				{
					Params = "";
					/*for(int colItr=0;Vars.TestData.getCellData(rowItr, colItr)!="";colItr++){
						Params = Params + "," + Vars.TestData.getCellData(rowItr, colItr) ;
					}*/
					for(int colItr=0;colItr<retColCount;colItr++){
						if(Vars.TestData.getCellData(rowItr, colItr) == null){
							if(Params.isEmpty()){
								Params = null;
							}
							else if(null != Params)
								Params = Params + "," + null;
						}
						else
							if(null != Params && Params.isEmpty())
								Params = Vars.TestData.getCellData(rowItr, colItr);
							else
								Params = Params + "," + Vars.TestData.getCellData(rowItr, colItr) ;
					}
					func_InvokeFunction(Vars.getObj(), Params);
				}
			}
			else func_InvokeFunction(Vars.getObj(), Vars.getObjProp());
		} catch (Exception e) {
		}
	}
	public static void comparedbcell(LocalTC vars){
		try{
			if(vars.isinvaliddb){
				vars.setScreenshotTypeFlag(0);
				WebElement getElement = getWebElement();
				if(getElement==null){
					System.out.println(" No matching Element found in Object Repository");
					Reporter.ReportEvent(Constant.ObjectNotFound);
					return;
				}
				String toSearch = getElement.getText();
				boolean isfound = search_Excel(toSearch);
				if(isfound){
					Reporter.ReportEvent(Constant.Executed);
				}else{
					Reporter.ReportEvent(Constant.NoMatchinDataTable);
				}
			}else{
				System.out.println("Basic parameters are invalid");
				Reporter.ReportEvent(Constant.InvalidConnection);
			}
		}
		catch(Exception e){
			Log.info( "Exception Occured in comparedbcell : No Data table found  " +e.getMessage() );
			System.out.println("Exception Occured as -"+e.getMessage());
			//Reporter.ReportEvent("NoMatchinDataTable");
		}
	}
	public static WebElement getWebElement(){
		try{
			String objectType = Constant.Vars.getObj();     
			String ObjectValCh = Constant.Vars.getObjProp();
			try {
				Constant.Vars.elem = driver.findElement(Constant.Vars.obj.getLocator(ObjectValCh));
				return Constant.Vars.elem;
			} catch (Exception e) {
				System.out.println("Error Occured While getting Element-  "+e.getMessage());
				Log.info( "Error Occured While getting Element- " +e.getMessage());
			}
		}catch(Exception e){
			System.out.println("Exception Occured as -"+e.getMessage());
			Log.info( "Exception Occured as- " +e.getMessage());
		}
		return Constant.Vars.elem;
	}
	public static boolean search_Excel(String toSearch){
		boolean isfound=false;
		String ObjectSetCh = Constant.Vars.getEvent();                             
		String ObjectSetValCh = Constant.Vars.getTestdata();
		boolean columnFound = false;
		String compare = null;
		int columnno =0;
		String getColumn = null;
		if (ObjectSetValCh.contains("dt_")) {
			Constant.Vars.iflag = 0;
			String ObjectSetValtableheader[] = ObjectSetValCh
					.split("_",2);
			int column = 0;
			String Searchincolumn = ObjectSetValtableheader[1];
			Row row = Constant.Vars.ws.getRow(0);
			int cell = row.getLastCellNum();
			for(int i=0;i<cell;i++){
				getColumn = (Constant.Vars.ws.getRow(0).getCell(i).getStringCellValue());
				if(getColumn.equalsIgnoreCase(Searchincolumn)){
					columnFound = true;
					break;
				}
			}                                                            
			if((columnFound == true)&&(columnno!=0)){
				int rowcnt = 0;
				for(Row r : Constant.Vars.ws){
					rowcnt= Constant.Vars.ws.getLastRowNum();
				}
				System.out.println("Row Count is  "+rowcnt);
				for(int i=0;i<rowcnt;i++){
					String getCelldata = Constant.Vars.ws.getRow(i).getCell(columnno).getStringCellValue();
					if(getCelldata.equalsIgnoreCase(toSearch)){
						System.out.println("Script Found  "+getCelldata);
						isfound = true;
					}
				}
			}
		}
		return isfound;
	}
	
	public static void screencapture(LocalTC vars) throws Exception{
		vars.setScreenshotTypeFlag(0);
		screenShot(vars);
		Reporter.ReportEvent(Constant.Executed);
	}
	
	public static void download(LocalTC vars){
		cCellObjName = vars.getObjProp().replace("obj=", "").toLowerCase();
		cCellObjType = vars.getObj(); 
		ObjectSet = vars.Event.toLowerCase();
		ObjectSetVal=vars.getTestdata().replace("\"", "");
		String[] ObjectSet1=null;
		String ObjectSet2 = null;
		try {
			readAttributeforPerform();
			vars.elem = driver.findElement(vars.obj.getLocator(cCellObjName));
			if (vars.elem == null) {
				return;
			} else {
				if (ObjectSet == "") {
					Reporter.ReportEvent(Constant.FilePathNotFound2);
				} else {
					try {
						ObjectSet1 = ObjectSet.split("\\\\");
					} catch (Exception e2) {
						System.out.println(e2);
					}
					for (int i = 0; i < ObjectSet1.length - 1; i++) {
						ObjectSet2 = ObjectSet2 + ObjectSet1[i] + "\\";
					}
					if (new File(ObjectSet2.toString()).exists()) {
						doUploadDownload(Constant.Download,vars);
					} else {
						Reporter.ReportEvent(Constant.FilePathNotFound1);
					}
					ObjectSet2 = "";
					ObjectSet1 = null;
				}
			}
		} catch (Exception e) {
			Log.info( "Error Occured in Download :   " +e.getMessage() );
			System.out.println(e);
		}
	}
	public static void readAttributeforPerform(){
		try {
			int DTcolumncount =0;
			if (ObjectSetVal.length() > 0)
			{
				if (ObjectSetVal.substring(0, 1).equalsIgnoreCase("#")) {
					if (Constant.Vars.map.get(ObjectSetVal.substring(1,
							(ObjectSetVal.length()))) != null) {
						ObjectSetVal = Constant.Vars.map.get(ObjectSetVal.substring(1,
								(ObjectSetVal.length())));
					} else {
						ObjectSetVal = "";
					}
				} else if (ObjectSetVal.contains("dt_")) {
					DTcolumncount = Constant.Vars.DTsheet.getColCount();
					Constant.Vars.iflag = 0;
					String ObjectSetValtableheader[] = ObjectSetVal.split("_");
					int column = 0;
					String Searchtext = ObjectSetValtableheader[1];
					for (column = 0; column < DTcolumncount; column++) {
						if(Searchtext.equalsIgnoreCase(Constant.Vars.DTsheet.getCellData(Constant.Vars.row,column))==true)
						{
							ObjectSetVal = Constant.Vars.DTsheet.getCellData(Constant.Vars.row,column);;
							if (ObjectSetVal.length() == 0) {
								ObjectSetVal = "";
							}
							Constant.Vars.iflag = 1;
						}
					}
					if (Constant.Vars.iflag != 1) {
						ObjectSetVal = "nodatarow";
					}
					else {
						Reporter.ReportEvent("toomanyarguments");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(" Error Occured while Reading Attribute for Perform  "+e.getMessage());
			Log.info( "Exception Occured while Reading Attribute for Perform- " +e.getMessage());
		}
	}
	public static void varCallaction(LocalTC vars) throws Exception{
		vars.reporttype = 1;
		vars.exeStatus = "Pass";
		//String ComponentPath = vars.reusableComponents + cCellData;
		if (vars.getObj().contains("xlsx")) {
			String ComponentName = vars.getObj().split(".xlsx")[0];
			//XSSFSheet  TestScriptSheet = TScsheet;
			FileInputStream ComponentFile1 = null;
			try {
				ComponentFile1 = new FileInputStream(new File(vars.getObj()));
				XSSFWorkbook  ComponentWorkBook = new XSSFWorkbook(ComponentFile1);
				XSSFSheet ComponentSheet = ComponentWorkBook.getSheetAt(0);
				int ComponentRowCount = 0;
				int introwcnt = 0;
				int introwcntStore = vars.row;
				Reporter.ReportEvent(Constant.Executed);
				vars.row = vars.row + 1;
				//TScsheet = ComponentSheet;
				Stack<String> ComponentStack = new Stack<String>();
				vars.setObj(ComponentName);
				ComponentStack.push(ComponentName);
				Reporter.ReportEvent(Constant.Callactionstart);
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
							System.out.println("File not found");
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
						System.out.println(vars.Action + "||" + vars.getObj()
								+ "||" + vars.getObjProp());
						CallAction(vars);
						//bCellAction(scriptName);
						jloop = vars.row;
					}// End of Execution
				}// End of If that get all rows in Test Script
				vars.setObj(ComponentStack.pop());
				Reporter.ReportEvent(Constant.Callactionend);
				vars.row = introwcntStore;
				vars.reporttype = 0;
				//TScsheet = TestScriptSheet;
			} catch (FileNotFoundException FNF1) {
				Reporter.ReportEvent(Constant.Callactionfnf);
			}
		} else {
			Reporter.ReportEvent(Constant.Failed);
			Reporter.ReportEvent(Constant.Callactionff);
		}
	}
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

	public static void context(LocalTC vars) throws Exception {
		cCellObjName = vars.getObjProp().replace("obj=", "").toLowerCase();
		cCellObjType = vars.getObj();
		ObjectSet = vars.getEvent();
		ObjectSetVal = vars.getTestdata();
		int DTcolumncountCh = 0;
		String parentWindowHandle = null;
		int windowFound = 0;
		// if (ObjectSetVal.startsWith("dt_") || ObjectSetVal.startsWith("#"))
		int frameindex = 0;
		/*if (cCellObjType.equalsIgnoreCase("frame") || cCellObjType.equalsIgnoreCase("iframe")) {
			frameindex = 1;
		}*/
		if (cCellObjType.equalsIgnoreCase("frame") || cCellObjType.equalsIgnoreCase("iframe")) {
			/*if (frameindex == 1) {*/
			frameindex = 1;
				driver.switchTo().parentFrame();
				Reporter.ReportEvent(Constant.Executed);
				frameindex = 0;
			if ("default".equals(cCellObjName)) {
				driver.switchTo().defaultContent();
				Reporter.ReportEvent(Constant.Executed);
			} else if (cCellObjName.matches("^[0-9]+") == true) {
				driver.switchTo().frame(new Integer(cCellObjName));
				Reporter.ReportEvent(Constant.Executed);
			} else {
				vars.elem = driver.findElement(vars.obj.getLocator(cCellObjName));
				if (vars.elem == null) {
					return;
				} else {
					driver.switchTo().frame(vars.elem);
					Reporter.ReportEvent(Constant.Executed);
				}
			}
		} else {
			try {
				if (ObjectSetVal.substring(0, 1).equalsIgnoreCase("#")) {
					if (vars.map.get(ObjectSetVal.substring(1, (ObjectSetVal.length()))) != null) {
						ObjectSetVal = vars.map.get(ObjectSetVal.substring(1, (ObjectSetVal.length())));
					} else {
						ObjectSetVal = "";
					}
				} else if (ObjectSetVal.contains("dt_")) {
					vars.iflag = 0;
					String ObjectSetValtableheader[] = ObjectSetVal.split("_");
					int column = 0;
					String Searchtext = ObjectSetValtableheader[1];
					try {
						DTcolumncountCh = vars.DTsheet.getColCount();

					} catch (NullPointerException e) {
						return;
					}
					for (column = 0; column < DTcolumncountCh; column++) {
						if (Searchtext.equalsIgnoreCase(vars.DTsheet.getCellData(0, column)) == true) {
							ObjectSetVal = vars.DTsheet.getCellData(vars.row, column);
							vars.iflag = 1;
							if (ObjectSetVal.length() == 0) {
								ObjectSetVal = "";
							}
						}
					}
					if ((!ObjectSet.equalsIgnoreCase("dialog;"))
							&& ((ObjectSet.equalsIgnoreCase("page") || ObjectSet.equalsIgnoreCase("page;"))
									&& !ObjectSetVal.contains("::")
									|| !ObjectSet.equalsIgnoreCase("page;WindowRtn;"))) {
						int windowNums = 0;
						int windowItr = 0;
						WebDriver newWindow = null;
						Set<String> al = new HashSet<String>();
						al = driver.getWindowHandles();
						windowNums = al.size(); // get the number of window
						Iterator<String> windowIterator = al.iterator();
						if (windowNums == 1) {
							// Switch the hundle, if number of available hundle
							// is 1.
							String handle = windowIterator.next();
							driver.switchTo().window(handle);
							// Reset Iterator
							windowIterator = al.iterator();
						} else {
							// save the current window handle.
							parentWindowHandle = driver.getWindowHandle();
						}
						if (driver.getTitle().toString().equalsIgnoreCase(ObjectSetVal) == true) {
							Reporter.ReportEvent(Constant.Executed);
						} else {
							if (!((ObjectSetVal.equalsIgnoreCase("page") || (ObjectSetVal.equalsIgnoreCase("page;")))
									|| (ObjectSetVal.toString() == ""))) {
								if (driver.getTitle().toString().equalsIgnoreCase(ObjectSetVal) == false) {
									for (windowItr = 0; windowItr < windowNums; windowItr++) {
										String windowHandle = windowIterator.next();
										newWindow = driver.switchTo().window(windowHandle);
										if (newWindow.getTitle().toString().equalsIgnoreCase(ObjectSetVal)) {
											windowFound = 1;
											Reporter.ReportEvent(Constant.Executed, ObjectSet, ObjectSetVal);
											break;
										}
									}
									if (windowFound != 1) {
										Reporter.ReportEvent(Constant.NoWindowFound, ObjectSet, ObjectSetVal);
									}
								}
							} else {
								if (windowNums == 1) {
									Reporter.ReportEvent(Constant.Executed);
								} else {
									int winItr1 = 0;
									String windowHandle = null;
									while (winItr1 != windowNums) {
										windowHandle = windowIterator.next();
										System.out.println(windowHandle);
										newWindow = driver.switchTo().window(windowHandle);
										if (parentWindowHandle.equalsIgnoreCase(windowHandle)) {
											if (winItr1 != windowNums - 1) {
												windowHandle = windowIterator.next();
												driver.switchTo().window(windowHandle);
												Reporter.ReportEvent(Constant.Executed);
												windowFound = 1;
												break;
											} else {
												Iterator<String> windowIterator1 = al.iterator();
												windowHandle = windowIterator1.next();
												driver.switchTo().window(windowHandle);
												Reporter.ReportEvent(Constant.Executed);
												windowFound = 1;
												break;
											}
										}
										winItr1++;
									}
									if (windowFound != 1) {
										Reporter.ReportEvent(Constant.NoWindowFound);
									}
								}
							}

						}
					} else if (ObjectSet.equalsIgnoreCase("page;WindowRtn;")) {
						driver.switchTo().window(parentWindowHandle);
						Reporter.ReportEvent(Constant.Executed);
					}
					if ((ObjectSet.equalsIgnoreCase("dialog") || ObjectSet.equalsIgnoreCase("dialog;"))) {
						driver.switchTo().alert();
						Reporter.ReportEvent(Constant.Executed);
					}
				}
			} catch (Exception e) {
				Reporter.ReportEvent(Constant.Failed, e);
			}

		}
	}
	public static String testObjectSetValue(String source) {
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
}



