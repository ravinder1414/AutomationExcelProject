package utility;

import java.io.BufferedWriter;

import org.openqa.selenium.WebDriver;

import automationFramework.LocalTC;

public class Constant 
{
	//TestSuite, TestScript, ObjectRepository, Summary Report, Screenshot Report, Browser Type, ieDriverPath,
	//TempTetsreortpath,Filemanager,database,host_name,portnumber,schemaname,username,password
	//update,execpath,reusableComponents,
	public static final String URL = "https://test.salesforce.com/";
	public static final String Username = "bharat.sethi@impellam.com.regression";//"bhtestemail15@impellam.com";
	public static final String Password = "Clarity1";//"Pa55w0rd1";
	public static final String Path_TestData = "C://Temp//IgniteTestData.xlsx";
	public static final String File_TestData = "IgniteTestData.xlsx";
	public static final String ServiceUser = "?username=bharat.sethi&api-key={D6DAC12E-189E-4BDC-A1F3-3F2EC3CFCB3A}";
	public static final String ProjectDetail = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}";
	public static final String ReleaseDetail = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/releases/{release_id}";
	public static final String TestCasesInSet = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/test-sets/{test_set_id}/test-cases";
	public static final String TestSteps = 	"https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/test-cases/{test_case_id}";
	public static final String TestSet = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/test-sets/{test_set_id}";
	public static final String TestSetsinProject = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/test-sets";
	public static final String RunfromHost = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/test-runs/create/automation_host/{automation_host_token}";
	public static final String automation_host_token = "IgniteFramework";
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
	public static final String ieDriverPath = "C:\\temp";
	public static final String chromeDriverPath = "C:\\temp";
	public static final String TestRun = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/test-runs/create/test_set/{test_set_id}";
	public static final String TestStatus = "https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/{project_id}/test-runs?end_date={end_date}";
	public static final String execpath = "\\Utility\\FileManager.exe";
	public static LocalTC Vars=null;
	//Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	public static final int Col_PageObject =4 ;
	public static final int Col_ActionKeyword =5 ;
	public static final int Col_RunMode =2 ;
	public static final int Col_Result =3 ;
	public static final int Col_DataSet =6 ;
	public static final int Col_TestStepResult =7 ;
	public static WebDriver driver;
	public static final String tempTestReportPath = "C:\\Temp";
 
	// Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	public static final String Sheet_TestCases = "Test Cases";
	public static final String Sheet_TestRun = "Test Run";
		
	//Test Data Sheet Columns
	public static final int Col_TestCaseName = 0;	
	public static final int Col_UserName =1 ;
	public static final int Col_Password = 2;
	public static final int Col_Browser = 3;
	public static final int Col_ProductType = 4;
	public static final int Col_ProductNumber = 5;
	public static final int Col_FirstName = 6;
	public static final int Col_LastName = 7;
	public static final int Col_Address = 8;
	public static final int Col_City = 9;
	public static final int Col_Country = 10;
	public static final int Col_Phone = 11;
	public static final int Col_Email = 12;
	public static final String Path_ScreenShot = "C://TEMP//Screenshots//";
	public static final String Path_OR = null;
	
	//Translate Engine
	public static final String CheckVisible = "check visible";
	public static final String Check = "check";
	public static final String CheckEnable = "check enable";
	public static final String CheckText = "check text";
	public static final String CheckLinkText = "check link text";
	public static final String CheckValue = "check value";
	public static final String CheckIfChecked = "check if checked";
	public static final String CheckPageTitle = "check page title";
	public static final String CheckTableRowCount = "check table row count";
	public static final String CheckTableColumnCount = "check table column count";
	public static final String CheckTableValues = "check table values";
	public static final String Comparedbcell = "comparedbcell";
	public static final String Open = "open";
	public static final String OpenBrowser = "open browser";
	public static final String Launchapp = "launchapp";
	public static final String Wait = "wait";
	public static final String Sleep = "sleep";
	public static final String TestDataFrom = "test data from";
	public static final String ImportData = "import data";
	public static final String Importdata = "importdata";
	public static final String CaptureScreen = "capture screen";
	public static final String Screenshot = "screenshot";
	public static final String Screen_Shot = "screen shot";
	public static final String ScreenCapture = "screen capture";
	public static final String Screencapture = "screencapture";
	public static final String Condition = "condition";
	public static final String IF = "condition";
	public static final String Compare = "compare";
	public static final String CheckVariable = "check variable";
	public static final String ConcludeCondition = "conclude condition";
	public static final String End_Condition = "end condition";
	public static final String Endcondition = "endcondition";
	public static final String RunStepsBelow = "run steps below";
	public static final String LoopHere = "loop here";
	public static final String Loop = "loop";
	public static final String Endloop = "endloop";
	public static final String Perform = "perform";
	public static final String ActionOn = "action on";
	public static final String ClickOn = "click on";
	public static final String Enter = "enter";
	public static final String SetText = "set text";
	public static final String Type = "type";
	public static final String Altclick = "altclick";
	public static final String HoverOver = "hover over";
	public static final String Hover = "hover";
	public static final String SelectFromList = "select from list";
	public static final String Listselect = "listselect";
	public static final String Select = "select";
	public static final String Store_Value = "store value";
	public static final String ReadValue = "read value";
	public static final String ReadText = "read text";
	public static final String StoreText = "store text";
	public static final String ReadVisible = "read visible";
	public static final String StoreVisible = "store visible";
	public static final String ReadEnable = "read enable";
	public static final String StoreEnable = "store enable";
	public static final String ReadLinkText = "read link text";
	public static final String StoreLinkText = "store link text";
	public static final String ReadPageTitle = "read page title";
	public static final String PageTitle = "page title";
	public static final String Get = "get";
	public static final String Read = "read";
	public static final String Store = "store";
	public static final String Storevalue = "storevalue";
	public static final String Message = "message";
	public static final String Report = "report";
	public static final String Comment = "comment";
	public static final String Msgbox = "msgbox";
	public static final String SetContext = "set context";
	public static final String ReferTo = "refer to";
	public static final String OnPage = "on page";
	public static final String Context = "context";
	public static final String RunTest = "run test";
	public static final String RunAction = "run action";
	public static final String CallAction = "call action";
	public static final String RunFunction = "run function";
	public static final String CallFunction = "call function";
	public static final String Callfunction = "callfunction";
	public static final String ClickToDownload = "click to download";
	public static final String Download = "download";
	public static final String Upload = "upload";
	public static final String ExractFromDb = "exract from db";
	public static final String Fetchdb = "fetchdb";
	public static final String NavigateTo = "navigate to";
	public static final String Close = "close";
	public static final String Click = "click";
	public static final String Link = "link";
	public static final String Screencaptureoption = "screencaptureoption";
	public static final String Cancelupload = "cancelupload";
	public static final String Closeupload = "closeupload";
	public static final String Abortupload = "abortupload";
	public static final String Set = "set";
	public static final String Setdate = "setdate";
	public static final String Enabled = "enabled";
	public static final String Text = "text";
	public static final String Value = "value";
	public static final String Visible = "visible";
	public static final String Checked = "checked";
	public static final String Linktext = "linktext";
	public static final String Pagetitle = "pagetitle";
	public static final String Exist = "exist";
	public static final String Rowcount = "rowcount";
	public static final String Columncount = "columncount";
	public static final String Equals = "equals";
	public static final String Notequals = "notequals";
	public static final String Greaterthan = "greaterthan";
	public static final String Lessthan = "lessthan";
	public static final String CheckNotVisible = "check not visible";
	public static final String CheckNotEnable = "check not enable";
	public static final String CloseUpload = "Close Upload";
	public static final String CancleUpload = "Cancle Upload";
	
	
	
	
	
	
	//Report Event
	public static final String Executed = "executed";
	public static final String Failed = "failed";
	public static final String NoWindowFound = "NoWindowFound";
	public static final String Callactionstart = "callactionstart";
	public static final String Callactionend = "callactionend";
	public static final String Callactionfnf = "callactionfnf";
	public static final String Callactionff = "callactionff";
	public static final String Missing = "missing";
	public static final String ObjectLocator = "ObjectLocator";
	public static final String TooManyArguments = "tooManyArguments";
	public static final String NoBlankAvailable = "NoBlankAvailable";
	public static final String ObjNotFound = "objNotFound";
	public static final String Keyword = "keyword";
	public static final String Nodatatable = "nodatatable";
	public static final String Action = "action";
	public static final String Action1 = "action1";
	public static final String Objectmiss = "objectmiss";
	public static final String Property = "property";
	public static final String Property1 = "property1";
	public static final String CondFailed = "condFailed";
	public static final String Invaliddate1 = "invaliddate1";
	public static final String Invaliddate = "invaliddate";
	public static final String Prevmonth = "prevmonth";
	public static final String Nextmonth = "nextmonth";
	public static final String Titlemonth = "titlemonth";
	public static final String Titleyear = "titleyear";
	public static final String Titledefault = "titledefault";
	public static final String Monthnotidentified = "monthnotidentified";
	public static final String Invalidmonth = "invalidmonth";
	public static final String FilePathNotFound = "filePathNotFound";
	public static final String FilePathNotFound1 = "filePathNotFound1";
	public static final String FilePathNotFound2 = "filePathNotFound2";
	public static final String Calendaraction = "calendaraction";
	public static final String Userdefined = "userdefined";
	public static final String Getcelldata = "getcelldata";
	public static final String Nofetchdata = "nofetchdata";
	public static final String NoColumnFound = "NoColumnFound";
	public static final String NoMatchinDataTable = "NoMatchinDataTable";
	public static final String ObjectNotFound = "ObjectNotFound";
	public static final String InvalidQuery = "invalidQuery";
	public static final String InvalidConnection = "invalidConnection";
	public static final String Page = "page";
	
	
}
