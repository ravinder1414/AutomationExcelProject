/**
 * RemoteTestSetTestCaseMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteTestSetTestCaseMapping  implements java.io.Serializable {
    private java.lang.Integer ownerId;

    private java.lang.Integer testCaseId;

    private java.lang.Integer testSetId;

    private java.lang.Integer testSetTestCaseId;

    public RemoteTestSetTestCaseMapping() {
    }

    public RemoteTestSetTestCaseMapping(
           java.lang.Integer ownerId,
           java.lang.Integer testCaseId,
           java.lang.Integer testSetId,
           java.lang.Integer testSetTestCaseId) {
           this.ownerId = ownerId;
           this.testCaseId = testCaseId;
           this.testSetId = testSetId;
           this.testSetTestCaseId = testSetTestCaseId;
    }


    /**
     * Gets the ownerId value for this RemoteTestSetTestCaseMapping.
     * 
     * @return ownerId
     */
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RemoteTestSetTestCaseMapping.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the testCaseId value for this RemoteTestSetTestCaseMapping.
     * 
     * @return testCaseId
     */
    public java.lang.Integer getTestCaseId() {
        return testCaseId;
    }


    /**
     * Sets the testCaseId value for this RemoteTestSetTestCaseMapping.
     * 
     * @param testCaseId
     */
    public void setTestCaseId(java.lang.Integer testCaseId) {
        this.testCaseId = testCaseId;
    }


    /**
     * Gets the testSetId value for this RemoteTestSetTestCaseMapping.
     * 
     * @return testSetId
     */
    public java.lang.Integer getTestSetId() {
        return testSetId;
    }


    /**
     * Sets the testSetId value for this RemoteTestSetTestCaseMapping.
     * 
     * @param testSetId
     */
    public void setTestSetId(java.lang.Integer testSetId) {
        this.testSetId = testSetId;
    }


    /**
     * Gets the testSetTestCaseId value for this RemoteTestSetTestCaseMapping.
     * 
     * @return testSetTestCaseId
     */
    public java.lang.Integer getTestSetTestCaseId() {
        return testSetTestCaseId;
    }


    /**
     * Sets the testSetTestCaseId value for this RemoteTestSetTestCaseMapping.
     * 
     * @param testSetTestCaseId
     */
    public void setTestSetTestCaseId(java.lang.Integer testSetTestCaseId) {
        this.testSetTestCaseId = testSetTestCaseId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteTestSetTestCaseMapping)) return false;
        RemoteTestSetTestCaseMapping other = (RemoteTestSetTestCaseMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.testCaseId==null && other.getTestCaseId()==null) || 
             (this.testCaseId!=null &&
              this.testCaseId.equals(other.getTestCaseId()))) &&
            ((this.testSetId==null && other.getTestSetId()==null) || 
             (this.testSetId!=null &&
              this.testSetId.equals(other.getTestSetId()))) &&
            ((this.testSetTestCaseId==null && other.getTestSetTestCaseId()==null) || 
             (this.testSetTestCaseId!=null &&
              this.testSetTestCaseId.equals(other.getTestSetTestCaseId())));
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
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getTestCaseId() != null) {
            _hashCode += getTestCaseId().hashCode();
        }
        if (getTestSetId() != null) {
            _hashCode += getTestSetId().hashCode();
        }
        if (getTestSetTestCaseId() != null) {
            _hashCode += getTestSetTestCaseId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteTestSetTestCaseMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("testSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSetTestCaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSetTestCaseId"));
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
