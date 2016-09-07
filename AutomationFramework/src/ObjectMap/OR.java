package ObjectMap;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
		if (null != locator){
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
					switch(locatorType.toLowerCase()){
					case "id":
						return By.id(locatorValue);
					case "name":
						return By.name(locatorValue);
					case "class":
					case "classname":
						return By.className(locatorValue);
					case "tag":
					case "tagname":
						return By.className(locatorValue);
					case "link":
					case "linktext":
						return By.linkText(locatorValue);
					case "partiallinktext":
						return By.partialLinkText(locatorValue);
					case "css":
					case "cssselector":
						return By.cssSelector(locatorValue);
					case "xpath":
						return By.xpath(locatorValue);
					default:
						return By.xpath(locatorValue);
						//throw new Exception("Unknown locator type '" + locatorType + "'");
					}
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
	
	public WebElement findelement(By Locator) throws Exception 
	{
		try{
			Constant.Vars.elem = Constant.driver.findElement(Locator);
			return Constant.Vars.elem;
		}
		catch(Exception ex2){
		return null;}
	}
	
	public void selectDate(String mm2, String dd2, String yyyy2)
			throws Exception {
		String dateClass = null;
		String monthpart = null;
		String monthpartjap = null;
		int objectfound = 0;
		int monthnum1 = 0;
		int lastSelecteddateJQ = 0;
		int lastSelectedmonthJQ = 0;
		int lastSelectedyearJQ = 0;
		String usedTitleMonth = null;
		String usedTitleYear = null;
		String usedTitletag = null;
		WebElement prevMonth = null;
		WebElement nextMonth = null;
		WebElement titleYear = null;
		WebElement daytoClick = null;
		int titleYearnum = 0;
		String titleMonthString = "";
		WebElement titleMonth = null;
		String datePickerType = "";
		String locatorNext = "";
		String locatorPrev = "";
		String outerHTMLCalendar = "";
		outerHTMLCalendar = Constant.Vars.elem.getAttribute("outerHTML");
		Constant.Vars.elem.click();
		int setmm = Integer.parseInt(mm2);
		int setyyyy = Integer.parseInt(yyyy2);
		int setdd = Integer.parseInt(dd2);
		WebElement titleDefault = null;
		String titleDefaultText;
		// List<WebElement> titlebootYearTags;
		List<WebElement> realCategoryDeciders = new ArrayList<WebElement>();
		// int titlebootYearNum;
		Robot robot1 = new Robot();
		int isDateNotSelected = 0;
		int isDateSelected = 0;
		if (outerHTMLCalendar.toLowerCase().contains("datepicker")) {
			datePickerType = "jquery";
		} else if (outerHTMLCalendar.toLowerCase().contains("type=")
				&& outerHTMLCalendar.toLowerCase().contains("date")) {
			datePickerType = "html5";
		} else {
			datePickerType = "boot";
		}
		switch (setmm) {
		case 1:
			monthpart = "Jan";
			monthpartjap = "1";
			break;
		case 2:
			monthpart = "Feb";
			monthpartjap = "2";
			break;
		case 3:
			monthpart = "Mar";
			monthpartjap = "3";
			break;
		case 4:
			monthpart = "Apr";
			monthpartjap = "4";
			break;
		case 5:
			monthpart = "May";
			monthpartjap = "5";
			break;
		case 6:
			monthpart = "Jun";
			monthpartjap = "6";
			break;
		case 7:
			monthpart = "Jul";
			monthpartjap = "7";
			break;
		case 8:
			monthpart = "Aug";
			monthpartjap = "8";
			break;
		case 9:
			monthpart = "Sep";
			monthpartjap = "9";
			break;
		case 10:
			monthpart = "Oct";
			monthpartjap = "10";
			break;
		case 11:
			monthpart = "Nov";
			monthpartjap = "11";
			break;
		case 12:
			monthpart = "Dec";
			monthpartjap = "12";
			break;
		default:
			Reporter.ReportEvent("invalidmonth");
			break;
		}
		int titleLength;
		switch (datePickerType) {

		case "jquery":
			if (!(lastSelecteddateJQ == setdd && lastSelectedmonthJQ == setmm && lastSelectedyearJQ == setyyyy)) {
				for (String strPrevMonth : Constant.Vars.getEnvprevMonth1()) {
					try {
						prevMonth = Constant.driver.findElement(By.xpath("//a[contains(@class,'"
										+ strPrevMonth + "')]"));
						locatorPrev = prevMonth.getAttribute("class")
								.toString();
						objectfound = 1;
						break;
					} catch (Exception e) {
						continue;
					}
				}
				if (objectfound == 0) {
					Reporter.ReportEvent("prevmonth");
					break;
				} else {
					objectfound = 0;
				}
				for (String strNextMonth : Constant.Vars.getEnvnextMonth1()) {
					try {
						nextMonth = Constant.driver.findElement(
								(By.xpath("//a[contains(@class,'"
										+ strNextMonth + "')]")));
						locatorNext = nextMonth.getAttribute("class")
								.toString();
						objectfound = 1;
						break;
					} catch (Exception e) {
						continue;
					}
				}
				if (objectfound == 0) {
					Reporter.ReportEvent("nextmonth");
					break;
				} else {
					objectfound = 0;
				}
				for (String strtitleMonth : Constant.Vars.getEnvtitleMonth()) {
					try {
						titleMonth = Constant.driver
								.findElement(By.xpath("//span[contains(@class,'"
										+ strtitleMonth + "')]"));
						titleMonthString = titleMonth.getText();
						usedTitleMonth = strtitleMonth;
						usedTitletag = "span";
						objectfound = 1;
						break;
					} catch (Exception e) {
						try {
							titleMonth = Constant.driver
									.findElement(By.xpath("//select[contains(@class,'"
											+ strtitleMonth + "')]"));
							titleMonthString = new Select(titleMonth)
									.getFirstSelectedOption().getText()
									.toString();
							usedTitleMonth = strtitleMonth;
							usedTitletag = "select";
							objectfound = 1;
							break;
						} catch (Exception e4) {
						}
						continue;
					}
				}
				if (objectfound == 0) {
					Reporter.ReportEvent("titlemonth");
					break;
				} else {
					objectfound = 0;
				}
				for (String strtitleYear : Constant.Vars.getEnvtitleYear()) {
					try {
						titleYear = Constant.driver
								.findElement(By.xpath("//span[contains(@class,'"
										+ strtitleYear + "')]"));
						titleYearnum = Integer.parseInt(titleYear.getText());
						usedTitleYear = strtitleYear;
						usedTitletag = "span";
						objectfound = 1;
						break;
					} catch (Exception e) {
						try {
							titleYear = Constant.driver
									.findElement(By.xpath("//select[contains(@class,'"
											+ strtitleYear + "')]"));
							titleYearnum = Integer.parseInt(new Select(
									titleYear).getFirstSelectedOption()
									.getText());
							usedTitleYear = strtitleYear;
							usedTitletag = "select";
							objectfound = 1;
							break;
						} catch (Exception e5) {
						}
						continue;
					}
				}
				if (objectfound == 0) {
					Reporter.ReportEvent("titleyear");
					break;
				} else {
					objectfound = 0;
				}
				switch (titleMonthString.toLowerCase()) {
				case "jan":
					monthnum1 = 1;
					break;
				case "1":
					monthnum1 = 1;
					break;
				case "january":
					monthnum1 = 1;
					break;
				case "feb":
					monthnum1 = 2;
					break;
				case "2":
					monthnum1 = 2;
					break;
				case "february":
					monthnum1 = 2;
					break;
				case "mar":
					monthnum1 = 3;
					break;
				case "3":
					monthnum1 = 3;
					break;
				case "march":
					monthnum1 = 3;
					break;
				case "apr":
					monthnum1 = 4;
					break;
				case "4":
					monthnum1 = 4;
					break;
				case "april":
					monthnum1 = 4;
					break;
				case "may":
					monthnum1 = 5;
					break;
				case "5":
					monthnum1 = 5;
					break;
				case "june":
					monthnum1 = 6;
					break;
				case "jun":
					monthnum1 = 6;
					break;
				case "6":
					monthnum1 = 6;
					break;
				case "july":
					monthnum1 = 7;
					break;
				case "jul":
					monthnum1 = 7;
					break;
				case "7":
					monthnum1 = 7;
					break;
				case "aug":
					monthnum1 = 8;
					break;
				case "august":
					monthnum1 = 8;
					break;
				case "8":
					monthnum1 = 8;
					break;
				case "sep":
					monthnum1 = 9;
					break;
				case "september":
					monthnum1 = 9;
					break;
				case "9":
					monthnum1 = 9;
					break;
				case "oct":
					monthnum1 = 10;
					break;
				case "october":
					monthnum1 = 10;
					break;
				case "10":
					monthnum1 = 10;
					break;
				case "nov":
					monthnum1 = 11;
					break;
				case "november":
					monthnum1 = 11;
					break;
				case "11":
					monthnum1 = 11;
					break;
				case "dec":
					monthnum1 = 12;
					break;
				case "december":
					monthnum1 = 12;
					break;
				case "12":
					monthnum1 = 12;
					break;
				default:
					Reporter.ReportEvent("monthnotidentified");
					break;
				}
				if (setyyyy > titleYearnum && setmm > monthnum1) {
					try {
						do {
							nextMonth.click();
							monthnum1++;
							if (monthnum1 == 13)
								monthnum1 = 1;
							nextMonth = Constant.driver
									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorNext + "')]"));
							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));
							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();
								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}

						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( "IOException Occured in jquery case [date]- " +e.getMessage()); 
					}

				} else if (setyyyy < titleYearnum && setmm < monthnum1) {

					try {
						do {

							prevMonth.click();
							monthnum1--;
							if (monthnum1 == 0)
								monthnum1 = 12;
							prevMonth = Constant.driver
									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorPrev + "')]"));

							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));

							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();
								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}

						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( " Exception Occured in jquery case [date]- " +e.getMessage()); 
					}
				}

				else if (setyyyy == titleYearnum && setmm < monthnum1) {
					try {
						do {
							prevMonth.click();
							monthnum1--;
							if (monthnum1 == 0)
								monthnum1 = 12;
							prevMonth = Constant.driver
									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorPrev + "')]"));
							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));
							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();
								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}
						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( " Exception Occured in jquery case [date]- " +e.getMessage()); 
					}
				} else if (setyyyy == titleYearnum && setmm > monthnum1) {
					try {
						do {
							nextMonth.click();

							monthnum1++;
							if (monthnum1 == 13)
								monthnum1 = 1;
							nextMonth = Constant.driver

									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorNext + "')]"));

							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));

							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();
								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}

						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( " Exception Occured in jquery case [date]- " +e.getMessage()); 
					}
				}

				else if (setyyyy > titleYearnum && setmm == monthnum1) {
					try {
						do {

							nextMonth.click();
							monthnum1++;
							if (monthnum1 == 13)
								monthnum1 = 1;
							nextMonth = Constant.driver
									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorNext + "')]"));

							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));

							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();
								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}

						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( " Exception Occured in jquery case [date Calendar]- " +e.getMessage()); 
					}
				} else if (setyyyy < titleYearnum && setmm == monthnum1) {
					try {
						do {
							prevMonth.click();
							monthnum1--;
							if (monthnum1 == 0)
								monthnum1 = 12;
							prevMonth = Constant.driver
									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorPrev + "')]"));
							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));
							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();

								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}

						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( " Exception Occured in jquery case [date Calendar]- " +e.getMessage()); 
					}

				} else if (setyyyy > titleYearnum && setmm < monthnum1) {
					try {
						do {

							nextMonth.click();
							monthnum1++;
							if (monthnum1 == 13)
								monthnum1 = 1;
							nextMonth = Constant.driver

									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorNext + "')]"));

							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));

							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();
								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}
						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( " Exception Occured in jquery case [date Calendar]- " +e.getMessage()); 
					}
				} else if (setyyyy < titleYearnum && setmm > monthnum1) {
					try {
						do {
							prevMonth.click();
							monthnum1--;
							if (monthnum1 == 0)
								monthnum1 = 12;
							prevMonth = Constant.driver
									.findElement(By.xpath("//a[contains(@class,'"
											+ locatorPrev + "')]"));
							titleMonth = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleMonth + "')]"));
							titleYear = Constant.driver.findElement(By.xpath("//"
									+ usedTitletag + "[contains(@class,'"
									+ usedTitleYear + "')]"));
							if (usedTitletag == "span") {
								titleMonthString = titleMonth.getText();
								titleYearnum = Integer.parseInt(titleYear
										.getText());
							} else if (usedTitletag == "select") {

								titleMonthString = new Select(titleMonth)
										.getFirstSelectedOption().getText()
										.toString();
								titleYearnum = Integer.parseInt(new Select(
										titleYear).getFirstSelectedOption()
										.getText());
							}
						} while (!((titleMonthString.toLowerCase().contains(
								monthpart.toLowerCase()) || titleMonthString
								.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
					} catch (Exception e) {
						isDateNotSelected = 1;
						Log.info( " Exception Occured in jquery case [date Calendar]- " +e.getMessage()); 
					}
				}
				if (isDateNotSelected == 0) {
					if (setyyyy == titleYearnum && setmm == monthnum1) {

						try {

							List<WebElement> daystoClick = Constant.driver
									.findElements(By.xpath("//a[contains(@class,'"
											+ locatorPrev
											+ "')]"
											+ "/following::a[contains(text(),'"
											+ setdd + "')]"));

							List<WebElement> categoryDeciders = Constant.driver
									.findElements(By.xpath("//a[contains(@class,'"
											+ locatorPrev
											+ "')]"
											+ "/following::a[contains(text(),'"
											+ 15 + "')]"));

							for (WebElement categoryDecider : categoryDeciders) {
								if (categoryDecider.getAttribute("href")
										.endsWith("#")
										&& categoryDecider.getText().equals(
												"15")) {
									realCategoryDeciders.add(categoryDecider);
									dateClass = categoryDecider
											.getAttribute("class");

								}
							}

							for (int i2 = 0; i2 < daystoClick.size(); i2++) {
								// Date date = new Date();
								String selectedDateClass = "";
								if (Constant.Vars.today == setdd
										&& Integer.parseInt(daystoClick.get(i2)
												.getText()) == setdd
												&& daystoClick.get(i2)
												.getAttribute("href")
												.endsWith("#")) {

									daytoClick = daystoClick.get(i2);
									daytoClick.click();
									lastSelecteddateJQ = setdd;
									lastSelectedmonthJQ = setmm;
									lastSelectedyearJQ = setyyyy;
									isDateSelected = 1;
									Constant.Vars.setRes_type(Constant.Executed);
									//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(),
										//	Constant.Vars.getTestdata().replace("\"", ""));
									break;

								} else if (Integer.parseInt(daystoClick.get(i2)
										.getText()) == setdd
										&& (daystoClick.get(i2)
												.getAttribute("class")
												.equalsIgnoreCase(dateClass) || (daystoClick
														.get(i2).getAttribute("class")
														.equalsIgnoreCase(selectedDateClass))
												&& daystoClick.get(i2)
												.getAttribute("href")
												.endsWith("#"))) {

									daytoClick = daystoClick.get(i2);
									daytoClick.click();
									lastSelecteddateJQ = setdd;
									lastSelectedmonthJQ = setmm;
									lastSelectedyearJQ = setyyyy;
									isDateSelected = 1;
									selectedDateClass = daytoClick
											.getAttribute("class");
									Constant.Vars.setRes_type(Constant.Executed);
									//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(),
										//	Constant.Vars.getTestdata().replace("\"", ""));
									break;
								}
							}
						} catch (Exception e1) {
							isDateNotSelected = 1;
							Log.info( " Exception Occured in jquery case [date Calendar]- " +e1.getMessage()); 
						}
					}
					
					if (isDateSelected == 0) {

						Reporter.ReportEvent("invaliddate");
						robot1.keyPress(KeyEvent.VK_ESCAPE);
						robot1.keyRelease(KeyEvent.VK_ESCAPE);
					} else {
						isDateSelected = 0;
					}

				} else {

					isDateNotSelected = 0;
					Reporter.ReportEvent("invaliddate");
					robot1.keyPress(KeyEvent.VK_ESCAPE);
					robot1.keyRelease(KeyEvent.VK_ESCAPE);

				}
			} else {
				Constant.Vars.setRes_type(Constant.Executed);
				//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(), Constant.Vars.getTestdata().replace("\"", ""));
				robot1.keyPress(KeyEvent.VK_ESCAPE);
				robot1.keyRelease(KeyEvent.VK_ESCAPE);

			}

			break;

		case "boot":

			for (String strPrevMonth : Constant.Vars.getEnvprevMonth1()) {
				try {
					prevMonth = Constant.driver.findElement(By.xpath("//th[contains(@class,'"
							+ strPrevMonth + "')]"));
					locatorPrev = strPrevMonth;
					objectfound = 1;
					break;
				} catch (Exception e) {
					continue;
				}
			}
			if (objectfound == 0) {
				Reporter.ReportEvent("prevmonth");
				break;
			} else {
				objectfound = 0;
			}

			for (String strNextMonth : Constant.Vars.getEnvnextMonth1()) {
				try {
					nextMonth = Constant.driver.findElement(By.xpath("//th[contains(@class,'"
							+ strNextMonth + "')]"));
					locatorNext = strNextMonth;
					objectfound = 1;
					break;
				} catch (Exception e) {
					continue;
				}
			}
			if (objectfound == 0) {
				Reporter.ReportEvent("nextmonth");
				break;
			} else {
				objectfound = 0;
			}

			try {
				titleDefault = Constant.driver.findElement(By.xpath("//th[contains(@class,'"
						+ "switch" + "')]"));

			}

			catch (Exception e) {
				Reporter.ReportEvent("titledefault");
				break;
			}
			titleDefaultText = titleDefault.getText().trim();
			titleLength = titleDefaultText.length();
			titleYearnum = Integer.parseInt(titleDefaultText
					.substring(titleLength - 4));
			titleMonthString = titleDefaultText.substring(0, titleLength - 5)
					.trim();
			switch (titleMonthString.toLowerCase()) {

			case "jan":
				monthnum1 = 1;
				break;
			case "1":
				monthnum1 = 1;
				break;
			case "january":
				monthnum1 = 1;
				break;
			case "feb":
				monthnum1 = 2;
				break;
			case "2":
				monthnum1 = 2;
				break;
			case "february":
				monthnum1 = 2;
				break;
			case "mar":
				monthnum1 = 3;
				break;
			case "3":
				monthnum1 = 3;
				break;
			case "march":
				monthnum1 = 3;
				break;
			case "apr":
				monthnum1 = 4;
				break;
			case "4":
				monthnum1 = 4;
				break;
			case "april":
				monthnum1 = 4;
				break;
			case "may":
				monthnum1 = 5;
				break;
			case "5":
				monthnum1 = 5;
				break;
			case "june":
				monthnum1 = 6;
				break;
			case "jun":
				monthnum1 = 6;
				break;
			case "6":
				monthnum1 = 6;
				break;
			case "july":
				monthnum1 = 7;
				break;
			case "jul":
				monthnum1 = 7;
				break;
			case "7":
				monthnum1 = 7;
				break;
			case "aug":
				monthnum1 = 8;
				break;
			case "august":
				monthnum1 = 8;
				break;
			case "8":
				monthnum1 = 8;
				break;
			case "sep":
				monthnum1 = 9;
				break;
			case "september":
				monthnum1 = 9;
				break;
			case "9":
				monthnum1 = 9;
				break;
			case "oct":
				monthnum1 = 10;
				break;
			case "october":
				monthnum1 = 10;
				break;
			case "10":
				monthnum1 = 10;
				break;
			case "nov":
				monthnum1 = 11;
				break;
			case "november":
				monthnum1 = 11;
				break;
			case "11":
				monthnum1 = 11;
				break;
			case "dec":
				monthnum1 = 12;
				break;
			case "december":
				monthnum1 = 12;
				break;
			case "12":
				monthnum1 = 12;
				break;
			default:
				Reporter.ReportEvent("monthnotidentified");
				break;
			}
			try {
				nextMonth = Constant.driver.findElement(By.xpath("//th[contains(@class,'"
						+ locatorNext + "')]"));
			} catch (Exception e) {
				Reporter.ReportEvent("nextmonth");
				break;
			}
			try {
				prevMonth = Constant.driver.findElement(By.xpath("//th[contains(@class,'"
						+ locatorPrev + "')]"));
			} catch (Exception e) {
				Reporter.ReportEvent("prevmonth");
				Log.info( " Exception Occured in jquery case [Switch case of Month ]- " +e.getMessage()); 
				break;
			}
			if (setyyyy > titleYearnum && setmm > monthnum1) {
				try {
					do {

						nextMonth.click();
						monthnum1++;
						if (monthnum1 == 13)
							monthnum1 = 1;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();

					}

					while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date Calendar]- " +e.getMessage()); 
					break;
				}
			} else if (setyyyy < titleYearnum && setmm < monthnum1) {
				try {
					do {

						prevMonth.click();
						monthnum1--;
						if (monthnum1 == 0)
							monthnum1 = 12;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();
					} while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					break;
				}
			}

			else if (setyyyy == titleYearnum && setmm < monthnum1) {
				try {
					do {
						prevMonth.click();
						monthnum1--;
						if (monthnum1 == 0)
							monthnum1 = 12;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();
					} while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					break;
				}
			} else if (setyyyy == titleYearnum && setmm > monthnum1) {
				try {
					do {
						nextMonth.click();
						monthnum1++;
						if (monthnum1 == 13)
							monthnum1 = 1;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();
					} while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					break;
				}

			}

			else if (setyyyy > titleYearnum && setmm == monthnum1) {
				try {
					do {
						nextMonth.click();
						monthnum1++;
						if (monthnum1 == 13)
							monthnum1 = 1;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();
					} while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					break;
				}
			} else if (setyyyy < titleYearnum && setmm == monthnum1) {
				try {
					do {
						prevMonth.click();
						monthnum1--;
						if (monthnum1 == 0)
							monthnum1 = 12;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();

					} while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					break;
				}
			} else if (setyyyy > titleYearnum && setmm < monthnum1) {
				try {
					do {
						nextMonth.click();
						monthnum1++;
						if (monthnum1 == 13)
							monthnum1 = 1;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();
					} while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					break;
				}
			} else if (setyyyy < titleYearnum && setmm > monthnum1) {
				try {
					do {
						prevMonth.click();
						monthnum1--;
						if (monthnum1 == 0)
							monthnum1 = 12;
						titleDefault = Constant.driver
								.findElement(By.xpath("//th[contains(@class,'"
										+ "switch" + "')]"));
						titleDefaultText = titleDefault.getText().trim();
						titleLength = titleDefaultText.length();
						titleYearnum = Integer.parseInt(titleDefaultText
								.substring(titleLength - 4));
						titleMonthString = titleDefaultText.substring(0,
								titleLength - 5).trim();
					} while (!((titleMonthString.toLowerCase().contains(
							monthpart.toLowerCase()) || titleMonthString
							.toLowerCase().contains(monthpartjap)) && (setyyyy == titleYearnum)));
				} catch (Exception e) {
					Reporter.ReportEvent("invaliddate");
					Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					break;
				}
			}
			if (setyyyy == titleYearnum && setmm == monthnum1) {
				try {
					List<WebElement> daystoClick = Constant.driver
							.findElements(By.xpath("//td[contains(text(),'"
									+ setdd + "')]"));
					if (daystoClick.size() == 1) {
						daytoClick = daystoClick.get(0);
						daytoClick.click();
						Constant.Vars.setRes_type(Constant.Executed);
						//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(), Constant.Vars.getTestdata().replace("\"", ""));
					} else if (daystoClick.size() > 1) {
						if (setdd <= 7) {
							for (int i2 = 0; i2 < daystoClick.size(); i2++) {
								if (Integer.parseInt(daystoClick.get(i2)
										.getText()) == setdd) {
									daytoClick = daystoClick.get(i2);
									daytoClick.click();
									Constant.Vars.setRes_type(Constant.Executed);
									//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(),
										//	Constant.Vars.getTestdata().replace("\"", ""));
									break;
								}
							}
							// daytoClick = daystoClick.get(0);
						} else {
							for (int i2 = daystoClick.size() - 1; i2 >= 0; i2--) {
								if (Integer.parseInt(daystoClick.get(i2)
										.getText()) == setdd) {
									daytoClick = daystoClick.get(i2);
									daytoClick.click();
									Constant.Vars.setRes_type(Constant.Executed);
									//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(),
										//	Constant.Vars.getTestdata().replace("\"", ""));
									break;
								}
							}
						}
					} else {
						Reporter.ReportEvent("invaliddate");
						Log.info( " Exception Occured in jquery case [date invaliddate]- " ); 
						break;
					}
				} catch (Exception ex1) {
					try {
						List<WebElement> daystoClick = Constant.driver.findElements(By.xpath("//span[contains(text(),'"
										+ setdd + "')]"));
						if (daystoClick.size() == 1) {
							daytoClick = daystoClick.get(0);
							daytoClick.click();
							Constant.Vars.setRes_type(Constant.Executed);
							//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(), Constant.Vars.getTestdata().replace("\"", ""));
						} else if (daystoClick.size() > 1) {
							if (setdd <= 7) {
								for (int i2 = 0; i2 < daystoClick.size(); i2++) {
									if (Integer.parseInt(daystoClick.get(i2)
											.getText()) == setdd) {
										daytoClick = daystoClick.get(i2);
										daytoClick.click();
										Constant.Vars.setRes_type(Constant.Executed);
										//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(),
											//	Constant.Vars.getTestdata().replace("\"", ""));
										break;
									}
								}
							} else {
								for (int i2 = daystoClick.size() - 1; i2 >= 0; i2--) {

									if (Integer.parseInt(daystoClick.get(i2)
											.getText()) == setdd) {
										daytoClick = daystoClick.get(i2);
										daytoClick.click();
										Constant.Vars.setRes_type(Constant.Executed);
										//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(),
											//	Constant.Vars.getTestdata().replace("\"", ""));
										break;
									}
								}
							}
						} else {
							Reporter.ReportEvent("invaliddate");
						}
						Constant.Vars.setRes_type(Constant.Invaliddate);
						//Reporter.ReportEvent("executed", Constant.Vars.getEvent().toLowerCase(), Constant.Vars.getTestdata().replace("\"", ""));
					}
					catch (Exception e) {
						Reporter.ReportEvent("invaliddate");
						Log.info( " Exception Occured in jquery case [date invaliddate]- " +e.getMessage()); 
					}
				}
			}

			Constant.Vars.elem.click();
			break;
		default:
			System.out.println("Notdefined");
			break;
		}
	}
}
