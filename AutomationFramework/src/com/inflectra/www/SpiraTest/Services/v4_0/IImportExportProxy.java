package com.inflectra.www.SpiraTest.Services.v4_0;

public class IImportExportProxy implements com.inflectra.www.SpiraTest.Services.v4_0.IImportExport {
  private String _endpoint = null;
  private com.inflectra.www.SpiraTest.Services.v4_0.IImportExport iImportExport = null;
  
  public IImportExportProxy() {
    _initIImportExportProxy();
  }
  
  public IImportExportProxy(String endpoint) {
    _endpoint = endpoint;
    _initIImportExportProxy();
  }
  
  private void _initIImportExportProxy() {
    try {
      iImportExport = (new com.inflectra.www.SpiraTest.Services.v4_0.ImportExportLocator()).getBasicHttpBinding_IImportExport();
      if (iImportExport != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iImportExport)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iImportExport)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iImportExport != null)
      ((javax.xml.rpc.Stub)iImportExport)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.inflectra.www.SpiraTest.Services.v4_0.IImportExport getIImportExport() {
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport;
  }
  
  public java.lang.Boolean connection_Authenticate(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.connection_Authenticate(userName, password);
  }
  
  public java.lang.Boolean connection_Authenticate2(java.lang.String userName, java.lang.String password, java.lang.String plugInName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.connection_Authenticate2(userName, password, plugInName);
  }
  
  public java.lang.Boolean connection_ConnectToProject(java.lang.Integer projectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.connection_ConnectToProject(projectId);
  }
  
