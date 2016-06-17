/**
 * RemoteTestRun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteTestRun  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.Integer actualDuration;

    private java.lang.Integer buildId;

    private java.util.Calendar endDate;

    private java.lang.Integer estimatedDuration;

    private java.lang.Integer executionStatusId;

    private java.lang.String name;

    private java.lang.Integer releaseId;

    private java.util.Calendar startDate;

    private java.lang.Integer testCaseId;

    private java.lang.Integer testRunId;

    private java.lang.Integer testRunTypeId;

    private java.lang.Integer testSetId;

    private java.lang.Integer testSetTestCaseId;

    private java.lang.Integer testerId;

    public RemoteTestRun() {
    }

    public RemoteTestRun(
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
           java.lang.Integer testerId) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.actualDuration = actualDuration;
        this.buildId = buildId;
        this.endDate = endDate;
        this.estimatedDuration = estimatedDuration;
        this.executionStatusId = executionStatusId;
        this.name = name;
        this.releaseId = releaseId;
        this.startDate = startDate;
        this.testCaseId = testCaseId;
        this.testRunId = testRunId;
        this.testRunTypeId = testRunTypeId;
        this.testSetId = testSetId;
        this.testSetTestCaseId = testSetTestCaseId;
        this.testerId = testerId;
    }


    /**
     * Gets the actualDuration value for this RemoteTestRun.
     * 
     * @return actualDuration
     */
    public java.lang.Integer getActualDuration() {
        return actualDuration;
    }


    /**
     * Sets the actualDuration value for this RemoteTestRun.
     * 
     * @param actualDuration
     */
    public void setActualDuration(java.lang.Integer actualDuration) {
        this.actualDuration = actualDuration;
    }


    /**
     * Gets the buildId value for this RemoteTestRun.
     * 
     * @return buildId
     */
    public java.lang.Integer getBuildId() {
        return buildId;
    }


    /**
     * Sets the buildId value for this RemoteTestRun.
     * 
     * @param buildId
     */
    public void setBuildId(java.lang.Integer buildId) {
        this.buildId = buildId;
    }


    /**
     * Gets the endDate value for this RemoteTestRun.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this RemoteTestRun.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the estimatedDuration value for this RemoteTestRun.
     * 
     * @return estimatedDuration
     */
    public java.lang.Integer getEstimatedDuration() {
        return estimatedDuration;
    }


    /**
     * Sets the estimatedDuration value for this RemoteTestRun.
     * 
     * @param estimatedDuration
     */
    public void setEstimatedDuration(java.lang.Integer estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }


    /**
     * Gets the executionStatusId value for this RemoteTestRun.
     * 
     * @return executionStatusId
     */
    public java.lang.Integer getExecutionStatusId() {
        return executionStatusId;
    }


    /**
     * Sets the executionStatusId value for this RemoteTestRun.
     * 
     * @param executionStatusId
     */
    public void setExecutionStatusId(java.lang.Integer executionStatusId) {
        this.executionStatusId = executionStatusId;
    }


    /**
     * Gets the name value for this RemoteTestRun.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteTestRun.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the releaseId value for this RemoteTestRun.
     * 
     * @return releaseId
     */
    public java.lang.Integer getReleaseId() {
        return releaseId;
    }


    /**
     * Sets the releaseId value for this RemoteTestRun.
     * 
     * @param releaseId
     */
    public void setReleaseId(java.lang.Integer releaseId) {
        this.releaseId = releaseId;
    }


    /**
     * Gets the startDate value for this RemoteTestRun.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RemoteTestRun.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the testCaseId value for this RemoteTestRun.
     * 
     * @return testCaseId
     */
    public java.lang.Integer getTestCaseId() {
        return testCaseId;
    }


    /**
     * Sets the testCaseId value for this RemoteTestRun.
     * 
     * @param testCaseId
     */
    public void setTestCaseId(java.lang.Integer testCaseId) {
        this.testCaseId = testCaseId;
    }


    /**
     * Gets the testRunId value for this RemoteTestRun.
     * 
     * @return testRunId
     */
    public java.lang.Integer getTestRunId() {
        return testRunId;
    }


    /**
     * Sets the testRunId value for this RemoteTestRun.
     * 
     * @param testRunId
     */
    public void setTestRunId(java.lang.Integer testRunId) {
        this.testRunId = testRunId;
    }


    /**
     * Gets the testRunTypeId value for this RemoteTestRun.
     * 
     * @return testRunTypeId
     */
    public java.lang.Integer getTestRunTypeId() {
        return testRunTypeId;
    }


    /**
     * Sets the testRunTypeId value for this RemoteTestRun.
     * 
     * @param testRunTypeId
     */
    public void setTestRunTypeId(java.lang.Integer testRunTypeId) {
        this.testRunTypeId = testRunTypeId;
    }


    /**
     * Gets the testSetId value for this RemoteTestRun.
     * 
     * @return testSetId
     */
    public java.lang.Integer getTestSetId() {
        return testSetId;
    }


    /**
     * Sets the testSetId value for this RemoteTestRun.
     * 
     * @param testSetId
     */
    public void setTestSetId(java.lang.Integer testSetId) {
        this.testSetId = testSetId;
    }


    /**
     * Gets the testSetTestCaseId value for this RemoteTestRun.
     * 
     * @return testSetTestCaseId
     */
    public java.lang.Integer getTestSetTestCaseId() {
        return testSetTestCaseId;
    }


    /**
     * Sets the testSetTestCaseId value for this RemoteTestRun.
     * 
     * @param testSetTestCaseId
     */
    public void setTestSetTestCaseId(java.lang.Integer testSetTestCaseId) {
        this.testSetTestCaseId = testSetTestCaseId;
    }


    /**
     * Gets the testerId value for this RemoteTestRun.
     * 
     * @return testerId
     */
    public java.lang.Integer getTesterId() {
        return testerId;
    }


    /**
     * Sets the testerId value for this RemoteTestRun.
     * 
     * @param testerId
     */
    public void setTesterId(java.lang.Integer testerId) {
        this.testerId = testerId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteTestRun)) return false;
        RemoteTestRun other = (RemoteTestRun) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualDuration==null && other.getActualDuration()==null) || 
             (this.actualDuration!=null &&
              this.actualDuration.equals(other.getActualDuration()))) &&
            ((this.buildId==null && other.getBuildId()==null) || 
             (this.buildId!=null &&
              this.buildId.equals(other.getBuildId()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.estimatedDuration==null && other.getEstimatedDuration()==null) || 
             (this.estimatedDuration!=null &&
              this.estimatedDuration.equals(other.getEstimatedDuration()))) &&
            ((this.executionStatusId==null && other.getExecutionStatusId()==null) || 
             (this.executionStatusId!=null &&
              this.executionStatusId.equals(other.getExecutionStatusId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.releaseId==null && other.getReleaseId()==null) || 
             (this.releaseId!=null &&
              this.releaseId.equals(other.getReleaseId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.testCaseId==null && other.getTestCaseId()==null) || 
             (this.testCaseId!=null &&
              this.testCaseId.equals(other.getTestCaseId()))) &&
            ((this.testRunId==null && other.getTestRunId()==null) || 
             (this.testRunId!=null &&
              this.testRunId.equals(other.getTestRunId()))) &&
            ((this.testRunTypeId==null && other.getTestRunTypeId()==null) || 
             (this.testRunTypeId!=null &&
              this.testRunTypeId.equals(other.getTestRunTypeId()))) &&
            ((this.testSetId==null && other.getTestSetId()==null) || 
             (this.testSetId!=null &&
              this.testSetId.equals(other.getTestSetId()))) &&
            ((this.testSetTestCaseId==null && other.getTestSetTestCaseId()==null) || 
             (this.testSetTestCaseId!=null &&
              this.testSetTestCaseId.equals(other.getTestSetTestCaseId()))) &&
            ((this.testerId==null && other.getTesterId()==null) || 
             (this.testerId!=null &&
              this.testerId.equals(other.getTesterId())));
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
        if (getActualDuration() != null) {
            _hashCode += getActualDuration().hashCode();
        }
        if (getBuildId() != null) {
            _hashCode += getBuildId().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEstimatedDuration() != null) {
            _hashCode += getEstimatedDuration().hashCode();
        }
        if (getExecutionStatusId() != null) {
            _hashCode += getExecutionStatusId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getReleaseId() != null) {
            _hashCode += getReleaseId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTestCaseId() != null) {
            _hashCode += getTestCaseId().hashCode();
        }
        if (getTestRunId() != null) {
            _hashCode += getTestRunId().hashCode();
        }
        if (getTestRunTypeId() != null) {
            _hashCode += getTestRunTypeId().hashCode();
        }
        if (getTestSetId() != null) {
            _hashCode += getTestSetId().hashCode();
        }
        if (getTestSetTestCaseId() != null) {
            _hashCode += getTestSetTestCaseId().hashCode();
        }
        if (getTesterId() != null) {
            _hashCode += getTesterId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteTestRun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ActualDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "BuildId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "EstimatedDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ReleaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestCaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSetTestCaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSetTestCaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TesterId"));
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
