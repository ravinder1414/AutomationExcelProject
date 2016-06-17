/**
 * RemoteCustomListValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteCustomListValue  implements java.io.Serializable {
    private java.lang.Integer customPropertyListId;

    private java.lang.Integer customPropertyValueId;

    private java.lang.String name;

    public RemoteCustomListValue() {
    }

    public RemoteCustomListValue(
           java.lang.Integer customPropertyListId,
           java.lang.Integer customPropertyValueId,
           java.lang.String name) {
           this.customPropertyListId = customPropertyListId;
           this.customPropertyValueId = customPropertyValueId;
           this.name = name;
    }


    /**
     * Gets the customPropertyListId value for this RemoteCustomListValue.
     * 
     * @return customPropertyListId
     */
    public java.lang.Integer getCustomPropertyListId() {
        return customPropertyListId;
    }


    /**
     * Sets the customPropertyListId value for this RemoteCustomListValue.
     * 
     * @param customPropertyListId
     */
    public void setCustomPropertyListId(java.lang.Integer customPropertyListId) {
        this.customPropertyListId = customPropertyListId;
    }


    /**
     * Gets the customPropertyValueId value for this RemoteCustomListValue.
     * 
     * @return customPropertyValueId
     */
    public java.lang.Integer getCustomPropertyValueId() {
        return customPropertyValueId;
    }


    /**
     * Sets the customPropertyValueId value for this RemoteCustomListValue.
     * 
     * @param customPropertyValueId
     */
    public void setCustomPropertyValueId(java.lang.Integer customPropertyValueId) {
        this.customPropertyValueId = customPropertyValueId;
    }


    /**
     * Gets the name value for this RemoteCustomListValue.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteCustomListValue.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteCustomListValue)) return false;
        RemoteCustomListValue other = (RemoteCustomListValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customPropertyListId==null && other.getCustomPropertyListId()==null) || 
             (this.customPropertyListId!=null &&
              this.customPropertyListId.equals(other.getCustomPropertyListId()))) &&
            ((this.customPropertyValueId==null && other.getCustomPropertyValueId()==null) || 
             (this.customPropertyValueId!=null &&
              this.customPropertyValueId.equals(other.getCustomPropertyValueId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
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
        if (getCustomPropertyListId() != null) {
            _hashCode += getCustomPropertyListId().hashCode();
        }
        if (getCustomPropertyValueId() != null) {
            _hashCode += getCustomPropertyValueId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteCustomListValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomListValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPropertyListId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CustomPropertyListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customPropertyValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CustomPropertyValueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
