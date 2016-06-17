package SpiraTest;

/********************************************************************************************************
 *Project Name		: Ignite Automation framework 
 *Author		    : Bharat Sethi
 *Version	    	: V1.0
 *Date of Creation	: 13-05-2016
 *Date Last modified: 16/05/2016
 *Description       : Connect to SpiraTest to read test steps, test cases for requested test set
 *Functions			: https://impellam.spiraservice.net/Services/v4_0/RestService.aspx
 *SpraReader : Constructor to set proxy variable after checking a flag file on the system
 *ExtractTestSteps(LocalTC obj) 		: Get all test steps in a testcase in SpiraTest
 *ExtractTestCases(LocalTC obj) 		: Get all test cases from SpiraTest in a Test Set
 *CreateTestRun(LocalTC obj)    		: Create a test run for requested test set
 *UpdateTestRun(LocalTC obj)    		: Update the result back in SpiraTest after execution
 *ExtractProject(LocalTC obj)			: Get all the test set in the project
 *buildUrl(String type, LocalTC obj )	: Build a restful URL to request SpiraTest 
 ********************************************************************************************************
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
//import org.omg.CORBA.portable.OutputStream;

import automationFramework.KeywordLibrary;
import automationFramework.LocalTC;
import automationFramework.TranslateEngine;
import bsh.Parser;
import utility.Constant;
import utility.Utils;
/***************************Constructor to SpiraTest reader class***************************************
 * 
 * @author bharat.sethi
 *
 */
public class SpiraReader {
	URL RequestURL;
	Proxy proxy;
	HttpURLConnection conn;
	int TestCasesID[];
	String TestSteps[];
	JSONArray TestSet;
	JSONObject TestCase;
	JSONArray StepsinTest;
	JSONArray TestResult;

