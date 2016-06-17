/**
 * RemoteTestStep.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteTestStep  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.Integer executionStatusId;

    private java.lang.String expectedResult;

    private java.util.Calendar lastUpdateDate;

    private java.lang.Integer linkedTestCaseId;

    private java.lang.Integer position;

    private java.lang.String sampleData;

    private java.lang.Integer testCaseId;

    private java.lang.Integer testStepId;

    public RemoteTestStep() {
    }

    public RemoteTestStep(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.String description,
           java.lang.Integer executionStatusId,
           java.lang.String expectedResult,
           java.util.Calendar lastUpdateDate,
           java.lang.Integer linkedTestCaseId,
           java.lang.Integer position,
           java.lang.String sampleData,
           java.lang.Integer testCaseId,
           java.lang.Integer testStepId) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.description = description;
        this.executionStatusId = executionStatusId;
        this.expectedResult = expectedResult;
        this.lastUpdateDate = lastUpdateDate;
        this.linkedTestCaseId = linkedTestCaseId;
        this.position = position;
        this.sampleData = sampleData;
        this.testCaseId = testCaseId;
        this.testStepId = testStepId;
    }


    /**
     * Gets the description value for this RemoteTestStep.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteTestStep.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the executionStatusId value for this RemoteTestStep.
     * 
     * @return executionStatusId
     */
    public java.lang.Integer getExecutionStatusId() {
        return executionStatusId;
    }


    /**
     * Sets the executionStatusId value for this RemoteTestStep.
     * 
     * @param executionStatusId
     */
    public void setExecutionStatusId(java.lang.Integer executionStatusId) {
        this.executionStatusId = executionStatusId;
    }


    /**
     * Gets the expectedResult value for this RemoteTestStep.
     * 
     * @return expectedResult
     */
    public java.lang.String getExpectedResult() {
        return expectedResult;
    }


    /**
     * Sets the expectedResult value for this RemoteTestStep.
     * 
     * @param expectedResult
     */
    public void setExpectedResult(java.lang.String expectedResult) {
        this.expectedResult = expectedResult;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteTestStep.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteTestStep.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the linkedTestCaseId value for this RemoteTestStep.
     * 
     * @return linkedTestCaseId
     */
    public java.lang.Integer getLinkedTestCaseId() {
        return linkedTestCaseId;
    }


    /**
     * Sets the linkedTestCaseId value for this RemoteTestStep.
     * 
     * @param linkedTestCaseId
     */
    public void setLinkedTestCaseId(java.lang.Integer linkedTestCaseId) {
        this.linkedTestCaseId = linkedTestCaseId;
    }


    /**
     * Gets the position value for this RemoteTestStep.
     * 
     * @return position
     */
    public java.lang.Integer getPosition() {
        return position;
    }


    /**
     * Sets the position value for this RemoteTestStep.
     * 
     * @param position
     */
    public void setPosition(java.lang.Integer position) {
        this.position = position;
    }


    /**
     * Gets the sampleData value for this RemoteTestStep.
     * 
     * @return sampleData
     */
    public java.lang.String getSampleData() {
        return sampleData;
    }


    /**
     * Sets the sampleData value for this RemoteTestStep.
     * 
     * @param sampleData
     */
    public void setSampleData(java.lang.String sampleData) {
        this.sampleData = sampleData;
    }


    /**
     * Gets the testCaseId value for this RemoteTestStep.
     * 
     * @return testCaseId
     */
    public java.lang.Integer getTestCaseId() {
        return testCaseId;
    }


    /**
     * Sets the testCaseId value for this RemoteTestStep.
     * 
     * @param testCaseId
     */
    public void setTestCaseId(java.lang.Integer testCaseId) {
        this.testCaseId = testCaseId;
    }


    /**
     * Gets the testStepId value for this RemoteTestStep.
     * 
     * @return testStepId
     */
    public java.lang.Integer getTestStepId() {
        return testStepId;
    }


    /**
     * Sets the testStepId value for this RemoteTestStep.
     * 
     * @param testStepId
     */
    public void setTestStepId(java.lang.Integer testStepId) {
        this.testStepId = testStepId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteTestStep)) return false;
        RemoteTestStep other = (RemoteTestStep) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.executionStatusId==null && other.getExecutionStatusId()==null) || 
             (this.executionStatusId!=null &&
              this.executionStatusId.equals(other.getExecutionStatusId()))) &&
            ((this.expectedResult==null && other.getExpectedResult()==null) || 
             (this.expectedResult!=null &&
              this.expectedResult.equals(other.getExpectedResult()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.linkedTestCaseId==null && other.getLinkedTestCaseId()==null) || 
             (this.linkedTestCaseId!=null &&
              this.linkedTestCaseId.equals(other.getLinkedTestCaseId()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.sampleData==null && other.getSampleData()==null) || 
             (this.sampleData!=null &&
              this.sampleData.equals(other.getSampleData()))) &&
            ((this.testCaseId==null && other.getTestCaseId()==null) || 
             (this.testCaseId!=null &&
              this.testCaseId.equals(other.getTestCaseId()))) &&
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
        int _hashCode = super.hashCode();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExecutionStatusId() != null) {
            _hashCode += getExecutionStatusId().hashCode();
        }
        if (getExpectedResult() != null) {
            _hashCode += getExpectedResult().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getLinkedTestCaseId() != null) {
            _hashCode += getLinkedTestCaseId().hashCode();
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
        if (getTestStepId() != null) {
            _hashCode += getTestStepId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteTestStep.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExpectedResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "LastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedTestCaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "LinkedTestCaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setNillable(false);
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
