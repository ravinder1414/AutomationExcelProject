/**
 * RemoteWorkflowIncidentTransition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteWorkflowIncidentTransition  implements java.io.Serializable {
    private java.lang.Boolean executeByDetector;

    private java.lang.Boolean executeByOwner;

    private java.lang.Integer incidentStatusId_Input;

    private java.lang.Integer incidentStatusId_Output;

    private java.lang.String incidentStatusName_Input;

    private java.lang.String incidentStatusName_Output;

    private java.lang.String name;

    private java.lang.Integer transitionId;

    private java.lang.Integer workflowId;

    public RemoteWorkflowIncidentTransition() {
    }

    public RemoteWorkflowIncidentTransition(
           java.lang.Boolean executeByDetector,
           java.lang.Boolean executeByOwner,
           java.lang.Integer incidentStatusId_Input,
           java.lang.Integer incidentStatusId_Output,
           java.lang.String incidentStatusName_Input,
           java.lang.String incidentStatusName_Output,
           java.lang.String name,
           java.lang.Integer transitionId,
           java.lang.Integer workflowId) {
           this.executeByDetector = executeByDetector;
           this.executeByOwner = executeByOwner;
           this.incidentStatusId_Input = incidentStatusId_Input;
           this.incidentStatusId_Output = incidentStatusId_Output;
           this.incidentStatusName_Input = incidentStatusName_Input;
           this.incidentStatusName_Output = incidentStatusName_Output;
           this.name = name;
           this.transitionId = transitionId;
           this.workflowId = workflowId;
    }


    /**
     * Gets the executeByDetector value for this RemoteWorkflowIncidentTransition.
     * 
     * @return executeByDetector
     */
    public java.lang.Boolean getExecuteByDetector() {
        return executeByDetector;
    }


    /**
     * Sets the executeByDetector value for this RemoteWorkflowIncidentTransition.
     * 
     * @param executeByDetector
     */
    public void setExecuteByDetector(java.lang.Boolean executeByDetector) {
        this.executeByDetector = executeByDetector;
    }


    /**
     * Gets the executeByOwner value for this RemoteWorkflowIncidentTransition.
     * 
     * @return executeByOwner
     */
    public java.lang.Boolean getExecuteByOwner() {
        return executeByOwner;
    }


    /**
     * Sets the executeByOwner value for this RemoteWorkflowIncidentTransition.
     * 
     * @param executeByOwner
     */
    public void setExecuteByOwner(java.lang.Boolean executeByOwner) {
        this.executeByOwner = executeByOwner;
    }


    /**
     * Gets the incidentStatusId_Input value for this RemoteWorkflowIncidentTransition.
     * 
     * @return incidentStatusId_Input
     */
    public java.lang.Integer getIncidentStatusId_Input() {
        return incidentStatusId_Input;
    }


    /**
     * Sets the incidentStatusId_Input value for this RemoteWorkflowIncidentTransition.
     * 
     * @param incidentStatusId_Input
     */
    public void setIncidentStatusId_Input(java.lang.Integer incidentStatusId_Input) {
        this.incidentStatusId_Input = incidentStatusId_Input;
    }


    /**
     * Gets the incidentStatusId_Output value for this RemoteWorkflowIncidentTransition.
     * 
     * @return incidentStatusId_Output
     */
    public java.lang.Integer getIncidentStatusId_Output() {
        return incidentStatusId_Output;
    }


    /**
     * Sets the incidentStatusId_Output value for this RemoteWorkflowIncidentTransition.
     * 
     * @param incidentStatusId_Output
     */
    public void setIncidentStatusId_Output(java.lang.Integer incidentStatusId_Output) {
        this.incidentStatusId_Output = incidentStatusId_Output;
    }


    /**
     * Gets the incidentStatusName_Input value for this RemoteWorkflowIncidentTransition.
     * 
     * @return incidentStatusName_Input
     */
    public java.lang.String getIncidentStatusName_Input() {
        return incidentStatusName_Input;
    }


    /**
     * Sets the incidentStatusName_Input value for this RemoteWorkflowIncidentTransition.
     * 
     * @param incidentStatusName_Input
     */
    public void setIncidentStatusName_Input(java.lang.String incidentStatusName_Input) {
        this.incidentStatusName_Input = incidentStatusName_Input;
    }


    /**
     * Gets the incidentStatusName_Output value for this RemoteWorkflowIncidentTransition.
     * 
     * @return incidentStatusName_Output
     */
    public java.lang.String getIncidentStatusName_Output() {
        return incidentStatusName_Output;
    }


    /**
     * Sets the incidentStatusName_Output value for this RemoteWorkflowIncidentTransition.
     * 
     * @param incidentStatusName_Output
     */
    public void setIncidentStatusName_Output(java.lang.String incidentStatusName_Output) {
        this.incidentStatusName_Output = incidentStatusName_Output;
    }


    /**
     * Gets the name value for this RemoteWorkflowIncidentTransition.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteWorkflowIncidentTransition.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the transitionId value for this RemoteWorkflowIncidentTransition.
     * 
     * @return transitionId
     */
    public java.lang.Integer getTransitionId() {
        return transitionId;
    }


    /**
     * Sets the transitionId value for this RemoteWorkflowIncidentTransition.
     * 
     * @param transitionId
     */
    public void setTransitionId(java.lang.Integer transitionId) {
        this.transitionId = transitionId;
    }


    /**
     * Gets the workflowId value for this RemoteWorkflowIncidentTransition.
     * 
     * @return workflowId
     */
    public java.lang.Integer getWorkflowId() {
        return workflowId;
    }


    /**
     * Sets the workflowId value for this RemoteWorkflowIncidentTransition.
     * 
     * @param workflowId
     */
    public void setWorkflowId(java.lang.Integer workflowId) {
        this.workflowId = workflowId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteWorkflowIncidentTransition)) return false;
        RemoteWorkflowIncidentTransition other = (RemoteWorkflowIncidentTransition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.executeByDetector==null && other.getExecuteByDetector()==null) || 
             (this.executeByDetector!=null &&
              this.executeByDetector.equals(other.getExecuteByDetector()))) &&
            ((this.executeByOwner==null && other.getExecuteByOwner()==null) || 
             (this.executeByOwner!=null &&
              this.executeByOwner.equals(other.getExecuteByOwner()))) &&
            ((this.incidentStatusId_Input==null && other.getIncidentStatusId_Input()==null) || 
             (this.incidentStatusId_Input!=null &&
              this.incidentStatusId_Input.equals(other.getIncidentStatusId_Input()))) &&
            ((this.incidentStatusId_Output==null && other.getIncidentStatusId_Output()==null) || 
             (this.incidentStatusId_Output!=null &&
              this.incidentStatusId_Output.equals(other.getIncidentStatusId_Output()))) &&
            ((this.incidentStatusName_Input==null && other.getIncidentStatusName_Input()==null) || 
             (this.incidentStatusName_Input!=null &&
              this.incidentStatusName_Input.equals(other.getIncidentStatusName_Input()))) &&
            ((this.incidentStatusName_Output==null && other.getIncidentStatusName_Output()==null) || 
             (this.incidentStatusName_Output!=null &&
              this.incidentStatusName_Output.equals(other.getIncidentStatusName_Output()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.transitionId==null && other.getTransitionId()==null) || 
             (this.transitionId!=null &&
              this.transitionId.equals(other.getTransitionId()))) &&
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
        if (getExecuteByDetector() != null) {
            _hashCode += getExecuteByDetector().hashCode();
        }
        if (getExecuteByOwner() != null) {
            _hashCode += getExecuteByOwner().hashCode();
        }
        if (getIncidentStatusId_Input() != null) {
            _hashCode += getIncidentStatusId_Input().hashCode();
        }
        if (getIncidentStatusId_Output() != null) {
            _hashCode += getIncidentStatusId_Output().hashCode();
        }
        if (getIncidentStatusName_Input() != null) {
            _hashCode += getIncidentStatusName_Input().hashCode();
        }
        if (getIncidentStatusName_Output() != null) {
            _hashCode += getIncidentStatusName_Output().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTransitionId() != null) {
            _hashCode += getTransitionId().hashCode();
        }
        if (getWorkflowId() != null) {
            _hashCode += getWorkflowId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteWorkflowIncidentTransition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentTransition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeByDetector");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExecuteByDetector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeByOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExecuteByOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentStatusId_Input");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentStatusId_Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentStatusId_Output");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentStatusId_Output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentStatusName_Input");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentStatusName_Input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentStatusName_Output");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentStatusName_Output"));
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
        elemField.setFieldName("transitionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TransitionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
