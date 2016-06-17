/**
 * RemoteBuild.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteBuild  implements java.io.Serializable {
    private java.lang.Integer buildId;

    private java.lang.Integer buildStatusId;

    private java.lang.String buildStatusName;

    private java.util.Calendar creationDate;

    private java.lang.String description;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.Integer projectId;

    private java.lang.Integer releaseId;

    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuildSourceCode[] revisions;

    public RemoteBuild() {
    }

    public RemoteBuild(
           java.lang.Integer buildId,
           java.lang.Integer buildStatusId,
           java.lang.String buildStatusName,
           java.util.Calendar creationDate,
           java.lang.String description,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.Integer projectId,
           java.lang.Integer releaseId,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuildSourceCode[] revisions) {
           this.buildId = buildId;
           this.buildStatusId = buildStatusId;
           this.buildStatusName = buildStatusName;
           this.creationDate = creationDate;
           this.description = description;
           this.lastUpdateDate = lastUpdateDate;
           this.name = name;
           this.projectId = projectId;
           this.releaseId = releaseId;
           this.revisions = revisions;
    }


    /**
     * Gets the buildId value for this RemoteBuild.
     * 
     * @return buildId
     */
    public java.lang.Integer getBuildId() {
        return buildId;
    }


    /**
     * Sets the buildId value for this RemoteBuild.
     * 
     * @param buildId
     */
    public void setBuildId(java.lang.Integer buildId) {
        this.buildId = buildId;
    }


    /**
     * Gets the buildStatusId value for this RemoteBuild.
     * 
     * @return buildStatusId
     */
    public java.lang.Integer getBuildStatusId() {
        return buildStatusId;
    }


    /**
     * Sets the buildStatusId value for this RemoteBuild.
     * 
     * @param buildStatusId
     */
    public void setBuildStatusId(java.lang.Integer buildStatusId) {
        this.buildStatusId = buildStatusId;
    }


    /**
     * Gets the buildStatusName value for this RemoteBuild.
     * 
     * @return buildStatusName
     */
    public java.lang.String getBuildStatusName() {
        return buildStatusName;
    }


    /**
     * Sets the buildStatusName value for this RemoteBuild.
     * 
     * @param buildStatusName
     */
    public void setBuildStatusName(java.lang.String buildStatusName) {
        this.buildStatusName = buildStatusName;
    }


    /**
     * Gets the creationDate value for this RemoteBuild.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteBuild.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the description value for this RemoteBuild.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteBuild.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteBuild.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteBuild.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this RemoteBuild.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteBuild.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the projectId value for this RemoteBuild.
     * 
     * @return projectId
     */
    public java.lang.Integer getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this RemoteBuild.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.Integer projectId) {
        this.projectId = projectId;
    }


    /**
     * Gets the releaseId value for this RemoteBuild.
     * 
     * @return releaseId
     */
    public java.lang.Integer getReleaseId() {
        return releaseId;
    }


    /**
     * Sets the releaseId value for this RemoteBuild.
     * 
     * @param releaseId
     */
    public void setReleaseId(java.lang.Integer releaseId) {
        this.releaseId = releaseId;
    }


    /**
     * Gets the revisions value for this RemoteBuild.
     * 
     * @return revisions
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuildSourceCode[] getRevisions() {
        return revisions;
    }


    /**
     * Sets the revisions value for this RemoteBuild.
     * 
     * @param revisions
     */
    public void setRevisions(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuildSourceCode[] revisions) {
        this.revisions = revisions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteBuild)) return false;
        RemoteBuild other = (RemoteBuild) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buildId==null && other.getBuildId()==null) || 
             (this.buildId!=null &&
              this.buildId.equals(other.getBuildId()))) &&
            ((this.buildStatusId==null && other.getBuildStatusId()==null) || 
             (this.buildStatusId!=null &&
              this.buildStatusId.equals(other.getBuildStatusId()))) &&
            ((this.buildStatusName==null && other.getBuildStatusName()==null) || 
             (this.buildStatusName!=null &&
              this.buildStatusName.equals(other.getBuildStatusName()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.projectId==null && other.getProjectId()==null) || 
             (this.projectId!=null &&
              this.projectId.equals(other.getProjectId()))) &&
            ((this.releaseId==null && other.getReleaseId()==null) || 
             (this.releaseId!=null &&
              this.releaseId.equals(other.getReleaseId()))) &&
            ((this.revisions==null && other.getRevisions()==null) || 
             (this.revisions!=null &&
              java.util.Arrays.equals(this.revisions, other.getRevisions())));
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
        if (getBuildId() != null) {
            _hashCode += getBuildId().hashCode();
        }
        if (getBuildStatusId() != null) {
            _hashCode += getBuildStatusId().hashCode();
        }
        if (getBuildStatusName() != null) {
            _hashCode += getBuildStatusName().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        if (getReleaseId() != null) {
            _hashCode += getReleaseId().hashCode();
        }
        if (getRevisions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevisions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevisions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteBuild.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "BuildId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "BuildStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildStatusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "BuildStatusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("lastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "LastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ReleaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revisions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Revisions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuildSourceCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuildSourceCode"));
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
