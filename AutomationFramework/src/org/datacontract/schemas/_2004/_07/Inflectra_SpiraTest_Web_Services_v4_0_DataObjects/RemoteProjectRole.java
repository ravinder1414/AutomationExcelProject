/**
 * RemoteProjectRole.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteProjectRole  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Boolean admin;

    private java.lang.String description;

    private java.lang.Boolean discussionsAdd;

    private java.lang.Boolean documentsAdd;

    private java.lang.Boolean documentsDelete;

    private java.lang.Boolean documentsEdit;

    private java.lang.String name;

    private java.lang.Integer projectRoleId;

    private java.lang.Boolean sourceCodeView;

    public RemoteProjectRole() {
    }

    public RemoteProjectRole(
           java.lang.Boolean active,
           java.lang.Boolean admin,
           java.lang.String description,
           java.lang.Boolean discussionsAdd,
           java.lang.Boolean documentsAdd,
           java.lang.Boolean documentsDelete,
           java.lang.Boolean documentsEdit,
           java.lang.String name,
           java.lang.Integer projectRoleId,
           java.lang.Boolean sourceCodeView) {
           this.active = active;
           this.admin = admin;
           this.description = description;
           this.discussionsAdd = discussionsAdd;
           this.documentsAdd = documentsAdd;
           this.documentsDelete = documentsDelete;
           this.documentsEdit = documentsEdit;
           this.name = name;
           this.projectRoleId = projectRoleId;
           this.sourceCodeView = sourceCodeView;
    }


    /**
     * Gets the active value for this RemoteProjectRole.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this RemoteProjectRole.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the admin value for this RemoteProjectRole.
     * 
     * @return admin
     */
    public java.lang.Boolean getAdmin() {
        return admin;
    }


    /**
     * Sets the admin value for this RemoteProjectRole.
     * 
     * @param admin
     */
    public void setAdmin(java.lang.Boolean admin) {
        this.admin = admin;
    }


    /**
     * Gets the description value for this RemoteProjectRole.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteProjectRole.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the discussionsAdd value for this RemoteProjectRole.
     * 
     * @return discussionsAdd
     */
    public java.lang.Boolean getDiscussionsAdd() {
        return discussionsAdd;
    }


    /**
     * Sets the discussionsAdd value for this RemoteProjectRole.
     * 
     * @param discussionsAdd
     */
    public void setDiscussionsAdd(java.lang.Boolean discussionsAdd) {
        this.discussionsAdd = discussionsAdd;
    }


    /**
     * Gets the documentsAdd value for this RemoteProjectRole.
     * 
     * @return documentsAdd
     */
    public java.lang.Boolean getDocumentsAdd() {
        return documentsAdd;
    }


    /**
     * Sets the documentsAdd value for this RemoteProjectRole.
     * 
     * @param documentsAdd
     */
    public void setDocumentsAdd(java.lang.Boolean documentsAdd) {
        this.documentsAdd = documentsAdd;
    }


    /**
     * Gets the documentsDelete value for this RemoteProjectRole.
     * 
     * @return documentsDelete
     */
    public java.lang.Boolean getDocumentsDelete() {
        return documentsDelete;
    }


    /**
     * Sets the documentsDelete value for this RemoteProjectRole.
     * 
     * @param documentsDelete
     */
    public void setDocumentsDelete(java.lang.Boolean documentsDelete) {
        this.documentsDelete = documentsDelete;
    }


    /**
     * Gets the documentsEdit value for this RemoteProjectRole.
     * 
     * @return documentsEdit
     */
    public java.lang.Boolean getDocumentsEdit() {
        return documentsEdit;
    }


    /**
     * Sets the documentsEdit value for this RemoteProjectRole.
     * 
     * @param documentsEdit
     */
    public void setDocumentsEdit(java.lang.Boolean documentsEdit) {
        this.documentsEdit = documentsEdit;
    }


    /**
     * Gets the name value for this RemoteProjectRole.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteProjectRole.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the projectRoleId value for this RemoteProjectRole.
     * 
     * @return projectRoleId
     */
    public java.lang.Integer getProjectRoleId() {
        return projectRoleId;
    }


    /**
     * Sets the projectRoleId value for this RemoteProjectRole.
     * 
     * @param projectRoleId
     */
    public void setProjectRoleId(java.lang.Integer projectRoleId) {
        this.projectRoleId = projectRoleId;
    }


    /**
     * Gets the sourceCodeView value for this RemoteProjectRole.
     * 
     * @return sourceCodeView
     */
    public java.lang.Boolean getSourceCodeView() {
        return sourceCodeView;
    }


    /**
     * Sets the sourceCodeView value for this RemoteProjectRole.
     * 
     * @param sourceCodeView
     */
    public void setSourceCodeView(java.lang.Boolean sourceCodeView) {
        this.sourceCodeView = sourceCodeView;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteProjectRole)) return false;
        RemoteProjectRole other = (RemoteProjectRole) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.discussionsAdd==null && other.getDiscussionsAdd()==null) || 
             (this.discussionsAdd!=null &&
              this.discussionsAdd.equals(other.getDiscussionsAdd()))) &&
            ((this.documentsAdd==null && other.getDocumentsAdd()==null) || 
             (this.documentsAdd!=null &&
              this.documentsAdd.equals(other.getDocumentsAdd()))) &&
            ((this.documentsDelete==null && other.getDocumentsDelete()==null) || 
             (this.documentsDelete!=null &&
              this.documentsDelete.equals(other.getDocumentsDelete()))) &&
            ((this.documentsEdit==null && other.getDocumentsEdit()==null) || 
             (this.documentsEdit!=null &&
              this.documentsEdit.equals(other.getDocumentsEdit()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.projectRoleId==null && other.getProjectRoleId()==null) || 
             (this.projectRoleId!=null &&
              this.projectRoleId.equals(other.getProjectRoleId()))) &&
            ((this.sourceCodeView==null && other.getSourceCodeView()==null) || 
             (this.sourceCodeView!=null &&
              this.sourceCodeView.equals(other.getSourceCodeView())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDiscussionsAdd() != null) {
            _hashCode += getDiscussionsAdd().hashCode();
        }
        if (getDocumentsAdd() != null) {
            _hashCode += getDocumentsAdd().hashCode();
        }
        if (getDocumentsDelete() != null) {
            _hashCode += getDocumentsDelete().hashCode();
        }
        if (getDocumentsEdit() != null) {
            _hashCode += getDocumentsEdit().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getProjectRoleId() != null) {
            _hashCode += getProjectRoleId().hashCode();
        }
        if (getSourceCodeView() != null) {
            _hashCode += getSourceCodeView().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteProjectRole.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectRole"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discussionsAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DiscussionsAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentsAdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DocumentsAdd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentsDelete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DocumentsDelete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentsEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DocumentsEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("projectRoleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectRoleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCodeView");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "SourceCodeView"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
