/**
 * RemoteProjectUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteProjectUser  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser  implements java.io.Serializable {
    private java.lang.Integer projectId;

    private java.lang.Integer projectRoleId;

    private java.lang.String projectRoleName;

    public RemoteProjectUser() {
    }

    public RemoteProjectUser(
           java.lang.Boolean active,
           java.lang.Boolean admin,
           java.lang.Boolean approved,
           java.lang.String department,
           java.lang.String emailAddress,
           java.lang.String firstName,
           java.lang.String fullName,
           java.lang.String lastName,
           java.lang.String ldapDn,
           java.lang.Boolean locked,
           java.lang.String middleInitial,
           java.lang.String rssToken,
           java.lang.Integer userId,
           java.lang.String userName,
           java.lang.Integer projectId,
           java.lang.Integer projectRoleId,
           java.lang.String projectRoleName) {
        super(
            active,
            admin,
            approved,
            department,
            emailAddress,
            firstName,
            fullName,
            lastName,
            ldapDn,
            locked,
            middleInitial,
            rssToken,
            userId,
            userName);
        this.projectId = projectId;
        this.projectRoleId = projectRoleId;
        this.projectRoleName = projectRoleName;
    }


    /**
     * Gets the projectId value for this RemoteProjectUser.
     * 
     * @return projectId
     */
    public java.lang.Integer getProjectId() {
        return projectId;
    }


    /**
     * Sets the projectId value for this RemoteProjectUser.
     * 
     * @param projectId
     */
    public void setProjectId(java.lang.Integer projectId) {
        this.projectId = projectId;
    }


    /**
     * Gets the projectRoleId value for this RemoteProjectUser.
     * 
     * @return projectRoleId
     */
    public java.lang.Integer getProjectRoleId() {
        return projectRoleId;
    }


    /**
     * Sets the projectRoleId value for this RemoteProjectUser.
     * 
     * @param projectRoleId
     */
    public void setProjectRoleId(java.lang.Integer projectRoleId) {
        this.projectRoleId = projectRoleId;
    }


    /**
     * Gets the projectRoleName value for this RemoteProjectUser.
     * 
     * @return projectRoleName
     */
    public java.lang.String getProjectRoleName() {
        return projectRoleName;
    }


    /**
     * Sets the projectRoleName value for this RemoteProjectUser.
     * 
     * @param projectRoleName
     */
    public void setProjectRoleName(java.lang.String projectRoleName) {
        this.projectRoleName = projectRoleName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteProjectUser)) return false;
        RemoteProjectUser other = (RemoteProjectUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.projectId==null && other.getProjectId()==null) || 
             (this.projectId!=null &&
              this.projectId.equals(other.getProjectId()))) &&
            ((this.projectRoleId==null && other.getProjectRoleId()==null) || 
             (this.projectRoleId!=null &&
              this.projectRoleId.equals(other.getProjectRoleId()))) &&
            ((this.projectRoleName==null && other.getProjectRoleName()==null) || 
             (this.projectRoleName!=null &&
              this.projectRoleName.equals(other.getProjectRoleName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProjectId() != null) {
            _hashCode += getProjectId().hashCode();
        }
        if (getProjectRoleId() != null) {
            _hashCode += getProjectRoleId().hashCode();
        }
        if (getProjectRoleName() != null) {
            _hashCode += getProjectRoleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteProjectUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectRoleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectRoleName"));
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