	public SpiraReader() throws MalformedURLException {
		super();
		File f = new File("C:\\Impellam.txt");
		if (f.exists()) 
			this.proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.21.0.25", 8080));
		else
			this.proxy = null; //
	}
	/************************Call to SpiraTest to provide all test steps in a test case****************************
	 * @request https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/75/test-cases/16209?username=bharat.sethi&api-key={D6DAC12E-189E-4BDC-A1F3-3F2EC3CFCB3A}
	 * @param obj
	 * @throws Exception 
	 */
	public void ExtractTestSteps(LocalTC obj) throws Exception
	{
		StringBuilder sb;
		sb = new StringBuilder();
		try{
			String requestURL = buildUrl("teststep", obj); //Build a URL for Restful request
			RequestURL = new URL(requestURL);              // 
			if (this.proxy != null){                       // Add Proxy detail if running in Impellam  
				this.conn = (HttpURLConnection) RequestURL.openConnection(proxy);
				System.out.println("Running with proxy");
			}
			else
				this.conn = (HttpURLConnection) RequestURL.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				System.out.println("Blocked: test has been blocked due to connectivity with SpiraTest");
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			System.out.println("Reading teststeps from spira response");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) 
			{
				sb.append(output);
				System.out.println("SpiraTest Output" + output + "");
			}
			TestCase = new JSONObject(sb.toString()); 
			//JSONObject jsonTS = jsonObj.getJSONObject("TestSteps");
			StepsinTest = TestCase.getJSONArray("TestSteps");
			System.out.println("\n\nTestStepsArray: " + StepsinTest);
			ExecuteSteps(obj);
			System.out.println("\njsonArray: " + StepsinTest);
			conn.disconnect();
		} 
		catch (MalformedURLException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		}
		catch (JSONException e) {
			System.out.println("Blocked: test has been blocked due to exception in JSONException while reading SpiraTest");
			e.printStackTrace();
		}
	}

	public void ExecuteSteps(LocalTC obj) throws Exception{
		int TestCaseId = Integer.parseInt(TestCase.getString("TestCaseId"));
		System.out.println("\nTestCase: " + TestCaseId);
		obj.setTestCaseID(TestCaseId);
		KeywordLibrary.CreateReport(obj,"d");
		StepsinTest = TestCase.getJSONArray("TestRunSteps");
		for (int i = 0; i < StepsinTest.length(); i++) 
		{  
			JSONObject childJSONObject = StepsinTest.getJSONObject(i);
			System.out.println("\nChildObject: " + childJSONObject);
			//Extract teststep from JSON
			String TestStep = Utils.htmlToTextConvertMethod(childJSONObject.getString("Description"));
			obj.setTestStep(TestStep);
			System.out.println("\nTestStep: " + TestStep);
			//Extract test expected from JSON
			String TestExpected = Utils.htmlToTextConvertMethod(childJSONObject.getString("ExpectedResult"));
			obj.setExpected(TestExpected);
			System.out.println("\nTestExpected: " + TestExpected);
			//Extract SampleData from JSON
			String SampleData = Utils.htmlToTextConvertMethod(childJSONObject.getString("SampleData"));
			System.out.println("\nSampleData: " + SampleData);
			obj.setSampleData(SampleData);
			//Extract TestStepID from JSON
			int TestStepId = childJSONObject.getInt("TestStepId");
			obj.setTestStepID(TestStepId);
			System.out.println("\nTestStepID: " + Integer.toString(TestStepId));
			KeywordLibrary.ReadTest(obj); //Execute all actions in a test step 
			obj.ActualResult = "Passed execution";
			obj.ExecutionStatus = "Passed";
			int exid = 3;
			switch (obj.ExecutionStatus){  //Set the ExecutionID for execution status captured during execution
			case "Passed":
				exid = 2;
				break;
			case "Failed":
				exid = 1;
				break;
			case "No Run":
				exid = 3;
				break;	
			case "Blocked":
				exid = 5;
				break;	
			case "Caution":
				exid = 6;
				break;	
			}
			//Put the actual result and status back in the object
			childJSONObject.put("ActualResult", obj.ActualResult);
			childJSONObject.put("ExecutionStatusId", new Integer(exid));
		}
	}


	/*********************************Extract all test cases in a given test set*******************************
	 * @request https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/75/releases/587/test-cases?username=bharat.sethi&api-key={D6DAC12E-189E-4BDC-A1F3-3F2EC3CFCB3A}
	 * @param obj
	 * @throws Exception 
	 */
	public void ExtractTestCases(LocalTC obj) throws Exception
	{
		StringBuilder sb;
		sb = new StringBuilder();
		try{
			String requestURL = buildUrl("testcase", obj);

			RequestURL = new URL(requestURL);
			if (this.proxy != null)
				this.conn = (HttpURLConnection) RequestURL.openConnection(proxy);
			else
				this.conn = (HttpURLConnection) RequestURL.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				System.out.println("Blocked: test has been blocked due to connectivity with SpiraTest");
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			System.out.println("Reading testcases from spira response");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) 
			{
				sb.append(output);
				System.out.println("SpiraTest Output" + output + "");
			}
			JSONArray TestSet = new JSONArray(sb.toString()); 
			for (int i = 0; i < TestSet.length(); i++) 
			{  
				TestCase = TestSet.getJSONObject(i);
				ExtractTestSteps(obj);
				obj.bw.close();
			}
			obj.bw1.close();
			System.out.println("\njsonArray: " + TestSet);
			conn.disconnect();
		} 
		catch (MalformedURLException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		}
		catch (JSONException e) {
			System.out.println("Blocked: test has been blocked due to exception in JSONException while reading SpiraTest");
			e.printStackTrace();
		}
	}

	/*********************************Extract all test set name and other detail *******************************
	 * @request https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/75/test-sets/161?username=bharat.sethi&api-key={D6DAC12E-189E-4BDC-A1F3-3F2EC3CFCB3A}
	 * @param obj
	 * @throws IOException
	 */
	public void ExtractTestSet(LocalTC obj) throws IOException
	{
		StringBuilder sb;
		sb = new StringBuilder();
		try{
			String requestURL = buildUrl("testset", obj);

			RequestURL = new URL(requestURL);
			if (this.proxy != null)
				this.conn = (HttpURLConnection) RequestURL.openConnection(proxy);
			else
				this.conn = (HttpURLConnection) RequestURL.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				System.out.println("Blocked: test has been blocked due to connectivity with SpiraTest");
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			System.out.println("Reading testset name from spira response");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) 
			{
				sb.append(output);
				System.out.println("SpiraTest Output" + output + "");
			}
			JSONObject jsonObj = new JSONObject(sb.toString()); 
			String TestSetName = jsonObj.getString("Name");
			obj.setTestSetName(TestSetName);
			if(TestSetName.contains("IE"))
				obj.setbrosername("IE");
			else if(TestSetName.contains("Chrome"))
				obj.setbrosername("Chrome");
			else if(TestSetName.contains("Firefox"))
				obj.setbrosername("Firefox");
			String regex = "http:*.*";
			Pattern patt = Pattern.compile(regex);
			Matcher matcher = patt.matcher(TestSetName);
			while(matcher.find())
				obj.setURL(matcher.group());
			//System.out.println("\n\nTestStepsArray: " + jsonArray);
			conn.disconnect();
		} 
		catch (MalformedURLException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		}
		catch (JSONException e) {
			System.out.println("Blocked: test has been blocked due to exception in JSONException while reading SpiraTest");
			e.printStackTrace();
		}
	}

	/*************Extract all test sets in project linked to current release ******************************
	 * @request https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/75/test-sets/161?username=bharat.sethi&api-key={D6DAC12E-189E-4BDC-A1F3-3F2EC3CFCB3A}
	 * @param obj
	 * @throws Exception 
	 */
	public void ExtractTestSetinProject(LocalTC obj) throws Exception
	{
		StringBuilder sb;
		String rid = "" + obj.getReleaseID();
		sb = new StringBuilder();
		try{
			String requestURL = buildUrl("testsetsinproject", obj);
			RequestURL = new URL(requestURL);
			if (this.proxy != null)
				this.conn = (HttpURLConnection) RequestURL.openConnection(proxy);
			else
				this.conn = (HttpURLConnection) RequestURL.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				System.out.println("Blocked: test has been blocked due to connectivity with SpiraTest");
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			System.out.println("Reading testsets in project having running release id");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) 
			{
				sb.append(output);
				System.out.println("SpiraTest Output" + output + "");
			}
			TestSet = new JSONArray(sb.toString()); 
			for (int i = 0; i < TestSet.length(); i++) 
			{  
				JSONObject TestCase = TestSet.getJSONObject(i);
				String ReleaseId = TestCase.getString("ReleaseId");
				if(ReleaseId.equals(rid)){
					ExtractTestSet(obj);
					CreateTestRun(obj);
				}	
			}
			conn.disconnect();
		} 
		catch (MalformedURLException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		}
		catch (JSONException e) {
			System.out.println("Blocked: test has been blocked due to exception in JSONException while reading SpiraTest");
			e.printStackTrace();
		}
	}

	/*********************************Create a test run for this execution****************************
	 * @request https://impellam.spiraservice.net/Services/v4_0/RestService.svc/projects/75/test-runs/create/test_set/161?username=bharat.sethi&api-key={D6DAC12E-189E-4BDC-A1F3-3F2EC3CFCB3A}
	 * @param obj
	 * @throws Exception 
	 */
	public void CreateTestRun(LocalTC obj) throws Exception
	{
		StringBuilder sb;
		sb = new StringBuilder();
		try{
			String requestURL = buildUrl("testrun", obj);
			System.out.println(requestURL);
			RequestURL = new URL(requestURL);
			if (this.proxy != null){
				this.conn = (HttpURLConnection) RequestURL.openConnection(proxy);
				System.out.println("Running with proxy");
			}
			else
				this.conn = (HttpURLConnection) RequestURL.openConnection();

			conn.setRequestMethod("POST");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setAllowUserInteraction(false);
			conn.setRequestProperty("Accept", "application/json");

			OutputStream os = conn.getOutputStream();
			os.write(obj.getTestRunStatus().getBytes());
			//	        os.flush();
			os.close();
			conn.connect();
			if (conn.getResponseCode() != 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getErrorStream())));
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println (line);
				}
				System.out.println("Blocked: test has been blocked due to connectivity with SpiraTest ");
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			System.out.println("Creating testrun for automation execution");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) 
			{
				sb.append(output);
				System.out.println("SpiraTest Output" + output + "");
			}
			TestSet = new JSONArray(sb.toString()); 

			for (int i = 0; i < TestSet.length(); i++) 
			{  	long startTime = System.currentTimeMillis();
			TestCase = TestSet.getJSONObject(i);
			int TestCaseId = Integer.parseInt(TestCase.getString("TestCaseId"));
			System.out.println("\nTestCase: " + TestCaseId);
			obj.setTestCaseID(TestCaseId);
			KeywordLibrary.CreateReport(obj,"d");
			StepsinTest = TestCase.getJSONArray("TestRunSteps");
			System.out.println(StepsinTest.toString());
			ExecuteSteps(obj);
			obj.bw.close();
			TestCase.put("ExecutionStatusId", new Integer(1));
			TestCase.put("ActualDuration", System.currentTimeMillis() - startTime);
			TestCase.put("EndDate", TestCase.getString("StartDate"));
			}
			obj.bw1.close();
			conn.disconnect();
			UpdateTestRun(obj);
		}
		catch (ProtocolException e){
			System.out.println(e.getMessage());
		}
		catch (MalformedURLException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		}
	} 

	/***************************Create Json update Test run for this execution ******************************
	 * 
	 * @param obj
	 * @throws IOException
	 * @throws JSONException 
	 */

	public void UpdateTestRun(LocalTC obj) throws IOException, JSONException
	{
		StringBuilder sb;
		sb = new StringBuilder();
		try{
			String requestURL = buildUrl("status", obj);
			RequestURL = new URL(requestURL);
			if (this.proxy != null){
				this.conn = (HttpURLConnection) RequestURL.openConnection(proxy);
				System.out.println("Running with proxy");
			}
			else
				this.conn = (HttpURLConnection) RequestURL.openConnection();

			conn.setRequestMethod("PUT");
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setAllowUserInteraction(false);
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Accept", "application/json");
			OutputStreamWriter os = new OutputStreamWriter(conn.getOutputStream());
			os.write(TestSet.toString());
			os.flush();
			os.close();
			conn.connect();
			if (conn.getResponseCode() != 200) {
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getErrorStream())));
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println (line);
				}
				System.out.println("Blocked: test has been blocked due to connectivity with SpiraTest ");
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			System.out.println("Creating testrun for automation execution");
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			while ((output = br.readLine()) != null) 
			{
				sb.append(output);
				System.out.println("SpiraTest Output" + output + "");
			}
			TestSet = new JSONArray(sb.toString()); 
			conn.disconnect();
		}
		catch (ProtocolException e){
			System.out.println(e.getMessage());
		}
		catch (MalformedURLException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Blocked: test has been blocked due to exception in MalformedURLException while reading SpiraTest");
			e.printStackTrace();
		}
	}

	public void ExtractProject(LocalTC obj) throws IOException
	{
		StringBuilder sb;
		sb = new StringBuilder();
		String requestURL = buildUrl("project", obj);
		RequestURL = new URL(requestURL);
		this.conn = (HttpURLConnection) RequestURL.openConnection(proxy);
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
	}

	public String buildUrl(String type, LocalTC obj )
	{
		String requestURL = null;
		switch(type)
		{
		case "testcase":
			requestURL = new String(Constant.TestCasesInSet); 
			break;
		case "testset":
			requestURL = new String(Constant.TestSet);
			break;
		case "testsetsinproject":
			requestURL = new String(Constant.TestSetsinProject);
			break;
		case "runfromhost":
			requestURL = new String(Constant.RunfromHost);
			break;
		case "teststep":
			requestURL = new String(Constant.TestSteps);
			break;
		case "project":
			requestURL = new String(Constant.ProjectDetail);
			break;
		case "release":
			requestURL = new String(Constant.ReleaseDetail);
			break;
		case "testrun":
			requestURL = new String(Constant.TestRun);
			break;
		case "status":
			requestURL = new String(Constant.TestStatus);
			break;
		}
		requestURL = requestURL.replace("{project_id}", Integer.toString(obj.getProjectID()));
		requestURL = requestURL.replace("{test_case_id}", Integer.toString(obj.getTestCaseID()));
		requestURL = requestURL.replace("{test_set_id}", Integer.toString(obj.getTestSetID()));
		requestURL = requestURL.replace("{release_id}", Integer.toString(obj.getReleaseID()));
		requestURL = requestURL.replace("{automation_host_token}", Constant.automation_host_token);
		requestURL = requestURL.replace("{end_date}", "16062016");
		requestURL = requestURL + Constant.ServiceUser;
		System.out.println("Build URL: " + requestURL );
		return requestURL;
	}
}
