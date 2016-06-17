/**
 * RemoteTestRunStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteTestRunStep  implements java.io.Serializable {
    private java.lang.String actualResult;

    private java.lang.String description;

    private java.lang.Integer executionStatusId;

    private java.lang.String expectedResult;

    private java.lang.Integer position;

    private java.lang.String sampleData;

    private java.lang.Integer testCaseId;

    private java.lang.Integer testRunId;

    private java.lang.Integer testRunStepId;

    private java.lang.Integer testStepId;

    public RemoteTestRunStep() {
    }

    public RemoteTestRunStep(
           java.lang.String actualResult,
           java.lang.String description,
           java.lang.Integer executionStatusId,
           java.lang.String expectedResult,
           java.lang.Integer position,
           java.lang.String sampleData,
           java.lang.Integer testCaseId,
           java.lang.Integer testRunId,
           java.lang.Integer testRunStepId,
           java.lang.Integer testStepId) {
           this.actualResult = actualResult;
           this.description = description;
           this.executionStatusId = executionStatusId;
           this.expectedResult = expectedResult;
           this.position = position;
           this.sampleData = sampleData;
           this.testCaseId = testCaseId;
           this.testRunId = testRunId;
           this.testRunStepId = testRunStepId;
           this.testStepId = testStepId;
    }


    /**
     * Gets the actualResult value for this RemoteTestRunStep.
     * 
     * @return actualResult
     */
    public java.lang.String getActualResult() {
        return actualResult;
    }


    /**
     * Sets the actualResult value for this RemoteTestRunStep.
     * 
     * @param actualResult
     */
    public void setActualResult(java.lang.String actualResult) {
        this.actualResult = actualResult;
    }


    /**
     * Gets the description value for this RemoteTestRunStep.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteTestRunStep.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the executionStatusId value for this RemoteTestRunStep.
     * 
     * @return executionStatusId
     */
    public java.lang.Integer getExecutionStatusId() {
        return executionStatusId;
    }


    /**
     * Sets the executionStatusId value for this RemoteTestRunStep.
     * 
     * @param executionStatusId
     */
    public void setExecutionStatusId(java.lang.Integer executionStatusId) {
        this.executionStatusId = executionStatusId;
    }


    /**
     * Gets the expectedResult value for this RemoteTestRunStep.
     * 
     * @return expectedResult
     */
    public java.lang.String getExpectedResult() {
        return expectedResult;
    }


    /**
     * Sets the expectedResult value for this RemoteTestRunStep.
     * 
     * @param expectedResult
     */
    public void setExpectedResult(java.lang.String expectedResult) {
        this.expectedResult = expectedResult;
    }


    /**
     * Gets the position value for this RemoteTestRunStep.
     * 
     * @return position
     */
    public java.lang.Integer getPosition() {
        return position;
    }


    /**
     * Sets the position value for this RemoteTestRunStep.
     * 
     * @param position
     */
    public void setPosition(java.lang.Integer position) {
        this.position = position;
    }


    /**
     * Gets the sampleData value for this RemoteTestRunStep.
     * 
     * @return sampleData
     */
    public java.lang.String getSampleData() {
        return sampleData;
    }


    /**
     * Sets the sampleData value for this RemoteTestRunStep.
     * 
     * @param sampleData
     */
    public void setSampleData(java.lang.String sampleData) {
        this.sampleData = sampleData;
    }


    /**
     * Gets the testCaseId value for this RemoteTestRunStep.
     * 
     * @return testCaseId
     */
    public java.lang.Integer getTestCaseId() {
        return testCaseId;
    }


    /**
     * Sets the testCaseId value for this RemoteTestRunStep.
     * 
     * @param testCaseId
     */
    public void setTestCaseId(java.lang.Integer testCaseId) {
        this.testCaseId = testCaseId;
    }


    /**
     * Gets the testRunId value for this RemoteTestRunStep.
     * 
     * @return testRunId
     */
    public java.lang.Integer getTestRunId() {
        return testRunId;
    }


    /**
     * Sets the testRunId value for this RemoteTestRunStep.
     * 
     * @param testRunId
     */
    public void setTestRunId(java.lang.Integer testRunId) {
        this.testRunId = testRunId;
    }


    /**
     * Gets the testRunStepId value for this RemoteTestRunStep.
     * 
     * @return testRunStepId
     */
    public java.lang.Integer getTestRunStepId() {
        return testRunStepId;
    }


    /**
     * Sets the testRunStepId value for this RemoteTestRunStep.
     * 
     * @param testRunStepId
     */
    public void setTestRunStepId(java.lang.Integer testRunStepId) {
        this.testRunStepId = testRunStepId;
    }


    /**
     * Gets the testStepId value for this RemoteTestRunStep.
     * 
     * @return testStepId
     */
    public java.lang.Integer getTestStepId() {
        return testStepId;
    }


    /**
     * Sets the testStepId value for this RemoteTestRunStep.
     * 
     * @param testStepId
     */
    public void setTestStepId(java.lang.Integer testStepId) {
        this.testStepId = testStepId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteTestRunStep)) return false;
        RemoteTestRunStep other = (RemoteTestRunStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualResult==null && other.getActualResult()==null) || 
             (this.actualResult!=null &&
              this.actualResult.equals(other.getActualResult()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.executionStatusId==null && other.getExecutionStatusId()==null) || 
             (this.executionStatusId!=null &&
              this.executionStatusId.equals(other.getExecutionStatusId()))) &&
            ((this.expectedResult==null && other.getExpectedResult()==null) || 
             (this.expectedResult!=null &&
              this.expectedResult.equals(other.getExpectedResult()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.sampleData==null && other.getSampleData()==null) || 
             (this.sampleData!=null &&
              this.sampleData.equals(other.getSampleData()))) &&
            ((this.testCaseId==null && other.getTestCaseId()==null) || 
             (this.testCaseId!=null &&
              this.testCaseId.equals(other.getTestCaseId()))) &&
            ((this.testRunId==null && other.getTestRunId()==null) || 
             (this.testRunId!=null &&
              this.testRunId.equals(other.getTestRunId()))) &&
            ((this.testRunStepId==null && other.getTestRunStepId()==null) || 
             (this.testRunStepId!=null &&
              this.testRunStepId.equals(other.getTestRunStepId()))) &&
            ((this.testStepId==null && other.getTestStepId()==null) || 
             (this.testStepId!=null &&
              this.testStepId.equals(other.getTestStepId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActualResult() != null) {
            _hashCode += getActualResult().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExecutionStatusId() != null) {
            _hashCode += getExecutionStatusId().hashCode();
        }
        if (getExpectedResult() != null) {
            _hashCode += getExpectedResult().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getSampleData() != null) {
            _hashCode += getSampleData().hashCode();
        }
        if (getTestCaseId() != null) {
            _hashCode += getTestCaseId().hashCode();
        }
        if (getTestRunId() != null) {
            _hashCode += getTestRunId().hashCode();
        }
        if (getTestRunStepId() != null) {
            _hashCode += getTestRunStepId().hashCode();
        }
        if (getTestStepId() != null) {
            _hashCode += getTestStepId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteTestRunStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRunStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ActualResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExecutionStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExpectedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sampleData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "SampleData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestCaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunStepId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunStepId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testStepId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestStepId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
