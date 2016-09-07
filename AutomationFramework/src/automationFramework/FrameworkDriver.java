package automationFramework;
/********************************************************************************************************
 *Project Name		: Ignite Automation framework 
 *Author		    : Bharat Sethi
 *Version	    	: V1.0
 *Date of Creation	: 28-04-2016
 *Date Last modified: 04/05/2016
 *Description       : Getting maximum benefits with minimum effort. This Framework will give ability to increase 
 *					  the efficiency of resources, increase test coverage, and increase the quality and 
 *					  reliability of the software.
 *Functions			: 
 *
@BeforeSuite  - beforeSuite - Configures the log
@BeforeTest   - loadLocally - Load all arguments to the LocalTC object
@BeforeClass  - 
@BeforeMethod - ReadTest    - If Integration is set to true then run a loop to read each step from SpiraReader else from excel
@Test         - StartTest   - Loop through all steps in a test case and send steps string to translator  
@AfterMethod  -
@AfterClass   -
@AfterTest    -
@AfterSuite   -
@DataProvider -
 ********************************************************************************************************
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Import Package Log4j.*
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectMap.OR;
import SpiraTest.SpiraReader;
import utility.BrowserFactory;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class FrameworkDriver
{
	LocalTC Vars;
	SpiraReader SpiraRead;
	int rowCountBw = 0;
	int rowCount = 0;

	/****************************This function is called by TestNG at the start of the test suite
	 * @throws MalformedURLException ***********************/
	@BeforeSuite
	public void beforeSuite() throws MalformedURLException {
		Log.info("beforeSuite : Strating Project Test Execution" );
		SpiraRead = new SpiraReader();
	}

	/*************This function is called by TestNG at the start of the test by loading all arguments to object
	 * @throws Exception ********/
	@Parameters({"ProjectID","ReleaseID","TestSetID","TestCaseID","TestRunPath","Integration"})
	@BeforeTest
	public void loadLocally(String ProjectID,String ReleaseID,String TestSetID,String TestCaseID,String TestRunPath,String Integration) throws Exception
	{
		Vars = new LocalTC(ProjectID,ReleaseID,TestSetID,TestCaseID,TestRunPath,Integration);
		Log.info("loadLocally : Running test for Project ID " +  Vars.getProjectID());
		if (Vars.getIntegration() == false)
			Log.startTestSet("loadLocally : Starting to execute Test Set " + TestSetID + " and Test Case " + TestCaseID);
	}
	/****************************Initiate the 
	 * 
	 * @throws Exception
	 */
	@BeforeMethod //initiate the browser of a particular type (ie/firefox/chrome)
	public void init() throws Exception
	{		
		Vars.Translate = new TranslateEngine();
		Vars.TestRun = new ExcelUtils();
		Vars.TestData = new ExcelUtils();
		if (Vars.getIntegration() == false){
			//Create test run for the test set this has to be called for each set in release
			//SpiraRead.CreateTestRun(Vars);  
			Vars.TestRun.setExcelFile(Vars.getTestRunPath(),"Test Runs");
			Log.info("init : test case excel opened");
			Log.info("init: It is start of test execution");
		}
		Vars.obj =new OR("ObjectRepository/OR.Properties");
		if (Vars.getIntegration() == true){
			//Create test run for the test set this has to be called for each set in release
			//SpiraRead.CreateTestRun(Vars);  
		}
	}

	@Test 
	public void StartTest() throws Exception 
	{
		//if set to false open the excel file from TestRunPath sample added in TestData package
		//loop through the excel or SpiraTest for all the test cases in the given Set
		//KeywordLibrary.CreateReport(Vars,"s");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Vars.setExecutionStartTime(dateFormat.format(new Date()));
		ReporterSummaryObject reportSumObj = null;
		if(Vars.getIntegration()==false)
		{
			/*Vars.TestRun.setExcelFile(Vars.getTestRunPath(), "Test Runs");
			Log.info("StartTest : Test Run Excel sheet opened");*/
			int retRowCount=Vars.TestRun.getRowCount();
			//Loop through all rows test step, expected, test step id and sample data from excel and
			for(int rowItr=2;rowItr<retRowCount;rowItr++)
			{    
				//Reset execution result
				Vars.row = rowItr-2;
				if(Vars.testcasestart !=0 && null != Vars.TestRun.getCellData(rowItr, 1) && !Vars.TestRun.getCellData(rowItr, 1).isEmpty()){
					Vars.reporterSumObjList.add(reportSumObj);
				}
				if(null != Vars.TestRun.getCellData(rowItr, 1) && !Vars.TestRun.getCellData(rowItr, 1).isEmpty()){
					reportSumObj = new ReporterSummaryObject();
					if(Vars.bw != null)
					{	
						Vars.conditionSkip = false;
						if(Vars.loopflag == 1)
						{
							Vars.loopflag =0;
							KeywordAction.endloop(Vars);
						}
						Vars.bw.close();
						//Reporter.ReportEvent(Vars);
						Log.endTestCase("End of Test Case : " + Vars.getTestCaseName());
					}
					Vars.setExecutionCount(rowItr-1);
					Vars.testcasestart = rowItr;
					Vars.setTestCaseID(Vars.TestRun.getNumaricCellData(rowItr, 0));
					Vars.setTestCaseName(Vars.TestRun.getCellData(rowItr, 1));
					Vars.setResultStatus(Vars.TestRun.getCellData(rowItr, 9));
					Log.startTestCase("Start of Test Case "+ Vars.getTestCaseName());
					Vars.setTestCaseStatus("Passed");
					//storing the object of report into arraylist for summary report
					reportSumObj.setReportSummaryTestCaseID(Vars.getTestCaseID());
					reportSumObj.setReportSummaryTestCaseName(Vars.getTestCaseName());
				}
				else {
					if(null != Vars.TestRun.getCellData(rowItr, 6) && !Vars.TestRun.getCellData(rowItr, 6).isEmpty()){
						//Reading one row of excel for Step, Expected, Test StepID, Sample Data
						Vars.setTestStep (Utils.htmlToTextConvertMethod(Vars.TestRun.getCellData(rowItr, 6)));
						if(null != Vars.TestRun.getCellData(rowItr, 7) && !Vars.TestRun.getCellData(rowItr, 7).isEmpty())
							Vars.setExpected(Utils.htmlToTextConvertMethod(Vars.TestRun.getCellData(rowItr, 7)));
						else
							Vars.setExpected("");
						Vars.setTestStepID(Vars.TestRun.getNumaricCellData(rowItr,5));
						Vars.setSampleData(Vars.TestRun.getCellData(rowItr,8));
						Vars.setExecutionResult("");
						KeywordLibrary.ReadTest(Vars); //Execute all actions in a test step
						reportSumObj.setReportSummaryTestCaseStatus(Vars.getTestCaseStatus());
						ExcelUtils.updateExcellSheet(Constant.Vars);
					}
				}
				
			}
			Vars.reporterSumObjList.add(reportSumObj);
			if(Vars.loopflag == 1)
			{
				Vars.loopflag =0;
				KeywordAction.endloop(Vars);
			}
			//Reporter.ReportEvent(Vars);
			DateFormat dateFormatEndTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Constant.Vars.setExecutionEndTime(dateFormatEndTime.format(new Date()));
			Vars.conditionSkip = false;
			Log.endTestCase("End of Test Case : " + Vars.getTestCaseName());
		}
		if (Vars.getIntegration()==true) {
			Log.info(" StartTest : calling  getIntegration " + Vars.getIntegration());
			Log.info("StartTest : calling Reader function ");
			SpiraRead.ExtractRelease(Vars);
			DateFormat dateFormatEndTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Constant.Vars.setExecutionEndTime(dateFormatEndTime.format(new Date()));
			/*Reporter.generateReport(Vars);*/
			//KeywordLibrary.Endreport(Vars);
		}
	}

	@AfterMethod
	public void afterMethod() throws IOException {
		Reporter.generateReport(Vars);
		Vars.bw1.close();
		Log.endTestSet("Ending TestSet " + Vars.getTestSetID());
	}

	@AfterSuite
	public void tearDown() throws IOException
	{
		BrowserFactory.closeAllDriver();
		Log.info("Browser closed");
	}
}
