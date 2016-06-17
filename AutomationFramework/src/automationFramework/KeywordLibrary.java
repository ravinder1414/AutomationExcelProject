package automationFramework;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.collect.Table.Cell;

import utility.BrowserFactory;
import utility.Constant;
import utility.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;

public class KeywordLibrary {
	static XSSFSheet ws;
	//static int j = 1;
	static int screenshotflag = 1;
	static int devFlag;
	static int initscreen = 2;
	
	
	public static void ReadTest(LocalTC Vars) throws Exception{
		if(Vars.getTestStep() !="")
		{   String TC = Vars.getTestStep();
			String Ex = Vars.getExpected();
			String steps[] = TC.split("\\n");
			String expected[] = Ex.split("\\n");
			String ActualResult = "";
			//String Status = "Failed";
			System.out.println("KeywordLibrary.ReadTest - Test  step ID :: "+ Vars.getTestStepID());
			for (int i=0; i<steps.length;i++){  //loop to all steps in a cell 
				System.out.println("KeywordLibrary.ReadTest - Test Step :: " + Vars.getTestStepID() + "-" + i + " " + steps[i]);
				Vars.sTestStep = steps[i];
				Vars.Translate.FindKeyword(Vars, steps[i]);
				KeywordAction.CallAction(Vars);
				//if expected steps and test steps are equal
				//that suggest that we have one expected for each step
				if (expected.length==steps.length){  
					if (expected[i] != "") {         
						System.out.println("KeywordLibrary.ReadTest - Test Expected :: "+expected[i]);
						Vars.sTestStep = expected[i];
						Vars.Translate.FindKeyword(Vars, Vars.getTestStep());
						Vars.Translate.FindKeyword(Vars, expected[i]);
						KeywordAction.CallAction(Vars);
						ActualResult = ActualResult + Vars.getExecutionResult();
					}
				}
			}
			//when expected steps are not equal to test steps
			// that suggest that expected steps to be executed after completion of all steps
			if (expected.length!=steps.length){  
				for (int i=0; i<expected.length;i++){ 
					if (expected[i] != "") {
						System.out.println("KeywordLibrary.ReadTest - Test expected :: "+expected[i]);
						Vars.sTestStep = expected[i];
						Vars.Translate.FindKeyword(Vars, Vars.getTestStep());
						//Translate.FindKeyword(Vars, Vars.getTestStep());
						KeywordAction.CallAction(Vars);
						ActualResult = ActualResult + Vars.getExecutionResult();
					}
				}
			}
			updateExcellSheet(Constant.Vars);
		}
	}
	
