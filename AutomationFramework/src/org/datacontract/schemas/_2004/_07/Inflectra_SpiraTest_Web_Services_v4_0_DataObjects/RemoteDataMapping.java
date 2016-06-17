/**
 * RemoteDataMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteDataMapping  implements java.io.Serializable {
    private java.lang.String externalKey;

    private java.lang.Integer internalId;

    private java.lang.Boolean primary;

    private java.lang.Integer projectId;

    public RemoteDataMapping() {
    }

    public RemoteDataMapping(
           java.lang.String externalKey,
           java.lang.Integer internalId,
           java.lang.Boolean primary,
           java.lang.Integer projectId) {
           this.externalKey = externalKey;
           this.internalId = internalId;
           this.primary = primary;
           this.projectId = projectId;
    }


    /**
     * Gets the externalKey value for this RemoteDataMapping.
     * 
     * @return externalKey
     */
    public java.lang.String getExternalKey() {
        return externalKey;
    }


    /**
     * Sets the externalKey value for this RemoteDataMapping.
     * 
     * @param externalKey
     */
    public void setExternalKey(java.lang.String externalKey) {
        this.externalKey = externalKey;
    }


    /**
     * Gets the internalId value for this RemoteDataMapping.
     * 
     * @return internalId
     */
    public java.lang.Integer getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this RemoteDataMapping.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.Integer internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the primary value for this RemoteDataMapping.
     * 
     * @return primary
     */
    public java.lang.Boolean getPrimary() {
        return primary;
    }


    /**
     * Sets the primary value for this RemoteDataMapping.
     * 
     * @param primary
     */
    public void setPrimary(java.lang.Boolean primary) {
        this.primary = primary;
    }


    /**
     * Gets the projectId value for this RemoteDataMapping.
     * 
     * @return projectId
     */
    public java.lang.Integer getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this RemoteDataMapping.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.Integer projectId) {
        this.projectId = projectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteDataMapping)) return false;
        RemoteDataMapping other = (RemoteDataMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalKey==null && other.getExternalKey()==null) || 
             (this.externalKey!=null &&
              this.externalKey.equals(other.getExternalKey()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.primary==null && other.getPrimary()==null) || 
             (this.primary!=null &&
              this.primary.equals(other.getPrimary()))) &&
            ((this.projectId==null && other.getProjectId()==null) || 
             (this.projectId!=null &&
              this.projectId.equals(other.getProjectId())));
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
        if (getExternalKey() != null) {
            _hashCode += getExternalKey().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getPrimary() != null) {
            _hashCode += getPrimary().hashCode();
        }
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteDataMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExternalKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "InternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Primary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectId"));
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
