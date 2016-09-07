package automationFramework;

import java.io.BufferedWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ObjectMap.OR;
import utility.Constant;
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
	public By Locator;
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
	public int passed = 0;
	public int failed = 0;
	public int caution = 0;
	public int blocked = 0;
	public int notrun = 0;
	public int act;
	public int objFoundFlag;
	public int testcasestart;
	public String sTestStep;
	public BufferedWriter bw;
	public BufferedWriter bw1;
	public int reporttype;
	public String ORvalname;
	public String ORvalue;
	public String exeStatus;
	public Map<String, String> map;
	public Map<String, String> Browsers;
	public Map<String, String> Env;
	public int iflag = 0;
	public TranslateEngine Translate;
	public String ExecutionStatus;
	public String ActualResult;
	public String TestCaseStatus;
	public boolean conditionSkip;
	public int today;
	public String filenamer;
	///////////////////////////////Running loop//////////////////////////////////////////////////////////////
	public int loopsize = -1;                   //Counter for the loops/nested loops been placed 
	public int[] loopstart = new int[1];        //Record index of the looptestcase array for loop start point
	public int[] loopcount = new int[1];        //How many times to execute current loop 
	public int[] loopend = new int[1];          //Record index of the looptestcase array for loop end point
	public int[] loopcnt = new int[1];          //Record how many nested loops are in progress
	public int[] dtrownumloop = new int[1];     //Data table row number for the current loop 
	public String[] loopTestCases = new String[1];              //Holds test actions for loop and nested loop
	public String[] loopTestStepID = new String[1];                //Holds test step for loop and nested loop
	public int startrow = -1;                    //Counter for recording steps been addded to array comes in loop
	public int dtrownum = 1;					//Not Used
	public int loopnum = -1;                     //Loops number running   
	public int rowcnt;                          //Not Used
	public String[] loopTestData = new String[1];           //Holds TestData sheet for each loop 
	public int loopflag = 0;  //record start of the loop keyword stays on until execution of all steps in loop
	public String RunTestCase="";
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	public int executionCount = 0;
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
			ExecutionResult = ExecutionResult + act ;
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
	public String sTestRunPath;
	boolean fIntegration;
	/***********************************************************/

	/*************Framework Execution Variables*****************/
	String browsername;
	String URL;
	String browserver;
	String executionStartTime;
	String executionEndTime;
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
	public String getExecutionStartTime() {
		return executionStartTime;
	}
	public void setExecutionStartTime(String executionStartTime) {
		this.executionStartTime = executionStartTime;
	}
	public String getExecutionEndTime() {
		return executionEndTime;
	}
	public void setExecutionEndTime(String executionEndTime) {
		this.executionEndTime = executionEndTime;
	}
	/***********************************************************/
	
	public LocalTC(String ProjectID,String ReleaseID,String TestSetID,String TestCaseID,String TestRunPath,String Integration) {
		iProjectID = Integer.parseInt(ProjectID) ;
		iReleaseID =Integer.parseInt(ReleaseID) ;
		//iTestSetID = Integer.parseInt(TestSetID) ;
		Constant.tempTestReportPath = TestSetID;
		if (! (Constant.tempTestReportPath.endsWith("//") || Constant.tempTestReportPath.endsWith("\\")))
			Constant.tempTestReportPath = Constant.tempTestReportPath + "//";
		Constant.ieDriverPath = Constant.tempTestReportPath + Constant.ieDriverPath;
		Constant.chromeDriverPath = Constant.tempTestReportPath + Constant.chromeDriverPath;
		Constant.Path_TestData = Constant.tempTestReportPath + Constant.Path_TestData;  
		Constant.Path_ScreenShot=Constant.tempTestReportPath +Constant.Path_ScreenShot;
		Constant.File_DownloadPath=TestSetID;
		iTestCaseID = Integer.parseInt(TestCaseID) ;
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
		URL = Constant.URL;
		TCID_list = new ArrayList<Integer>(500);
		reporttype = 0;
		exeStatus = "True";
		conditionSkip = false;
		capturestorevalue =true;
		capturecheckvalue = true;
		objFoundFlag =0;
		passed = 0;
		failed = 0;
		captureperform = true;
		startrow = -1;
		map = new HashMap<String, String>();
		ActualResult = "";
		ExecutionStatus ="";
		TestCaseStatus ="Passed"; 
		Browsers = new LinkedHashMap<String, String>();
		Env = new LinkedHashMap<String, String>();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		map.put("current_date", sdf.format(date));
		map.put("currentdate", sdf.format(date));
		map.put("random_number",Randomnumber());
		Browsers.put("483", "Firefox");
		Browsers.put("484", "IE");
		Browsers.put("485", "Chrome");
		Browsers.put("512", "IE");
		Browsers.put("514", "Firefox");
		Browsers.put("513", "Chrome");
		Env.put("481", "https://cms6.test.evolution-system.com");
		Env.put("482", "https://cms2.test.evolution-system.com");
		Env.put("480", "https://cms5.test.evolution-system.com");
		Env.put("515", "https://cms6.test.evolution-system.com");
		Env.put("516", "https://cms2.test.evolution-system.com");
		Env.put("517", "https://cms5.test.evolution-system.com");
		Env.put("518", "https://cms1.test.evolution-system.com");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String strTimeStamp = dateFormat.format(new Date());
		String[] dateArray = strTimeStamp.split("-");
		today = Integer.parseInt(dateArray[2]);
		loopstart[0] = 0;        //Record index of the looptestcase array for loop start point
		loopcount[0] = 0;        //How many times to execute current loop 
		loopend[0] = 0;          //Record index of the looptestcase array for loop end point
		loopcnt[0] = 0;          //Record how many nested loops are in progress
		dtrownumloop[0] = 0;     //Data table row number for the current loop 
		loopTestCases[0] = "";              //Holds test actions for loop and nested loop
		loopTestStepID[0] = "";                //Holds test step for loop and nested loop
		loopTestData[0]= "";  
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
	List<ReporterObject> reporterObjectList = new ArrayList<>();
	public List<ReporterSummaryObject> reporterSumObjList = new ArrayList<>();
	String res_type;
	String exceptionVar;
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
	public String getExecutionStatus() {
		return ExecutionStatus;
	}
	public void setExecutionStatus(String executionStatus) {
		ExecutionStatus = executionStatus;
	}
	public String getTestCaseStatus() {
		return TestCaseStatus;
	}
	public void setTestCaseStatus(String testCaseStatus) {
		TestCaseStatus = testCaseStatus;
	}
	/////////////////////Date picker////////////////////////////////////////
	private String[] envprevMonth1={"prev","Prev"}; // Specify a class name through which the framework can identify the image representing the previous month
	private String[] envnextMonth1={"next","Next"};// Specify a class name through which the framework can identify the image representing the next month
	private String[] envtitleMonth={"month"};// Specify a class name through which we can identify the title month element in calendar control element
	private String[] envtitleYear={"year"};// Specify a class name through which we can identify the title year element in calendar control element
	public String[] getEnvnextMonth1() {
		return envnextMonth1;
	}
	public void setEnvnextMonth1(String[] envnextMonth1) {
		this.envnextMonth1 = envnextMonth1;
	}
	public String[] getEnvprevMonth1() {
		return envprevMonth1;
	}
	public void setEnvprevMonth1(String[] envprevMonth1) {
		this.envprevMonth1 = envprevMonth1;
	}
	public String[] getEnvtitleMonth() {
		return envtitleMonth;
	}
	public void setEnvtitleMonth(String[] envtitleMonth) {
		this.envtitleMonth = envtitleMonth;
	}
	public String[] getEnvtitleYear() {
		return envtitleYear;
	}
	public void setEnvtitleYear(String[] envtitleYear) {
		this.envtitleYear = envtitleYear;
	}
	public String Randomnumber(){
		Random rnd = new Random();
		return ((1 + rnd.nextInt(999))+"");
	}
	public String getRes_type() {
		return res_type;
	}
	public void setRes_type(String res_type) {
		this.res_type = res_type;
	}
	public String getExceptionVar() {
		return exceptionVar;
	}
	public void setExceptionVar(String exceptionVar) {
		this.exceptionVar = exceptionVar;
	}
	public int getExecutionCount() {
		return executionCount;
	}
	public void setExecutionCount(int executionCount) {
		this.executionCount = executionCount;
	}
}
