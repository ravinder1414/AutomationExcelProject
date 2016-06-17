/**
 * RemoteDocumentFolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteDocumentFolder  implements java.io.Serializable {
    private java.lang.String indentLevel;

    private java.lang.String name;

    private java.lang.Integer parentProjectAttachmentFolderId;

    private java.lang.Integer projectAttachmentFolderId;

    private java.lang.Integer projectId;

    public RemoteDocumentFolder() {
    }

    public RemoteDocumentFolder(
           java.lang.String indentLevel,
           java.lang.String name,
           java.lang.Integer parentProjectAttachmentFolderId,
           java.lang.Integer projectAttachmentFolderId,
           java.lang.Integer projectId) {
           this.indentLevel = indentLevel;
           this.name = name;
           this.parentProjectAttachmentFolderId = parentProjectAttachmentFolderId;
           this.projectAttachmentFolderId = projectAttachmentFolderId;
           this.projectId = projectId;
    }


    /**
     * Gets the indentLevel value for this RemoteDocumentFolder.
     * 
     * @return indentLevel
     */
    public java.lang.String getIndentLevel() {
        return indentLevel;
    }


    /**
     * Sets the indentLevel value for this RemoteDocumentFolder.
     * 
     * @param indentLevel
     */
    public void setIndentLevel(java.lang.String indentLevel) {
        this.indentLevel = indentLevel;
    }


    /**
     * Gets the name value for this RemoteDocumentFolder.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteDocumentFolder.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parentProjectAttachmentFolderId value for this RemoteDocumentFolder.
     * 
     * @return parentProjectAttachmentFolderId
     */
    public java.lang.Integer getParentProjectAttachmentFolderId() {
        return parentProjectAttachmentFolderId;
    }


    /**
     * Sets the parentProjectAttachmentFolderId value for this RemoteDocumentFolder.
     * 
     * @param parentProjectAttachmentFolderId
     */
    public void setParentProjectAttachmentFolderId(java.lang.Integer parentProjectAttachmentFolderId) {
        this.parentProjectAttachmentFolderId = parentProjectAttachmentFolderId;
    }


    /**
     * Gets the projectAttachmentFolderId value for this RemoteDocumentFolder.
     * 
     * @return projectAttachmentFolderId
     */
    public java.lang.Integer getProjectAttachmentFolderId() {
        return projectAttachmentFolderId;
    }


    /**
     * Sets the projectAttachmentFolderId value for this RemoteDocumentFolder.
     * 
     * @param projectAttachmentFolderId
     */
    public void setProjectAttachmentFolderId(java.lang.Integer projectAttachmentFolderId) {
        this.projectAttachmentFolderId = projectAttachmentFolderId;
    }


    /**
     * Gets the projectId value for this RemoteDocumentFolder.
     * 
     * @return projectId
     */
    public java.lang.Integer getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this RemoteDocumentFolder.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.Integer projectId) {
        this.projectId = projectId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteDocumentFolder)) return false;
        RemoteDocumentFolder other = (RemoteDocumentFolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.indentLevel==null && other.getIndentLevel()==null) || 
             (this.indentLevel!=null &&
              this.indentLevel.equals(other.getIndentLevel()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parentProjectAttachmentFolderId==null && other.getParentProjectAttachmentFolderId()==null) || 
             (this.parentProjectAttachmentFolderId!=null &&
              this.parentProjectAttachmentFolderId.equals(other.getParentProjectAttachmentFolderId()))) &&
            ((this.projectAttachmentFolderId==null && other.getProjectAttachmentFolderId()==null) || 
             (this.projectAttachmentFolderId!=null &&
              this.projectAttachmentFolderId.equals(other.getProjectAttachmentFolderId()))) &&
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
        if (getIndentLevel() != null) {
            _hashCode += getIndentLevel().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParentProjectAttachmentFolderId() != null) {
            _hashCode += getParentProjectAttachmentFolderId().hashCode();
        }
        if (getProjectAttachmentFolderId() != null) {
            _hashCode += getProjectAttachmentFolderId().hashCode();
        }
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteDocumentFolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indentLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IndentLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentProjectAttachmentFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ParentProjectAttachmentFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectAttachmentFolderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectAttachmentFolderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectId"));
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
