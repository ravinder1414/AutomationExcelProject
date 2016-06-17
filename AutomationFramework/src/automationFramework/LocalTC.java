package automationFramework;

import java.io.BufferedWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebElement;

import ObjectMap.OR;
import utility.ExcelUtils;

public class LocalTC {
	/*************Database connection variables****************/
	public String database;
	public String host_name;
	public String Varshost_name; //store IP address of DB host name
	public String portnumber;
	public String schemaname;
	public String username;
	public String password;
	public String sqlquery;
	public Connection con;
	public Statement stmt;
	public ResultSet rs;
	public String update=null;
	public boolean captureperform;
	public boolean capturestorevalue;
	public boolean capturecheckvalue;
	public ExcelUtils TestRun;
	public ExcelUtils TestData;
	public ExcelUtils DTsheet;
	public WebElement elem;
	public OR obj;
	public int row;
	public int objFoundFlag;
	public String sTestStep;
	public BufferedWriter bw;
	public BufferedWriter bw1;
	public int reporttype;
	public String ORvalname;
	public String ORvalue;
	public String exeStatus;
	public Map<String, String> map;
	public int iflag = 0;
	public TranslateEngine Translate;
	public String ExecutionStatus;
	public String ActualResult;
	public String TestCaseStatus;
	/**********************************************************/
	
	/************Excel Connection Variables********************/
	
	static XSSFSheet ws;
	boolean isinvaliddb = false;
	boolean isconnected =false;	
	/**********************************************************/
	
	/************************SpiraTestReader*******************/
	String[][][] SpiraTestSteps;
	String TestSetName;
	String TestCaseName;
	String TestStep;
	String Expected;
	String SampleData;
	int TestStepID;
	ArrayList<Integer> TCID_list;
	String TestRunStatus;
	public String getTestCaseName()	{
		return TestCaseName;
	}
	public void setTestCaseName(String act)	{
		TestCaseName = act;
	}
	public String getTestStep()	{
		return TestStep;
	}
	public void setTestStep(String act)	{
		TestStep = act;
	}
	public String getTestSetName()	{
		return TestSetName;
	}
	public void setTestSetName(String act)	{
		TestSetName = act;
	}
	public String getSampleData()	{
		return SampleData;
	}
	public void setSampleData(String act)	{
		SampleData = act;
	}
	public String getExpected()	{
		return Expected;
	}
	public void setExpected(String act)	{
		Expected = act;
	}
	public int getTestStepID()	{
		return TestStepID;
	}
	public void setTestStepID(int act)	{
		TestStepID = act;
	}
	public String getTestRunStatus()	{
		return TestRunStatus;
	}
	public void setTestRunStatus(String act)	{
		TestRunStatus = act;
	}
	public ArrayList<Integer> getTCID_list()	{
		return TCID_list;
	}
	public void setTCID_list(int act)	{
		TCID_list.add(act);
	}
	/**********************************************************/
	
	/*********Translated Object********************************/
	String Action;
	String Obj;
	String ObjProp;
	String Event;
	String Testdata;	
	String ExecutionResult;
	public String ResultStatus="Failed";
	ArrayList<String> ResultsStatus = new ArrayList<>();
	/**********************************************************/
	public String getAction()	{
		return Action;
	}
	public String getObj()	{
		return Obj;
	}
	public String getObjProp()	{
		return ObjProp;
	}
	public String getEvent()	{
		return Event;
	}
	public String getTestdata()	{
		return Testdata;
	}
	public String getExecutionResult()	{
		return ExecutionResult;
	}
	public void setExecutionResult(String act)	{
		if(act=="")
			ExecutionResult ="";
		else
			ExecutionResult = ExecutionResult + act + "//n";
	}
	public void setAction(String act)	{
		Action = act;
	}
	public void setObj(String obje)	{
		Obj = obje;
	}
	public void setObjProp(String prop)	{
		ObjProp = prop;
	}
	public void setEvent(String eve)	{
		Event = eve;
	}
	public void setTestdata(String td)	{
		Testdata =  td;
	}
	
	
	/*******Ignite Arguments from Spire or Commandline*********/
	int iProjectID;
	int iReleaseID;
	int iTestSetID;
	int iTestCaseID;
	String sTestRunPath;
	boolean fIntegration;
	/***********************************************************/

