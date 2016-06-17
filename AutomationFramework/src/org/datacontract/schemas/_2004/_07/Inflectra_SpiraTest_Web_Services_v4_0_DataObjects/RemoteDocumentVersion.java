/**
 * RemoteDocumentVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteDocumentVersion  implements java.io.Serializable {
    private java.lang.Integer attachmentId;

    private java.lang.Integer attachmentVersionId;

    private java.lang.Integer authorId;

    private java.lang.String authorName;

    private java.lang.String description;

    private java.lang.String filenameOrUrl;

    private java.lang.Integer size;

    private java.util.Calendar uploadDate;

    private java.lang.String versionNumber;

    public RemoteDocumentVersion() {
    }

    public RemoteDocumentVersion(
           java.lang.Integer attachmentId,
           java.lang.Integer attachmentVersionId,
           java.lang.Integer authorId,
           java.lang.String authorName,
           java.lang.String description,
           java.lang.String filenameOrUrl,
           java.lang.Integer size,
           java.util.Calendar uploadDate,
           java.lang.String versionNumber) {
           this.attachmentId = attachmentId;
           this.attachmentVersionId = attachmentVersionId;
           this.authorId = authorId;
           this.authorName = authorName;
           this.description = description;
           this.filenameOrUrl = filenameOrUrl;
           this.size = size;
           this.uploadDate = uploadDate;
           this.versionNumber = versionNumber;
    }


    /**
     * Gets the attachmentId value for this RemoteDocumentVersion.
     * 
     * @return attachmentId
     */
    public java.lang.Integer getAttachmentId() {
        return attachmentId;
    }


    /**
     * Sets the attachmentId value for this RemoteDocumentVersion.
     * 
     * @param attachmentId
     */
    public void setAttachmentId(java.lang.Integer attachmentId) {
        this.attachmentId = attachmentId;
    }


    /**
     * Gets the attachmentVersionId value for this RemoteDocumentVersion.
     * 
     * @return attachmentVersionId
     */
    public java.lang.Integer getAttachmentVersionId() {
        return attachmentVersionId;
    }


    /**
     * Sets the attachmentVersionId value for this RemoteDocumentVersion.
     * 
     * @param attachmentVersionId
     */
    public void setAttachmentVersionId(java.lang.Integer attachmentVersionId) {
        this.attachmentVersionId = attachmentVersionId;
    }


    /**
     * Gets the authorId value for this RemoteDocumentVersion.
     * 
     * @return authorId
     */
    public java.lang.Integer getAuthorId() {
        return authorId;
    }


    /**
     * Sets the authorId value for this RemoteDocumentVersion.
     * 
     * @param authorId
     */
    public void setAuthorId(java.lang.Integer authorId) {
        this.authorId = authorId;
    }


    /**
     * Gets the authorName value for this RemoteDocumentVersion.
     * 
     * @return authorName
     */
    public java.lang.String getAuthorName() {
        return authorName;
    }


    /**
     * Sets the authorName value for this RemoteDocumentVersion.
     * 
     * @param authorName
     */
    public void setAuthorName(java.lang.String authorName) {
        this.authorName = authorName;
    }


    /**
     * Gets the description value for this RemoteDocumentVersion.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteDocumentVersion.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the filenameOrUrl value for this RemoteDocumentVersion.
     * 
     * @return filenameOrUrl
     */
    public java.lang.String getFilenameOrUrl() {
        return filenameOrUrl;
    }


    /**
     * Sets the filenameOrUrl value for this RemoteDocumentVersion.
     * 
     * @param filenameOrUrl
     */
    public void setFilenameOrUrl(java.lang.String filenameOrUrl) {
        this.filenameOrUrl = filenameOrUrl;
    }


    /**
     * Gets the size value for this RemoteDocumentVersion.
     * 
     * @return size
     */
    public java.lang.Integer getSize() {
        return size;
    }


    /**
     * Sets the size value for this RemoteDocumentVersion.
     * 
     * @param size
     */
    public void setSize(java.lang.Integer size) {
        this.size = size;
    }


    /**
     * Gets the uploadDate value for this RemoteDocumentVersion.
     * 
     * @return uploadDate
     */
    public java.util.Calendar getUploadDate() {
        return uploadDate;
    }


    /**
     * Sets the uploadDate value for this RemoteDocumentVersion.
     * 
     * @param uploadDate
     */
    public void setUploadDate(java.util.Calendar uploadDate) {
        this.uploadDate = uploadDate;
    }


    /**
     * Gets the versionNumber value for this RemoteDocumentVersion.
     * 
     * @return versionNumber
     */
    public java.lang.String getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this RemoteDocumentVersion.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.String versionNumber) {
        this.versionNumber = versionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteDocumentVersion)) return false;
        RemoteDocumentVersion other = (RemoteDocumentVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attachmentId==null && other.getAttachmentId()==null) || 
             (this.attachmentId!=null &&
              this.attachmentId.equals(other.getAttachmentId()))) &&
            ((this.attachmentVersionId==null && other.getAttachmentVersionId()==null) || 
             (this.attachmentVersionId!=null &&
              this.attachmentVersionId.equals(other.getAttachmentVersionId()))) &&
            ((this.authorId==null && other.getAuthorId()==null) || 
             (this.authorId!=null &&
              this.authorId.equals(other.getAuthorId()))) &&
            ((this.authorName==null && other.getAuthorName()==null) || 
             (this.authorName!=null &&
              this.authorName.equals(other.getAuthorName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.filenameOrUrl==null && other.getFilenameOrUrl()==null) || 
             (this.filenameOrUrl!=null &&
              this.filenameOrUrl.equals(other.getFilenameOrUrl()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.uploadDate==null && other.getUploadDate()==null) || 
             (this.uploadDate!=null &&
              this.uploadDate.equals(other.getUploadDate()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber())));
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
        if (getAttachmentId() != null) {
            _hashCode += getAttachmentId().hashCode();
        }
        if (getAttachmentVersionId() != null) {
            _hashCode += getAttachmentVersionId().hashCode();
        }
        if (getAuthorId() != null) {
            _hashCode += getAuthorId().hashCode();
        }
        if (getAuthorName() != null) {
            _hashCode += getAuthorName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFilenameOrUrl() != null) {
            _hashCode += getFilenameOrUrl().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getUploadDate() != null) {
            _hashCode += getUploadDate().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteDocumentVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AttachmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentVersionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AttachmentVersionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AuthorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AuthorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filenameOrUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FilenameOrUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "UploadDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "VersionNumber"));
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
