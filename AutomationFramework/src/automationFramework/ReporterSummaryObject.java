package automationFramework;

/********************************************************************************************************
 *Project Name		: Ignite Automation framework 
 *Author		    : mohammad.makki
 *Version	    	: V1.0
 *Date of Creation	: 17-08-2017
 *Date Last modified: 
 *Description       : bean file for storing the object of summary report
 *Functions			: 
 *
 ********************************************************************************************************
 */
public class ReporterSummaryObject {
	public int reportSummaryTestCaseID;
	public String reportSummaryTestCaseName;
	public String reportSummaryTestCaseStatus;
	public String reportSummaryScreenShot;
	
	public int getReportSummaryTestCaseID() {
		return reportSummaryTestCaseID;
	}
	public void setReportSummaryTestCaseID(int reportSummaryTestCaseID) {
		this.reportSummaryTestCaseID = reportSummaryTestCaseID;
	}
	public String getReportSummaryTestCaseName() {
		return reportSummaryTestCaseName;
	}
	public void setReportSummaryTestCaseName(String reportSummaryTestCaseName) {
		this.reportSummaryTestCaseName = reportSummaryTestCaseName;
	}
	public String getReportSummaryTestCaseStatus() {
		return reportSummaryTestCaseStatus;
	}
	public void setReportSummaryTestCaseStatus(String reportSummaryTestCaseStatus) {
		this.reportSummaryTestCaseStatus = reportSummaryTestCaseStatus;
	}
	public String getReportSummaryScreenShot() {
		return reportSummaryScreenShot;
	}
	public void setReportSummaryScreenShot(String reportSummaryScreenShot) {
		this.reportSummaryScreenShot = reportSummaryScreenShot;
	}
	
}
