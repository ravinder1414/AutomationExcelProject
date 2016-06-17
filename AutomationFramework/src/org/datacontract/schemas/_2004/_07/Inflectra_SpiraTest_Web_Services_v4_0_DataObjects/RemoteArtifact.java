/**
 * RemoteArtifact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteArtifact  implements java.io.Serializable {
    private java.lang.Integer artifactTypeId;

    private java.util.Calendar concurrencyDate;

    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties;

    private java.lang.Integer projectId;

    public RemoteArtifact() {
    }

    public RemoteArtifact(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId) {
           this.artifactTypeId = artifactTypeId;
           this.concurrencyDate = concurrencyDate;
           this.customProperties = customProperties;
           this.projectId = projectId;
    }


    /**
     * Gets the artifactTypeId value for this RemoteArtifact.
     * 
     * @return artifactTypeId
     */
    public java.lang.Integer getArtifactTypeId() {
        return artifactTypeId;
    }


    /**
     * Sets the artifactTypeId value for this RemoteArtifact.
     * 
     * @param artifactTypeId
     */
    public void setArtifactTypeId(java.lang.Integer artifactTypeId) {
        this.artifactTypeId = artifactTypeId;
    }


    /**
     * Gets the concurrencyDate value for this RemoteArtifact.
     * 
     * @return concurrencyDate
     */
    public java.util.Calendar getConcurrencyDate() {
        return concurrencyDate;
    }


    /**
     * Sets the concurrencyDate value for this RemoteArtifact.
     * 
     * @param concurrencyDate
     */
    public void setConcurrencyDate(java.util.Calendar concurrencyDate) {
        this.concurrencyDate = concurrencyDate;
    }


    /**
     * Gets the customProperties value for this RemoteArtifact.
     * 
     * @return customProperties
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] getCustomProperties() {
        return customProperties;
    }


    /**
     * Sets the customProperties value for this RemoteArtifact.
     * 
     * @param customProperties
     */
    public void setCustomProperties(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties) {
        this.customProperties = customProperties;
    }


    /**
     * Gets the projectId value for this RemoteArtifact.
     * 
     * @return projectId
     */
    public java.lang.Integer getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this RemoteArtifact.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.Integer projectId) {
        this.projectId = projectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteArtifact)) return false;
        RemoteArtifact other = (RemoteArtifact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.artifactTypeId==null && other.getArtifactTypeId()==null) || 
             (this.artifactTypeId!=null &&
              this.artifactTypeId.equals(other.getArtifactTypeId()))) &&
            ((this.concurrencyDate==null && other.getConcurrencyDate()==null) || 
             (this.concurrencyDate!=null &&
              this.concurrencyDate.equals(other.getConcurrencyDate()))) &&
            ((this.customProperties==null && other.getCustomProperties()==null) || 
             (this.customProperties!=null &&
              java.util.Arrays.equals(this.customProperties, other.getCustomProperties()))) &&
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
        if (getArtifactTypeId() != null) {
            _hashCode += getArtifactTypeId().hashCode();
        }
        if (getConcurrencyDate() != null) {
            _hashCode += getConcurrencyDate().hashCode();
        }
        if (getCustomProperties() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomProperties());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomProperties(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteArtifact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artifactTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArtifactTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concurrencyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ConcurrencyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customProperties");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CustomProperties"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifactCustomProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifactCustomProperty"));
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
