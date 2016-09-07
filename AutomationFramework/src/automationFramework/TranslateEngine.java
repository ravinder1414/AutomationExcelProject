package automationFramework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import utility.Constant;
import utility.Log;

/********************************************************************************************************
 *Project Name		: Ignite Automation framework 
 *Author		    : Bharat Sethi
 *Version	    	: V1.0
 *Date of Creation	: 05-04-2016
 *Date Last modified: 05/05/2016
 *Description       : Translator is the class that translate Plain English test step into Automation keywords to execute 
 *before adding any new keyword ensure it is not conflicting with and existing keyword
 *Functions			: 
 *
 ********************************************************************************************************
 */

public class TranslateEngine {

	//static Set<String> KeywordList;
	//static Hashtable<String,String> ActionsList;
	static LinkedHashMap<String, String> ActionsList;
	String action;
	String prvObj;
	public static final String PatternForBox = "\\b(TextBox|textbox|ComboBox|combobox|TextArea|textarea|Image|image|Frame|frame|iFrame|IFrame|Table|table|element|CheckBox|checkbox|RadioButtonButton|Link|link|ListBox|webelement|title|page|TextElement|dialog|alert|WebElement|xpath)\\b";
	public static final String regexLaunchapp = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;/]*[-a-zA-Z0-9+&@#/%=~_|/]";
	public static final String patternEncode = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
	public static final String dateRegex = "(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])-[0-9]{4}$";
	public static final String RegexNumberdata = "[0-9]+";
	public static final String PatternArithmetic = "\\b(equal|equals|not equal|not equals|contains)\\b";
	//
	public TranslateEngine(){
		ActionsList = new LinkedHashMap<String, String>();
		ActionsList.put(Constant.GetCount,Constant.Perform); 			//Get count in option/select/dropdown
		ActionsList.put(Constant.VerifyData,Constant.Check); 			//Returns whether data is verified or not from excel file.
		ActionsList.put(Constant.VerifyProperty,Constant.Check); 			//Returns whether object is verified or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.Getattribute,Constant.Check); 			//Returns whether object is verified or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.CheckProperty,Constant.Check); 			//Returns whether object is verified or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.Verifydisplayed,Constant.Check); 			//Returns whether object is Visible or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.CheckVisible,Constant.Check); 				//Returns whether object is Visible or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.CheckNotVisible,Constant.Check); 			//Returns whether object is Visible or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.VerifyEnable,Constant.Check); 
		ActionsList.put(Constant.CheckEnable,Constant.Check); 				//Returns whether object is enabled or not. If so True, else False; Data Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.CheckNotEnable,Constant.Check); 			//Returns whether object is enabled or not. If so True, else False; Data Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.VerifyText,Constant.Check);
		ActionsList.put(Constant.CheckText,Constant.Check); 				//Checks the Text property of the given object.Data table variables/ Environment variables can be used here for text to compare
		ActionsList.put(Constant.CheckEnabled,Constant.Check); 				//Returns whether object is enabled or not. If so True, else False; Data Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.CheckNotEnabled,Constant.Check); 			//Returns whether object is enabled or not. If so True, else False; Data Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put(Constant.VerifyLinkText,Constant.Check);
		ActionsList.put(Constant.CheckLinkText,Constant.Check); 			//checks the displayed text of the link.Data table variables/ Environment variables can be used here for text to compare
		ActionsList.put(Constant.VerifyValue,Constant.Check);
		ActionsList.put(Constant.CheckValue,Constant.Check); 				//Validate the selected item from the combobox.Data table variables/ Environment variables can be used here for value to compare
		ActionsList.put(Constant.CheckVariable,Constant.Check);
		ActionsList.put(Constant.VerifyIfnotChecked,Constant.Check);
		ActionsList.put(Constant.CheckIfnotChecked,Constant.Check); 	
		ActionsList.put(Constant.VerifyIfChecked,Constant.Check);
		ActionsList.put(Constant.CheckIfChecked,Constant.Check); 			//Data table variables/ Environment variables can be used here for value to compare whether checked is ON/OFF.
		ActionsList.put(Constant.VerifyPageTitle,Constant.Check); 
		ActionsList.put(Constant.CheckPageTitle,Constant.Check); 			//check whether the page available.  Data and environmental variable are also allowable for true/false
		ActionsList.put(Constant.VerifyTableRowCount,Constant.Check);
		ActionsList.put(Constant.CheckTableRowCount,Constant.Check); 		//Compare the row count of the table object with the given number.
		ActionsList.put(Constant.VerifyTableColumnCount,Constant.Check);
		ActionsList.put(Constant.CheckTableColumnCount,Constant.Check); 	//Compare the column count of the table object with the given number.
		ActionsList.put(Constant.VerifyTableValues,Constant.Comparedbcell);
		ActionsList.put(Constant.CheckTableValues,Constant.Comparedbcell);  //it will search : compare the text of given object with the data table
		ActionsList.put(Constant.OpenBrowser,Constant.Launchapp); 			//Launches the given URL
		ActionsList.put(Constant.NavigateTo,Constant.Launchapp); 			//Launches the given URL
		ActionsList.put(Constant.Wait,Constant.Wait);   					//Waits for the given interval 
		ActionsList.put(Constant.Sleep,Constant.Wait);   					//Waits for the given interval
		ActionsList.put(Constant.TestDataFrom,Constant.Importdata);			//Imports  the Data from the given path (Data Sheet path)
		ActionsList.put(Constant.ImportData,Constant.Importdata);			//Imports  the Data from the given path (Data Sheet path)
		ActionsList.put(Constant.CaptureScreen,Constant.Screencapture);		//Capture screenshot for evidence 
		ActionsList.put(Constant.Screenshot,Constant.Screencapture);		//Capture screenshot for evidence 
		ActionsList.put(Constant.Screen_Shot,Constant.Screencapture);		//Capture screenshot for evidence 
		ActionsList.put(Constant.ScreenCapture,Constant.Screencapture);		//Capture screenshot for evidence
		ActionsList.put(Constant.ConcludeCondition,Constant.Endcondition);	//End conditional steps
		ActionsList.put(Constant.End_Condition,Constant.Endcondition);	    //End conditional steps
		ActionsList.put(Constant.Endcondition,Constant.Endcondition);	    //End conditional steps
		ActionsList.put(Constant.Condition,Constant.Condition);			    //Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		ActionsList.put(Constant.Compare,Constant.Condition);				//Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		ActionsList.put(Constant.Endloop,Constant.Endloop);	    		    //End of loop
		ActionsList.put(Constant.End_loop,Constant.Endloop);	    		//End of loop
		ActionsList.put(Constant.RunStepsBelow,Constant.Loop);				//Start of loop
		ActionsList.put(Constant.LoopHere,Constant.Loop);	    			//Start of loop
		ActionsList.put(Constant.Loop,Constant.Loop);	    				//Start of loop
		ActionsList.put(Constant.Perform,Constant.Perform);				    //Clicks the required object,In some elements, particularly in sub menu items, if  'Click' action doesn't work, use this action.
		ActionsList.put(Constant.ActionOn,Constant.Perform);
		ActionsList.put(Constant.Altclick,Constant.Perform);                //We use Java script executor to perform 'click' operation  in tests where the Selenium 'click' method doesn't work
		ActionsList.put(Constant.ClickOn,Constant.Perform);				    //Clicks the required object
		ActionsList.put(Constant.Enter,Constant.Perform);					//We actually perform an 'Enter' key stroke in this case.
		ActionsList.put(Constant.HitEnter,Constant.Perform);				//We actually perform an 'Enter' key stroke in this case.
		ActionsList.put(Constant.HitTab,Constant.Perform);				//We actually perform an 'Enter' key stroke in this case.
		ActionsList.put(Constant.Setdate,Constant.Perform);									 
		ActionsList.put(Constant.SetText,Constant.Perform);				    //We actually perform an 'Enter' key stroke in this case.
		ActionsList.put(Constant.Type,Constant.Perform);					//We actually perform an 'Enter' key stroke in this case.
		ActionsList.put(Constant.HoverOver,Constant.Perform);				//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		ActionsList.put(Constant.Hover,Constant.Perform);					//Some menu items / elements we need to hover mouse the web elements, use this method.
		ActionsList.put(Constant.SelectFromSpanDropDown,Constant.Perform);	//Select set of values from listbox. One data variable and environmental variable is allowed.		
		ActionsList.put(Constant.SelectFromList,Constant.Perform);			//Select set of values from listbox. One data variable and environmental variable is allowed.
		ActionsList.put(Constant.Listselect,Constant.Perform);				//Select set of values from listbox. One data variable and environmental variable is allowed.
		ActionsList.put(Constant.Select,Constant.Perform);					//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		ActionsList.put(Constant.Store_Value,Constant.Storevalue);			//Store text value to a variable
		ActionsList.put(Constant.Assign_Value,Constant.Storevalue);
		ActionsList.put(Constant.ReadValue,Constant.Storevalue);			//Store text value to a variable
		ActionsList.put(Constant.ReadText,Constant.Storevalue);				//Store text value to a variable
		ActionsList.put(Constant.StoreText,Constant.Storevalue);			//Store text value to a variable
		ActionsList.put(Constant.ReadVisible,Constant.Storevalue);			//Assigns the display status of the element in a variable.
		ActionsList.put(Constant.StoreVisible,Constant.Storevalue);			//Assigns the display status of the element in a variable.
		ActionsList.put(Constant.ReadEnable,Constant.Storevalue);			//Store whether object is enabled or not to a boolean variable
		ActionsList.put(Constant.StoreEnable,Constant.Storevalue);			//Store whether object is enabled or not to a boolean variable
		ActionsList.put(Constant.ReadLinkText,Constant.Storevalue);
		ActionsList.put(Constant.StoreLinkText,Constant.Storevalue);
		ActionsList.put(Constant.ReadPageTitle,Constant.Storevalue);
		ActionsList.put(Constant.PageTitle,Constant.Storevalue);
		ActionsList.put(Constant.Get,Constant.Storevalue);
		ActionsList.put(Constant.Read,Constant.Storevalue);
		ActionsList.put(Constant.Store,Constant.Storevalue);
		ActionsList.put(Constant.Message,Constant.Msgbox);					//Put the message in to the report
		ActionsList.put(Constant.Report_Passed,Constant.Msgbox);			//Put the message in to the report
		ActionsList.put(Constant.Report_Failed,Constant.Msgbox);			//Put the message in to the report
		ActionsList.put(Constant.Comment,Constant.Msgbox);					//Put the message in to the report
		ActionsList.put(Constant.SetContext,Constant.Context);				//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window.
		ActionsList.put(Constant.ReferTo,Constant.Context);					//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window. 
		ActionsList.put(Constant.OnPage,Constant.Context);					//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window.
		ActionsList.put(Constant.RunTestCase,Constant.TestCaseID);
		ActionsList.put(Constant.RunTest_Case,Constant.TestCaseID);
		ActionsList.put(Constant.RunTest, Constant.Callfunction);			//Use if any testscript has to be called from another Test Script
		ActionsList.put(Constant.RunAction, Constant.Callfunction);			//Run another testcase with in the project
		ActionsList.put(Constant.CallAction, Constant.Callfunction);		//Run another testcase with in the project 
		ActionsList.put(Constant.RunFunction, Constant.Callfunction);		//run a predefined known function
		ActionsList.put(Constant.CallFunction, Constant.Callfunction);		//run a predefined known function
		ActionsList.put(Constant.ClickToDownload,Constant.Download);		//Click a link to download the file 	
		ActionsList.put(Constant.Download,Constant.Download);		 		//Click a link to download the file
		ActionsList.put(Constant.Upload,Constant.Upload);		 			//Upload a file
		ActionsList.put(Constant.CloseUpload,Constant.Upload);		 		//close upload dialog
		ActionsList.put(Constant.CancelUpload,Constant.Upload);		 		//cancel upload dialog
		ActionsList.put(Constant.ExractFromDb,Constant.Fetchdb);			//SQL query will get execute . And result set is copied to Excel file in current working dir.
		ActionsList.put(Constant.Fetchdb,Constant.Fetchdb);					//SQL query will get execute . And result set is copied to Excel file in current working dir.
		ActionsList.put(Constant.Close,Constant.Close);
		ActionsList.put(Constant.Navigateback,Constant.Navigate);			//SQL query will get execute . And result set is copied to Excel file in current working dir.
		ActionsList.put(Constant.Navigateforward,Constant.Navigate);		//SQL query will get execute . And result set is copied to Excel file in current working dir.
		ActionsList.put(Constant.Browserrefresh,Constant.Navigate);
		ActionsList.put(Constant.Extract, Constant.Extract);				//Extract value from one variable and store it into other variable
		ActionsList.put(Constant.Swap, Constant.Swap);						//Swaping word from string 
	}

	public String FindKeyword(LocalTC Vars, String TestStep) {
		Vars.setAction("");
		prvObj = Vars.getObj();
		Vars.setObj("");
		Vars.setTestdata("");
		Vars.setObjProp("");
		Vars.setEvent("");
		Set<String> Keys = ActionsList.keySet();
		TestStep = removeExtraSpaces(TestStep);
		if(TestStep.startsWith("#") && TestStep.contains("=")){
			Translate(Vars, TestStep, "=", "arithmetic");
		}
		else{
			for (String word : Keys) {
				if (TestStep.toLowerCase().startsWith(word)) {
					/* ActionsList.get(word); */
					Translate(Vars, TestStep, word, ActionsList.get(word));
					break;
				}
			}
		}
		Log.info("Translating Step : " + TestStep + " as action :" + Vars.getAction() + "; obj: " + Vars.getObj() + "; objprop:" + Vars.getObjProp() + "; event:" + Vars.getEvent() + "; test data:" + Vars.getTestdata());
		//report to html report as comment
		return null;
	}

	/***************************Translate Engine ****************************************
	 * Receive 3 arguments as TestStep, Keyword and KeyValue
	 * For Each KeyValue found in TestStep Translate Engine will convert string into following:
	 * Vars.Action; Vars.Obj; 	Vars.ObjProp; Vars.Event; Vars.Testdata;
	 * Where Action = KeyValue
	 * Obj={act = Split(TestStep," "); loop for all act[i]
	 * if instr(Keyword,act[i] || act[i] = "with" || act[i] =  ) then ignore 
	 * else Obj=act[1]   
	 * e.g. Open browser with "www.google.com" 	will translate in to 
	 * Action : launchapp
	 * Object: Vars.Browsername
	 * ObjProp : http://google.com
	 **************************************************************************************/
	/**
	 * @param Vars
	 * @param TestStep
	 * @param Keyword
	 * @param KeyValue
	 */
	public void Translate(LocalTC Vars, String TestStep, String Keyword, String KeyValue) {
		String testData = null;
		String testDatatemp = null;
		switch (KeyValue) {
		case Constant.TestCaseID: //Run Test case 12456
			Vars.setAction(KeyValue);
			Vars.setObj(MatchNumbers(TestStep));
			break;
		case Constant.Navigate: //Browser refresh; Navigate Back ; Navigate forward;
			Vars.setAction(KeyValue);
			Vars.setObj(Keyword);
			break;
		case Constant.Arithmetic: //#Var1 = #Var2+#Var3
			Vars.setAction(KeyValue);
			String arith[] = TestStep.split("=");
			Vars.setObj(arith[0].trim());
			Pattern p = Pattern.compile("[-*+%\\/]");
			Matcher m = p.matcher(arith[1]);
			while (m.find()) {
				Vars.setEvent(m.group(0));
				String variables[] = arith[1].split("[-*+%/]");
				Vars.setObjProp(variables[0].trim());
				Vars.setTestdata(variables[1].trim());
				break;
			}
			break;
		case Constant.Loop:
			/*
			 * loop 4 times, 
			 * loop 4 times, 
			 * loop 4
			 * run below step 5 times with dt_testdat
			 * loop here 5 times with dt_testdata
			 */
			Vars.setAction(KeyValue);
			p = Pattern.compile("[0-9]+");
			m = p.matcher(TestStep);
			while (m.find()) {
				Vars.setObj(m.group());
				break;
			}
			if(TestStep.contains("dt_")){
				Pattern ptr = Pattern.compile("\\b(dt_)\\w+");
				Matcher mtch = ptr.matcher(TestStep);
				if(mtch.find()){
					Vars.setTestdata(mtch.group(0));
				}
			}
			break;
		case Constant.Endloop:
			Vars.setAction(KeyValue);
			break;
		case Constant.Launchapp:
			/*
			 * Open Browser “URL” Open “URL" Navigate to “URL”
			 */
			String actLaunchapp[] = TestStep.split(" ");
			//String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
			boolean bUrlFlag = false;
			for (int i = 0; i < actLaunchapp.length; i++) {
				if (IsMatch(actLaunchapp[i].replace("\"", ""), regexLaunchapp)) {
					Vars.setObjProp(actLaunchapp[i].replace("\"", ""));
					bUrlFlag = true;
					break;
				}
			}
			if (!bUrlFlag)
				Vars.setObjProp(Vars.getURL());
			Vars.setAction(KeyValue);
			Vars.setObj(Vars.getbrowsername());
			if(Keyword.equals(Constant.NavigateTo)){
				Vars.setEvent(Constant.NavigateTo);
			}else
				Vars.setEvent(Vars.getEvent());
			Vars.setTestdata(Vars.getTestdata());
			break;
		case Constant.Close:
			Vars.setAction(KeyValue);
			Vars.setObj(Vars.getbrowsername());
			Vars.setObjProp(Vars.getURL());
			break;
		case Constant.Wait:
			TestStep = TestStep.replace("wait", "");
			TestStep = TestStep.replace("sleep", "");
			TestStep = TestStep.replace("for", "");
			TestStep = TestStep.trim();
			Vars.setAction(KeyValue);
			if (TestStep.contains("obj")) {
				String objdata[] = TestStep.split("obj=");
				Vars.setObj(objdata[0]);
				Vars.setObjProp(objdata[1].replace("obj=", ""));
				Vars.setEvent("2");
			} else {
				Vars.setObjProp("");
				Vars.setObj("");
				Vars.setEvent(MatchNumbers(TestStep));
				Vars.setTestdata("");
			}
			break;
		case Constant.Condition:   
			// condition #test=#test1
			// condition #test not equals #test1
			/*
			 * != or <> or not equals, > or greater than, < or less than or contains
			 */
			TestStep =	testDataReplace(TestStep,Keyword,"");
			Vars.setAction(KeyValue);
			String word = TestStep.substring(0, TestStep.indexOf(" "));
			Vars.setObj(word);
			TestStep = TestStep.replaceFirst(word, "").trim();
			if(TestStep.contains("#")){
				Vars.setEvent(TestStep.substring(TestStep.indexOf("#")).trim());
				Vars.setObjProp(TestStep.substring(0, TestStep.indexOf("#")).trim());
			}
			else if(TestStep.contains("\"")){
				Vars.setEvent(TestStep.substring(TestStep.indexOf("\"")).trim());
				Vars.setObjProp(TestStep.substring(0, TestStep.indexOf("\"")).trim());
			}
			break;
		case Constant.Endcondition:
		case Constant.End_Condition:
			Vars.setAction(KeyValue);
			break;
			/*
			 * case "screencaptureoption": break;
			 */
		case Constant.Importdata:
			// import data "c:\data.xls"
			TestStep =	testDataReplace(TestStep,Keyword,"");
			Vars.setAction(KeyValue);
			if (TestStep.contains("\"")) {
				testData = testDataMatch(TestStep);
				Vars.setObj(testData);
			}
			break;
			/*
			 * Feching the data from the database
			 */
		case Constant.Fetchdb:
			TestStep =	testDataReplace(TestStep,Keyword,"");
			Vars.setAction(KeyValue);
			if (TestStep.contains("\"")) {
				String sqlQuery = testDataMatch(TestStep);
				Vars.setObj(sqlQuery);
			}
			Pattern patt1 = Pattern.compile("MSSQL|MYSQL",Pattern.CASE_INSENSITIVE);
			Matcher matcher1 = patt1.matcher(TestStep);
			if(matcher1.find())
				Vars.setObjProp(matcher1.group(0));
			break;
		case Constant.Comparedbcell:
			TestStep =	testDataReplace(TestStep,Keyword,"");
			Vars.setAction(KeyValue);
			Vars.setEvent(Constant.Text);
			if(TestStep.contains("obj=")){
				Vars.setObjProp(objPropReturn(TestStep));
			}
			if(TestStep.contains("dt_")){
				Pattern ptr = Pattern.compile("\\b(dt_)\\w+");
				Matcher mtch = ptr.matcher(TestStep);
				if(mtch.find()){
					Vars.setTestdata(mtch.group(0));
				}
			}
			break;
		case Constant.Screencapture:
			Vars.setAction(KeyValue);
			break;
		case Constant.Context:
			// set context for iframe obj=framename
			//vars.getObj()=<frame/iframe>, vars.getEvent()=page
			TestStep =	testDataReplace(TestStep,Keyword,"");
			Vars.setAction(KeyValue);
			testDatatemp = testDataReturn(TestStep);
			if (null != testDatatemp)
				Vars.setObj(testDatatemp);
			else{
				Vars.setObj("browser");
				Pattern pt = Pattern.compile("page|dialog",Pattern.CASE_INSENSITIVE);
				Matcher mt = pt.matcher(TestStep);
				if (mt.find()){
					Vars.setEvent(mt.group(0));
				}
			}
			if(TestStep.contains("obj=")){
				Vars.setObjProp(objPropReturn(TestStep));
			}
			if(TestStep.contains("#")){
				Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
			}
			else if(TestStep.contains("dt_")){
				Vars.setTestdata(TestStep.substring(TestStep.indexOf("dt_")).trim());
			}

			break;
		case Constant.Check:
			// "check visible", "check enable","check text","check link
			// text","check value","check if checked","check page title", "check
			// table row count", "check table column count"
			try {
				switch (Keyword) {
				case Constant.VerifyData:
					/*verify data file "csv/excel" row 1 has value ""
					verify data in "Excelpath" column 3 within range #var1 to #var2
					verify data in "Excelpath" column 2 has #var2
					verify data is "Excelpath" column 2 should "not blank"
					verify data in "Excelpath" column 2 has #var2
					Verify data in pdf  “filepath” has got #test
					Verify data in pdf  “filepath” has got “data”
					 */

					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(Keyword);
					if(TestStep.contains("pdf") || TestStep.contains("PDF")){
						Pattern pt = Pattern.compile("\\b(pdf)\\b",Pattern.CASE_INSENSITIVE);
						Matcher mt = pt.matcher(TestStep);
						if (mt.find())
							Vars.setObj(mt.group(0));
					}
					else if(TestStep.contains("row")){
						Vars.setObj("row " + getNumber(TestStep));
					}else if(TestStep.contains("column")){
						Vars.setObj("column " + getNumber(TestStep));
					}
					stringInQuote(TestStep, Vars);
					stringInVar(TestStep, Vars);

					break;
					//verify property/check property  <href/value/text/anyother> for obj=objname equals/not equals/contains "value"
				case Constant.VerifyProperty:
				case Constant.CheckProperty:
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					word = TestStep.substring(0, TestStep.indexOf(" "));
					Vars.setObj(word);
					TestStep = TestStep.replace("for", "");
					TestStep = TestStep.replace(word, "");
					String strEvent = arithmeticOperation(TestStep);
					Vars.setEvent(strEvent.trim());
					if(TestStep.contains("obj=")){
						String strObj = objPropReturn(TestStep);
						Vars.setObjProp(strObj);
						/*TestStep.replace(strObj, "");*/
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}
					break;
					//getattribute <href/value/text/anyother> for obj=objname into #var
				case Constant.Getattribute:
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					word = TestStep.substring(0, TestStep.indexOf(" "));
					Vars.setObj(word);
					TestStep = TestStep.replace("for", "");
					TestStep = TestStep.replace(word, "");
					Vars.setEvent(Constant.Getattribute);
					if(TestStep.contains("obj=")){
						String strObj = objPropReturn(TestStep);
						Vars.setObjProp(strObj);
						/*TestStep.replace(strObj, "");*/
						if(TestStep.contains("#")){
							Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
						}
					}
					break;
				case Constant.VerifyVariable:
				case Constant.CheckVariable:
					//check variable #var equals #var2
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					word = TestStep.substring(0, TestStep.indexOf(" "));
					Vars.setObj(word);
					TestStep = TestStep.replaceFirst(word, "").trim();
					if(TestStep.contains("#")){
						Vars.setEvent(TestStep.substring(TestStep.indexOf("#")).trim());
						Vars.setObjProp(TestStep.substring(0, TestStep.indexOf("#")).trim());
					}
					else if(TestStep.contains("\"")){
						Vars.setEvent(TestStep.substring(TestStep.indexOf("\"")).trim());
						Vars.setObjProp(TestStep.substring(0, TestStep.indexOf("\"")).trim());
					}
					break;
				case Constant.CheckNotVisible:
				case Constant.VerifyNotVisible:	
				case Constant.VerifyNotdisplayed:		
					//check not visible textbox obj=username
				case Constant.Verifydisplayed:
				case Constant.CheckVisible:
					//check visible textbox obj=usename
					//Check visible
					TestStep =	testDataReplace(TestStep,Keyword,"");
					if (Keyword.equalsIgnoreCase(Constant.CheckVisible) || Keyword.equalsIgnoreCase(Constant.Verifydisplayed))
						Vars.setTestdata("true");
					else
						Vars.setTestdata("false");

					Vars.setAction(KeyValue);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp)
						Vars.setObj(testDatatemp);
					else
						Vars.setObj("textbox");
					Vars.setEvent("visible");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);

					break;
				case Constant.CheckNotEnabled:
				case Constant.VerifyEnable:
				case Constant.VerifyNotEnable:
				case Constant.VerifyEnabled:
				case Constant.CheckEnabled:
				case Constant.CheckNotEnable:
					// check not enabled element obj=username
				case Constant.CheckEnable:
					// check enable element obj=username
					if (Keyword.equalsIgnoreCase(Constant.CheckEnable) || Keyword.equalsIgnoreCase(Constant.CheckEnabled)
							|| Keyword.equalsIgnoreCase(Constant.VerifyEnable) || Keyword.equalsIgnoreCase(Constant.VerifyEnabled))	
						Vars.setTestdata("true");
					else
						Vars.setTestdata("false");
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp)
						Vars.setObj(testDatatemp);
					else
						Vars.setObj("textbox");
					Vars.setEvent(Constant.Enabled);
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.VerifyText:
				case Constant.CheckText:
					// check text in textbox as "sayemul.makki"
					// check text textbox obj=usename
					// verify text displayed "Test is pass"
					TestStep = testDataReplace(TestStep, Keyword, "");
					Vars.setAction(KeyValue);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp)
						Vars.setObj(testDatatemp);
					else
						Vars.setObj("element");
					Vars.setEvent("text");
					if (TestStep.contains("displayed") || TestStep.contains("display")) {
						Vars.setObjProp("displayed");
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					} else {
						if (TestStep.contains("obj=")) {
							Vars.setObjProp(objPropReturn(TestStep));
							if (TestStep.contains("\"")) {
								testData = testDataMatch(TestStep);
								Vars.setTestdata(testData);
							}
						} else {
							cmnCase(Vars, TestStep);
						}
					}
					break;
				case Constant.VerifyLinkText:	
				case Constant.CheckLinkText:
					// check link text in textbox as "sayemul.makki"
					// check link text textbox obj=usename
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setObj("textbox");
					Vars.setEvent(Constant.Check);
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.VerifyValue:	
				case Constant.CheckValue:
					//check value of textbox obj=usename as "testing"
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setObj("textbox");
					Vars.setEvent("value");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.VerifyIfnotChecked:	
				case Constant.CheckIfnotChecked:
				case Constant.VerifyIfChecked:	
				case Constant.CheckIfChecked:
					//verify if not checked obj=chkbox
					if (Keyword.equalsIgnoreCase(Constant.VerifyIfChecked) || Keyword.equalsIgnoreCase(Constant.CheckIfChecked))	
						Vars.setTestdata("on");
					else
						Vars.setTestdata("off");
					// check if checked checkbox obj=usename
					//Vars.setTestdata("on");
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent("checked");
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp) {
						Vars.setObj(testDatatemp);
					}
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.VerifyPageTitle:	
				case Constant.CheckPageTitle:
					// check page title for obj=username as "Google"
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Pagetitle);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp) {
						Vars.setObj(testDatatemp);
					}else
						Vars.setObj("page");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.VerifyTableRowCount:	
				case Constant.CheckTableRowCount:
					// check table row count for table obj=webtable is "20"/#rowcount
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent("rowcount");
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp) {
						Vars.setObj(testDatatemp);
					}
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}else if(TestStep.contains("#")){
							Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.VerifyTableColumnCount:	
				case Constant.CheckTableColumnCount:
					// check table column count for table obj=webtable is "20"/#colcount
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent("count");
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp) {
						Vars.setObj(testDatatemp);
					}
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				}
			} catch (Exception e) {
				Log.info("Error occured due to" + e.getMessage());
			}
			break;
		case Constant.Storevalue:
			try {
				switch (Keyword) {
				case Constant.Assign_Value:
					// Assign value #vartest as "123abc"
					//String strSplit[] = TestStep.split("#");
					TestStep= TestStep.replace(Constant.Assign_Value, "").trim();
					Vars.setAction(Keyword);
					if (TestStep.contains("\"")) {
						Vars.map.put(TestStep.substring(TestStep.indexOf("#"), TestStep.indexOf(" ")).trim().replace("#", ""),testDataMatch(TestStep));
						Log.info("variable "+ TestStep.substring(TestStep.indexOf("#"), TestStep.indexOf(" ")).trim() +"Has been assigned a value"+testDataMatch(TestStep));
					}
					break;
				case Constant.Store_Value:
				case Constant.ReadValue:
					/// *read value/store value/store from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #varvalue
					storevalue(Vars, TestStep, Keyword, KeyValue, "value");
					break;
				case Constant.ReadText:
				case Constant.StoreText:
					/// *read text/store text from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #vartext
					storevalue(Vars, TestStep, Keyword, KeyValue, "text");
					break;
				case Constant.ReadVisible:
				case Constant.StoreVisible:
					/// * read visible/store visible from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #varvisible
					storevalue(Vars, TestStep, Keyword, KeyValue, "visible");
					break;
				case Constant.ReadEnable:
				case Constant.StoreEnable:
					/// *read enable/store enable from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #varenable
					storevalue(Vars, TestStep, Keyword, KeyValue, "enable");
					break;
				case Constant.ReadLinkText:
				case Constant.StoreLinkText:
					// read link text/store link text from <TextBox/ CheckBox/
					// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					// Table/ListBox/element> obj=Objprop in #varvisible
					storevalue(Vars, TestStep, Keyword, KeyValue, "enable");
					break;
				case Constant.ReadPageTitle:
					/// *read page title in #pagetitle
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent("getproperty");
					Vars.setObj("page");
					Vars.setObjProp("pagetitle");
					if (TestStep.contains("#")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
					}
					break;
				case Constant.PageTitle:
					// page title "xyz"/#title exist in #pagetitle
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent("exist");
					Vars.setObj("page");
					String str[] = TestStep.split(" ");
					Vars.setObjProp(str[0]);
					int length = str.length;
					Vars.setTestdata(str[length - 1]);
					break;
				case Constant.Get:
				case Constant.Read:
				case Constant.Store:
					/*
					 * get/read/store row count for table obj=tablename in #rowcount 
					 * get/read/store col/column count for table obj=tablename in #colcount 
					 * get/read/store data in cell from table obj=tablename in #celldata
					 */
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp.toLowerCase());
					}
					String strT[] = TestStep.split(" ");
					for (String strTest : strT) {
						if (strTest.equalsIgnoreCase("row")) {
							Vars.setEvent("rowcount");
							break;
						} else if (strTest.equalsIgnoreCase("col") || strTest.equalsIgnoreCase("column")) {
							Vars.setEvent("columncount");
							break;
						} else if (strTest.equalsIgnoreCase("data")) {
							Vars.setEvent("getcelldata");
							break;
						}
					}
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
					}
					int lengthT = strT.length;
					Vars.setTestdata(strT[lengthT - 1]);
					break;

				}
			} catch (Exception ex) {
				Log.info("Error occured" + ex.getMessage());
			}
			break;
		case Constant.Upload:
			TestStep =	testDataReplace(TestStep,Keyword,"");
			Vars.setAction(KeyValue);
			if (TestStep.contains("\"")) {
				testData = testDataMatch(TestStep);
				Vars.setObj(testData);
			}
			Vars.setEvent(Keyword);
			break;
		case Constant.Download:
			TestStep =	testDataReplace(TestStep,Keyword,"");
			Vars.setAction(KeyValue);
			if(TestStep.contains("obj=")){
				Vars.setObjProp(objPropReturn(TestStep));
			}
			Pattern patt = Pattern.compile(regexLaunchapp);
			Matcher matcher = patt.matcher(TestStep);
			if(matcher.find())
				Vars.setObj(matcher.group(0));
			if (TestStep.contains("\"")) {
				testData = testDataMatch(TestStep);
				Vars.setEvent(testData);
			}
			break;
		case Constant.Perform:
			try {
				switch (Keyword) {
				case Constant.GetCount:
					//get count from dropdown obj=dropdown in #index
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.GetCount);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp) {
						Vars.setObj(testDatatemp);
					} else
						Vars.setObj(Constant.DropDown);
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
					}else
						cmnCase(Vars, TestStep);
					if (TestStep.contains("#")){
						String Var = TestStep.substring(TestStep.indexOf("#")).trim();
						Vars.setTestdata(Var);
					}
				case Constant.Click:
				case Constant.ClickOn:
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					if(TestStep.toLowerCase().contains(Constant.Ok)) 
						Vars.setEvent("ok");
					else if (TestStep.toLowerCase().contains(Constant.Cancel))
						Vars.setEvent("cancel");
					else if (Keyword.equalsIgnoreCase(Constant.ClickOn))
						Vars.setEvent(Constant.Click);
					else 
						Vars.setEvent(Keyword);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp) {
						Vars.setObj(testDatatemp);
					} else
						Vars.setObj(Constant.Link);
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					if(TestStep.toLowerCase().contains(Constant.Ok)){
						if (TestStep.contains("#")) 
							Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
					}

					break;
				case Constant.Altclick:
					TestStep =	testDataReplace(TestStep,Keyword,"");
					//String beforeAltclick = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Altclick);
					//String actAltclick[] = TestStep.split(" ");
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp) {
						Vars.setObj(testDatatemp);
					} else
						Vars.setObj(Constant.Link);
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);

					break;
				case Constant.HitEnter:
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setObj(prvObj);
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Enter);
					break;
				case Constant.HitTab:
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setObj(prvObj);
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Tab);
					break;

				case Constant.Enter:
					// enter in obj=username "sayemul.makki"
					// enter "sayemul.makki" in textbox obj=username
					// enter encrypted "$%RDE867" in obj=password
					// TextBox|ComboBox|TextArea|Image|Frame|iFrame|Table|element
					/*enter "bharat.sethi" in obj=username
					enter "bharat.sethi" in "username"
					enter bharat.sethi" in "id:username*/
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent("set");
					if (TestStep.contains("encrypted")) {
						testData = testDataMatch(TestStep);
						testData = testData.replace('"', '\u0000').trim();//eAll("\"", "").trim();
						//String pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
						Pattern r = Pattern.compile(patternEncode);
						Matcher encodeM = r.matcher(testData);
						if (encodeM.find()) {
							Log.info(encodeM.group(0));
							byte[] decodedBytes = Base64.getDecoder().decode(testData);
							Vars.setTestdata(new String(decodedBytes));
						}
					}else{
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						} 

						else if (TestStep.contains("#")) {
							Vars.setTestdata(TestStep.substring(TestStep.indexOf("#"), TestStep.indexOf(" ")).trim());
						}
						else if (TestStep.contains("dt_")) {
							Vars.setTestdata(TestStep.substring(TestStep.indexOf("dt_"), TestStep.indexOf(" ")).trim());
						}
					}	
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					} else
						Vars.setObj("textbox");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(objPropReturn(TestStep));
						//Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim().replace("obj=", ""));
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.Hover:
				case Constant.HoverOver:
					// hoverover on image obj=img
					/*String beforeHover = TestStep.substring(TestStep.indexOf("on"), TestStep.indexOf("obj=")).trim();*/
					if(TestStep.contains("obj=")){
						TestStep = testDataReplace(TestStep,Keyword,"");
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Hover);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					} else
						Vars.setObj(Constant.Link);
					break;
				case Constant.SetText:
					// set text "sayemul.makki" in textbox obj=username
					TestStep =	testDataReplace(TestStep,Keyword,"");
					TestStep.split(" ");
					Vars.setAction(KeyValue);
					Vars.setEvent("set");
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					}
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.SelectFromSpanDropDown:
					//select from span dropdown "Text to select" obj=span
				case Constant.Listselect:
					Vars.setAction(KeyValue);
					if(Keyword.equals(Constant.Listselect ))
						Vars.setEvent(Constant.Listselect);
					else
						Vars.setEvent(Constant.SelectFromSpanDropDown);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					}else
						Vars.setObj("listbox");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.Select:
					TestStep = testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Select);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					}else
						Vars.setObj("combobox");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						testData = testDataMatch(TestStep);
						Vars.setTestdata(testData);
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.Check:
					// check visible for textbox obj=txtusers
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(Keyword);
					String actCheck[] = TestStep.split(" ");
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					}
					Vars.setEvent(actCheck[0]);
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.Setdate:
					//setdate in calender cal_calname in mm-dd-yyyy
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent(Keyword);
					Vars.setObj("calendar");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
					}else
						cmnCase(Vars, TestStep);
					//date should be in mm-dd-yyyy
					Pattern ptrDate = Pattern.compile(dateRegex);
					Matcher mtchDate = ptrDate.matcher(TestStep);
					if(mtchDate.find()){
						Vars.setTestdata(mtchDate.group(0));
					}
					break;
				case Constant.Ok:
				case Constant.Close:
				case Constant.Cancel:
					//click on/perform OK/cancel in dialog/alert
					//TestStep = testDataReplace(TestStep,Keyword,"");
					TestStep = testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent(Keyword);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					}
					if (TestStep.contains("#")) 
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("#"), TestStep.indexOf(" ")).trim());
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
							Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				}
			} catch (Exception e) {
				Log.info(e.getMessage());
			}
			break;
		case Constant.Callfunction:
			Vars.setAction(KeyValue);
			TestStep = TestStep.replace(Keyword, "");
			TestStep = TestStep.replace("(", " ");
			TestStep = TestStep.replace(")", " ");
			TestStep = TestStep.replace(" with", "");
			TestStep = TestStep.replace(" and", ",");
			TestStep = TestStep.trim();
			String actEnter[] = TestStep.split(" ");
			Vars.setObj(actEnter[0]);
			//if (actEnter[1] == "")
			Vars.setObjProp(actEnter[1]);
			break;
		case Constant.CallAction:
			Vars.setAction(KeyValue);
			if(TestStep.contains(".xlsx")){
				Pattern ptr = Pattern.compile("\\w+.xlsx");
				Matcher mtch = ptr.matcher(TestStep);
				if(mtch.find()){
					Vars.setObj(mtch.group(0));
				}
			}
			break;
		case Constant.Extract:
			//Extract text from #var1 number into #var2
			//Extract text from #var1 "regex:\d" into #var2
			Vars.setAction(KeyValue);
			Vars.setEvent(Constant.Text);
			VarExtract(TestStep, Vars);
			testData = testDataMatch(TestStep);
			Vars.setTestdata(testData);
			break;
		case Constant.Swap:
			/*
			 * swap value from #var1 into #var2, swap value from "abc xyz" into
			 * #var2 swap value from obj=abc into #var2 || example #var2=xyz, abc
			 */
			Vars.setAction(KeyValue);
			Vars.setEvent(Constant.Swap);
			if (TestStep.contains("obj=")) {
				Vars.setObjProp(objPropReturn(TestStep));
				if (TestStep.contains("#")) {
					Vars.setObj(TestStep.substring(TestStep.indexOf("#")).trim());
				}
			} else
				swapValue(TestStep, Vars);
			break;

		case Constant.Msgbox:
		{  switch(Keyword){
		case Constant.Report_Failed:
			Vars.setExecutionStatus(Constant.Failed);
			Vars.setExecutionResult("Condition is reported as failed");
			Vars.setRes_type(Constant.Failed);
			break;
		case Constant.Report_Passed:
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setExecutionResult("Condition is reported as passed");
			Vars.setRes_type(Constant.Passed);
			break;
		case Constant.Comment:
		case Constant.Message:
			String msg = "";
			TestStep =	testDataReplace(TestStep,Keyword,"");
			if (TestStep.contains("#")) 
				msg = Vars.map.get(TestStep.substring(TestStep.indexOf("#")).trim().replace("#",""));
			if (TestStep.contains("\"")) 
				msg = testDataMatch(TestStep);
			Vars.setExecutionStatus(Constant.Passed);
			Vars.setExecutionResult(msg);
			Vars.setRes_type(Constant.Passed);
			break;
		}
		}
		}
	}

	/*
	 * Method for matching the URL
	 */
	public static boolean IsMatch(String url, String pattern) {
		try {
			Pattern patt = Pattern.compile(pattern);
			Matcher matcher = patt.matcher(url);
			if(matcher.find())
				return matcher.matches();
			else
				return false;
		} catch (RuntimeException e) {
			return false;
		}
	}

	/*
	 * Method for storevalue
	 */
	public void storevalue(LocalTC Vars, String TestStep, String Keyword, String KeyValue, String event) {
		TestStep =	testDataReplace(TestStep,Keyword,"");
		TestStep = TestStep.replace("from", "").trim();
		Vars.setAction(KeyValue);
		Vars.setEvent(event);
		String testDatatemp = testDataReturn(TestStep);
		if (null != testDatatemp && !testDatatemp.isEmpty()) {
			Vars.setObj(testDatatemp.toLowerCase());
			//TestStep = TestStep.replace(testDatatemp, "").trim();
		}
		else Vars.setObj("element");
		if(TestStep.contains("obj=")){
			Vars.setObjProp(objPropReturn(TestStep));
		}
		if (TestStep.contains("#")) {
			String Var = TestStep.substring(TestStep.indexOf("#")).trim();
			if(Var.replace("#", "").equalsIgnoreCase("current_date") ||Var.replace("#", "").equalsIgnoreCase("currentdate") ){
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
				Vars.setTestdata(sdf.format(date));
			}

			else
				Vars.setTestdata(Var);
		} else
			if (event.equalsIgnoreCase("visible") || event.equalsIgnoreCase("enable") || event.equalsIgnoreCase("exist"))
				Vars.setTestdata("true");
			else
				Vars.setTestdata("");
	}


	/*
	 * Method for teststeps which have testdata and objprop in double inverted code("")
	 */
	public LocalTC cmnCase(LocalTC Vars, String TestStep) {
		// enter "sayemul.makki" in "username"
		// click on "login"
		String strSplit[] = TestStep.split(" ");
		ArrayList<String> strData = new ArrayList<>();
		for (String splitt : strSplit) {
			if (splitt.contains("\"")) {
				strData.add(splitt);
			}
		}
		if (strData != null && strData.size() > 0) {
			if (strData.size() > 1) {
				Vars.setTestdata(strData.get(0).replaceAll("\"", ""));
				Vars.setObjProp(strData.get(1).replaceAll("\"", ""));
			} else {
				Vars.setObjProp(strData.get(0).replaceAll("\"", ""));
			}
		}
		return Vars;
	}
	/*
	 * Method for matching word having ""
	 */
	public String testDataMatch(String TestStep) {
		Pattern pt = Pattern.compile("\".*\"");
		Matcher mt = pt.matcher(TestStep);
		String dataExtract = "",VartoReplace;
		try{
			if (mt.find()){
				if(null != Constant.Vars && Constant.Vars.loopnum >= 0){
					dataExtract = TestDataMatch(Constant.Vars.ObjProp,mt.group(0).replaceAll("\"", ""));
					if(dataExtract.contains("#")){
						VartoReplace = dataExtract.substring(0, TestStep.indexOf("#")).trim().replace("#", "");
						dataExtract = dataExtract.replace(VartoReplace, Constant.Vars.map.get(VartoReplace));
					}
				}
				else{
					dataExtract = mt.group(0).replaceAll("\"", "");
					if(dataExtract.contains("#")){
						VartoReplace = dataExtract.substring(0, TestStep.indexOf("#")).trim().replace("#", "");
						dataExtract = dataExtract.replace(VartoReplace, Constant.Vars.map.get(VartoReplace));
					}
				}
			}
			else {
				if(TestStep.contains("#"))
				{
					VartoReplace = TestStep.substring(TestStep.indexOf("#"), TestStep.indexOf(" ")).trim().replace("#", "");
					dataExtract = Constant.Vars.map.get(VartoReplace);
				}
			}
			return dataExtract;
		}
		catch (Exception e){
			return "";
		}
	}

	/*
	 * Method for replacing keyword from the teststep
	 */
	public String testDataReplace(String source,String target,String replacement) {
		Pattern pt = Pattern.compile(target+" ",Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(source);
		return mt.replaceAll(replacement).trim();
	}

	/*
	 * Method for getting numbers form step
	 */
	public String MatchNumbers(String source) {
		Pattern pt = Pattern.compile(RegexNumberdata,Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(source);
		mt.find();
		return mt.group(0);
	}

	//return objProp without obj from the teststep
	public String objPropReturn(String TestStep) {
		String Regex = "obj=[a-zA-Z0-9._]+";
		String obj;
		Pattern ptr = Pattern.compile(Regex);
		Matcher matcher = ptr.matcher(TestStep);
		matcher.find();
		obj = matcher.group(0);
		if (obj.length() >1) {
			return obj.replace("obj=", "").toLowerCase();
		} else
			return null;
	}

	/*
	 * Method for returning box 
	 * 
	 */
	public String testDataReturn(String TestStep){
		Pattern pt = Pattern.compile(PatternForBox,Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(TestStep);
		if (mt.find())
			return mt.group(0);
		else {
			return null;
		}
	}

	public String TestDataMatch(String Searchtext, String Default) 
	{
		int DTcolumncountCh;
		String ObjectSetValCh = Default;
		try {
			DTcolumncountCh = Constant.Vars.TestData.getColCount();

			for (int column = 0; column < DTcolumncountCh; column++) {
				if(Searchtext.equalsIgnoreCase(Constant.Vars.TestData.getCellData(0, column))==true)
				{
					ObjectSetValCh = Constant.Vars.TestData.getCellData(Constant.Vars.loopcnt[Constant.Vars.loopnum]+1, column);
					if (ObjectSetValCh.length() == 0) {
						ObjectSetValCh = Default;
					}  
					return ObjectSetValCh;
				}
			}
			return ObjectSetValCh;
		} catch (NullPointerException e) {
			Log.info(e.getMessage());
			return null;
		} catch (Exception e) {
			Log.info(e.getMessage());
			return null;
		}
	}
	//return arithmetic operatin from the teststep
	public String arithmeticOperation(String TestStep){
		Pattern pt = Pattern.compile(PatternArithmetic,Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(TestStep);
		if (mt.find()){
			return mt.group(0);
		}

		else {
			return null;
		}
	}

	// Removing extra spaces after obj in teststep
	public String removeExtraSpaces(String TestStep) {
		if (TestStep.contains("obj") && TestStep.contains("=")) {
			// obj = a.b.c.d, obj= a.b.c.d, obj =a.b.c.d
			TestStep = TestStep.replaceAll("\\s+", " ");
			if (TestStep.contains("obj =") || TestStep.contains("obj= ")) {
				String[] split = TestStep.split("=");
				if (split.length > 0) {
					TestStep = split[0].trim() + "=" + split[1].trim();
				}
			}
			return TestStep;
		}
		return TestStep;
	}

	//Setting value in Vars from teststep in comma
	public LocalTC stringInQuote(String TestStep, LocalTC Vars){
		Pattern pt = Pattern.compile("\"[^\"]+[^\\s\"]\"");
		Matcher mt = pt.matcher(TestStep);
		while(mt.find())
		{
			/*if(null == Vars.getTestdata() || Vars.getTestdata().isEmpty()){
				Vars.setTestdata(mt.group().replaceAll("\"", ""));
			}else{*/
			Vars.setObjProp(mt.group().replaceAll("\"", ""));
			/*}*/

		}
		return Vars;
	}

	/**
	 * @param TestStep
	 * @param Vars
	 * @return
	 * Setting the variables(#) values into LocalTC object from teststep
	 */
	public LocalTC stringInVar(String TestStep, LocalTC Vars){
		Pattern pt = Pattern.compile("#[^#\\s]*");
		Matcher mt = pt.matcher(TestStep);
		while(mt.find())
		{
			if(null == Vars.getEvent() || Vars.getEvent().isEmpty()){
				Vars.setEvent(mt.group());
			}else{
				Vars.setObjProp(mt.group());
			}

		}
		return Vars;
	}
	/**
	 * @param source
	 * @return
	 * Method for getting numbers form step
	 */
	public String getNumber(String source) {
		Pattern pt = Pattern.compile("\\s+(\\d+)\\s+");
		Matcher mt = pt.matcher(source);
		mt.find();
		return mt.group().trim();
	}

	/**
	 * @param TestStep
	 * @param Vars
	 * @return
	 * Setting the variables(#) values into LocalTC object from teststep
	 */
	public LocalTC VarExtract(String TestStep, LocalTC Vars) {
		Pattern pt = Pattern.compile("#[^#\\s]*");
		Matcher mt = pt.matcher(TestStep);
		while (mt.find()) {
			if (null == Vars.getObj() || Vars.getObj().isEmpty()) {
				Vars.setObj(mt.group());
			} else {
				Vars.setObjProp(mt.group());
			}
		}
		return Vars;
	}
	/**
	 * @param TestStep
	 * @param Vars
	 * @return
	 */
	public LocalTC swapValue(String TestStep, LocalTC Vars) {
		Pattern pt = Pattern.compile("#[^#\\s]*");
		Matcher mt = pt.matcher(TestStep);
		while (mt.find()) {
			if (null == Vars.getObjProp() || Vars.getObjProp().isEmpty()) {
				Vars.setObjProp(mt.group());
			} else {
				Vars.setObj(mt.group());
			}
		}
		return Vars;
	}
}
