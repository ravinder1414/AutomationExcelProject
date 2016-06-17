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
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class FrameworkDriver
{
	LocalTC Vars;
	//TranslateEngine Translate;
	SpiraReader SpiraRead;
	int rowCountBw = 0;
	int rowCount = 0;
	/*	public void FrameworkDriver() throws NoSuchMethodException, SecurityException{
		actionKeywords = new ActionKeywords();
		method = actionKeywords.getClass().getMethods();	
	}*/

	/****************************This function is called by TestNG at the start of the test suite
	 * @throws MalformedURLException ***********************/
	@BeforeSuite
	public void beforeSuite() throws MalformedURLException {
		//Provide Log4j configuration settings
		DOMConfigurator.configure("log4j.xml");
		Log.info("beforeSuite : Strating Project Test Execution" );
		System.out.println("beforeSuite : Strating Project Test Execution");
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
		System.out.println("loadLocally : Starting test Suite for Project ID " +  ProjectID);
		Log.startTestCase("loadLocally : Starting to execute Test Set " + TestSetID + " and Test Case " + TestCaseID);
	}

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
			System.out.println("init : test case excel opened");
			Log.info("init: Excel sheet opened");
			System.out.println("init: It is start of test execution");
		}
		Log.startTestSet("init : Start of Test Set "+ Vars.getTestSetID());
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
		KeywordLibrary.CreateReport(Vars,"s");
		int prevtestcaseid = 0;
		String TestCaseStatus = "Passed";
		String strTextTemp ="";
		if(Vars.getIntegration()==false)
		{
			Vars.TestRun.setExcelFile(Vars.getTestRunPath(), "Test Runs");
			Log.info("StartTest : Test Run Excel sheet opened");
			int retRowCount=Vars.TestRun.getRowCount();
			for(int rowItr=2;rowItr<retRowCount;rowItr++)
			{   //Reading test step, expected, test step id and sample data from excel and 
				//Reset execution result
				Vars.row = rowItr;
				if(null != Vars.TestRun.getCellData(rowItr, 1) && !Vars.TestRun.getCellData(rowItr, 1).isEmpty()){
					if(Vars.bw != null)
					{	
						Vars.bw.close();
						for(int tcid=prevtestcaseid+1;tcid<rowItr;tcid++)
						{
							if(Vars.TestRun.getCellData(tcid, 9) != "Passed" && TestCaseStatus != "Failed" ){
								TestCaseStatus = Vars.TestRun.getCellData(tcid, 9);
							}
						}
					}
					Vars.setTestCaseName(Vars.TestRun.getCellData(rowItr, 1));
					Vars.setResultStatus(Vars.TestRun.getCellData(rowItr, 9));
					Log.startTestCase("StartTest " + Vars.getTestCaseName());
					if(rowCountBw != 0){
						for(int i=0; i<Vars.ResultsStatus.size(); i++){
							if(Vars.ResultsStatus.get(i).equals("Passed")){
								//bFlag = true;
								Vars.setResultStatus("Passed");
								continue;
							}else{
								//bFlag = false;
								Vars.setResultStatus("Failed");
								break;
							}
								
						}
						//UpdateSheet(rowCountBw, 9, Vars);
					}
					rowCountBw = rowItr;
					KeywordLibrary.CreateReport(Vars,"d");
					Log.endTestCase("StartTest: " + Vars.getTestCaseName());
					//set testcase status in excel column 9 of row prevtestcaseid
					prevtestcaseid = rowItr;
				}
				else if (Vars.getTestCaseID() == Vars.TestRun.getNumaricCellData(rowItr, 0))
				{
					//Reading one row of excel for Step, Expected, Test StepID, Sample Data
					strTextTemp = Vars.TestRun.getCellData(rowItr, 6);
					String htmlToTextConvert = Utils.htmlToTextConvertMethod(strTextTemp);
					Vars.setTestStep (htmlToTextConvert);
					Vars.setExpected(Vars.TestRun.getCellData(rowItr, 7));
					Vars.setTestStepID(Vars.TestRun.getNumaricCellData(rowItr,5));
					Vars.setSampleData(Vars.TestRun.getCellData(rowItr,8));
					Vars.setExecutionResult("");
					KeywordLibrary.ReadTest(Vars); //Execute all actions in a test step 
				}
						//set actualresult in excel
						//set teststep status as well
			}	
			
		}
		if (Vars.getIntegration()==true) {
			System.out.println(" StartTest : calling  getIntegration " + Vars.getIntegration());
			//Extract all TestSetID linked to a releaseID
			//Loop 1: Loop on all Test Set ID 
			//Extract which browse and url to use for testing
			SpiraRead.CreateTestRun(Vars);
			SpiraRead.ExtractTestSetinProject(Vars);
			//SpiraRead.ExtractTestCases(Vars);
			//Extract all TestCaseID linked to a TestSetID
			//Loop 2: Loop on all TestCaseID
			//Extract all TestStep in a TestCaseID and execute those steps
			//SpiraRead.ExtractTestSteps(Vars,Translate); 
			System.out.println("StartTest : calling Reader function ");
		}
	}

	@AfterMethod
	public void afterMethod() throws IOException {
		Log.endTestCase("Finishing Test Case ID ");
		System.out.println("Test has been completed");
		KeywordLibrary.Endreport(Vars);
		Log.endTestSet("Ending TestSet " + Vars.getTestSetID());
	}

	@AfterSuite
	public void tearDown()
	{
		BrowserFactory.closeAllDriver();
		Log.info("Browser closed");
	}
}
