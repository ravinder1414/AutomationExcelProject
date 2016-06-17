/**
 * RemoteProject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteProject  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.util.Calendar creationDate;

    private java.lang.String description;

    private java.lang.String name;

    private java.lang.Integer nonWorkingHours;

    private java.lang.Integer projectId;

    private java.lang.String website;

    private java.lang.Integer workingDays;

    private java.lang.Integer workingHours;

    public RemoteProject() {
    }

    public RemoteProject(
           java.lang.Boolean active,
           java.util.Calendar creationDate,
           java.lang.String description,
           java.lang.String name,
           java.lang.Integer nonWorkingHours,
           java.lang.Integer projectId,
           java.lang.String website,
           java.lang.Integer workingDays,
           java.lang.Integer workingHours) {
           this.active = active;
           this.creationDate = creationDate;
           this.description = description;
           this.name = name;
           this.nonWorkingHours = nonWorkingHours;
           this.projectId = projectId;
           this.website = website;
           this.workingDays = workingDays;
           this.workingHours = workingHours;
    }


    /**
     * Gets the active value for this RemoteProject.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this RemoteProject.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the creationDate value for this RemoteProject.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteProject.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the description value for this RemoteProject.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteProject.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this RemoteProject.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteProject.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nonWorkingHours value for this RemoteProject.
     * 
     * @return nonWorkingHours
     */
    public java.lang.Integer getNonWorkingHours() {
        return nonWorkingHours;
    }


    /**
     * Sets the nonWorkingHours value for this RemoteProject.
     * 
     * @param nonWorkingHours
     */
    public void setNonWorkingHours(java.lang.Integer nonWorkingHours) {
        this.nonWorkingHours = nonWorkingHours;
    }


    /**
     * Gets the projectId value for this RemoteProject.
     * 
     * @return projectId
     */
    public java.lang.Integer getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this RemoteProject.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.Integer projectId) {
        this.projectId = projectId;
    }


    /**
     * Gets the website value for this RemoteProject.
     * 
     * @return website
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this RemoteProject.
     * 
     * @param website
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }


    /**
     * Gets the workingDays value for this RemoteProject.
     * 
     * @return workingDays
     */
    public java.lang.Integer getWorkingDays() {
        return workingDays;
    }


    /**
     * Sets the workingDays value for this RemoteProject.
     * 
     * @param workingDays
     */
    public void setWorkingDays(java.lang.Integer workingDays) {
        this.workingDays = workingDays;
    }


    /**
     * Gets the workingHours value for this RemoteProject.
     * 
     * @return workingHours
     */
    public java.lang.Integer getWorkingHours() {
        return workingHours;
    }


    /**
     * Sets the workingHours value for this RemoteProject.
     * 
     * @param workingHours
     */
    public void setWorkingHours(java.lang.Integer workingHours) {
        this.workingHours = workingHours;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteProject)) return false;
        RemoteProject other = (RemoteProject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nonWorkingHours==null && other.getNonWorkingHours()==null) || 
             (this.nonWorkingHours!=null &&
              this.nonWorkingHours.equals(other.getNonWorkingHours()))) &&
            ((this.projectId==null && other.getProjectId()==null) || 
             (this.projectId!=null &&
              this.projectId.equals(other.getProjectId()))) &&
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.workingDays==null && other.getWorkingDays()==null) || 
             (this.workingDays!=null &&
              this.workingDays.equals(other.getWorkingDays()))) &&
            ((this.workingHours==null && other.getWorkingHours()==null) || 
             (this.workingHours!=null &&
              this.workingHours.equals(other.getWorkingHours())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNonWorkingHours() != null) {
            _hashCode += getNonWorkingHours().hashCode();
        }
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getWorkingDays() != null) {
            _hashCode += getWorkingDays().hashCode();
        }
        if (getWorkingHours() != null) {
            _hashCode += getWorkingHours().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteProject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Description"));
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
        elemField.setFieldName("nonWorkingHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "NonWorkingHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workingDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "WorkingDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workingHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "WorkingHours"));
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
