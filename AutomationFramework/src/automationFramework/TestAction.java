package automationFramework;

/********************************************************************************************************
 *Project Name		: Ignite Automation framework 
 *Author		    : Bharat Sethi
 *Version	    	: V1.0
 *Date of Creation	: 04-05-2016
 *Date Last modified: 04/05/2016
 *Description       : Program to be called from command line with 6 arguments to be in the same order 	    
 *		ProjectID 	- args[0]
 *		ReleaseID 	- args[1]
 *		TestSetID 	- args[2]
 *		TestCaseID	- args[3]
 *		TestRunPath	- args[4]
 *		Integration - args[5]
 *Functions			: public static void main(String[] args) - Validates the argument count and then create a Dynamic TestNG XML 
 *					  to run the test from FrameworkDriver class 
 * ********************************************************************************************************
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import appModules.functionLibary;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class TestAction 
{
	public static void main(String[] args) 
	{
		if (args.length != 6) {
	    	System.err.println("Blocked: Test started with wrong input arguments");
	    	System.exit(1);
	    }
	    String arg;
	    arg = "Reading all test arguments as ";
		for (String s: args) {
			arg = arg + " <" + s + ">";
        }
		System.out.println(arg);
		
		/****************Create a TestNG XML at runtime by passing the command line variables to TestNG**************/
		//Set Suite Name in XML
		XmlSuite suite = new XmlSuite();
		suite.setName("IgniteSuite");
		System.out.println("added xml suite");
		//Set Test name in XML
		XmlTest test = new XmlTest(suite);
		test.setName("IgniteTest");
		System.out.println("added xml test");
		//Add Parameters to the XML
		Map<String, String> parameters = new HashMap<String, String>();
	    parameters.put("ProjectID",args[0]);
	    parameters.put("ReleaseID",args[1]);
	    parameters.put("TestSetID",args[2]);
	    parameters.put("TestCaseID",args[3]);
	    parameters.put("TestRunPath",args[4]);
	    parameters.put("Integration",args[5]);
	    System.out.println("added xml parameters");
	    test.setParameters(parameters);
	    System.out.println("added xml parameters to xml");
  	    //Add Class name in xml
		List<XmlClass> myclasses = new ArrayList<XmlClass>(); //List of XMLClass
		String classname="automationFramework.FrameworkDriver";
		XmlClass cl= new XmlClass(classname);
		myclasses.add(cl);   //add new class to the list
		test.setXmlClasses(myclasses) ;                       //add class list to XML
		//Create a list of XmlTests and add the Xmltest you created earlier to it.
		 List<XmlTest> myTests = new ArrayList<XmlTest>();
		 myTests.add(test);
		 suite.setTests(myTests);

		/************************************************************************************************************/
		System.out.println("Created a dynamic XML using parameters");
		/****************Calling Framework to execute test for this test case ****************************************/
		//TestListenerAdapter tla = new TestListenerAdapter();
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		TestNG testng = new TestNG();
		testng.setXmlSuites(suites);
		//testng.setTestClasses(new Class[] { FrameworkDriver.class });
		//testng.addListener(tla);
		System.out.println("Starting IgniteFramework to execute test");
		testng.run();
		/*************************************************************************************************************/
	}
}
