/**
 * RemoteRequirementTestCaseMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteRequirementTestCaseMapping  implements java.io.Serializable {
    private java.lang.Integer requirementId;

    private java.lang.Integer testCaseId;

    public RemoteRequirementTestCaseMapping() {
    }

    public RemoteRequirementTestCaseMapping(
           java.lang.Integer requirementId,
           java.lang.Integer testCaseId) {
           this.requirementId = requirementId;
           this.testCaseId = testCaseId;
    }


    /**
     * Gets the requirementId value for this RemoteRequirementTestCaseMapping.
     * 
     * @return requirementId
     */
    public java.lang.Integer getRequirementId() {
        return requirementId;
    }


    /**
     * Sets the requirementId value for this RemoteRequirementTestCaseMapping.
     * 
     * @param requirementId
     */
    public void setRequirementId(java.lang.Integer requirementId) {
        this.requirementId = requirementId;
    }


    /**
     * Gets the testCaseId value for this RemoteRequirementTestCaseMapping.
     * 
     * @return testCaseId
     */
    public java.lang.Integer getTestCaseId() {
        return testCaseId;
    }


    /**
     * Sets the testCaseId value for this RemoteRequirementTestCaseMapping.
     * 
     * @param testCaseId
     */
    public void setTestCaseId(java.lang.Integer testCaseId) {
        this.testCaseId = testCaseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteRequirementTestCaseMapping)) return false;
        RemoteRequirementTestCaseMapping other = (RemoteRequirementTestCaseMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requirementId==null && other.getRequirementId()==null) || 
             (this.requirementId!=null &&
              this.requirementId.equals(other.getRequirementId()))) &&
            ((this.testCaseId==null && other.getTestCaseId()==null) || 
             (this.testCaseId!=null &&
              this.testCaseId.equals(other.getTestCaseId())));
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
        if (getRequirementId() != null) {
            _hashCode += getRequirementId().hashCode();
        }
        if (getTestCaseId() != null) {
            _hashCode += getTestCaseId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteRequirementTestCaseMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirementTestCaseMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirementId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RequirementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
