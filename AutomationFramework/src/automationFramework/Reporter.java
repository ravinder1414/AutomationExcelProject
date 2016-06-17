package automationFramework;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import utility.Constant;

public class Reporter {
	/**************************************************************************************************************
	 * Function=update_Report
	 * Description=This function is used to update the report.
	 /****************************************************************************************************************
	 */

	public static void ReportEvent(String Res_type) throws IOException {
		try {
			String TestStepID = Constant.Vars.getTestStepID() + "-" + Constant.Vars.row;
			String Action =Constant.Vars.getAction(); 
			String cCellData = Constant.Vars.getObj() + " " + Constant.Vars.getObjProp();
			String dCellData = Constant.Vars.getEvent() + " " + Constant.Vars.getTestdata();
			String comments = Constant.Vars.sTestStep;
			String globalCompName = Constant.Vars.getObj();
			int conditionline = Constant.Vars.row;
			String str_time;
			// String[] str_rep = new String[2];
			Date exec_time = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			str_time = dateFormat.format(exec_time);

			String exeStatus;
			if (Res_type.startsWith(Constant.Executed)) {
				Constant.Vars.bw.write("<TR COLS=6>"
						+ "<TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID //teststepid
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action  //Constant.Vars.action 
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData //Constant.Vars.obj = Constant.Vars.objprop
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData //Constant.Vars.events = Constant.Vars.Tesdata
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments  //TestStep SpiraTest
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time  //Execution Time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
						+ "Passed" + "</FONT></TD></TR>");
			} else if (Res_type.startsWith(Constant.Failed)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");

			} else if (Res_type.startsWith(Constant.NoWindowFound)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Fail" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number: "
						+ TestStepID
						+ ". Description: The Window not Found</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Loop)) {

				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=BLUE><div align=left></FONT><FONT FACE=VERDANA SIZE=2 COLOR = BLUE>"
						+ Res_type + "</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Callactionstart)) {

				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=BLUE><div align=left></FONT><FONT FACE=VERDANA SIZE=2 COLOR = BLUE>"
						+ " Start of CallAction : '"
						+ globalCompName
						+ "' execution" + "</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Callactionend)) {

				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=BLUE><div align=left></FONT><FONT FACE=VERDANA SIZE=2 COLOR = BLUE>"
						+ " End of CallAction : '"
						+ globalCompName
						+ "' execution" + "</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Callactionfnf)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Fail" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number: "
						+ TestStepID
						+ ". Description: The Action(TestScript) name given is not available in the given path. Check the file path and action name.</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Callactionff)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Fail" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number: "
						+ TestStepID
						+ ". Description: The Action(TestScript) format is not in supported. Give the file name with xlsx extension only.</div></th></FONT></TR>");
			}

			else if (Res_type.startsWith(Constant.Missing)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = ORANGE>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number "
						+ TestStepID
						+ ".Description: The Datatable column name not found</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.ObjectLocator)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = ORANGE>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number "
						+ TestStepID
						+ ". Description: Object Locator is wrong or not supported. Supported Locators are Id,Name,Xpath& CSS</div></th></FONT></TR>");
			}

