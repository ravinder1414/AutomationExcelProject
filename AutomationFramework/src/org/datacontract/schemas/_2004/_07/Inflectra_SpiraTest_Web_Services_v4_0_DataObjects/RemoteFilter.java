/**
 * RemoteFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteFilter  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange dateRangeValue;

    private java.lang.Integer intValue;

    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.MultiValueFilter multiValue;

    private java.lang.String propertyName;

    private java.lang.String stringValue;

    public RemoteFilter() {
    }

    public RemoteFilter(
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange dateRangeValue,
           java.lang.Integer intValue,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.MultiValueFilter multiValue,
           java.lang.String propertyName,
           java.lang.String stringValue) {
           this.dateRangeValue = dateRangeValue;
           this.intValue = intValue;
           this.multiValue = multiValue;
           this.propertyName = propertyName;
           this.stringValue = stringValue;
    }


    /**
     * Gets the dateRangeValue value for this RemoteFilter.
     * 
     * @return dateRangeValue
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange getDateRangeValue() {
        return dateRangeValue;
    }


    /**
     * Sets the dateRangeValue value for this RemoteFilter.
     * 
     * @param dateRangeValue
     */
    public void setDateRangeValue(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange dateRangeValue) {
        this.dateRangeValue = dateRangeValue;
    }


    /**
     * Gets the intValue value for this RemoteFilter.
     * 
     * @return intValue
     */
    public java.lang.Integer getIntValue() {
        return intValue;
    }


    /**
     * Sets the intValue value for this RemoteFilter.
     * 
     * @param intValue
     */
    public void setIntValue(java.lang.Integer intValue) {
        this.intValue = intValue;
    }


    /**
     * Gets the multiValue value for this RemoteFilter.
     * 
     * @return multiValue
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.MultiValueFilter getMultiValue() {
        return multiValue;
    }


    /**
     * Sets the multiValue value for this RemoteFilter.
     * 
     * @param multiValue
     */
    public void setMultiValue(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.MultiValueFilter multiValue) {
        this.multiValue = multiValue;
    }


    /**
     * Gets the propertyName value for this RemoteFilter.
     * 
     * @return propertyName
     */
    public java.lang.String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this RemoteFilter.
     * 
     * @param propertyName
     */
    public void setPropertyName(java.lang.String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the stringValue value for this RemoteFilter.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this RemoteFilter.
     * 
     * @param stringValue
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteFilter)) return false;
        RemoteFilter other = (RemoteFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateRangeValue==null && other.getDateRangeValue()==null) || 
             (this.dateRangeValue!=null &&
              this.dateRangeValue.equals(other.getDateRangeValue()))) &&
            ((this.intValue==null && other.getIntValue()==null) || 
             (this.intValue!=null &&
              this.intValue.equals(other.getIntValue()))) &&
            ((this.multiValue==null && other.getMultiValue()==null) || 
             (this.multiValue!=null &&
              this.multiValue.equals(other.getMultiValue()))) &&
            ((this.propertyName==null && other.getPropertyName()==null) || 
             (this.propertyName!=null &&
              this.propertyName.equals(other.getPropertyName()))) &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue())));
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
        if (getDateRangeValue() != null) {
            _hashCode += getDateRangeValue().hashCode();
        }
        if (getIntValue() != null) {
            _hashCode += getIntValue().hashCode();
        }
        if (getMultiValue() != null) {
            _hashCode += getMultiValue().hashCode();
        }
        if (getPropertyName() != null) {
            _hashCode += getPropertyName().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DateRangeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DateRange"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IntValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "MultiValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "MultiValueFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "PropertyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "StringValue"));
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
