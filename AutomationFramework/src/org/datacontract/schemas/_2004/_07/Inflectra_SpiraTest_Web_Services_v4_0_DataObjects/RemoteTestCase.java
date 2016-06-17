/**
 * RemoteTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteTestCase  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Integer authorId;

    private java.lang.String authorName;

    private java.lang.Integer automationAttachmentId;

    private java.lang.Integer automationEngineId;

    private java.util.Calendar creationDate;

    private java.lang.String description;

    private java.lang.Integer estimatedDuration;

    private java.util.Calendar executionDate;

    private java.lang.Integer executionStatusId;

    private java.lang.Boolean folder;

    private java.lang.String indentLevel;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.Integer ownerId;

    private java.lang.String ownerName;

    private java.lang.String projectName;

    private java.lang.Integer testCaseId;

    private java.lang.Integer testCasePriorityId;

    private java.lang.String testCasePriorityName;

    private org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep[] testSteps;

    public RemoteTestCase() {
    }

    public RemoteTestCase(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.Boolean active,
           java.lang.Integer authorId,
           java.lang.String authorName,
           java.lang.Integer automationAttachmentId,
           java.lang.Integer automationEngineId,
           java.util.Calendar creationDate,
           java.lang.String description,
           java.lang.Integer estimatedDuration,
           java.util.Calendar executionDate,
           java.lang.Integer executionStatusId,
           java.lang.Boolean folder,
           java.lang.String indentLevel,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.Integer ownerId,
           java.lang.String ownerName,
           java.lang.String projectName,
           java.lang.Integer testCaseId,
           java.lang.Integer testCasePriorityId,
           java.lang.String testCasePriorityName,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep[] testSteps) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.active = active;
        this.authorId = authorId;
        this.authorName = authorName;
        this.automationAttachmentId = automationAttachmentId;
        this.automationEngineId = automationEngineId;
        this.creationDate = creationDate;
        this.description = description;
        this.estimatedDuration = estimatedDuration;
        this.executionDate = executionDate;
        this.executionStatusId = executionStatusId;
        this.folder = folder;
        this.indentLevel = indentLevel;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.projectName = projectName;
        this.testCaseId = testCaseId;
        this.testCasePriorityId = testCasePriorityId;
        this.testCasePriorityName = testCasePriorityName;
        this.testSteps = testSteps;
    }


    /**
     * Gets the active value for this RemoteTestCase.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this RemoteTestCase.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the authorId value for this RemoteTestCase.
     * 
     * @return authorId
     */
    public java.lang.Integer getAuthorId() {
        return authorId;
    }


    /**
     * Sets the authorId value for this RemoteTestCase.
     * 
     * @param authorId
     */
    public void setAuthorId(java.lang.Integer authorId) {
        this.authorId = authorId;
    }


    /**
     * Gets the authorName value for this RemoteTestCase.
     * 
     * @return authorName
     */
    public java.lang.String getAuthorName() {
        return authorName;
    }


    /**
     * Sets the authorName value for this RemoteTestCase.
     * 
     * @param authorName
     */
    public void setAuthorName(java.lang.String authorName) {
        this.authorName = authorName;
    }


    /**
     * Gets the automationAttachmentId value for this RemoteTestCase.
     * 
     * @return automationAttachmentId
     */
    public java.lang.Integer getAutomationAttachmentId() {
        return automationAttachmentId;
    }


    /**
     * Sets the automationAttachmentId value for this RemoteTestCase.
     * 
     * @param automationAttachmentId
     */
    public void setAutomationAttachmentId(java.lang.Integer automationAttachmentId) {
        this.automationAttachmentId = automationAttachmentId;
    }


    /**
     * Gets the automationEngineId value for this RemoteTestCase.
     * 
     * @return automationEngineId
     */
    public java.lang.Integer getAutomationEngineId() {
        return automationEngineId;
    }


    /**
     * Sets the automationEngineId value for this RemoteTestCase.
     * 
     * @param automationEngineId
     */
    public void setAutomationEngineId(java.lang.Integer automationEngineId) {
        this.automationEngineId = automationEngineId;
    }


    /**
     * Gets the creationDate value for this RemoteTestCase.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteTestCase.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the description value for this RemoteTestCase.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteTestCase.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the estimatedDuration value for this RemoteTestCase.
     * 
     * @return estimatedDuration
     */
    public java.lang.Integer getEstimatedDuration() {
        return estimatedDuration;
    }


    /**
     * Sets the estimatedDuration value for this RemoteTestCase.
     * 
     * @param estimatedDuration
     */
    public void setEstimatedDuration(java.lang.Integer estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }


    /**
     * Gets the executionDate value for this RemoteTestCase.
     * 
     * @return executionDate
     */
    public java.util.Calendar getExecutionDate() {
        return executionDate;
    }


    /**
     * Sets the executionDate value for this RemoteTestCase.
     * 
     * @param executionDate
     */
    public void setExecutionDate(java.util.Calendar executionDate) {
        this.executionDate = executionDate;
    }


    /**
     * Gets the executionStatusId value for this RemoteTestCase.
     * 
     * @return executionStatusId
     */
    public java.lang.Integer getExecutionStatusId() {
        return executionStatusId;
    }


    /**
     * Sets the executionStatusId value for this RemoteTestCase.
     * 
     * @param executionStatusId
     */
    public void setExecutionStatusId(java.lang.Integer executionStatusId) {
        this.executionStatusId = executionStatusId;
    }


    /**
     * Gets the folder value for this RemoteTestCase.
     * 
     * @return folder
     */
    public java.lang.Boolean getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this RemoteTestCase.
     * 
     * @param folder
     */
    public void setFolder(java.lang.Boolean folder) {
        this.folder = folder;
    }


    /**
     * Gets the indentLevel value for this RemoteTestCase.
     * 
     * @return indentLevel
     */
    public java.lang.String getIndentLevel() {
        return indentLevel;
    }


    /**
     * Sets the indentLevel value for this RemoteTestCase.
     * 
     * @param indentLevel
     */
    public void setIndentLevel(java.lang.String indentLevel) {
        this.indentLevel = indentLevel;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteTestCase.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteTestCase.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this RemoteTestCase.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteTestCase.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ownerId value for this RemoteTestCase.
     * 
     * @return ownerId
     */
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RemoteTestCase.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerName value for this RemoteTestCase.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this RemoteTestCase.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the projectName value for this RemoteTestCase.
     * 
     * @return projectName
     */
    public java.lang.String getProjectName() {
        return projectName;
    }


    /**
     * Sets the projectName value for this RemoteTestCase.
     * 
     * @param projectName
     */
    public void setProjectName(java.lang.String projectName) {
        this.projectName = projectName;
    }


    /**
     * Gets the testCaseId value for this RemoteTestCase.
     * 
     * @return testCaseId
     */
    public java.lang.Integer getTestCaseId() {
        return testCaseId;
    }


    /**
     * Sets the testCaseId value for this RemoteTestCase.
     * 
     * @param testCaseId
     */
    public void setTestCaseId(java.lang.Integer testCaseId) {
        this.testCaseId = testCaseId;
    }


    /**
     * Gets the testCasePriorityId value for this RemoteTestCase.
     * 
     * @return testCasePriorityId
     */
    public java.lang.Integer getTestCasePriorityId() {
        return testCasePriorityId;
    }


    /**
     * Sets the testCasePriorityId value for this RemoteTestCase.
     * 
     * @param testCasePriorityId
     */
    public void setTestCasePriorityId(java.lang.Integer testCasePriorityId) {
        this.testCasePriorityId = testCasePriorityId;
    }


    /**
     * Gets the testCasePriorityName value for this RemoteTestCase.
     * 
     * @return testCasePriorityName
     */
    public java.lang.String getTestCasePriorityName() {
        return testCasePriorityName;
    }


    /**
     * Sets the testCasePriorityName value for this RemoteTestCase.
     * 
     * @param testCasePriorityName
     */
    public void setTestCasePriorityName(java.lang.String testCasePriorityName) {
        this.testCasePriorityName = testCasePriorityName;
    }


    /**
     * Gets the testSteps value for this RemoteTestCase.
     * 
     * @return testSteps
     */
    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep[] getTestSteps() {
        return testSteps;
    }


    /**
     * Sets the testSteps value for this RemoteTestCase.
     * 
     * @param testSteps
     */
    public void setTestSteps(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep[] testSteps) {
        this.testSteps = testSteps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteTestCase)) return false;
        RemoteTestCase other = (RemoteTestCase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.authorId==null && other.getAuthorId()==null) || 
             (this.authorId!=null &&
              this.authorId.equals(other.getAuthorId()))) &&
            ((this.authorName==null && other.getAuthorName()==null) || 
             (this.authorName!=null &&
              this.authorName.equals(other.getAuthorName()))) &&
            ((this.automationAttachmentId==null && other.getAutomationAttachmentId()==null) || 
             (this.automationAttachmentId!=null &&
              this.automationAttachmentId.equals(other.getAutomationAttachmentId()))) &&
            ((this.automationEngineId==null && other.getAutomationEngineId()==null) || 
             (this.automationEngineId!=null &&
              this.automationEngineId.equals(other.getAutomationEngineId()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.estimatedDuration==null && other.getEstimatedDuration()==null) || 
             (this.estimatedDuration!=null &&
              this.estimatedDuration.equals(other.getEstimatedDuration()))) &&
            ((this.executionDate==null && other.getExecutionDate()==null) || 
             (this.executionDate!=null &&
              this.executionDate.equals(other.getExecutionDate()))) &&
            ((this.executionStatusId==null && other.getExecutionStatusId()==null) || 
             (this.executionStatusId!=null &&
              this.executionStatusId.equals(other.getExecutionStatusId()))) &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder()))) &&
            ((this.indentLevel==null && other.getIndentLevel()==null) || 
             (this.indentLevel!=null &&
              this.indentLevel.equals(other.getIndentLevel()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.projectName==null && other.getProjectName()==null) || 
             (this.projectName!=null &&
              this.projectName.equals(other.getProjectName()))) &&
            ((this.testCaseId==null && other.getTestCaseId()==null) || 
             (this.testCaseId!=null &&
              this.testCaseId.equals(other.getTestCaseId()))) &&
            ((this.testCasePriorityId==null && other.getTestCasePriorityId()==null) || 
             (this.testCasePriorityId!=null &&
              this.testCasePriorityId.equals(other.getTestCasePriorityId()))) &&
            ((this.testCasePriorityName==null && other.getTestCasePriorityName()==null) || 
             (this.testCasePriorityName!=null &&
              this.testCasePriorityName.equals(other.getTestCasePriorityName()))) &&
            ((this.testSteps==null && other.getTestSteps()==null) || 
             (this.testSteps!=null &&
              java.util.Arrays.equals(this.testSteps, other.getTestSteps())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getAuthorId() != null) {
            _hashCode += getAuthorId().hashCode();
        }
        if (getAuthorName() != null) {
            _hashCode += getAuthorName().hashCode();
        }
        if (getAutomationAttachmentId() != null) {
            _hashCode += getAutomationAttachmentId().hashCode();
        }
        if (getAutomationEngineId() != null) {
            _hashCode += getAutomationEngineId().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEstimatedDuration() != null) {
            _hashCode += getEstimatedDuration().hashCode();
        }
        if (getExecutionDate() != null) {
            _hashCode += getExecutionDate().hashCode();
        }
        if (getExecutionStatusId() != null) {
            _hashCode += getExecutionStatusId().hashCode();
        }
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        if (getIndentLevel() != null) {
            _hashCode += getIndentLevel().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getProjectName() != null) {
            _hashCode += getProjectName().hashCode();
        }
        if (getTestCaseId() != null) {
            _hashCode += getTestCaseId().hashCode();
        }
        if (getTestCasePriorityId() != null) {
            _hashCode += getTestCasePriorityId().hashCode();
        }
        if (getTestCasePriorityName() != null) {
            _hashCode += getTestCasePriorityName().hashCode();
        }
        if (getTestSteps() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestSteps());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestSteps(), i);
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
        new org.apache.axis.description.TypeDesc(RemoteTestCase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("automationAttachmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AutomationAttachmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationEngineId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AutomationEngineId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("estimatedDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "EstimatedDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExecutionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executionStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExecutionStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Folder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indentLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IndentLevel"));
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
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "OwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestCaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCasePriorityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestCasePriorityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testCasePriorityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestCasePriorityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep"));
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
