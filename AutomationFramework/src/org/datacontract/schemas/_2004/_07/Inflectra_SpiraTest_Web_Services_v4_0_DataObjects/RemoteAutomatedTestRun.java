/**
 * RemoteAutomatedTestRun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteAutomatedTestRun  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun  implements java.io.Serializable {
    private java.lang.Integer automationAttachmentId;

    private java.lang.Integer automationEngineId;

    private java.lang.String automationEngineToken;

    private java.lang.Integer automationHostId;

    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[] parameters;

    private java.lang.Integer runnerAssertCount;

    private java.lang.String runnerMessage;

    private java.lang.String runnerName;

    private java.lang.String runnerStackTrace;

    private java.lang.String runnerTestName;

    private java.util.Calendar scheduledDate;

    private java.lang.Integer testRunFormatId;

    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[] testRunSteps;

    public RemoteAutomatedTestRun() {
    }

    public RemoteAutomatedTestRun(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.Integer actualDuration,
           java.lang.Integer buildId,
           java.util.Calendar endDate,
           java.lang.Integer estimatedDuration,
           java.lang.Integer executionStatusId,
           java.lang.String name,
           java.lang.Integer releaseId,
           java.util.Calendar startDate,
           java.lang.Integer testCaseId,
           java.lang.Integer testRunId,
           java.lang.Integer testRunTypeId,
           java.lang.Integer testSetId,
           java.lang.Integer testSetTestCaseId,
           java.lang.Integer testerId,
           java.lang.Integer automationAttachmentId,
           java.lang.Integer automationEngineId,
           java.lang.String automationEngineToken,
           java.lang.Integer automationHostId,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[] parameters,
           java.lang.Integer runnerAssertCount,
           java.lang.String runnerMessage,
           java.lang.String runnerName,
           java.lang.String runnerStackTrace,
           java.lang.String runnerTestName,
           java.util.Calendar scheduledDate,
           java.lang.Integer testRunFormatId,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[] testRunSteps) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId,
            actualDuration,
            buildId,
            endDate,
            estimatedDuration,
            executionStatusId,
            name,
            releaseId,
            startDate,
            testCaseId,
            testRunId,
            testRunTypeId,
            testSetId,
            testSetTestCaseId,
            testerId);
        this.automationAttachmentId = automationAttachmentId;
        this.automationEngineId = automationEngineId;
        this.automationEngineToken = automationEngineToken;
        this.automationHostId = automationHostId;
        this.parameters = parameters;
        this.runnerAssertCount = runnerAssertCount;
        this.runnerMessage = runnerMessage;
        this.runnerName = runnerName;
        this.runnerStackTrace = runnerStackTrace;
        this.runnerTestName = runnerTestName;
        this.scheduledDate = scheduledDate;
        this.testRunFormatId = testRunFormatId;
        this.testRunSteps = testRunSteps;
    }


    /**
     * Gets the automationAttachmentId value for this RemoteAutomatedTestRun.
     * 
     * @return automationAttachmentId
     */
    public java.lang.Integer getAutomationAttachmentId() {
        return automationAttachmentId;
    }


    /**
     * Sets the automationAttachmentId value for this RemoteAutomatedTestRun.
     * 
     * @param automationAttachmentId
     */
    public void setAutomationAttachmentId(java.lang.Integer automationAttachmentId) {
        this.automationAttachmentId = automationAttachmentId;
    }


    /**
     * Gets the automationEngineId value for this RemoteAutomatedTestRun.
     * 
     * @return automationEngineId
     */
    public java.lang.Integer getAutomationEngineId() {
        return automationEngineId;
    }


    /**
     * Sets the automationEngineId value for this RemoteAutomatedTestRun.
     * 
     * @param automationEngineId
     */
    public void setAutomationEngineId(java.lang.Integer automationEngineId) {
        this.automationEngineId = automationEngineId;
    }


    /**
     * Gets the automationEngineToken value for this RemoteAutomatedTestRun.
     * 
     * @return automationEngineToken
     */
    public java.lang.String getAutomationEngineToken() {
        return automationEngineToken;
    }


    /**
     * Sets the automationEngineToken value for this RemoteAutomatedTestRun.
     * 
     * @param automationEngineToken
     */
    public void setAutomationEngineToken(java.lang.String automationEngineToken) {
        this.automationEngineToken = automationEngineToken;
    }


    /**
     * Gets the automationHostId value for this RemoteAutomatedTestRun.
     * 
     * @return automationHostId
     */
    public java.lang.Integer getAutomationHostId() {
        return automationHostId;
    }


    /**
     * Sets the automationHostId value for this RemoteAutomatedTestRun.
     * 
     * @param automationHostId
     */
    public void setAutomationHostId(java.lang.Integer automationHostId) {
        this.automationHostId = automationHostId;
    }


    /**
     * Gets the parameters value for this RemoteAutomatedTestRun.
     * 
     * @return parameters
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this RemoteAutomatedTestRun.
     * 
     * @param parameters
     */
    public void setParameters(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[] parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the runnerAssertCount value for this RemoteAutomatedTestRun.
     * 
     * @return runnerAssertCount
     */
    public java.lang.Integer getRunnerAssertCount() {
        return runnerAssertCount;
    }


    /**
     * Sets the runnerAssertCount value for this RemoteAutomatedTestRun.
     * 
     * @param runnerAssertCount
     */
    public void setRunnerAssertCount(java.lang.Integer runnerAssertCount) {
        this.runnerAssertCount = runnerAssertCount;
    }


    /**
     * Gets the runnerMessage value for this RemoteAutomatedTestRun.
     * 
     * @return runnerMessage
     */
    public java.lang.String getRunnerMessage() {
        return runnerMessage;
    }


    /**
     * Sets the runnerMessage value for this RemoteAutomatedTestRun.
     * 
     * @param runnerMessage
     */
    public void setRunnerMessage(java.lang.String runnerMessage) {
        this.runnerMessage = runnerMessage;
    }


    /**
     * Gets the runnerName value for this RemoteAutomatedTestRun.
     * 
     * @return runnerName
     */
    public java.lang.String getRunnerName() {
        return runnerName;
    }


    /**
     * Sets the runnerName value for this RemoteAutomatedTestRun.
     * 
     * @param runnerName
     */
    public void setRunnerName(java.lang.String runnerName) {
        this.runnerName = runnerName;
    }


    /**
     * Gets the runnerStackTrace value for this RemoteAutomatedTestRun.
     * 
     * @return runnerStackTrace
     */
    public java.lang.String getRunnerStackTrace() {
        return runnerStackTrace;
    }


    /**
     * Sets the runnerStackTrace value for this RemoteAutomatedTestRun.
     * 
     * @param runnerStackTrace
     */
    public void setRunnerStackTrace(java.lang.String runnerStackTrace) {
        this.runnerStackTrace = runnerStackTrace;
    }


    /**
     * Gets the runnerTestName value for this RemoteAutomatedTestRun.
     * 
     * @return runnerTestName
     */
    public java.lang.String getRunnerTestName() {
        return runnerTestName;
    }


    /**
     * Sets the runnerTestName value for this RemoteAutomatedTestRun.
     * 
     * @param runnerTestName
     */
    public void setRunnerTestName(java.lang.String runnerTestName) {
        this.runnerTestName = runnerTestName;
    }


    /**
     * Gets the scheduledDate value for this RemoteAutomatedTestRun.
     * 
     * @return scheduledDate
     */
    public java.util.Calendar getScheduledDate() {
        return scheduledDate;
    }


    /**
     * Sets the scheduledDate value for this RemoteAutomatedTestRun.
     * 
     * @param scheduledDate
     */
    public void setScheduledDate(java.util.Calendar scheduledDate) {
        this.scheduledDate = scheduledDate;
    }


    /**
     * Gets the testRunFormatId value for this RemoteAutomatedTestRun.
     * 
     * @return testRunFormatId
     */
    public java.lang.Integer getTestRunFormatId() {
        return testRunFormatId;
    }


    /**
     * Sets the testRunFormatId value for this RemoteAutomatedTestRun.
     * 
     * @param testRunFormatId
     */
    public void setTestRunFormatId(java.lang.Integer testRunFormatId) {
        this.testRunFormatId = testRunFormatId;
    }


    /**
     * Gets the testRunSteps value for this RemoteAutomatedTestRun.
     * 
     * @return testRunSteps
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[] getTestRunSteps() {
        return testRunSteps;
    }


    /**
     * Sets the testRunSteps value for this RemoteAutomatedTestRun.
     * 
     * @param testRunSteps
     */
    public void setTestRunSteps(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[] testRunSteps) {
        this.testRunSteps = testRunSteps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteAutomatedTestRun)) return false;
        RemoteAutomatedTestRun other = (RemoteAutomatedTestRun) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.automationAttachmentId==null && other.getAutomationAttachmentId()==null) || 
             (this.automationAttachmentId!=null &&
              this.automationAttachmentId.equals(other.getAutomationAttachmentId()))) &&
            ((this.automationEngineId==null && other.getAutomationEngineId()==null) || 
             (this.automationEngineId!=null &&
              this.automationEngineId.equals(other.getAutomationEngineId()))) &&
            ((this.automationEngineToken==null && other.getAutomationEngineToken()==null) || 
             (this.automationEngineToken!=null &&
              this.automationEngineToken.equals(other.getAutomationEngineToken()))) &&
            ((this.automationHostId==null && other.getAutomationHostId()==null) || 
             (this.automationHostId!=null &&
              this.automationHostId.equals(other.getAutomationHostId()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.runnerAssertCount==null && other.getRunnerAssertCount()==null) || 
             (this.runnerAssertCount!=null &&
              this.runnerAssertCount.equals(other.getRunnerAssertCount()))) &&
            ((this.runnerMessage==null && other.getRunnerMessage()==null) || 
             (this.runnerMessage!=null &&
              this.runnerMessage.equals(other.getRunnerMessage()))) &&
            ((this.runnerName==null && other.getRunnerName()==null) || 
             (this.runnerName!=null &&
              this.runnerName.equals(other.getRunnerName()))) &&
            ((this.runnerStackTrace==null && other.getRunnerStackTrace()==null) || 
             (this.runnerStackTrace!=null &&
              this.runnerStackTrace.equals(other.getRunnerStackTrace()))) &&
            ((this.runnerTestName==null && other.getRunnerTestName()==null) || 
             (this.runnerTestName!=null &&
              this.runnerTestName.equals(other.getRunnerTestName()))) &&
            ((this.scheduledDate==null && other.getScheduledDate()==null) || 
             (this.scheduledDate!=null &&
              this.scheduledDate.equals(other.getScheduledDate()))) &&
            ((this.testRunFormatId==null && other.getTestRunFormatId()==null) || 
             (this.testRunFormatId!=null &&
              this.testRunFormatId.equals(other.getTestRunFormatId()))) &&
            ((this.testRunSteps==null && other.getTestRunSteps()==null) || 
             (this.testRunSteps!=null &&
              java.util.Arrays.equals(this.testRunSteps, other.getTestRunSteps())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAutomationAttachmentId() != null) {
            _hashCode += getAutomationAttachmentId().hashCode();
        }
        if (getAutomationEngineId() != null) {
            _hashCode += getAutomationEngineId().hashCode();
        }
        if (getAutomationEngineToken() != null) {
            _hashCode += getAutomationEngineToken().hashCode();
        }
        if (getAutomationHostId() != null) {
            _hashCode += getAutomationHostId().hashCode();
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRunnerAssertCount() != null) {
            _hashCode += getRunnerAssertCount().hashCode();
        }
        if (getRunnerMessage() != null) {
            _hashCode += getRunnerMessage().hashCode();
        }
        if (getRunnerName() != null) {
            _hashCode += getRunnerName().hashCode();
        }
        if (getRunnerStackTrace() != null) {
            _hashCode += getRunnerStackTrace().hashCode();
        }
        if (getRunnerTestName() != null) {
            _hashCode += getRunnerTestName().hashCode();
        }
        if (getScheduledDate() != null) {
            _hashCode += getScheduledDate().hashCode();
        }
        if (getTestRunFormatId() != null) {
            _hashCode += getTestRunFormatId().hashCode();
        }
        if (getTestRunSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestRunSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestRunSteps(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteAutomatedTestRun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationAttachmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AutomationAttachmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationEngineId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AutomationEngineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationEngineToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AutomationEngineToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationHostId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AutomationHostId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseParameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseParameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runnerAssertCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RunnerAssertCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runnerMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RunnerMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RunnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runnerStackTrace");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RunnerStackTrace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runnerTestName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RunnerTestName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ScheduledDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRunStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRunStep"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
