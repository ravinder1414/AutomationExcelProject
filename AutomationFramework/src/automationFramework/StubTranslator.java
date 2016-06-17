package automationFramework;

import java.util.Base64;
import java.util.Hashtable;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utility.Log;

public class StubTranslator {

	//static Set<String> KeywordList;
	static Hashtable<String,String> ActionsList;
	String action;

	public StubTranslator(){
		ActionsList = new Hashtable<String, String>();
		ActionsList.put("check visible","check"); 				//Returns whether object is Visible or not. If so True, else False; Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put("check enable","check"); 				//Returns whether object is enabled or not. If so True, else False; Data Data table variables/ Environment variables can be used here for True/false.
		ActionsList.put("check text","check"); 				//Checks the Text property of the given object.Data table variables/ Environment variables can be used here for text to compare
		ActionsList.put("check link text","check"); 			//checks the displayed text of the link.Data table variables/ Environment variables can be used here for text to compare
		ActionsList.put("check value","check"); 				//Validate the selected item from the combobox.Data table variables/ Environment variables can be used here for value to compare
		ActionsList.put("check if checked","check"); 			//Data table variables/ Environment variables can be used here for value to compare whether checked is ON/OFF.
		ActionsList.put("check page title","check"); 			//check whether the page available.  Data and environmental variable are also allowable for true/false
		ActionsList.put("check table row count","check"); 		//Compare the row count of the table object with the given number.
		ActionsList.put("check table column count","check"); 	//Compare the column count of the table object with the given number.
		ActionsList.put("check table values","comparedbcell"); //it will search : compare the text of given object with the data table
		ActionsList.put("open","launchapp"); 					//Launches the given URL
		ActionsList.put("open browser","launchapp"); 			//Launches the given URL
		ActionsList.put("wait","wait");   					    //Waits for the given interval 
		ActionsList.put("sleep","wait");   					//Waits for the given interval
		ActionsList.put("test data from","importdata");		//Imports  the Data from the given path (Data Sheet path)
		ActionsList.put("capture screen","screencapture");		//Capture screenshot for evidence 
		ActionsList.put("screenshot","screencapture");			//Capture screenshot for evidence 
		ActionsList.put("screen shot","screencapture");		//Capture screenshot for evidence 
		ActionsList.put("condition","condition");				//Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		ActionsList.put("compare","condition");				//Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		ActionsList.put("check variable","condition");			//Start of conditional steps,Checks whether the the given variable Var1 <Operation> Var2. If so returns true else false
		ActionsList.put("conclude condition","endcondition");	//End conditional steps
		ActionsList.put("end condition","endcondition");	    //End conditional steps
		ActionsList.put("run steps below","loop");				//Start of loop
		ActionsList.put("loop here","loop");	    			//Start of loop
		ActionsList.put("perform","perform");				    //Clicks the required object,In some elements, particularly in sub menu items, if  'Click' action doesn't work, use this action.
		ActionsList.put("action on","perform");				//We use Java script executor to perform 'click' operation  in tests where the Selenium 'click' method doesn't work
		ActionsList.put("click on","perform");					//Clicks the required object
		ActionsList.put("enter","perform");					//We actually perform an 'Enter' key stroke in this case.
		ActionsList.put("perform","perform");					//We actually perform an 'Enter' key stroke in this case.		 
		ActionsList.put("set text","perform");					//We actually perform an 'Enter' key stroke in this case.
		ActionsList.put("type","perform");						//We actually perform an 'Enter' key stroke in this case.
		ActionsList.put("hover","perform");					//Some menu items / elements we need to hover mouse the web elements, use this method.
		ActionsList.put("hover over","perform");				//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		ActionsList.put("select from list","perform");			//Select set of values from listbox. One data variable and environmental variable is allowed.
		ActionsList.put("listselect","perform");				//Select set of values from listbox. One data variable and environmental variable is allowed.
		ActionsList.put("select","perform");					//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		ActionsList.put("hover","perform");					//Some menu items / elements we need to hover mouse the web elements, use this mehod.
		ActionsList.put("store value","storevalue");			//Store text value to a variable
		ActionsList.put("get value","storevalue");				//Store text value to a variable
		ActionsList.put("get text","storevalue");				//Store text value to a variable
		ActionsList.put("is visible","storevalue");			//Assigns the display status of the element in a variable.
		ActionsList.put("is enable","storevalue");				//Store whether object is enabled or not to a boolean variable
		ActionsList.put("message","msgbox");					//Put the message in to the report
		ActionsList.put("report","msgbox");					//Put the message in to the report
		ActionsList.put("comment","msgbox");					//Put the message in to the report
		ActionsList.put("set context","context");				//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window.
		ActionsList.put("refer to","context");					//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window. 
		ActionsList.put("on page","context");					//Set the context to the page. If multiple windows with the same title, context will be set to the first window. If page title is blank, context will be set to the next window.
		ActionsList.put("run test", "callaction");				//Use if any testscript has to be called from another Test Script
		ActionsList.put("run action", "callfunction");			//Run another testcase with in the project
		ActionsList.put("call action", "callfunction");		//Run another testcase with in the project 
		ActionsList.put("run function", "callfunction");		//run a predefined known function
		ActionsList.put("call function", "callfunction");		//run a predefined known function
		ActionsList.put("click to download","download");		//Click a link to download the file 	
		ActionsList.put("download","download");		 		//Click a link to download the file
		ActionsList.put("upload","upload");		 			//Upload a file
		ActionsList.put("upload","upload");		 			//close upload dialog
		ActionsList.put("upload","upload");		 			//cancel upload dialog
		ActionsList.put("exract from db","fetchdb");			//SQL query will get execute . And result set is copied to Excel file in current working dir.
		ActionsList.put("fetchdb","fetchdb");					//SQL query will get execute . And result set is copied to Excel file in current working dir.
	}