  public void connection_Disconnect() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.connection_Disconnect();
  }
  
  public java.lang.String system_GetProductName() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.system_GetProductName();
  }
  
  public java.util.Calendar system_GetServerDateTime() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.system_GetServerDateTime();
  }
  
  public java.lang.String system_GetWebServerUrl() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.system_GetWebServerUrl();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveByFolder(java.lang.Integer testCaseFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveByFolder(testCaseFolderId);
  }
  
  public void testCase_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase remoteTestCase) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testCase_Update(remoteTestCase);
  }
  
  public void testCase_Delete(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testCase_Delete(testCaseId);
  }
  
  public void testCase_Move(java.lang.Integer testCaseId, java.lang.Integer destinationTestCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testCase_Move(testCaseId, destinationTestCaseId);
  }
  
  public void testCase_MoveStep(java.lang.Integer testCaseId, java.lang.Integer sourceTestStepId, java.lang.Integer destinationTestStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testCase_MoveStep(testCaseId, sourceTestStepId, destinationTestStepId);
  }
  
  public void testCase_DeleteStep(java.lang.Integer testCaseId, java.lang.Integer testStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testCase_DeleteStep(testCaseId, testStepId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep testCase_AddStep(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep remoteTestStep, java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_AddStep(remoteTestStep, testCaseId);
  }
  
  public java.lang.Integer testCase_AddLink(java.lang.Integer testCaseId, java.lang.Integer position, java.lang.Integer linkedTestCaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[] parameters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_AddLink(testCaseId, position, linkedTestCaseId, parameters);
  }
  
  public void testCase_AddUpdateAutomationScript(java.lang.Integer testCaseId, java.lang.Integer automationEngineId, java.lang.String urlOrFilename, java.lang.String description, byte[] binaryData, java.lang.String version, java.lang.Integer projectAttachmentTypeId, java.lang.Integer projectAttachmentFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testCase_AddUpdateAutomationScript(testCaseId, automationEngineId, urlOrFilename, description, binaryData, version, projectAttachmentTypeId, projectAttachmentFolderId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] testCase_RetrieveComments(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveComments(testCaseId);
  }
  
  public java.lang.Long testCase_CountForFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer parentID) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_CountForFolder(remoteFilters, parentID);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment testCase_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_CreateComment(remoteComment);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_CreateFromTestCases(int[] testCaseIds, java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_CreateFromTestCases(testCaseIds, releaseId);
  }
  
  public java.lang.Long testRun_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_Count(remoteFilters);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_CreateFromTestSet(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_CreateFromTestSet(testSetId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_CreateForAutomationHost(java.lang.String automationHostToken, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange dateRange) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_CreateForAutomationHost(automationHostToken, dateRange);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_CreateForAutomatedTestSet(java.lang.Integer testSetId, java.lang.String automationHostToken) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_CreateForAutomatedTestSet(testSetId, automationHostToken);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun testRun_RecordAutomated1(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun remoteTestRun) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RecordAutomated1(remoteTestRun);
  }
  
  public java.lang.Integer testRun_RecordAutomated2(java.lang.String userName, java.lang.String password, java.lang.Integer projectId, java.lang.Integer testerUserId, java.lang.Integer testCaseId, java.lang.Integer releaseId, java.lang.Integer testSetId, java.lang.Integer testSetTestCaseId, java.lang.Integer buildId, java.util.Calendar startDate, java.util.Calendar endDate, java.lang.Integer executionStatusId, java.lang.String runnerName, java.lang.String runnerTestName, java.lang.Integer runnerAssertCount, java.lang.String runnerMessage, java.lang.String runnerStackTrace, java.lang.Integer testRunFormatId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RecordAutomated2(userName, password, projectId, testerUserId, testCaseId, releaseId, testSetId, testSetTestCaseId, buildId, startDate, endDate, executionStatusId, runnerName, runnerTestName, runnerAssertCount, runnerMessage, runnerStackTrace, testRunFormatId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_RecordAutomated3(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] remoteTestRuns) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RecordAutomated3(remoteTestRuns);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun[] testRun_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_Retrieve(remoteFilters, remoteSort, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_RetrieveManual(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RetrieveManual(remoteFilters, remoteSort, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_RetrieveAutomated(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RetrieveAutomated(remoteFilters, remoteSort, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun testRun_RetrieveById(java.lang.Integer testRunId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RetrieveById(testRunId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun testRun_RetrieveAutomatedById(java.lang.Integer testRunId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RetrieveAutomatedById(testRunId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun testRun_RetrieveManualById(java.lang.Integer testRunId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_RetrieveManualById(testRunId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_Save(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] remoteTestRuns, java.util.Calendar endDate) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testRun_Save(remoteTestRuns, endDate);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[] testSet_AddTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping remoteTestSetTestCaseMapping, java.lang.Integer existingTestSetTestCaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[] parameters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_AddTestMapping(remoteTestSetTestCaseMapping, existingTestSetTestCaseId, parameters);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet testSet_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet remoteTestSet, java.lang.Integer parentTestSetFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_Create(remoteTestSet, parentTestSetFolderId);
  }
  
  public java.lang.Long testSet_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_Count(remoteFilters);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet testSet_CreateFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet remoteTestSet, java.lang.Integer parentTestSetFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_CreateFolder(remoteTestSet, parentTestSetFolderId);
  }
  
  public void testSet_RemoveTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping remoteTestSetTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testSet_RemoveTestMapping(remoteTestSetTestCaseMapping);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[] testSet_RetrieveTestCaseMapping(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_RetrieveTestCaseMapping(testSetId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[] testSet_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_Retrieve(remoteFilters, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet testSet_RetrieveById(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_RetrieveById(testSetId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[] testSet_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_RetrieveForOwner();
  }
  
  public void testSet_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet remoteTestSet) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testSet_Update(remoteTestSet);
  }
  
  public void testSet_Delete(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testSet_Delete(testSetId);
  }
  
  public void testSet_Move(java.lang.Integer testSetId, java.lang.Integer destinationTestSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.testSet_Move(testSetId, destinationTestSetId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] testSet_RetrieveComments(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_RetrieveComments(testSetId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment testSet_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testSet_CreateComment(remoteComment);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser user_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser remoteUser, java.lang.String password, java.lang.String passwordQuestion, java.lang.String passwordAnswer, java.lang.Integer projectRoleId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.user_Create(remoteUser, password, passwordQuestion, passwordAnswer, projectRoleId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser user_RetrieveById(java.lang.Integer userId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.user_RetrieveById(userId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser user_RetrieveByUserName(java.lang.String userName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.user_RetrieveByUserName(userName);
  }
  
  public void user_Delete(java.lang.Integer userId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.user_Delete(userId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost[] automationHost_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationHost_Retrieve(remoteFilters, remoteSort, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost automationHost_RetrieveById(java.lang.Integer automationHostId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationHost_RetrieveById(automationHostId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost automationHost_RetrieveByToken(java.lang.String token) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationHost_RetrieveByToken(token);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost automationHost_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost remoteAutomationHost) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationHost_Create(remoteAutomationHost);
  }
  
  public void automationHost_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost remoteAutomationHost) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.automationHost_Update(remoteAutomationHost);
  }
  
  public void automationHost_Delete(java.lang.Integer automationHostId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.automationHost_Delete(automationHostId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine automationEngine_RetrieveByToken(java.lang.String token) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationEngine_RetrieveByToken(token);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine[] automationEngine_Retrieve(java.lang.Boolean activeOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationEngine_Retrieve(activeOnly);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine automationEngine_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine remoteEngine) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationEngine_Create(remoteEngine);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine automationEngine_RetrieveById(java.lang.Integer automationEngineId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.automationEngine_RetrieveById(automationEngineId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild[] build_RetrieveByReleaseId(java.lang.Integer releaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.build_RetrieveByReleaseId(releaseId, remoteFilters, remoteSort, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild build_RetrieveById(java.lang.Integer releaseId, java.lang.Integer buildId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.build_RetrieveById(releaseId, buildId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild build_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild remoteBuild) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.build_Create(remoteBuild);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty[] customProperty_RetrieveForArtifactType(java.lang.Integer artifactTypeId, java.lang.Boolean includeDeleted) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.customProperty_RetrieveForArtifactType(artifactTypeId, includeDeleted);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList customProperty_AddCustomList(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList remoteCustomList) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.customProperty_AddCustomList(remoteCustomList);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue customProperty_AddCustomListValue(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue remoteCustomListValue) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.customProperty_AddCustomListValue(remoteCustomListValue);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty customProperty_AddDefinition(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty remoteCustomProperty, java.lang.Integer customListId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.customProperty_AddDefinition(remoteCustomProperty, customListId);
  }
  
  public void customProperty_UpdateDefinition(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty remoteCustomProperty) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.customProperty_UpdateDefinition(remoteCustomProperty);
  }
  
  public void customProperty_DeleteDefinition(java.lang.Integer customPropertyId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.customProperty_DeleteDefinition(customPropertyId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList customProperty_RetrieveCustomListById(java.lang.Integer customListId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.customProperty_RetrieveCustomListById(customListId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList[] customProperty_RetrieveCustomLists() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.customProperty_RetrieveCustomLists();
  }
  
  public void customProperty_UpdateCustomList(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList remoteCustomList) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.customProperty_UpdateCustomList(remoteCustomList);
  }
  
  public void dataMapping_AddArtifactMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] remoteDataMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.dataMapping_AddArtifactMappings(dataSyncSystemId, artifactTypeId, remoteDataMappings);
  }
  
  public void dataMapping_AddUserMappings(java.lang.Integer dataSyncSystemId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] remoteDataMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.dataMapping_AddUserMappings(dataSyncSystemId, remoteDataMappings);
  }
  
  public void dataMapping_RemoveArtifactMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] remoteDataMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.dataMapping_RemoveArtifactMappings(dataSyncSystemId, artifactTypeId, remoteDataMappings);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveArtifactMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.dataMapping_RetrieveArtifactMappings(dataSyncSystemId, artifactTypeId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping dataMapping_RetrieveCustomPropertyMapping(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, java.lang.Integer customPropertyId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.dataMapping_RetrieveCustomPropertyMapping(dataSyncSystemId, artifactTypeId, customPropertyId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveCustomPropertyValueMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, java.lang.Integer customPropertyId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.dataMapping_RetrieveCustomPropertyValueMappings(dataSyncSystemId, artifactTypeId, customPropertyId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveFieldValueMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactFieldId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.dataMapping_RetrieveFieldValueMappings(dataSyncSystemId, artifactFieldId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveProjectMappings(java.lang.Integer dataSyncSystemId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.dataMapping_RetrieveProjectMappings(dataSyncSystemId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveUserMappings(java.lang.Integer dataSyncSystemId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.dataMapping_RetrieveUserMappings(dataSyncSystemId);
  }
  
  public byte[] document_OpenFile(java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_OpenFile(attachmentId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument document_AddFile(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument remoteDocument, byte[] binaryData) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_AddFile(remoteDocument, binaryData);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument document_AddUrl(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument remoteDocument) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_AddUrl(remoteDocument);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion document_AddFileVersion(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion remoteDocumentVersion, byte[] binaryData, java.lang.Boolean makeCurrent) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_AddFileVersion(remoteDocumentVersion, binaryData, makeCurrent);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion document_AddUrlVersion(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion remoteDocumentVersion, java.lang.Boolean makeCurrent) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_AddUrlVersion(remoteDocumentVersion, makeCurrent);
  }
  
  public void document_DeleteFromArtifact(java.lang.Integer attachmentId, java.lang.Integer artifactTypeId, java.lang.Integer artifactId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.document_DeleteFromArtifact(attachmentId, artifactTypeId, artifactId);
  }
  
  public void document_Delete(java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.document_Delete(attachmentId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[] document_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_Retrieve(remoteFilters, remoteSort, startingRow, numberRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[] document_RetrieveForFolder(java.lang.Integer folderId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_RetrieveForFolder(folderId, remoteFilters, remoteSort, startingRow, numberRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[] document_RetrieveForArtifact(java.lang.Integer artifactTypeId, java.lang.Integer artifactId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_RetrieveForArtifact(artifactTypeId, artifactId, remoteFilters, remoteSort);
  }
  
  public void document_AddToArtifactId(java.lang.Integer artifactTypeId, java.lang.Integer artifactId, java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.document_AddToArtifactId(artifactTypeId, artifactId, attachmentId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument document_RetrieveById(java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_RetrieveById(attachmentId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType[] document_RetrieveTypes(java.lang.Boolean activeOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_RetrieveTypes(activeOnly);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder[] document_RetrieveFolders() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_RetrieveFolders();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder document_RetrieveFolderById(java.lang.Integer folderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_RetrieveFolderById(folderId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder document_AddFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder remoteDocumentFolder) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.document_AddFolder(remoteDocumentFolder);
  }
  
  public void document_DeleteFolder(java.lang.Integer projectAttachmentFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.document_DeleteFolder(projectAttachmentFolderId);
  }
  
  public void document_UpdateFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder remoteDocumentFolder) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.document_UpdateFolder(remoteDocumentFolder);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation association_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation remoteAssociation) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.association_Create(remoteAssociation);
  }
  
  public void association_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation remoteAssociation) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.association_Update(remoteAssociation);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation[] association_RetrieveForArtifact(java.lang.Integer artifactTypeId, java.lang.Integer artifactId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.association_RetrieveForArtifact(artifactTypeId, artifactId, remoteFilters, remoteSort);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority incident_AddPriority(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority remoteIncidentPriority) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_AddPriority(remoteIncidentPriority);
  }
  
  public java.lang.Long incident_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_Count(remoteFilters);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] incident_AddComments(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] remoteComments) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_AddComments(remoteComments);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity incident_AddSeverity(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity remoteIncidentSeverity) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_AddSeverity(remoteIncidentSeverity);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus incident_AddStatus(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus remoteIncidentStatus) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_AddStatus(remoteIncidentStatus);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType incident_AddType(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType remoteIncidentType) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_AddType(remoteIncidentType);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident incident_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident remoteIncident) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_Create(remoteIncident);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_Retrieve(remoteFilters, remoteSort, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident incident_RetrieveById(java.lang.Integer incidentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveById(incidentId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveByTestCase(java.lang.Integer testCaseId, java.lang.Boolean openOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveByTestCase(testCaseId, openOnly);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveByTestRunStep(java.lang.Integer testRunStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveByTestRunStep(testRunStepId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveByTestStep(java.lang.Integer testStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveByTestStep(testStepId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveForOwner();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveNew(java.util.Calendar creationDate, java.lang.Integer startRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveNew(creationDate, startRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority[] incident_RetrievePriorities() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrievePriorities();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] incident_RetrieveComments(java.lang.Integer incidentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveComments(incidentId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity[] incident_RetrieveSeverities() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveSeverities();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus[] incident_RetrieveStatuses() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveStatuses();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType[] incident_RetrieveTypes() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveTypes();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields[] incident_RetrieveWorkflowFields(java.lang.Integer currentTypeId, java.lang.Integer currentStatusId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveWorkflowFields(currentTypeId, currentStatusId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition[] incident_RetrieveWorkflowTransitions(java.lang.Integer currentTypeId, java.lang.Integer currentStatusId, java.lang.Boolean isDetector, java.lang.Boolean isOwner) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveWorkflowTransitions(currentTypeId, currentStatusId, isDetector, isOwner);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties[] incident_RetrieveWorkflowCustomProperties(java.lang.Integer currentTypeId, java.lang.Integer currentStatusId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveWorkflowCustomProperties(currentTypeId, currentStatusId);
  }
  
  public void incident_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident remoteIncident) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.incident_Update(remoteIncident);
  }
  
  public void incident_Delete(java.lang.Integer incidentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.incident_Delete(incidentId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus incident_RetrieveDefaultStatus() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveDefaultStatus();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType incident_RetrieveDefaultType() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.incident_RetrieveDefaultType();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject project_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject remoteProject, java.lang.Integer existingProjectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.project_Create(remoteProject, existingProjectId);
  }
  
  public void project_Delete(java.lang.Integer projectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.project_Delete(projectId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject[] project_Retrieve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.project_Retrieve();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject project_RetrieveById(java.lang.Integer projectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.project_RetrieveById(projectId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser[] project_RetrieveUserMembership() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.project_RetrieveUserMembership();
  }
  
  public void project_RefreshProgressExecutionStatusCaches(java.lang.Integer releaseId, java.lang.Boolean runInBackground) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.project_RefreshProgressExecutionStatusCaches(releaseId, runInBackground);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole[] projectRole_Retrieve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.projectRole_Retrieve();
  }
  
  public void release_AddTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping remoteReleaseTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.release_AddTestMapping(remoteReleaseTestCaseMapping);
  }
  
  public void release_AddTestMapping2(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[] remoteReleaseTestCaseMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.release_AddTestMapping2(remoteReleaseTestCaseMappings);
  }
  
  public java.lang.Long release_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_Count(remoteFilters);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease release_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease remoteRelease, java.lang.Integer parentReleaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_Create(remoteRelease, parentReleaseId);
  }
  
  public void release_RemoveTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping remoteReleaseTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.release_RemoveTestMapping(remoteReleaseTestCaseMapping);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[] release_Retrieve(java.lang.Boolean activeOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_Retrieve(activeOnly);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[] release_Retrieve2(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_Retrieve2(remoteFilters, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease release_RetrieveById(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_RetrieveById(releaseId);
  }
  
  public void release_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease remoteRelease) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.release_Update(remoteRelease);
  }
  
  public void release_Delete(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.release_Delete(releaseId);
  }
  
  public void release_Move(java.lang.Integer releaseId, java.lang.Integer destinationReleaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.release_Move(releaseId, destinationReleaseId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] release_RetrieveComments(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_RetrieveComments(releaseId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[] release_RetrieveTestMapping(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_RetrieveTestMapping(releaseId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment release_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.release_CreateComment(remoteComment);
  }
  
  public void requirement_AddTestCoverage(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping remoteReqTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.requirement_AddTestCoverage(remoteReqTestCaseMapping);
  }
  
  public java.lang.Long requirement_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_Count(remoteFilters);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement requirement_Create1(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement remoteRequirement, java.lang.Integer indentPosition) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_Create1(remoteRequirement, indentPosition);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement requirement_Create2(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement remoteRequirement, java.lang.Integer parentRequirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_Create2(remoteRequirement, parentRequirementId);
  }
  
  public void requirement_RemoveTestCoverage(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping remoteReqTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.requirement_RemoveTestCoverage(remoteReqTestCaseMapping);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[] requirement_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_Retrieve(remoteFilters, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement requirement_RetrieveById(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_RetrieveById(requirementId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[] requirement_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_RetrieveForOwner();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping[] requirement_RetrieveTestCoverage(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_RetrieveTestCoverage(requirementId);
  }
  
  public void requirement_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement remoteRequirement) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.requirement_Update(remoteRequirement);
  }
  
  public void requirement_Delete(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.requirement_Delete(requirementId);
  }
  
  public void requirement_Move(java.lang.Integer requirementId, java.lang.Integer destinationRequirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.requirement_Move(requirementId, destinationRequirementId);
  }
  
  public void requirement_Indent(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.requirement_Indent(requirementId);
  }
  
  public void requirement_Outdent(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.requirement_Outdent(requirementId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] requirement_RetrieveComments(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_RetrieveComments(requirementId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment requirement_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.requirement_CreateComment(remoteComment);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteVersion system_GetProductVersion() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.system_GetProductVersion();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting[] system_GetSettings() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.system_GetSettings();
  }
  
  public java.lang.String system_GetArtifactUrl(java.lang.Integer navigationLinkId, java.lang.Integer projectId, java.lang.Integer artifactId, java.lang.String tabName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.system_GetArtifactUrl(navigationLinkId, projectId, artifactId, tabName);
  }
  
  public java.lang.Integer system_GetProjectIdForArtifact(java.lang.Integer artifactTypeId, java.lang.Integer artifactId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.system_GetProjectIdForArtifact(artifactTypeId, artifactId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask task_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask remoteTask) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_Create(remoteTask);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[] task_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_Retrieve(remoteFilters, remoteSort, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask task_RetrieveById(java.lang.Integer taskId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_RetrieveById(taskId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[] task_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_RetrieveForOwner();
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[] task_RetrieveNew(java.util.Calendar creationDate, java.lang.Integer startRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_RetrieveNew(creationDate, startRow, numberOfRows);
  }
  
  public void task_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask remoteTask) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.task_Update(remoteTask);
  }
  
  public java.lang.Long task_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_Count(remoteFilters);
  }
  
  public void task_Delete(java.lang.Integer taskId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    iImportExport.task_Delete(taskId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] task_RetrieveComments(java.lang.Integer taskId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_RetrieveComments(taskId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment task_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.task_CreateComment(remoteComment);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter testCase_AddParameter(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter remoteTestCaseParameter) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_AddParameter(remoteTestCaseParameter);
  }
  
  public java.lang.Long testCase_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_Count(remoteFilters);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase testCase_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase remoteTestCase, java.lang.Integer parentTestFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_Create(remoteTestCase, parentTestFolderId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase testCase_CreateFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase remoteTestCase, java.lang.Integer parentTestFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_CreateFolder(remoteTestCase, parentTestFolderId);
  }
  
  public java.lang.String testCase_CreateParameterToken(java.lang.String parameterName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_CreateParameterToken(parameterName);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_Retrieve(remoteFilters, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter[] testCase_RetrieveParameters(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveParameters(testCaseId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[] testCase_RetrieveStepParameters(java.lang.Integer testCaseId, java.lang.Integer testStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveStepParameters(testCaseId, testStepId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase testCase_RetrieveById(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveById(testCaseId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveByReleaseId(java.lang.Integer releaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveByReleaseId(releaseId, remoteFilters, startingRow, numberOfRows);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveByTestSetId(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveByTestSetId(testSetId);
  }
  
  public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage{
    if (iImportExport == null)
      _initIImportExportProxy();
    return iImportExport.testCase_RetrieveForOwner();
  }
  
  
}