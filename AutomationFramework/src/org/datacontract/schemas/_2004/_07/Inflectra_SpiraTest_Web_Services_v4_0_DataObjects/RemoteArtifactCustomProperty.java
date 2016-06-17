/**
 * RemoteArtifactCustomProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteArtifactCustomProperty  implements java.io.Serializable {
    private java.lang.Boolean booleanValue;

    private java.util.Calendar dateTimeValue;

    private java.math.BigDecimal decimalValue;

    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty definition;

    private int[] integerListValue;

    private java.lang.Integer integerValue;

    private java.lang.Integer propertyNumber;

    private java.lang.String stringValue;

    public RemoteArtifactCustomProperty() {
    }

    public RemoteArtifactCustomProperty(
           java.lang.Boolean booleanValue,
           java.util.Calendar dateTimeValue,
           java.math.BigDecimal decimalValue,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty definition,
           int[] integerListValue,
           java.lang.Integer integerValue,
           java.lang.Integer propertyNumber,
           java.lang.String stringValue) {
           this.booleanValue = booleanValue;
           this.dateTimeValue = dateTimeValue;
           this.decimalValue = decimalValue;
           this.definition = definition;
           this.integerListValue = integerListValue;
           this.integerValue = integerValue;
           this.propertyNumber = propertyNumber;
           this.stringValue = stringValue;
    }


    /**
     * Gets the booleanValue value for this RemoteArtifactCustomProperty.
     * 
     * @return booleanValue
     */
    public java.lang.Boolean getBooleanValue() {
        return booleanValue;
    }


    /**
     * Sets the booleanValue value for this RemoteArtifactCustomProperty.
     * 
     * @param booleanValue
     */
    public void setBooleanValue(java.lang.Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }


    /**
     * Gets the dateTimeValue value for this RemoteArtifactCustomProperty.
     * 
     * @return dateTimeValue
     */
    public java.util.Calendar getDateTimeValue() {
        return dateTimeValue;
    }


    /**
     * Sets the dateTimeValue value for this RemoteArtifactCustomProperty.
     * 
     * @param dateTimeValue
     */
    public void setDateTimeValue(java.util.Calendar dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }


    /**
     * Gets the decimalValue value for this RemoteArtifactCustomProperty.
     * 
     * @return decimalValue
     */
    public java.math.BigDecimal getDecimalValue() {
        return decimalValue;
    }


    /**
     * Sets the decimalValue value for this RemoteArtifactCustomProperty.
     * 
     * @param decimalValue
     */
    public void setDecimalValue(java.math.BigDecimal decimalValue) {
        this.decimalValue = decimalValue;
    }


    /**
     * Gets the definition value for this RemoteArtifactCustomProperty.
     * 
     * @return definition
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty getDefinition() {
        return definition;
    }


    /**
     * Sets the definition value for this RemoteArtifactCustomProperty.
     * 
     * @param definition
     */
    public void setDefinition(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty definition) {
        this.definition = definition;
    }


    /**
     * Gets the integerListValue value for this RemoteArtifactCustomProperty.
     * 
     * @return integerListValue
     */
    public int[] getIntegerListValue() {
        return integerListValue;
    }


    /**
     * Sets the integerListValue value for this RemoteArtifactCustomProperty.
     * 
     * @param integerListValue
     */
    public void setIntegerListValue(int[] integerListValue) {
        this.integerListValue = integerListValue;
    }


    /**
     * Gets the integerValue value for this RemoteArtifactCustomProperty.
     * 
     * @return integerValue
     */
    public java.lang.Integer getIntegerValue() {
        return integerValue;
    }


    /**
     * Sets the integerValue value for this RemoteArtifactCustomProperty.
     * 
     * @param integerValue
     */
    public void setIntegerValue(java.lang.Integer integerValue) {
        this.integerValue = integerValue;
    }


    /**
     * Gets the propertyNumber value for this RemoteArtifactCustomProperty.
     * 
     * @return propertyNumber
     */
    public java.lang.Integer getPropertyNumber() {
        return propertyNumber;
    }


    /**
     * Sets the propertyNumber value for this RemoteArtifactCustomProperty.
     * 
     * @param propertyNumber
     */
    public void setPropertyNumber(java.lang.Integer propertyNumber) {
        this.propertyNumber = propertyNumber;
    }


    /**
     * Gets the stringValue value for this RemoteArtifactCustomProperty.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this RemoteArtifactCustomProperty.
     * 
     * @param stringValue
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteArtifactCustomProperty)) return false;
        RemoteArtifactCustomProperty other = (RemoteArtifactCustomProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.booleanValue==null && other.getBooleanValue()==null) || 
             (this.booleanValue!=null &&
              this.booleanValue.equals(other.getBooleanValue()))) &&
            ((this.dateTimeValue==null && other.getDateTimeValue()==null) || 
             (this.dateTimeValue!=null &&
              this.dateTimeValue.equals(other.getDateTimeValue()))) &&
            ((this.decimalValue==null && other.getDecimalValue()==null) || 
             (this.decimalValue!=null &&
              this.decimalValue.equals(other.getDecimalValue()))) &&
            ((this.definition==null && other.getDefinition()==null) || 
             (this.definition!=null &&
              this.definition.equals(other.getDefinition()))) &&
            ((this.integerListValue==null && other.getIntegerListValue()==null) || 
             (this.integerListValue!=null &&
              java.util.Arrays.equals(this.integerListValue, other.getIntegerListValue()))) &&
            ((this.integerValue==null && other.getIntegerValue()==null) || 
             (this.integerValue!=null &&
              this.integerValue.equals(other.getIntegerValue()))) &&
            ((this.propertyNumber==null && other.getPropertyNumber()==null) || 
             (this.propertyNumber!=null &&
              this.propertyNumber.equals(other.getPropertyNumber()))) &&
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
        if (getBooleanValue() != null) {
            _hashCode += getBooleanValue().hashCode();
        }
        if (getDateTimeValue() != null) {
            _hashCode += getDateTimeValue().hashCode();
        }
        if (getDecimalValue() != null) {
            _hashCode += getDecimalValue().hashCode();
        }
        if (getDefinition() != null) {
            _hashCode += getDefinition().hashCode();
        }
        if (getIntegerListValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntegerListValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntegerListValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntegerValue() != null) {
            _hashCode += getIntegerValue().hashCode();
        }
        if (getPropertyNumber() != null) {
            _hashCode += getPropertyNumber().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteArtifactCustomProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifactCustomProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booleanValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "BooleanValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DateTimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DecimalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Definition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerListValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IntegerListValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integerValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IntegerValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "PropertyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
