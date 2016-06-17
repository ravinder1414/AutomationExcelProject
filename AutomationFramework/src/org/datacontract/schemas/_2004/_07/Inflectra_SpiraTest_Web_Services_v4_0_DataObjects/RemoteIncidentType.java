/**
 * RemoteIncidentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteIncidentType  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Integer incidentTypeId;

    private java.lang.Boolean issue;

    private java.lang.String name;

    private java.lang.Boolean risk;

    private java.lang.Integer workflowId;

    public RemoteIncidentType() {
    }

    public RemoteIncidentType(
           java.lang.Boolean active,
           java.lang.Integer incidentTypeId,
           java.lang.Boolean issue,
           java.lang.String name,
           java.lang.Boolean risk,
           java.lang.Integer workflowId) {
           this.active = active;
           this.incidentTypeId = incidentTypeId;
           this.issue = issue;
           this.name = name;
           this.risk = risk;
           this.workflowId = workflowId;
    }


    /**
     * Gets the active value for this RemoteIncidentType.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this RemoteIncidentType.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the incidentTypeId value for this RemoteIncidentType.
     * 
     * @return incidentTypeId
     */
    public java.lang.Integer getIncidentTypeId() {
        return incidentTypeId;
    }


    /**
     * Sets the incidentTypeId value for this RemoteIncidentType.
     * 
     * @param incidentTypeId
     */
    public void setIncidentTypeId(java.lang.Integer incidentTypeId) {
        this.incidentTypeId = incidentTypeId;
    }


    /**
     * Gets the issue value for this RemoteIncidentType.
     * 
     * @return issue
     */
    public java.lang.Boolean getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this RemoteIncidentType.
     * 
     * @param issue
     */
    public void setIssue(java.lang.Boolean issue) {
        this.issue = issue;
    }


    /**
     * Gets the name value for this RemoteIncidentType.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteIncidentType.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the risk value for this RemoteIncidentType.
     * 
     * @return risk
     */
    public java.lang.Boolean getRisk() {
        return risk;
    }


    /**
     * Sets the risk value for this RemoteIncidentType.
     * 
     * @param risk
     */
    public void setRisk(java.lang.Boolean risk) {
        this.risk = risk;
    }


    /**
     * Gets the workflowId value for this RemoteIncidentType.
     * 
     * @return workflowId
     */
    public java.lang.Integer getWorkflowId() {
        return workflowId;
    }


    /**
     * Sets the workflowId value for this RemoteIncidentType.
     * 
     * @param workflowId
     */
    public void setWorkflowId(java.lang.Integer workflowId) {
        this.workflowId = workflowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteIncidentType)) return false;
        RemoteIncidentType other = (RemoteIncidentType) obj;
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
            ((this.incidentTypeId==null && other.getIncidentTypeId()==null) || 
             (this.incidentTypeId!=null &&
              this.incidentTypeId.equals(other.getIncidentTypeId()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.risk==null && other.getRisk()==null) || 
             (this.risk!=null &&
              this.risk.equals(other.getRisk()))) &&
            ((this.workflowId==null && other.getWorkflowId()==null) || 
             (this.workflowId!=null &&
              this.workflowId.equals(other.getWorkflowId())));
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
        if (getIncidentTypeId() != null) {
            _hashCode += getIncidentTypeId().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRisk() != null) {
            _hashCode += getRisk().hashCode();
        }
        if (getWorkflowId() != null) {
            _hashCode += getWorkflowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteIncidentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Issue"));
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
        elemField.setFieldName("risk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Risk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workflowId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "WorkflowId"));
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