	public static String FindKeyword(LocalTC Vars, String TestStep) {
		Set<String> Keys = ActionsList.keySet();
		for (String word : Keys) {
			if (TestStep.toLowerCase().contains(word)) {
				//ActionsList.get(word);
				Translate(Vars,TestStep, word, ActionsList.get(word));
			}
		}
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
	private static void Translate(LocalTC Vars, String TestStep, String Keyword, String KeyValue) {

		switch (KeyValue) {

		case "loop":
			/*
			 * so i would write strat loop 4 times, loop 4 times, loop 4
			 */
			Vars.setAction(KeyValue);
			Vars.setTestdata("");
			Vars.setObjProp("");
			Vars.setEvent("");
			Pattern p = Pattern.compile("[0-9]+");
			Matcher m = p.matcher(TestStep);
			while (m.find()) {
				Vars.setObj(m.group());
				break;
			}
			break;
		case "endloop":
			Vars.setAction(KeyValue);
			Vars.setTestdata("");
			Vars.setObjProp("");
			Vars.setEvent("");
			Pattern pe = Pattern.compile("[0-9]+");
			Matcher me = pe.matcher(TestStep);
			while (me.find()) {
				Vars.setObj(me.group());
				break;
			}
			break;
		case "launchapp":
			/*
			 * Open Browser “URL” Open “URL Navigate to “URL”
			 */

			String actLaunchapp[] = TestStep.split(" ");
			String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
			boolean bUrlFlag = false;
			for (int i = 0; i < actLaunchapp.length; i++) {
				if (IsMatch(actLaunchapp[i], regex)) {
					Vars.setObjProp(actLaunchapp[i]); // objProp="URL"
					bUrlFlag = true;
					break;
				}
			}
			if (!bUrlFlag)
				Vars.setObjProp(Vars.getURL());
			Vars.setAction(KeyValue);
			Vars.setObj(Vars.getbrowsername());
			Vars.setEvent(Vars.getEvent());
			Vars.setTestdata(Vars.getTestdata());
			break;
		case "close":
			Vars.setAction(KeyValue);
			Vars.setObj(Vars.getbrowsername());
			Vars.setObjProp(Vars.getURL());
			Vars.setEvent("");
			Vars.setTestdata("");
			break;
		case "wait":
			TestStep = TestStep.replace("wait", "");
			TestStep = TestStep.replace("sleep", "");
			TestStep = TestStep.replace("for", "");
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
		case "condition":
			// condition #test=#test1
			// condition #test not equals #test1
			/*
			 * != or <> or not equals, > or greater than, < or less than
			 */
			TestStep = TestStep.replace(Keyword, "");
			Vars.setAction(KeyValue);
			String word = TestStep.substring(0, TestStep.indexOf(" "));
			Vars.setObj(word);
			TestStep = TestStep.replace(word, "");
			Vars.setEvent(TestStep.substring(TestStep.indexOf("#")).trim());
			Vars.setObjProp(TestStep.substring(0, TestStep.indexOf("#")).trim());
			Vars.setTestdata("");

			break;
		case "endcondition":
			TestStep = TestStep.replace(Keyword, "");
			Vars.setAction(KeyValue);
			String word1 = TestStep.substring(0, TestStep.indexOf(" "));
			Vars.setObj(word1);
			TestStep = TestStep.replace(word1, "");
			Vars.setEvent(TestStep.substring(TestStep.indexOf("#")).trim());
			Vars.setObjProp(TestStep.substring(0, TestStep.indexOf("#")).trim());
			Vars.setTestdata("");
			break;
		/*
		 * case "screencaptureoption": break;
		 */
		case "importdata":
			// import data "c:\data.xls"
			TestStep = TestStep.replace(Keyword, "");
			Vars.setAction(KeyValue);
			Vars.setObj(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
			Vars.setObjProp("");
			Vars.setTestdata("");
			Vars.setEvent("");
			break;
		case "fetchdb":
			break;
		case "comparedbcell":
			break;
		case "screencapture":
			Vars.setAction(KeyValue);
			Vars.setObj("");
			Vars.setObjProp("");
			Vars.setTestdata("");
			Vars.setEvent("");
			break;
		case "context":
			break;
		case "check":
			// "check visible", "check enable","check text","check link
			// text","check value","check if checked","check page title", "check
			// table row count", "check table column count"
			try {
				switch (Keyword) {
				case "check visible":
					// check visible textbox obj=usename
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					String beforeCheck = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					if (null != beforeCheck)
						Vars.setObj(beforeCheck);
					else
						Vars.setObj("textbox");
					Vars.setEvent("visible");
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}

					break;
				case "check enable":
					// check enable webelement obj=username
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					String beforeCheckEnable = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					if (null != beforeCheckEnable)
						Vars.setObj(beforeCheckEnable);
					else
						Vars.setObj("textbox");
					Vars.setEvent("enable");
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check text":
					// check text in textbox as "sayemul.makki"
					// check text textbox obj=usename
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					Vars.setObj("textbox");
					Vars.setEvent("check");
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check link text":
					// check link text in textbox as "sayemul.makki"
					// check link text textbox obj=usename
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					Vars.setObj("textbox");
					Vars.setEvent("check");
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check value":
					// check value textbox obj=usename
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					Vars.setObj("textbox");
					Vars.setEvent("check");
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check if checked":
					// check if checked checkbox obj=usename
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					Vars.setEvent("check");
					String beforeClickC = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					if (null != beforeClickC)
						Vars.setObj(beforeClickC);
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check page title":
					// check page title obj=username
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					Vars.setEvent("check");
					String beforeClickP = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					if (null != beforeClickP)
						Vars.setObj(beforeClickP);
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check table row count":
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					Vars.setEvent("count");
					String beforeClickR = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					if (null != beforeClickR)
						Vars.setObj(beforeClickR);
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check table column count":
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(KeyValue);
					Vars.setEvent("count");
					String beforeClickCl = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					if (null != beforeClickCl)
						Vars.setObj(beforeClickCl);
					if (TestStep.contains("\"")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("\"") + 1, TestStep.indexOf("\"")).trim());
					} else
						Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				}
			} catch (Exception e) {
				Log.info("Error occured due to" + e.getMessage());
			}
			break;
		case "storevalue":
			try {
				switch (Keyword) {
				case "store value":
				case "read value":
					/// *read value/store value/store from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #varvalue
					storevalue(Vars, TestStep, Keyword, KeyValue, "value");
					break;
				case "read text":
				case "store text":
					/// *read text/store text from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #vartext
					storevalue(Vars, TestStep, Keyword, KeyValue, "text");
					break;
				case "read visible":
				case "store visible":
					/// * read visible/store visible from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #varvisible
					storevalue(Vars, TestStep, Keyword, KeyValue, "visible");
					break;
				case "read enable":
				case "store enable":
					/// *read enable/store enable from <TextBox/ CheckBox/
					/// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					/// Table/ListBox/element> obj=Objprop in #varenable
					storevalue(Vars, TestStep, Keyword, KeyValue, "enable");
					break;
				case "read link text":
				case "store link text":
					// read link text/store link text from <TextBox/ CheckBox/
					// RadioButton/ Button/ Link/ ComboBox/ TextArea/ Image/
					// Table/ListBox/element> obj=Objprop in #varvisible
					storevalue(Vars, TestStep, Keyword, KeyValue, "enable");
					break;
				case "read page title":
					/// *read page title in #pagetitle
					TestStep = TestStep.replace(Keyword, "").trim();
					Vars.setAction(KeyValue);
					Vars.setEvent("getproperty");
					Vars.setObj("page");
					Vars.setObjProp("pagetitle");
					if (TestStep.contains("#")) {
						Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
					}
					break;
				case "page title":
					// page title "xyz"/#title exist in #pagetitle
					TestStep = TestStep.replace(Keyword, "").trim();
					Vars.setAction(KeyValue);
					Vars.setEvent("exist");
					Vars.setObj("page");
					String str[] = TestStep.split(" ");
					Vars.setObjProp(str[0]);
					int length = str.length;
					Vars.setTestdata(str[length - 1]);
					break;
				case "get":
				case "read":
				case "store":
					/*
					 * get/read/store row count for table obj=tablename in #rowcount 
					 * get/read/store col/column count for table obj=tablename in #colcount 
					 * get/read/store data in cell from table obj=tablename in #celldata
					 */

					TestStep = TestStep.replace(Keyword, "").trim();
					Vars.setAction(KeyValue);
					Vars.setObj("table");
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
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=") + 1, TestStep.indexOf(" ")).trim());
					}
					int lengthT = strT.length;
					Vars.setTestdata(strT[lengthT - 1]);
					break;

				}
			} catch (Exception ex) {
				Log.info("Error occured" + ex.getMessage());
			}
			break;
		case "upload":
			break;
		case "download":
			break;
		case "perform":
			try {
				switch (Keyword) {

				case "click":
				case "click on":
					TestStep = TestStep.replace(Keyword, "");
					String beforeClick = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					Vars.setAction(KeyValue);
					Vars.setEvent("click");
					Vars.setTestdata("");
					String actClick[] = TestStep.split(" ");
					if (null != beforeClick) {
						Vars.setObj(beforeClick);
					} else
						Vars.setObj("link");
					for (String strPerform : actClick) {
						if (strPerform.contains("obj=")) {
							Vars.setObjProp(strPerform.substring(4));
							break;
						}
					}

					break;
				case "altclick":
					TestStep = TestStep.replace(Keyword, "");
					String beforeAltclick = TestStep.substring(0, TestStep.indexOf("obj=")).trim();
					Vars.setAction(KeyValue);
					Vars.setEvent("altclick");
					Vars.setTestdata("");
					String actAltclick[] = TestStep.split(" ");
					if (null != beforeAltclick) {
						Vars.setObj(beforeAltclick);
					} else
						Vars.setObj("link");
					for (String strPerform : actAltclick) {
						if (strPerform.contains("obj=")) {
							Vars.setObjProp(strPerform.substring(4));
							break;
						}
					}

					break;
				case "enter":
					// enter in obj=username "sayemul.makki"
					// enter "sayemul.makki" in textbox obj=username
					// enter encrypted "$%RDE867" in obj=password
					// TextBox|ComboBox|TextArea|Image|Frame|iFrame|Table|element
					TestStep = TestStep.replace(Keyword, "");
					String actEnter[] = TestStep.split(" ");
					Vars.setAction(KeyValue);
					Vars.setEvent("set");
					for (String strPerform : actEnter) {
						if (TestStep.contains("encrypted")) {
							String encrypt = TestStep
									.substring(TestStep.indexOf("encrypted") + 1, TestStep.indexOf("obj=")).trim();
							Vars.setTestdata("");
							encrypt = encrypt.replace("\"", "");
							byte[] decodedBytes = Base64.getDecoder().decode(encrypt);
							Vars.setObjProp(new String(decodedBytes));
						} else {
							if (strPerform.contains("obj=")) {
								Vars.setObjProp(strPerform.substring(4));
							}
							if (strPerform.contains("\"")) {
								Vars.setTestdata(strPerform.replace("\"", ""));
							} else
								Vars.setTestdata("");
						}
						if (IsCheck(strPerform) || strPerform.contains("#") || strPerform.contains("dt_")) {
							Vars.setObj(strPerform);
						} else
							Vars.setObj("textbox");
					}

					break;
				case "hover":
				case "hover over":
					// hoverover on image obj=img
					String beforeHover = TestStep.substring(TestStep.indexOf("on"), TestStep.indexOf("obj=")).trim();
					if (TestStep.contains("obj=")) {
						String afterHover = TestStep.substring(TestStep.indexOf("obj=")).trim();
						Vars.setObjProp(afterHover);
					}
					Vars.setAction(KeyValue);
					Vars.setEvent("hover");
					Vars.setTestdata("");

					if (null != beforeHover) {
						Vars.setObj(beforeHover);
					} else
						Vars.setObj("link");

					break;
				case "set text":
					// set text "sayemul.makki" in textbox obj=username
					TestStep = TestStep.replace(Keyword, "");
					String actSet[] = TestStep.split(" ");
					Vars.setObj(actSet[0]);
					Vars.setAction(KeyValue);
					Vars.setEvent("set");
					Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "listselect":
					Vars.setAction(KeyValue);
					Vars.setEvent("listselect");
					Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "select":
					Vars.setAction(KeyValue);
					Vars.setEvent("select");
					Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}
					break;
				case "check":
					// check visible for textbox obj=txtusers
					TestStep = TestStep.replace(Keyword, "");
					Vars.setAction(Keyword);
					String actCheck[] = TestStep.split(" ");
					Vars.setObj(actCheck[2]);
					Vars.setEvent(actCheck[0]);
					Vars.setTestdata("");
					if (TestStep.contains("obj=")) {
						Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=")).trim());
					}

					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			break;
		case "callfunction":
			Vars.setAction(KeyValue);
			TestStep = TestStep.replace(Keyword, "");
			TestStep = TestStep.replace("(", " ");
			TestStep = TestStep.replace(")", " ");
			TestStep = TestStep.replace("with", "");
			TestStep = TestStep.replace("and", ",");
			TestStep = TestStep.trim();
			String actEnter[] = TestStep.split(" ");
			Vars.setObj(actEnter[0]);
			Vars.setObjProp(actEnter[1]);
			break;
		case "callaction":
			break;
		}
	}

	/*
	 * Method for matching the URL
	 */
	private static boolean IsMatch(String url, String pattern) {
		try {
			Pattern patt = Pattern.compile(pattern);
			Matcher matcher = patt.matcher(url);
			return matcher.matches();
		} catch (RuntimeException e) {
			return false;
		}
	}

	/*
	 * Method for checking object
	 */
	private static boolean IsCheck(String pattern) {
		// TextBox|ComboBox|TextArea|Image|Frame|iFrame|Table|element
		// TextBox/ CheckBox/ RadioButton/ Button/ Link/ ComboBox/ TextArea/
		// Image/ Table/ListBox/element
		boolean bFlag = false;
		switch (pattern) {
		case "TextBox":
			bFlag = true;
			break;
		case "ComboBox":
			bFlag = true;
			break;
		case "TextArea":
			bFlag = true;
			break;
		case "Image":
			bFlag = true;
			break;
		case "Frame":
			bFlag = true;
			break;
		case "iFrame":
			bFlag = true;
			break;
		case "Table":
			bFlag = true;
			break;
		case "element":
			bFlag = true;
			break;
		case "CheckBox":
			bFlag = true;
			break;
		case "RadioButton":
			bFlag = true;
			break;
		case "Button":
			bFlag = true;
			break;
		case "ListBox":
			bFlag = true;
			break;
		default:
			bFlag = false;
			break;
		}
		return bFlag;
	}

	/*
	 * Method for storevalue
	 */
	public static void storevalue(LocalTC Vars, String TestStep, String Keyword, String KeyValue, String event) {
		TestStep = TestStep.replace(Keyword, "").trim();
		TestStep = TestStep.replace("from", "").trim();
		Vars.setAction(KeyValue);
		Vars.setEvent(event);
		if (TestStep.contains("obj=")) {
			Vars.setObjProp(TestStep.substring(TestStep.indexOf("obj=") + 1, TestStep.indexOf(" ")).trim());
		}
		if (TestStep.contains("#")) {
			Vars.setTestdata(TestStep.substring(TestStep.indexOf("#")).trim());
		} else
			Vars.setTestdata("");
		String obj = TestStep.substring(0, TestStep.indexOf("obj")).trim();
		if (IsCheck(obj)) {
			Vars.setObj(obj);
		} else
			Vars.setObj("");
	}

}