/**
 * RemoteWorkflowIncidentCustomProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteWorkflowIncidentCustomProperties  implements java.io.Serializable {
    private java.lang.Integer customPropertyId;

    private java.lang.String fieldCaption;

    private java.lang.String fieldName;

    private java.lang.Integer fieldStateId;

    public RemoteWorkflowIncidentCustomProperties() {
    }

    public RemoteWorkflowIncidentCustomProperties(
           java.lang.Integer customPropertyId,
           java.lang.String fieldCaption,
           java.lang.String fieldName,
           java.lang.Integer fieldStateId) {
           this.customPropertyId = customPropertyId;
           this.fieldCaption = fieldCaption;
           this.fieldName = fieldName;
           this.fieldStateId = fieldStateId;
    }


    /**
     * Gets the customPropertyId value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @return customPropertyId
     */
    public java.lang.Integer getCustomPropertyId() {
        return customPropertyId;
    }


    /**
     * Sets the customPropertyId value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @param customPropertyId
     */
    public void setCustomPropertyId(java.lang.Integer customPropertyId) {
        this.customPropertyId = customPropertyId;
    }


    /**
     * Gets the fieldCaption value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @return fieldCaption
     */
    public java.lang.String getFieldCaption() {
        return fieldCaption;
    }


    /**
     * Sets the fieldCaption value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @param fieldCaption
     */
    public void setFieldCaption(java.lang.String fieldCaption) {
        this.fieldCaption = fieldCaption;
    }


    /**
     * Gets the fieldName value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the fieldStateId value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @return fieldStateId
     */
    public java.lang.Integer getFieldStateId() {
        return fieldStateId;
    }


    /**
     * Sets the fieldStateId value for this RemoteWorkflowIncidentCustomProperties.
     * 
     * @param fieldStateId
     */
    public void setFieldStateId(java.lang.Integer fieldStateId) {
        this.fieldStateId = fieldStateId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteWorkflowIncidentCustomProperties)) return false;
        RemoteWorkflowIncidentCustomProperties other = (RemoteWorkflowIncidentCustomProperties) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customPropertyId==null && other.getCustomPropertyId()==null) || 
             (this.customPropertyId!=null &&
              this.customPropertyId.equals(other.getCustomPropertyId()))) &&
            ((this.fieldCaption==null && other.getFieldCaption()==null) || 
             (this.fieldCaption!=null &&
              this.fieldCaption.equals(other.getFieldCaption()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.fieldStateId==null && other.getFieldStateId()==null) || 
             (this.fieldStateId!=null &&
              this.fieldStateId.equals(other.getFieldStateId())));
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
        if (getCustomPropertyId() != null) {
            _hashCode += getCustomPropertyId().hashCode();
        }
        if (getFieldCaption() != null) {
            _hashCode += getFieldCaption().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getFieldStateId() != null) {
            _hashCode += getFieldStateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteWorkflowIncidentCustomProperties.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentCustomProperties"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPropertyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CustomPropertyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldCaption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FieldCaption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldStateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FieldStateId"));
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
