/**
 * RemoteManualTestRun.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteManualTestRun  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[] testRunSteps;

    public RemoteManualTestRun() {
    }

    public RemoteManualTestRun(
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
        this.testRunSteps = testRunSteps;
    }


    /**
     * Gets the testRunSteps value for this RemoteManualTestRun.
     * 
     * @return testRunSteps
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[] getTestRunSteps() {
        return testRunSteps;
    }


    /**
     * Sets the testRunSteps value for this RemoteManualTestRun.
     * 
     * @param testRunSteps
     */
    public void setTestRunSteps(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[] testRunSteps) {
        this.testRunSteps = testRunSteps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteManualTestRun)) return false;
        RemoteManualTestRun other = (RemoteManualTestRun) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        new org.apache.axis.description.TypeDesc(RemoteManualTestRun.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
