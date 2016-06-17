/**
 * RemoteTestSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteTestSet  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.Integer automationHostId;

    private java.lang.Integer countBlocked;

    private java.lang.Integer countCaution;

    private java.lang.Integer countFailed;

    private java.lang.Integer countNotApplicable;

    private java.lang.Integer countNotRun;

    private java.lang.Integer countPassed;

    private java.util.Calendar creationDate;

    private java.lang.Integer creatorId;

    private java.lang.String creatorName;

    private java.lang.String description;

    private java.util.Calendar executionDate;

    private java.lang.Boolean folder;

    private java.lang.String indentLevel;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.Integer ownerId;

    private java.lang.String ownerName;

    private java.util.Calendar plannedDate;

    private java.lang.String projectName;

    private java.lang.Integer recurrenceId;

    private java.lang.String recurrenceName;

    private java.lang.Integer releaseId;

    private java.lang.String releaseVersionNumber;

    private java.lang.Integer testRunTypeId;

    private java.lang.Integer testSetId;

    private java.lang.Integer testSetStatusId;

    private java.lang.String testSetStatusName;

    public RemoteTestSet() {
    }

    public RemoteTestSet(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.Integer automationHostId,
           java.lang.Integer countBlocked,
           java.lang.Integer countCaution,
           java.lang.Integer countFailed,
           java.lang.Integer countNotApplicable,
           java.lang.Integer countNotRun,
           java.lang.Integer countPassed,
           java.util.Calendar creationDate,
           java.lang.Integer creatorId,
           java.lang.String creatorName,
           java.lang.String description,
           java.util.Calendar executionDate,
           java.lang.Boolean folder,
           java.lang.String indentLevel,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.Integer ownerId,
           java.lang.String ownerName,
           java.util.Calendar plannedDate,
           java.lang.String projectName,
           java.lang.Integer recurrenceId,
           java.lang.String recurrenceName,
           java.lang.Integer releaseId,
           java.lang.String releaseVersionNumber,
           java.lang.Integer testRunTypeId,
           java.lang.Integer testSetId,
           java.lang.Integer testSetStatusId,
           java.lang.String testSetStatusName) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.automationHostId = automationHostId;
        this.countBlocked = countBlocked;
        this.countCaution = countCaution;
        this.countFailed = countFailed;
        this.countNotApplicable = countNotApplicable;
        this.countNotRun = countNotRun;
        this.countPassed = countPassed;
        this.creationDate = creationDate;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.description = description;
        this.executionDate = executionDate;
        this.folder = folder;
        this.indentLevel = indentLevel;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.plannedDate = plannedDate;
        this.projectName = projectName;
        this.recurrenceId = recurrenceId;
        this.recurrenceName = recurrenceName;
        this.releaseId = releaseId;
        this.releaseVersionNumber = releaseVersionNumber;
        this.testRunTypeId = testRunTypeId;
        this.testSetId = testSetId;
        this.testSetStatusId = testSetStatusId;
        this.testSetStatusName = testSetStatusName;
    }


    /**
     * Gets the automationHostId value for this RemoteTestSet.
     * 
     * @return automationHostId
     */
    public java.lang.Integer getAutomationHostId() {
        return automationHostId;
    }


    /**
     * Sets the automationHostId value for this RemoteTestSet.
     * 
     * @param automationHostId
     */
    public void setAutomationHostId(java.lang.Integer automationHostId) {
        this.automationHostId = automationHostId;
    }


    /**
     * Gets the countBlocked value for this RemoteTestSet.
     * 
     * @return countBlocked
     */
    public java.lang.Integer getCountBlocked() {
        return countBlocked;
    }


    /**
     * Sets the countBlocked value for this RemoteTestSet.
     * 
     * @param countBlocked
     */
    public void setCountBlocked(java.lang.Integer countBlocked) {
        this.countBlocked = countBlocked;
    }


    /**
     * Gets the countCaution value for this RemoteTestSet.
     * 
     * @return countCaution
     */
    public java.lang.Integer getCountCaution() {
        return countCaution;
    }


    /**
     * Sets the countCaution value for this RemoteTestSet.
     * 
     * @param countCaution
     */
    public void setCountCaution(java.lang.Integer countCaution) {
        this.countCaution = countCaution;
    }


    /**
     * Gets the countFailed value for this RemoteTestSet.
     * 
     * @return countFailed
     */
    public java.lang.Integer getCountFailed() {
        return countFailed;
    }


    /**
     * Sets the countFailed value for this RemoteTestSet.
     * 
     * @param countFailed
     */
    public void setCountFailed(java.lang.Integer countFailed) {
        this.countFailed = countFailed;
    }


    /**
     * Gets the countNotApplicable value for this RemoteTestSet.
     * 
     * @return countNotApplicable
     */
    public java.lang.Integer getCountNotApplicable() {
        return countNotApplicable;
    }


    /**
     * Sets the countNotApplicable value for this RemoteTestSet.
     * 
     * @param countNotApplicable
     */
    public void setCountNotApplicable(java.lang.Integer countNotApplicable) {
        this.countNotApplicable = countNotApplicable;
    }


    /**
     * Gets the countNotRun value for this RemoteTestSet.
     * 
     * @return countNotRun
     */
    public java.lang.Integer getCountNotRun() {
        return countNotRun;
    }


    /**
     * Sets the countNotRun value for this RemoteTestSet.
     * 
     * @param countNotRun
     */
    public void setCountNotRun(java.lang.Integer countNotRun) {
        this.countNotRun = countNotRun;
    }


    /**
     * Gets the countPassed value for this RemoteTestSet.
     * 
     * @return countPassed
     */
    public java.lang.Integer getCountPassed() {
        return countPassed;
    }


    /**
     * Sets the countPassed value for this RemoteTestSet.
     * 
     * @param countPassed
     */
    public void setCountPassed(java.lang.Integer countPassed) {
        this.countPassed = countPassed;
    }


    /**
     * Gets the creationDate value for this RemoteTestSet.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteTestSet.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the creatorId value for this RemoteTestSet.
     * 
     * @return creatorId
     */
    public java.lang.Integer getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this RemoteTestSet.
     * 
     * @param creatorId
     */
    public void setCreatorId(java.lang.Integer creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the creatorName value for this RemoteTestSet.
     * 
     * @return creatorName
     */
    public java.lang.String getCreatorName() {
        return creatorName;
    }


    /**
     * Sets the creatorName value for this RemoteTestSet.
     * 
     * @param creatorName
     */
    public void setCreatorName(java.lang.String creatorName) {
        this.creatorName = creatorName;
    }


    /**
     * Gets the description value for this RemoteTestSet.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteTestSet.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the executionDate value for this RemoteTestSet.
     * 
     * @return executionDate
     */
    public java.util.Calendar getExecutionDate() {
        return executionDate;
    }


    /**
     * Sets the executionDate value for this RemoteTestSet.
     * 
     * @param executionDate
     */
    public void setExecutionDate(java.util.Calendar executionDate) {
        this.executionDate = executionDate;
    }


    /**
     * Gets the folder value for this RemoteTestSet.
     * 
     * @return folder
     */
    public java.lang.Boolean getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this RemoteTestSet.
     * 
     * @param folder
     */
    public void setFolder(java.lang.Boolean folder) {
        this.folder = folder;
    }


    /**
     * Gets the indentLevel value for this RemoteTestSet.
     * 
     * @return indentLevel
     */
    public java.lang.String getIndentLevel() {
        return indentLevel;
    }


    /**
     * Sets the indentLevel value for this RemoteTestSet.
     * 
     * @param indentLevel
     */
    public void setIndentLevel(java.lang.String indentLevel) {
        this.indentLevel = indentLevel;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteTestSet.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteTestSet.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this RemoteTestSet.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteTestSet.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ownerId value for this RemoteTestSet.
     * 
     * @return ownerId
     */
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RemoteTestSet.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerName value for this RemoteTestSet.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this RemoteTestSet.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the plannedDate value for this RemoteTestSet.
     * 
     * @return plannedDate
     */
    public java.util.Calendar getPlannedDate() {
        return plannedDate;
    }


    /**
     * Sets the plannedDate value for this RemoteTestSet.
     * 
     * @param plannedDate
     */
    public void setPlannedDate(java.util.Calendar plannedDate) {
        this.plannedDate = plannedDate;
    }


    /**
     * Gets the projectName value for this RemoteTestSet.
     * 
     * @return projectName
     */
    public java.lang.String getProjectName() {
        return projectName;
    }


    /**
     * Sets the projectName value for this RemoteTestSet.
     * 
     * @param projectName
     */
    public void setProjectName(java.lang.String projectName) {
        this.projectName = projectName;
    }


    /**
     * Gets the recurrenceId value for this RemoteTestSet.
     * 
     * @return recurrenceId
     */
    public java.lang.Integer getRecurrenceId() {
        return recurrenceId;
    }


    /**
     * Sets the recurrenceId value for this RemoteTestSet.
     * 
     * @param recurrenceId
     */
    public void setRecurrenceId(java.lang.Integer recurrenceId) {
        this.recurrenceId = recurrenceId;
    }


    /**
     * Gets the recurrenceName value for this RemoteTestSet.
     * 
     * @return recurrenceName
     */
    public java.lang.String getRecurrenceName() {
        return recurrenceName;
    }


    /**
     * Sets the recurrenceName value for this RemoteTestSet.
     * 
     * @param recurrenceName
     */
    public void setRecurrenceName(java.lang.String recurrenceName) {
        this.recurrenceName = recurrenceName;
    }


    /**
     * Gets the releaseId value for this RemoteTestSet.
     * 
     * @return releaseId
     */
    public java.lang.Integer getReleaseId() {
        return releaseId;
    }


    /**
     * Sets the releaseId value for this RemoteTestSet.
     * 
     * @param releaseId
     */
    public void setReleaseId(java.lang.Integer releaseId) {
        this.releaseId = releaseId;
    }


    /**
     * Gets the releaseVersionNumber value for this RemoteTestSet.
     * 
     * @return releaseVersionNumber
     */
    public java.lang.String getReleaseVersionNumber() {
        return releaseVersionNumber;
    }


    /**
     * Sets the releaseVersionNumber value for this RemoteTestSet.
     * 
     * @param releaseVersionNumber
     */
    public void setReleaseVersionNumber(java.lang.String releaseVersionNumber) {
        this.releaseVersionNumber = releaseVersionNumber;
    }


    /**
     * Gets the testRunTypeId value for this RemoteTestSet.
     * 
     * @return testRunTypeId
     */
    public java.lang.Integer getTestRunTypeId() {
        return testRunTypeId;
    }


    /**
     * Sets the testRunTypeId value for this RemoteTestSet.
     * 
     * @param testRunTypeId
     */
    public void setTestRunTypeId(java.lang.Integer testRunTypeId) {
        this.testRunTypeId = testRunTypeId;
    }


    /**
     * Gets the testSetId value for this RemoteTestSet.
     * 
     * @return testSetId
     */
    public java.lang.Integer getTestSetId() {
        return testSetId;
    }


    /**
     * Sets the testSetId value for this RemoteTestSet.
     * 
     * @param testSetId
     */
    public void setTestSetId(java.lang.Integer testSetId) {
        this.testSetId = testSetId;
    }


    /**
     * Gets the testSetStatusId value for this RemoteTestSet.
     * 
     * @return testSetStatusId
     */
    public java.lang.Integer getTestSetStatusId() {
        return testSetStatusId;
    }


    /**
     * Sets the testSetStatusId value for this RemoteTestSet.
     * 
     * @param testSetStatusId
     */
    public void setTestSetStatusId(java.lang.Integer testSetStatusId) {
        this.testSetStatusId = testSetStatusId;
    }


    /**
     * Gets the testSetStatusName value for this RemoteTestSet.
     * 
     * @return testSetStatusName
     */
    public java.lang.String getTestSetStatusName() {
        return testSetStatusName;
    }


    /**
     * Sets the testSetStatusName value for this RemoteTestSet.
     * 
     * @param testSetStatusName
     */
    public void setTestSetStatusName(java.lang.String testSetStatusName) {
        this.testSetStatusName = testSetStatusName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteTestSet)) return false;
        RemoteTestSet other = (RemoteTestSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.automationHostId==null && other.getAutomationHostId()==null) || 
             (this.automationHostId!=null &&
              this.automationHostId.equals(other.getAutomationHostId()))) &&
            ((this.countBlocked==null && other.getCountBlocked()==null) || 
             (this.countBlocked!=null &&
              this.countBlocked.equals(other.getCountBlocked()))) &&
            ((this.countCaution==null && other.getCountCaution()==null) || 
             (this.countCaution!=null &&
              this.countCaution.equals(other.getCountCaution()))) &&
            ((this.countFailed==null && other.getCountFailed()==null) || 
             (this.countFailed!=null &&
              this.countFailed.equals(other.getCountFailed()))) &&
            ((this.countNotApplicable==null && other.getCountNotApplicable()==null) || 
             (this.countNotApplicable!=null &&
              this.countNotApplicable.equals(other.getCountNotApplicable()))) &&
            ((this.countNotRun==null && other.getCountNotRun()==null) || 
             (this.countNotRun!=null &&
              this.countNotRun.equals(other.getCountNotRun()))) &&
            ((this.countPassed==null && other.getCountPassed()==null) || 
             (this.countPassed!=null &&
              this.countPassed.equals(other.getCountPassed()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
            ((this.creatorName==null && other.getCreatorName()==null) || 
             (this.creatorName!=null &&
              this.creatorName.equals(other.getCreatorName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.executionDate==null && other.getExecutionDate()==null) || 
             (this.executionDate!=null &&
              this.executionDate.equals(other.getExecutionDate()))) &&
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
            ((this.plannedDate==null && other.getPlannedDate()==null) || 
             (this.plannedDate!=null &&
              this.plannedDate.equals(other.getPlannedDate()))) &&
            ((this.projectName==null && other.getProjectName()==null) || 
             (this.projectName!=null &&
              this.projectName.equals(other.getProjectName()))) &&
            ((this.recurrenceId==null && other.getRecurrenceId()==null) || 
             (this.recurrenceId!=null &&
              this.recurrenceId.equals(other.getRecurrenceId()))) &&
            ((this.recurrenceName==null && other.getRecurrenceName()==null) || 
             (this.recurrenceName!=null &&
              this.recurrenceName.equals(other.getRecurrenceName()))) &&
            ((this.releaseId==null && other.getReleaseId()==null) || 
             (this.releaseId!=null &&
              this.releaseId.equals(other.getReleaseId()))) &&
            ((this.releaseVersionNumber==null && other.getReleaseVersionNumber()==null) || 
             (this.releaseVersionNumber!=null &&
              this.releaseVersionNumber.equals(other.getReleaseVersionNumber()))) &&
            ((this.testRunTypeId==null && other.getTestRunTypeId()==null) || 
             (this.testRunTypeId!=null &&
              this.testRunTypeId.equals(other.getTestRunTypeId()))) &&
            ((this.testSetId==null && other.getTestSetId()==null) || 
             (this.testSetId!=null &&
              this.testSetId.equals(other.getTestSetId()))) &&
            ((this.testSetStatusId==null && other.getTestSetStatusId()==null) || 
             (this.testSetStatusId!=null &&
              this.testSetStatusId.equals(other.getTestSetStatusId()))) &&
            ((this.testSetStatusName==null && other.getTestSetStatusName()==null) || 
             (this.testSetStatusName!=null &&
              this.testSetStatusName.equals(other.getTestSetStatusName())));
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
        if (getAutomationHostId() != null) {
            _hashCode += getAutomationHostId().hashCode();
        }
        if (getCountBlocked() != null) {
            _hashCode += getCountBlocked().hashCode();
        }
        if (getCountCaution() != null) {
            _hashCode += getCountCaution().hashCode();
        }
        if (getCountFailed() != null) {
            _hashCode += getCountFailed().hashCode();
        }
        if (getCountNotApplicable() != null) {
            _hashCode += getCountNotApplicable().hashCode();
        }
        if (getCountNotRun() != null) {
            _hashCode += getCountNotRun().hashCode();
        }
        if (getCountPassed() != null) {
            _hashCode += getCountPassed().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getCreatorId() != null) {
            _hashCode += getCreatorId().hashCode();
        }
        if (getCreatorName() != null) {
            _hashCode += getCreatorName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExecutionDate() != null) {
            _hashCode += getExecutionDate().hashCode();
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
        if (getPlannedDate() != null) {
            _hashCode += getPlannedDate().hashCode();
        }
        if (getProjectName() != null) {
            _hashCode += getProjectName().hashCode();
        }
        if (getRecurrenceId() != null) {
            _hashCode += getRecurrenceId().hashCode();
        }
        if (getRecurrenceName() != null) {
            _hashCode += getRecurrenceName().hashCode();
        }
        if (getReleaseId() != null) {
            _hashCode += getReleaseId().hashCode();
        }
        if (getReleaseVersionNumber() != null) {
            _hashCode += getReleaseVersionNumber().hashCode();
        }
        if (getTestRunTypeId() != null) {
            _hashCode += getTestRunTypeId().hashCode();
        }
        if (getTestSetId() != null) {
            _hashCode += getTestSetId().hashCode();
        }
        if (getTestSetStatusId() != null) {
            _hashCode += getTestSetStatusId().hashCode();
        }
        if (getTestSetStatusName() != null) {
            _hashCode += getTestSetStatusName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteTestSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automationHostId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AutomationHostId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CountBlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countCaution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CountCaution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CountFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countNotApplicable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CountNotApplicable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countNotRun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CountNotRun"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countPassed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CountPassed"));
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
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CreatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CreatorName"));
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
        elemField.setFieldName("executionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ExecutionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("plannedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "PlannedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("recurrenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RecurrenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurrenceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RecurrenceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ReleaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseVersionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ReleaseVersionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testRunTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSetId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSetStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSetStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testSetStatusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestSetStatusName"));
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
