/**
 * RemoteUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteUser  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Boolean admin;

    private java.lang.Boolean approved;

    private java.lang.String department;

    private java.lang.String emailAddress;

    private java.lang.String firstName;

    private java.lang.String fullName;

    private java.lang.String lastName;

    private java.lang.String ldapDn;

    private java.lang.Boolean locked;

    private java.lang.String middleInitial;

    private java.lang.String rssToken;

    private java.lang.Integer userId;

    private java.lang.String userName;

    public RemoteUser() {
    }

    public RemoteUser(
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
           java.lang.String userName) {
           this.active = active;
           this.admin = admin;
           this.approved = approved;
           this.department = department;
           this.emailAddress = emailAddress;
           this.firstName = firstName;
           this.fullName = fullName;
           this.lastName = lastName;
           this.ldapDn = ldapDn;
           this.locked = locked;
           this.middleInitial = middleInitial;
           this.rssToken = rssToken;
           this.userId = userId;
           this.userName = userName;
    }


    /**
     * Gets the active value for this RemoteUser.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this RemoteUser.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the admin value for this RemoteUser.
     * 
     * @return admin
     */
    public java.lang.Boolean getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this RemoteUser.
     * 
     * @param admin
     */
    public void setAdmin(java.lang.Boolean admin) {
        this.admin = admin;
    }


    /**
     * Gets the approved value for this RemoteUser.
     * 
     * @return approved
     */
    public java.lang.Boolean getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this RemoteUser.
     * 
     * @param approved
     */
    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }


    /**
     * Gets the department value for this RemoteUser.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this RemoteUser.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the emailAddress value for this RemoteUser.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this RemoteUser.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the firstName value for this RemoteUser.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this RemoteUser.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the fullName value for this RemoteUser.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this RemoteUser.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the lastName value for this RemoteUser.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this RemoteUser.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the ldapDn value for this RemoteUser.
     * 
     * @return ldapDn
     */
    public java.lang.String getLdapDn() {
        return ldapDn;
    }


    /**
     * Sets the ldapDn value for this RemoteUser.
     * 
     * @param ldapDn
     */
    public void setLdapDn(java.lang.String ldapDn) {
        this.ldapDn = ldapDn;
    }


    /**
     * Gets the locked value for this RemoteUser.
     * 
     * @return locked
     */
    public java.lang.Boolean getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this RemoteUser.
     * 
     * @param locked
     */
    public void setLocked(java.lang.Boolean locked) {
        this.locked = locked;
    }


    /**
     * Gets the middleInitial value for this RemoteUser.
     * 
     * @return middleInitial
     */
    public java.lang.String getMiddleInitial() {
        return middleInitial;
    }


    /**
     * Sets the middleInitial value for this RemoteUser.
     * 
     * @param middleInitial
     */
    public void setMiddleInitial(java.lang.String middleInitial) {
        this.middleInitial = middleInitial;
    }


    /**
     * Gets the rssToken value for this RemoteUser.
     * 
     * @return rssToken
     */
    public java.lang.String getRssToken() {
        return rssToken;
    }


    /**
     * Sets the rssToken value for this RemoteUser.
     * 
     * @param rssToken
     */
    public void setRssToken(java.lang.String rssToken) {
        this.rssToken = rssToken;
    }


    /**
     * Gets the userId value for this RemoteUser.
     * 
     * @return userId
     */
    public java.lang.Integer getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this RemoteUser.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this RemoteUser.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this RemoteUser.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteUser)) return false;
        RemoteUser other = (RemoteUser) obj;
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
            ((this.admin==null && other.getAdmin()==null) || 
             (this.admin!=null &&
              this.admin.equals(other.getAdmin()))) &&
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.ldapDn==null && other.getLdapDn()==null) || 
             (this.ldapDn!=null &&
              this.ldapDn.equals(other.getLdapDn()))) &&
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              this.locked.equals(other.getLocked()))) &&
            ((this.middleInitial==null && other.getMiddleInitial()==null) || 
             (this.middleInitial!=null &&
              this.middleInitial.equals(other.getMiddleInitial()))) &&
            ((this.rssToken==null && other.getRssToken()==null) || 
             (this.rssToken!=null &&
              this.rssToken.equals(other.getRssToken()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getAdmin() != null) {
            _hashCode += getAdmin().hashCode();
        }
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLdapDn() != null) {
            _hashCode += getLdapDn().hashCode();
        }
        if (getLocked() != null) {
            _hashCode += getLocked().hashCode();
        }
        if (getMiddleInitial() != null) {
            _hashCode += getMiddleInitial().hashCode();
        }
        if (getRssToken() != null) {
            _hashCode += getRssToken().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("admin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Admin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapDn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "LdapDn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleInitial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "MiddleInitial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rssToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RssToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "UserName"));
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