	/*************Framework Execution Variables*****************/
	String browsername;
	String URL;
	String browserver;
	public String getbrowsername()	{
		return browsername;
	}
	public String getURL()	{
		return URL;
	}
	public void setURL(String sURL)	{
		URL = sURL;
	}
	public void setbrosername(String sBrowseName)	{
		browsername = sBrowseName;
	}
	public void setBrowserVer(String BV)	{
		browserver = BV;
	}
	public String getBrowserVer()	{
		return browserver;
	}
	/***********************************************************/
	
	public LocalTC(String ProjectID,String ReleaseID,String TestSetID,String TestCaseID,String TestRunPath,String Integration) {
		iProjectID = Integer.parseInt(ProjectID) ;
		iReleaseID =Integer.parseInt(ReleaseID) ;
		iTestSetID = Integer.parseInt(TestSetID) ;;
		iTestCaseID = Integer.parseInt(TestCaseID) ;;
		sTestRunPath = TestRunPath;
		TestCaseName = "";
		TestStep = "";
		Expected = "";
		SampleData = "";
		TestStepID = 0;
		ScreenshotTypeFlag = 0;
		TestRunStatus = "";
		fIntegration = Boolean.parseBoolean(Integration);
		browsername = "Firefox";
		URL = "https://test.salesforce.com/";
		TCID_list = new ArrayList<Integer>(500);
		reporttype = 0;
		exeStatus = "True";
		capturestorevalue =true;
		capturecheckvalue = true;
		objFoundFlag =0;
		captureperform = true;
		map = new HashMap<String, String>();
		ActualResult = "";
	}
	public int getProjectID()	{
		return this.iProjectID;
	}
	public int getReleaseID()	{
		return this.iReleaseID;
	}
	public int getTestSetID()	{
		return this.iTestSetID;
	}
	public void setTestSetID(int tsid)	{
		iTestSetID = tsid;
	}
	public int getTestCaseID()	{
		return this.iTestCaseID;
	}
	public void setTestCaseID(int tcid)	{
		iTestCaseID = tcid;
	}
	public String getTestRunPath()	{
		return this.sTestRunPath;
	}
	public boolean getIntegration()	{
		return this.fIntegration;
	}
	
	/************************************Framework Variables**********************************/
	String strResultPath;
	String DetailReport;
	String ScreenShotReport;
	int ScreenshotTypeFlag;
	String globalCompName;
	public String getstrResultPath() {
		return strResultPath;
	}
	public void setstrResultPath(String strpath)	{
		strResultPath = strpath;
	}
	public String getDetailReport()	{
		return DetailReport;
	}
	public void setDetailReport(String strpath)	{
		DetailReport = strpath;
	}
	public int getScreenshotTypeFlag()	{
		return ScreenshotTypeFlag;
	}
	public void setScreenshotTypeFlag(int strpath)	{
		ScreenshotTypeFlag = strpath;
	}
	public String getScreenShotReport()	{
		return ScreenShotReport;
	}
	public void setScreenShotReport(String strpath)	{
		ScreenShotReport = strpath;
	}
	public String getglobalCompName()	{
		return globalCompName;
	}
	public void setglobalCompName(String strpath)	{
		globalCompName = strpath;
	}
	public String getActualResult() {
		return ActualResult;
	}
	public void setActualResult(String actualResult) {
		ActualResult = actualResult;
	}
	public String getResultStatus() {
		return ResultStatus;
	}
	public void setResultStatus(String resultStatus) {
		ResultStatus = resultStatus;
	}
	public ArrayList<String> getResultsStatus() {
		return ResultsStatus;
	}
	public void setResultsStatus(ArrayList<String> resultsStatus) {
		ResultsStatus = resultsStatus;
	}
}