			else if (Res_type.startsWith(Constant.TooManyArguments)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED >"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "WARNING" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>WARNING @ Line NO:  "
						+ TestStepID
						+ ". Pass only one argument if you are using data or environment variables. Otherwise only the first variable will be considered</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.NoBlankAvailable)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED >"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error @ Line NO:  "
						+ TestStepID
						+ ". No Blank Value is available in the Element</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.ObjectNotFound)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in test step number "
						+ TestStepID
						+ ". Object with the given object name is not found in objectrepository</div></th></FONT></TR>");

			} else if (Res_type.startsWith(Constant.Keyword)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ Action
						+ ": Keyword not supported by Ignite</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Nodatatable)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Data table not available, Ensure whether you have imported the right Data Table.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Action)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ dCellData
						+ " : Action not supported by Ignite</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Action1)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ dCellData
						+ " : The action is not supported for this type of object</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Objectmiss)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number "
						+ TestStepID
						+ ".Object not found in the page</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Property)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Property not supported by Ignite</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Property1)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Property not supported for this kind of object</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.CondFailed)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ (conditionline + 1)
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = ORANGE>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Condition Failed. Statements within the condition and End Condition will not be executed</div></th></FONT></TR>");

			} else if (Res_type.equalsIgnoreCase(Constant.Invaliddate1)) {

				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Invalid date has been given. Give the proper date format(It should be mm-dd-yyyy format) for a valid date in test script.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Invaliddate)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Given Date cannot be set. Check the date is valid and in allowed range</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Prevmonth)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Element releated to the previous month is not identified in the page. Try with different idenfication class by adding the same in setting.java.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Nextmonth)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Element releated to the next month is not identified in the page. Try with different idenfication class by adding the same in setting.java.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Titlemonth)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Element releated to the title month is not identified in the page. Try with different idenfication class by adding the same in setting.java.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Titleyear)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Element releated to the titleyear is not identified in the page. Try with different idenfication class by adding the same in setting.java.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Titledefault)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Element releated to the title year and month  is not identified in the page. Try with different idenfication class by adding the same in setting.java.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Monthnotidentified)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Month in the calendar is not identified. English and Japanese character set are supported.</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Invalidmonth)) {
				// System.out.println("fixed");

				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Given month is invalid. Correct the month and retry.</div></th></FONT></TR>");

			} else if (Res_type.equalsIgnoreCase(Constant.FilePathNotFound)) {

				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Given file does not exist.Check the File path and File Name.</div></th></FONT></TR>");

			} else if (Res_type.equalsIgnoreCase(Constant.FilePathNotFound1)) {

				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Given file path does not exist.Check the File path.</div></th></FONT></TR>");

			} else if (Res_type.equalsIgnoreCase(Constant.FilePathNotFound2)) {

				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "FilePath is not Given.Give a valid file path</div></th></FONT></TR>");

			} else if (Res_type.equalsIgnoreCase(Constant.Calendaraction)) {

				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "For SetDate Operation ObjectType Should be calendar and Object Name should start with cal_</div></th></FONT></TR>");
			} else if (Res_type.equalsIgnoreCase(Constant.Userdefined)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Function is not executed. Error exists in  User Defined function. Correct the User Defined Function</div></th></FONT></TR>");
			}

			else if (Res_type.equalsIgnoreCase(Constant.Getcelldata)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Invalid Syntax for getcelldata. Pass Exact number of arguments</div></th></FONT></TR>");
			}
			else if (Res_type.equalsIgnoreCase(Constant.Nofetchdata)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Invalid Syntax for Excelfile.  Data can be exported to only .xlsx file</div></th></FONT></TR>");
			}else if (Res_type.equalsIgnoreCase(Constant.NoColumnFound)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "NO Column found in Data Sheet-which mentioned as dt_XXX; Please verify your Data sheet and column</div></th></FONT></TR>");
			}else if (Res_type.equalsIgnoreCase(Constant.NoMatchinDataTable)) {

				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "NO Matching text found in Data Sheet- for table element which you mentioned in script; </div></th></FONT></TR>");
			}
			else if (Res_type.equalsIgnoreCase(Constant.ObjectNotFound)) {
				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Object details you mentioned in c column of script file, dosen't match with the Object repository </div></th></FONT></TR>");
			}else if (Res_type.equalsIgnoreCase(Constant.InvalidQuery)) {

				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Given Query is not Valid , Please enter correct Select query </div></th></FONT></TR>");
			}else if (Res_type.equalsIgnoreCase(Constant.InvalidConnection)) {

				exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number. "
						+ TestStepID
						+ ". "
						+ "Not able to Connect to Given Data base, please check the coneection parameters or appropriate Jar files are uploaded </div></th></FONT></TR>");
			}

		} catch (Exception e1) {
			System.out
			.println("Report will not be printed. Check the file path.  "
					+ e1);
		}
	}



	/**************************************************************************************************************
	 * Function=update_Report
	 * Description=This function is used to update report only for fail test cases with screenshort.
	 /****************************************************************************************************************
	 */

	public static void ReportEvent(String Res_type,Exception e)	throws IOException {
		try {
			
			String TestStepID = Constant.Vars.getTestStepID() + "-" + Constant.Vars.row;
			String Action =Constant.Vars.getAction(); 
			String cCellData = Constant.Vars.getObj() + " " + Constant.Vars.getObjProp();
			String dCellData = Constant.Vars.getEvent() + " " + Constant.Vars.getTestdata();
			String comments = Constant.Vars.sTestStep;
			String str_time;
			Date exec_time = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			str_time = dateFormat.format(exec_time);

			String exeStatus = "Failed";
			if (Res_type.startsWith(Constant.Failed)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left></FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ e.toString().substring(
								e.toString().indexOf(":") + 1,
								e.toString().indexOf(".",
										e.toString().indexOf(":") + 1) + 1)
						+ "</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Keyword)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number "
						+ TestStepID
						+ ". Description: Keyword not supported by Open2Test</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Screenshot)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"

						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ dCellData
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in  test step number "
						+ TestStepID
						+ ". Screenshot not printed</div></th></FONT></TR>");
			}
		} catch (Exception e4) {
			System.out
			.println("Report will not be printed. Check the file path."
					+ e4);
		}

	}

	public static void ReportEvent(String Res_type, String ObjectSet,
			String ObjectSetVal) throws IOException // for Adding the values
	// instead variable names in
	// the report
	{
		String TestStepID = Constant.Vars.getTestStepID() + "-" + Constant.Vars.row;
		String Action =Constant.Vars.getAction(); 
		String cCellData = Constant.Vars.getObj() + " " + Constant.Vars.getObjProp();
		String dCellData = Constant.Vars.getEvent() + " " + Constant.Vars.getTestdata();
		String comments = Constant.Vars.sTestStep;
		String globalCompName = Constant.Vars.getObj();
		int conditionline = Constant.Vars.row;
		try {
			String str_time;
			// String[] str_rep = new String[2];
			Date exec_time = new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			str_time = dateFormat.format(exec_time);
			if (Constant.Vars.reporttype == 1) {
			} else {
			}
			if (Res_type.startsWith(Constant.Executed)
					&& ObjectSet.equalsIgnoreCase(Constant.Page)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ ObjectSet
						+ " ; "
						+ ObjectSetVal
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
						+ "Passed" + "</FONT></TD></TR>");
			} else if (Res_type.startsWith(Constant.Executed)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ ObjectSet
						+ " : "
						+ ObjectSetVal
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = GREEN>"
						+ "Passed" + "</FONT></TD></TR>");
			} else if (Res_type.startsWith(Constant.NoWindowFound)
					&& ObjectSet.equalsIgnoreCase("page")) {
				Constant.Vars.exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ ObjectSet
						+ " ; "
						+ ObjectSetVal
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number: "
						+ TestStepID
						+ ". Description: The Window not Found</div></th></FONT></TR>");
			}

			else if (Res_type.startsWith(Constant.Failed)) {
				Constant.Vars.exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ ObjectSet
						+ " : "
						+ ObjectSetVal
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
			} else if (Res_type.startsWith(Constant.Loop)) {

				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=BLUE><div align=left></FONT><FONT FACE=VERDANA SIZE=2 COLOR = BLUE>"
						+ Res_type + "</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Missing)) {
				Constant.Vars.exeStatus = "Failed";
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ ObjectSet
						+ " : "
						+ ObjectSetVal
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = ORANGE>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number "
						+ TestStepID
						+ ". Description: The Datatable column name not found</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.ObjectLocator)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ ObjectSet
						+ " : "
						+ ObjectSetVal
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = ORANGE>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in Keyword test step number "
						+ TestStepID
						+ ". Description: Object Locator is wrong or not supported. Supported Locators are Id,Name,Xpath& CSS</div></th></FONT></TR>");
			} else if (Res_type.startsWith(Constant.Property)) {
				Constant.Vars.bw.write("<TR COLS=6><TD BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE=VERDANA SIZE=2>"
						+ TestStepID
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=17%><FONT FACE=VERDANA SIZE=2>"
						+ Action
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ cCellData
						+ "</FONT></TD></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ ObjectSet
						+ " : "
						+ ObjectSetVal
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ comments
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2>"
						+ str_time
						+ "</FONT></TD><TD BGCOLOR=#EEEEEE WIDTH=30%><FONT FACE=VERDANA SIZE=2 COLOR = RED>"
						+ "Failed" + "</FONT></TD></TR>");
				Constant.Vars.bw.write("<TR COLS=6><th colspan= 6 BGCOLOR=#EEEEEE WIDTH=5%><FONT FACE='WINGDINGS 2' SIZE=3 COLOR=RED><div align=left>X </FONT><FONT FACE=VERDANA SIZE=2 COLOR = RED>Error Occurred in test step number "
						+ TestStepID
						+ ". This property is not supported by Ignite</div></th></FONT></TR>");
			}

		} catch (Exception e1) {
			System.out
			.println("Report will not be printed. Check the file path."
					+ e1);
		}
	}
	
}
