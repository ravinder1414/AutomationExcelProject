package automationFramework;

import utility.Constant;
/********************************************************************************************************
 *Project Name		: Ignite Automation framework 
 *Author		    : Mohammad Sayemul Makki
 *Version	    	: V1.0
 *Date of Creation	: 25-07-2017
 *Date Last modified: 
 *Description       : bean file for storing the object of report
 *Functions			: 
 *
 ********************************************************************************************************
 */

public class ReporterObject {
	public String reportTestStepID;
	public String reportAction;
	public String reportCCellData;
	public String reportDCellData;
	public String reportComments;
	public String reportStrTime;
	public String reportRes_type;
	public String reportException;
	public String reportObjectEvent;
	public String reportObjectTestData;
	public int reporterObjectTestCaseId;
	public String reporterScreenFile;
	public String getReportTestStepID() {
		return reportTestStepID;
	}
	public void setReportTestStepID(String reportTestStepID) {
		this.reportTestStepID = reportTestStepID;
	}
	public String getReportAction() {
		return reportAction;
	}
	public void setReportAction(String reportAction) {
		this.reportAction = reportAction;
	}
	public String getReportCCellData() {
		return reportCCellData;
	}
	public void setReportCCellData(String reportCCellData) {
		this.reportCCellData = reportCCellData;
	}
	public String getReportDCellData() {
		return reportDCellData;
	}
	public void setReportDCellData(String reportDCellData) {
		this.reportDCellData = reportDCellData;
	}
	public String getReportComments() {
		return reportComments;
	}
	public void setReportComments(String reportComments) {
		this.reportComments = reportComments;
	}
	public String getReportStrTime() {
		return reportStrTime;
	}
	public void setReportStrTime(String reportStrTime) {
		this.reportStrTime = reportStrTime;
	}
	public String getReportRes_type() {
		return reportRes_type;
	}
	public void setReportRes_type(String reportRes_type) {
		this.reportRes_type = reportRes_type;
	}
	public String getReportException() {
		return reportException;
	}
	public void setReportException(String reportException) {
		this.reportException = reportException;
	}
	public String getReportObjectEvent() {
		return reportObjectEvent;
	}
	public void setReportObjectEvent(String reportObjectEvent) {
		this.reportObjectEvent = reportObjectEvent;
	}
	public String getReportObjectTestData() {
		return reportObjectTestData;
	}
	public void setReportObjectTestData(String reportObjectTestData) {
		this.reportObjectTestData = reportObjectTestData;
	}
	public int getReporterObjectTestCaseId() {
		return reporterObjectTestCaseId;
	}
	public void setReporterObjectTestCaseId(int reporterObjectTestCaseId) {
		this.reporterObjectTestCaseId = reporterObjectTestCaseId;
	}
	public String getReporterScreenFile() {
		return reporterScreenFile;
	}
	public void setReporterScreenFile(String reporterScreenFile) {
		this.reporterScreenFile = reporterScreenFile;
	}
}