	/*********************************************************************************************************
	 * Function:CreateReport
	 * Description: This function is used for setup a report variable so that report can be generated 
	 /*********************************************************************************************************** 
	 * @return 
	 * @throws IOException 
	 */
	public static void CreateReport(LocalTC Vars,String Type) throws IOException{
		Date cur_dt = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String strTimeStamp = dateFormat.format(cur_dt);
		//String[] dateArray = strTimeStamp.split("-");
		//int today = Integer.parseInt(dateArray[2]);
		String rp = Constant.tempTestReportPath;
		if (Type=="s"){
			if (!rp.endsWith("\\")) { // checks whether the path ends with
				// '/'
				rp = rp + "\\";
			}
			Vars.setstrResultPath(rp + "Detail");
			String htmlname1 = rp + "Summary" + "Test_Suite_" + Vars.getTestSetID() + "_" + strTimeStamp + ".html";
			System.out.println("Summary HTML report path set as " + Vars.getstrResultPath() + " and Report file name : " + htmlname1);
			File f = new File(Vars.getstrResultPath());
			if (Vars.getstrResultPath() != f.getAbsolutePath().toString()) {
				System.out.println("Report will be printed in the following path since THE REPORT PATH WAS NOT GIVEN / THE GIVEN PATH IS INCORRECT.");
				Log.info("WARNING :Report will be printed in the following path since THE REPORT PATH WAS NOT GIVEN / THE GIVEN PATH IS INCORRECT." );
				System.out.println(f.getAbsolutePath().toString());
			}
			//f.mkdirs();
			Vars.bw1 = new BufferedWriter(new FileWriter(htmlname1));
			Vars.bw1.write("<HTML><BODY><TABLE BORDER=0 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			Vars.bw1.write("<TABLE BORDER=0 BGCOLOR=BLACK CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			Vars.bw1.write("<TR><TD COLSPAN=6 BGCOLOR=#66699><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Testcase Name</B></FONT></TD><TD BGCOLOR=#66699 WIDTH=27%><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Status</B></FONT></TD></TR>");
			//Vars.bw1.close();
		}
		else{
			//setup report folder
			//Vars.setstrResultPath(Vars.getstrResultPath() +"\\"+Vars.getTestCaseID() +"\\");
			//setup detail report 
			Vars.setDetailReport(".\\Detail\\" + Vars.getTestCaseID()+ "\\" + strTimeStamp + ".html");
			//setup folder to store screen shots
			Vars.setScreenShotReport(Vars.getstrResultPath() +"\\"+Vars.getTestCaseID() +"\\");
			File f = new File(Vars.getstrResultPath() +"\\"+Vars.getTestCaseID() +"\\");
			f.mkdirs();
			Vars.bw = new BufferedWriter(new FileWriter(Vars.getstrResultPath() +"\\"+Vars.getTestCaseID() +"\\" + strTimeStamp + ".html"));
			Vars.bw.write("<HTML><BODY><TABLE BORDER=0 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			Vars.bw.write("<TABLE BORDER=0 BGCOLOR=BLACK CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			Vars.bw.write("<TR><TD BGCOLOR=#66699 WIDTH=27%>"
					+ "<FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>Test Case Name:</B></FONT></TD>"
					+ "<TD COLSPAN=6 BGCOLOR=#66699><FONT FACE=VERDANA COLOR=WHITE SIZE=2><B>"
					+"<a href=\"file:///"+Vars.getScreenShotReport()+"\">"+ Vars.getTestCaseID() + "</a>"+"</B></FONT></TD></TR>");
			Vars.bw.write("<HTML><BODY><TABLE BORDER=1 CELLPADDING=3 CELLSPACING=1 WIDTH=100%>");
			Vars.bw.write("<TR COLS=7><TD BGCOLOR=#FFCC99 WIDTH=3%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Test StepID</B></FONT></TD>"
					+ "<TD BGCOLOR=#FFCC99  WIDTH=3%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Action</B></FONT></TD>"
					+ "<TD BGCOLOR=#FFCC99 WIDTH=20% ><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Object</B></FONT></TD>"
					+ "<TD BGCOLOR=#FFCC99  WIDTH=23%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Event</B></FONT></TD>"
					+ "<TD BGCOLOR=#FFCC99 WIDTH=21%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Test Step</B></FONT></TD>"
					+ "<TD BGCOLOR=#FFCC99 WIDTH=25%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Execution Time</B></FONT></TD>"
					+ "<TD BGCOLOR=#FFCC99 WIDTH=5%><FONT FACE=VERDANA COLOR=BLACK SIZE=2><B>Status</B></FONT></TD>");
			//Vars.bw.close();
		}
	}

	public static void Endreport(LocalTC Vars) throws IOException{
		Vars.bw.close();  // Write all the buffer data to detail report 
		Vars.bw1.close(); // Write all the buffer data to summary report
	}

	/*********************************************************************************************************
	 * Function:createConnection
	 * Description: This function is used to create connection with DataBase
	 /*********************************************************************************************************** 
	 */
	protected static String createConnection(LocalTC Vars, String database, String schemaName, String username,String password) 
	{
		System.out.println(" I am in createconnection");
		String url1=null;
		try {
			if(database.equalsIgnoreCase("mysql")){
				String hostadd=  Vars.host_name.trim();
				InetAddress ipaddr =InetAddress.getByName(Vars.Varshost_name.trim());
				Class.forName("com.mysql.jdbc.Driver");
				String url = "jdbc:mysql://"+Vars.Varshost_name+":"+Vars.portnumber+"/"+schemaName;
				if (Vars.captureperform == true) {
					screenShot(Vars);//Vars.getTestCaseID(), Vars.getTestStepID(), Vars.getTestCaseName());
				}
				return url;
			}
			else if(database.equalsIgnoreCase("mssql")){
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				url1 = "jdbc:sqlserver://";
				String hostname =Vars.host_name;
				String db = "databasename="+schemaName;
				String user = "user="+username;
				String pass  ="password="+password;
				String url =url1+Vars.host_name+";"+db+";"+user+";"+pass+";";
				return url;
			}
			else{
				System.out.println(database+" is not handeled as database in this version of  framework");
				Log.info("This framework in not handeled database ");
				//if (captureperform == true) {
				screenShot(Vars);
				//}
				return url1;
			}
		} catch (Exception e) {
			try {
				Log.info("It is invalidConnection ");
				//if (captureperform == true) {
				screenShot(Vars);
				//}
			} catch (IOException e1) {
				System.out.println("Invalid Connection  "+e1.getMessage());
				Log.info( "Invalid Connection  "+e1.getMessage());

			} catch (Exception e2) {
				System.out.println("Error Occured in update_Report Function "+e2.getMessage());
				Log.info("Error Occured in update_Report Function "+e2.getMessage());
			}
		} 
		return url1;
	}



	/**************************************************************************************************************
	 * Function=executeQuery
	 * Description=This function is used executeQuery from data base
	 /****************************************************************************************************************
	 */

	protected static void executeQuery(ResultSet rs){
		String resultfile =null;
		File file = new File("Temp");
		boolean result=false; 
		if(!file.exists()){
			System.out.println("Creating Directory - "+file);;
			try{
				file.mkdir();
				result = true;
			}catch(SecurityException se){
				System.out.println(se.getMessage());
				Log.info("SecurityException Error Occured in executeQuery  "+se.getMessage());
			}
		}
		if(result){
			System.out.println("Direcotry is already Created");
			Log.info("Direcotry is already Created");
		}
		String workingDir = System.getProperty("user.dir");
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date date = new Date();
		String CurrentDate= dateFormat.format(date);
		String filepath=workingDir+"\\"+"Temp"+"\\"+CurrentDate+"."+"xlsx";
		resultfile = filepath;
		String SheetName ="dbData";
		try {
			FileOutputStream fo = new FileOutputStream(filepath);
			XSSFWorkbook workbook = new XSSFWorkbook(); 
			ws = workbook.createSheet(SheetName);
			FormulaEvaluator wbevaluator = workbook.getCreationHelper().createFormulaEvaluator();
			//if(update.equalsIgnoreCase("yes")){
			wbevaluator.evaluateAll();
			//}
			if (!resultfile.endsWith(".xlsx")){
				System.out.println("Please correct Excel file extension, Data can be exported to only .xlsx file");
				System.out.println("nofetchdata");
			}else{
				rs.beforeFirst(); 
				XSSFCell cell =null;
				ResultSetMetaData rsmd= (ResultSetMetaData) rs.getMetaData();
				int column = rsmd.getColumnCount();
				String columnname = rsmd.getColumnLabel(1);
				int rowcount=0;
				while(rs.next()){
					rowcount++;
				}
				rs.beforeFirst();
				int tempj=0;
				while(rs.next()){                      //Writing Column Name in excel
					XSSFRow row = ws.createRow(rowcount);
					for(int c =0;c<column;c++){
						cell = row.createCell(c);
						cell.setCellValue(rsmd.getColumnLabel(c+1)+0+" "+c);								
					}
				}
				rs.beforeFirst();
				int i=0;
				tempj=1;
				while(rs.next()){
					for(int c =0;c<column;c++){
						cell.setCellValue(rs.getString(c+1)+tempj+" "+c);
					}
					tempj++;
				}
				try {
					FileOutputStream fileOut = new FileOutputStream(filepath);
					workbook.write(fileOut);
					workbook.close();
					fo.close();
				} catch (IOException e) {
					Log.info("IO Exception Occured in executeQuery -  while Writing data into Excel"+e.getMessage());
					System.out.println("IO Exception Occured, while Writing data into Excel "+e);
				}
			}	
		} catch (SQLException e) {
			System.out.println(" SQLException occured in connection with DB, check your credentials are correct "+e);
			Log.info(" SQLException occured in executeQuery -  while connection with DB, check your credentials are correct "+e.getMessage());
		} catch (IOException e) {
			System.out.println("IO exception occured in executeQuery function  "+e.getMessage());
			Log.info("IO Exception Occured in executeQuery -   "+e.getMessage());
		}
	}



	/*********************************************************************************************************
	 * Function:screenShot
	 * Description: This function is used to take the screen short.
	 /*********************************************************************************************************** 
	 */

	public static  void screenShot(LocalTC Vars) throws Exception {
		try {
			int loopn =	Vars.getTestCaseID();
			int initscreenFlag = 1;
			int rown = Vars.getTestStepID();
			String Sname = Vars.getTestCaseName();
			RemoteWebDriver driver = (RemoteWebDriver) BrowserFactory.getBrowser(Vars);
			if (devFlag == 0) {
				screenshotflag = screenshotflag + 1;
				DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HH-mm-ss");
				Date date = new Date();
				String filenamer = "";
				String strTime = dateFormat.format(date);
				if(Sname.contains("-"))
				Sname = Sname.substring(0, Sname.indexOf("-")).trim();
				else if(Sname.contains("."))
					Sname = Sname.substring(0, Sname.indexOf(".")).trim();
				String ScreenFolder = Sname;
				String screenReport = Constant.Path_ScreenShot;
				String ScreenshotPath = screenReport  + Sname;


				screenReport = screenReport.toLowerCase();

				if (screenReport == "") {
					screenReport = Constant.tempTestReportPath;
					initscreenFlag = 2;
				}

				if (!screenReport.endsWith("\\")) {
					screenReport = screenReport + "\\";

				}
				if (!(screenReport.contains("screen"))) {
					screenReport = screenReport + "Screenshot\\";

				}
				initscreen = initscreen + 1;
				if (initscreen == 2 && initscreenFlag == 2) {
					System.out.println("Screenshots will be captured in the following path since the SCREENSHOTS PATH IS NOT GIVEN." + screenReport);
					Log.info("Screenshots will be captured in the following path since the SCREENSHOTS PATH IS NOT GIVEN    " + screenReport  );
				}

				else {
					if (initscreen == 2) {
						File f1s = new File(screenReport);
						if (!screenReport.substring(0,screenReport.length() - 1).
								equalsIgnoreCase(f1s.getAbsolutePath().toString()))

						{
							System.out.println("Screenshots will be captured in the following path since the given SCREENSHOTS PATH IS NOT AVAILABLE.");
							Log.info("Screenshots will be captured in the following path since the given SCREENSHOTS PATH IS NOT AVAILABLE   " +f1s.getAbsolutePath().toString() );
							System.out.println(f1s.getAbsolutePath().toString());

						}
						f1s.delete();
					}
				}
				filenamer = screenReport + Sname + "\\" + Sname + "_"
						+ screenshotflag + "_rowno_" + Vars.row + "_"
						+ strTime + ".png";


				if (Vars.getScreenshotTypeFlag() == 0) {
					File screenshot = driver.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshot, new File(filenamer));

				} else {

					BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit
							.getDefaultToolkit().getScreenSize()));
					File outputfile = new File(filenamer);
					outputfile.mkdirs();
					ImageIO.write(image, "png", outputfile);
					Thread.sleep(3000);
				}
			}
			else { 
				Log.info("It is not for device..");
			}
		}
		catch (Exception e) {
			System.out.println("Screenshot was not printed. Check the file path");
			Log.info("Screenshot was not printed. Check the file path");
		}
	}
	
	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			Log.info(" Exception Occured in isInteger- " +e.getMessage()); 
			return false;
		}
	}

	// Single Argument
	public static void Display(String Name)
	{
		System.out.println(Name);
	}

	// three
	public static void Display(String Name,String Name2,String Name3)
	{
		System.out.println(Name+ " "+Name2+ " "+Name3+ " ");
	}

	/*
	 * Method for getting connection with database
	 */
	protected static boolean getConnection(String url) {
		boolean parameter = false;
		SQLException errorString = null;
		try {
			if (Constant.Vars.database.equalsIgnoreCase("mssql")) {
				Constant.Vars.con = DriverManager.getConnection(url);
				Constant.Vars.stmt = Constant.Vars.con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE);
				Constant.Vars.rs = Constant.Vars.stmt.executeQuery(Constant.Vars.getObj());
				Constant.Vars.isconnected = true;
				return Constant.Vars.isconnected;
			} else if (Constant.Vars.database.equalsIgnoreCase("mysql")) {
				System.out.println("In get connection part of MSSQL");
				Constant.Vars.con = DriverManager.getConnection(url, Constant.Vars.username, Constant.Vars.password);
				Constant.Vars.stmt = Constant.Vars.con.createStatement();
				Constant.Vars.rs = Constant.Vars.stmt.executeQuery(Constant.Vars.getObj());
				Constant.Vars.isconnected = true;
				return Constant.Vars.isconnected;
			}
			return Constant.Vars.isconnected;
		} catch (SQLException e) {
			errorString = e;
			Log.info(
					"Connection to Database is failed, please verify connection URL parameters which are set in Selenium Utility File  "
							+ e.getMessage());
			System.out.println(
					"Connection to Database is failed, please verify connection URL parameters which are set in Selenium Utility File  "
							+ e.getMessage());
			return Constant.Vars.isconnected;
		}
	}
	public static void updateExcellSheet(LocalTC Vars) throws Exception{
		if(Vars.ResultStatus.equals("Passed")){
			Vars.setActualResult(Vars.getTestStep());
	
			try {
	       
				  FileInputStream file = new FileInputStream(Vars.sTestRunPath);
	         
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	             XSSFSheet sheet = workbook.getSheet("Test Runs");
	              XSSFCell cell = null;
	            //Update the value of cell
	            cell = sheet.getRow(Vars.row).getCell(9);
	            cell.setCellValue(Vars.ResultStatus);
	            cell = sheet.getRow(Vars.row).getCell(10);
	            cell.setCellValue(Vars.getActualResult());
	            Vars.getResultsStatus().add(Vars.ResultStatus);

	            file.close();
   
       FileOutputStream outFile =new FileOutputStream(new File(Vars.sTestRunPath));
	            workbook.write(outFile);
	            outFile.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
		}
		
	 else {
			try {
			       
				  FileInputStream file = new FileInputStream(Vars.sTestRunPath);
	         
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	             XSSFSheet sheet = workbook.getSheet("Test Runs");
	              XSSFCell cell = null;
	            //Update the value of cell
	            cell = sheet.getRow(Vars.row).getCell(9);
	            cell.setCellValue(Vars.ResultStatus);
	            cell = sheet.getRow(Vars.row).getCell(10);
	            cell.setCellValue(Vars.getActualResult());
	            Vars.getResultsStatus().add(Vars.ResultStatus);

	            file.close();
 
     FileOutputStream outFile =new FileOutputStream(new File(Vars.sTestRunPath));
	            workbook.write(outFile);
	            outFile.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	            
	           
	       }
		}
		
	}
	
	
	
	
}






