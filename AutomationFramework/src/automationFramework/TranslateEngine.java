package automationFramework;

import java.util.ArrayList;
import java.util.Base64;
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
	public static final String PatternForBox = "\\b(TextBox|textbox|ComboBox|combobox|TextArea|textarea|Image|image|Frame|frame|iFrame|IFrame|Table|table|element|CheckBox|checkbox|RadioButtonButton|Link|link|ListBox|webelement|title|page|TextElement|dialog)\\b";
	public static final String regexLaunchapp = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
	public static final String patternEncode = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
	public static final String dateRegex = "(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9])-[0-9]{4}$";
//
	public TranslateEngine(){
		 ActionsList = new LinkedHashMap<String, String>();
		 ActionsList.put(Constant.CheckVisible,Constant.Check); 				//Returns whether object is Visible or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		 ActionsList.put(Constant.CheckNotVisible,Constant.Check); 				//Returns whether object is Visible or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		 ActionsList.put(Constant.CheckEnable,Constant.Check); 				//Returns whether object is enabled or not. If so True, else False; Data Data table variables/ Environment variables can be used here for True/false.
		 ActionsList.put(Constant.CheckNotEnable,Constant.Check); 				//Returns whether object is enabled or not. If so True, else False; Data Data table variables/ Environment variables can be used here for True/false.
		 ActionsList.put(Constant.CheckText,Constant.Check); 				//Checks the Text property of the given object.Data table variables/ Environment variables can be used here for text to compare
		 ActionsList.put(Constant.CheckLinkText,Constant.Check); 			//checks the displayed text of the link.Data table variables/ Environment variables can be used here for text to compare
		 ActionsList.put(Constant.CheckValue,Constant.Check); 				//Validate the selected item from the combobox.Data table variables/ Environment variables can be used here for value to compare
		 ActionsList.put(Constant.CheckIfChecked,Constant.Check); 			//Data table variables/ Environment variables can be used here for value to compare whether checked is ON/OFF.
		 ActionsList.put(Constant.CheckPageTitle,Constant.Check); 			//check whether the page available.  Data and environmental variable are also allowable for true/false
		 ActionsList.put(Constant.CheckTableRowCount,Constant.Check); 		//Compare the row count of the table object with the given number.
		 ActionsList.put(Constant.CheckTableColumnCount,Constant.Check); 	//Compare the column count of the table object with the given number.
		 ActionsList.put(Constant.CheckTableValues,Constant.Comparedbcell); //it will search : compare the text of given object with the data table
		 ActionsList.put(Constant.Open,Constant.Launchapp); 					//Launches the given URL
		 ActionsList.put(Constant.OpenBrowser,Constant.Launchapp); 			//Launches the given URL
		 ActionsList.put(Constant.NavigateTo,Constant.Launchapp); 			//Launches the given URL
		 ActionsList.put(Constant.Wait,Constant.Wait);   					    //Waits for the given interval 
		 ActionsList.put(Constant.Sleep,Constant.Wait);   					//Waits for the given interval
		 ActionsList.put(Constant.TestDataFrom,Constant.Importdata);		//Imports  the Data from the given path (Data Sheet path)
		 ActionsList.put(Constant.ImportData,Constant.Importdata);			//Imports  the Data from the given path (Data Sheet path)
		 ActionsList.put(Constant.CaptureScreen,Constant.Screencapture);		//Capture screenshot for evidence 
		 ActionsList.put(Constant.Screenshot,Constant.Screencapture);			//Capture screenshot for evidence 
		 ActionsList.put(Constant.Screen_Shot,Constant.Screencapture);		//Capture screenshot for evidence 
		 ActionsList.put(Constant.ScreenCapture,Constant.Screencapture);		//Capture screenshot for evidence
		 ActionsList.put(Constant.ConcludeCondition,Constant.Endcondition);	//End conditional steps
		 ActionsList.put(Constant.End_Condition,Constant.Endcondition);	    //End conditional steps
		 ActionsList.put(Constant.Condition,Constant.Condition);				//Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		 ActionsList.put(Constant.Compare,Constant.Condition);				//Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		 ActionsList.put(Constant.CheckVariable,Constant.Condition);			//Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		 ActionsList.put(Constant.Endloop,Constant.Endloop);	    				//End of loop
		 ActionsList.put(Constant.RunStepsBelow,Constant.Loop);				//Start of loop
		 ActionsList.put(Constant.LoopHere,Constant.Loop);	    			//Start of loop
		 ActionsList.put(Constant.Loop,Constant.Loop);	    				//Start of loop
		 ActionsList.put(Constant.Perform,Constant.Perform);				    //Clicks the required object,In some elements, particularly in sub menu items, if  'Click' action doesn't work, use this action.
		 ActionsList.put(Constant.ActionOn,Constant.Perform);
		 ActionsList.put(Constant.Altclick,Constant.Perform);//We use Java script executor to perform 'click' operation  in tests where the Selenium 'click' method doesn't work
		 ActionsList.put(Constant.ClickOn,Constant.Perform);					//Clicks the required object
		 ActionsList.put(Constant.Enter,Constant.Perform);					//We actually perform an 'Enter' key stroke in this case.
		 ActionsList.put(Constant.Setdate,Constant.Perform);									 
		 ActionsList.put(Constant.SetText,Constant.Perform);					//We actually perform an 'Enter' key stroke in this case.
		 ActionsList.put(Constant.Type,Constant.Perform);						//We actually perform an 'Enter' key stroke in this case.
		 ActionsList.put(Constant.HoverOver,Constant.Perform);				//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		 ActionsList.put(Constant.Hover,Constant.Perform);					//Some menu items / elements we need to hover mouse the web elements, use this method.
		 ActionsList.put(Constant.SelectFromList,Constant.Perform);			//Select set of values from listbox. One data variable and environmental variable is allowed.
		 ActionsList.put(Constant.Listselect,Constant.Perform);				//Select set of values from listbox. One data variable and environmental variable is allowed.
		 ActionsList.put(Constant.Select,Constant.Perform);					//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		 //ActionsList.put("hover","perform");								//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		 ActionsList.put(Constant.Store_Value,Constant.Storevalue);			//Store text value to a variable
		 ActionsList.put(Constant.ReadValue,Constant.Storevalue);				//Store text value to a variable
		 ActionsList.put(Constant.ReadText,Constant.Storevalue);				//Store text value to a variable
		 ActionsList.put(Constant.StoreText,Constant.Storevalue);				//Store text value to a variable
		 ActionsList.put(Constant.ReadVisible,Constant.Storevalue);			//Assigns the display status of the element in a variable.
		 ActionsList.put(Constant.StoreVisible,Constant.Storevalue);			//Assigns the display status of the element in a variable.
		 ActionsList.put(Constant.ReadEnable,Constant.Storevalue);				//Store whether object is enabled or not to a boolean variable
		 ActionsList.put(Constant.StoreEnable,Constant.Storevalue);				//Store whether object is enabled or not to a boolean variable
		 ActionsList.put(Constant.ReadLinkText,Constant.Storevalue);
		 ActionsList.put(Constant.StoreLinkText,Constant.Storevalue);
		 ActionsList.put(Constant.ReadPageTitle,Constant.Storevalue);
		 ActionsList.put(Constant.PageTitle,Constant.Storevalue);
		 ActionsList.put(Constant.Get,Constant.Storevalue);
		 ActionsList.put(Constant.Read,Constant.Storevalue);
		 ActionsList.put(Constant.Store,Constant.Storevalue);
		 ActionsList.put(Constant.Message,Constant.Msgbox);					//Put the message in to the report
		 ActionsList.put(Constant.Report,Constant.Msgbox);					//Put the message in to the report
		 ActionsList.put(Constant.Comment,Constant.Msgbox);					//Put the message in to the report
		 ActionsList.put(Constant.SetContext,Constant.Context);				//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window.
		 ActionsList.put(Constant.ReferTo,Constant.Context);					//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window. 
		 ActionsList.put(Constant.OnPage,Constant.Context);					//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window.
		 ActionsList.put(Constant.RunTest, Constant.Callfunction);				//Use if any testscript has to be called from another Test Script
		 ActionsList.put(Constant.RunAction, Constant.Callfunction);			//Run another testcase with in the project
		 ActionsList.put(Constant.CallAction, Constant.Callfunction);		//Run another testcase with in the project 
		 ActionsList.put(Constant.RunFunction, Constant.Callfunction);		//run a predefined known function
		 ActionsList.put(Constant.CallFunction, Constant.Callfunction);		//run a predefined known function
		 ActionsList.put(Constant.ClickToDownload,Constant.Download);		//Click a link to download the file 	
		 ActionsList.put(Constant.Download,Constant.Download);		 		//Click a link to download the file
		 ActionsList.put(Constant.Upload,Constant.Upload);		 			//Upload a file
		 ActionsList.put(Constant.CloseUpload,Constant.Upload);		 			//close upload dialog
		 ActionsList.put(Constant.CancleUpload,Constant.Upload);		 			//cancel upload dialog
		 ActionsList.put(Constant.ExractFromDb,Constant.Fetchdb);			//SQL query will get execute . And result set is copied to Excel file in current working dir.
		 ActionsList.put(Constant.Fetchdb,Constant.Fetchdb);					//SQL query will get execute . And result set is copied to Excel file in current working dir.
		 ActionsList.put(Constant.Close,Constant.Close);
	}
	
	public String FindKeyword(LocalTC Vars, String TestStep) {
		Vars.setAction("");
		Vars.setObj("");
		Vars.setTestdata("");
		Vars.setObjProp("");
		Vars.setEvent("");
		Set<String> Keys = ActionsList.keySet();
		for (String word : Keys) {
			if (TestStep.toLowerCase().contains(word)) {
					/* ActionsList.get(word); */
					Translate(Vars, TestStep, word, ActionsList.get(word));
					break;
				}
		}
		//report to html report as comment
		return null;
	}
	
	/***************************Translate Engine ****************************************
	 * Receive 3 arguments as TestStep, Keyword and KeyValue
	 * For Each KeyValue found in TestStep Translate Engine will convert string into following:
	 * 	Vars.Action; Vars.Obj; 	Vars.ObjProp; Vars.Event; Vars.Testdata;
	 * Where Action = KeyValue
	 * Obj={act = Split(TestStep," "); loop for all act[i]
	 * if instr(Keyword,act[i] || act[i] = "with" || act[i] =  ) then ignore 
	 * else Obj=act[1]   
	 * e.g. Open browser with "www.google.com" 	will translate in to 
	 * Action : launchapp
	 * Object: Vars.Browsername
	 * ObjProp : http://google.com
	**************************************************************************************/
	public void Translate(LocalTC Vars, String TestStep, String Keyword, String KeyValue) {
		String testData = null;
		String testDatatemp = null;
		switch (KeyValue) {

		case Constant.Loop:
			/*
			 * so i would write strat loop 4 times, loop 4 times, loop 4
			 */
			Vars.setAction(KeyValue);
			Pattern p = Pattern.compile("[0-9]+");
			Matcher m = p.matcher(TestStep);
			while (m.find()) {
				Vars.setObj(m.group());
				break;
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
				if (IsMatch(actLaunchapp[i], regexLaunchapp)) {
					Vars.setObjProp(actLaunchapp[i]);
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
				Vars.setObjProp(objdata[1]);
				Vars.setEvent("100");
			} else {
				Vars.setObjProp("");
				Vars.setObj("");
				Vars.setEvent("100");
				Vars.setTestdata("");
			}
			break;
		case Constant.Condition:   
			// condition #test=#test1
			// condition #test not equals #test1
			/*
			 * != or <> or not equals, > or greater than, < or less than
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
				case Constant.CheckNotVisible:
				case Constant.CheckVisible:
					// check visible textbox obj=usename
					//Check visible
					TestStep =	testDataReplace(TestStep,Keyword,"");
					
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
				case Constant.CheckNotEnable:
				case Constant.CheckEnable:
					// check enable webelement obj=username
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp)
						Vars.setObj(testDatatemp);
					else
						Vars.setObj("textbox");
					Vars.setEvent("enable");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
					        Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
				case Constant.CheckText:
					// check text in textbox as "sayemul.makki"
					// check text textbox obj=usename
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp)
						Vars.setObj(testDatatemp);
					else
						Vars.setObj("textbox");
					Vars.setEvent("text");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
					        Vars.setTestdata(testData);
						}
					}else
						cmnCase(Vars, TestStep);
					break;
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
				case Constant.CheckValue:
					// check value textbox obj=usename
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
				case Constant.CheckIfChecked:
					// check if checked checkbox obj=usename
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
				case Constant.CheckPageTitle:
					// check page title obj=username
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
				case Constant.CheckTableRowCount:
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
				case Constant.CheckTableColumnCount:
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

				case Constant.Click:
				case Constant.ClickOn:
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					if(Keyword.equalsIgnoreCase(Constant.ClickOn))
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
					    	System.out.println(encodeM.group(0));
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
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}else
						cmnCase(Vars, TestStep);
					
					break;
				case Constant.Hover:
				case Constant.HoverOver:
					// hoverover on image obj=img
					/*String beforeHover = TestStep.substring(TestStep.indexOf("on"), TestStep.indexOf("obj=")).trim();*/
					if(TestStep.contains("obj=")){
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
					String actSet[] = TestStep.split(" ");
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
				case Constant.Listselect:
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Listselect);
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
					Vars.setAction(KeyValue);
					Vars.setEvent(Constant.Select);
					testDatatemp = testDataReturn(TestStep);
					if (null != testDatatemp && !testDatatemp.isEmpty()) {
						Vars.setObj(testDatatemp);
					}else
						Vars.setObj("combobox");
					if(TestStep.contains("obj=")){
						Vars.setObjProp(objPropReturn(TestStep));
						if (TestStep.contains("\"")) {
							testData = testDataMatch(TestStep);
					        Vars.setTestdata(testData);
						}
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
					TestStep =	testDataReplace(TestStep,Keyword,"");
					Vars.setAction(KeyValue);
					Vars.setEvent(Keyword);
					Vars.setObj("calender");
					if(TestStep.contains("cal_")){
						Pattern ptr = Pattern.compile("\\b(cal_)\\w+");
						Matcher mtch = ptr.matcher(TestStep);
						if(mtch.find()){
							Vars.setObjProp(mtch.group(0));
						}
					}
					//date should be in mm-dd-yyyy
					Pattern ptrDate = Pattern.compile(dateRegex);
					Matcher mtchDate = ptrDate.matcher(TestStep);
					if(mtchDate.find()){
						Vars.setTestdata(mtchDate.group(0));
					}
					
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
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
		}

	}

	/*
	 * Method for matching the URL
	 */
	public static boolean IsMatch(String url, String pattern) {
		try {
			Pattern patt = Pattern.compile(pattern);
			Matcher matcher = patt.matcher(url);
			return matcher.matches();
		} catch (RuntimeException e) {
			return false;
		}
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

	/*
	 * Method for storevalue
	 */
	public LocalTC storevalue(LocalTC Vars, String TestStep, String Keyword, String KeyValue, String event) {
		TestStep =	testDataReplace(TestStep,Keyword,"");
		TestStep = TestStep.replace("from", "").trim();
		Vars.setAction(KeyValue);
		Vars.setEvent(event);
		String testDatatemp = testDataReturn(TestStep);
		if (null != testDatatemp && !testDatatemp.isEmpty()) {
			Vars.setObj(testDatatemp.toLowerCase());
		}
		TestStep = TestStep.replace(testDatatemp, "").trim();
		if(TestStep.contains("obj=")){
			Vars.setObjProp(objPropReturn(TestStep));
		}
		if (TestStep.contains("#")) {
			Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
		} else
			Vars.setTestdata("");
		
		return Vars;
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
				//Vars.setTestdata("");
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
		if (mt.find())
			return mt.group(0);
		else {
			return null;
		}
	}
	/*
	 * Method for replacing keyword from the teststep
	 */
	public String testDataReplace(String source,String target,String replacement) {
		Pattern pt = Pattern.compile(target,Pattern.CASE_INSENSITIVE);
		Matcher mt = pt.matcher(source);
		return mt.replaceAll(replacement).trim();
	}

	public String objPropReturn(String TestStep) {
		Pattern ptr = Pattern.compile("\\b(obj=)\\w+");
		Matcher match = ptr.matcher(TestStep);
		if (match.find()) {
			return match.group(0);
		} else
			return null;
	}
}
