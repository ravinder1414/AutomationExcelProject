/**
 * RemoteRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteRequirement  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.Integer authorId;

    private java.lang.String authorName;

    private java.lang.Integer coverageCountBlocked;

    private java.lang.Integer coverageCountCaution;

    private java.lang.Integer coverageCountFailed;

    private java.lang.Integer coverageCountPassed;

    private java.lang.Integer coverageCountTotal;

    private java.util.Calendar creationDate;

    private java.lang.String description;

    private java.lang.Integer importanceId;

    private java.lang.String importanceName;

    private java.lang.String indentLevel;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.Integer ownerId;

    private java.lang.String ownerName;

    private java.lang.Integer plannedEffort;

    private java.lang.String projectName;

    private java.lang.Integer releaseId;

    private java.lang.String releaseVersionNumber;

    private java.lang.Integer requirementId;

    private java.lang.Integer statusId;

    private java.lang.String statusName;

    private java.lang.Boolean summary;

    private java.lang.Integer taskActualEffort;

    private java.lang.Integer taskCount;

    private java.lang.Integer taskEstimatedEffort;

    public RemoteRequirement() {
    }

    public RemoteRequirement(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.Integer authorId,
           java.lang.String authorName,
           java.lang.Integer coverageCountBlocked,
           java.lang.Integer coverageCountCaution,
           java.lang.Integer coverageCountFailed,
           java.lang.Integer coverageCountPassed,
           java.lang.Integer coverageCountTotal,
           java.util.Calendar creationDate,
           java.lang.String description,
           java.lang.Integer importanceId,
           java.lang.String importanceName,
           java.lang.String indentLevel,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.Integer ownerId,
           java.lang.String ownerName,
           java.lang.Integer plannedEffort,
           java.lang.String projectName,
           java.lang.Integer releaseId,
           java.lang.String releaseVersionNumber,
           java.lang.Integer requirementId,
           java.lang.Integer statusId,
           java.lang.String statusName,
           java.lang.Boolean summary,
           java.lang.Integer taskActualEffort,
           java.lang.Integer taskCount,
           java.lang.Integer taskEstimatedEffort) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.authorId = authorId;
        this.authorName = authorName;
        this.coverageCountBlocked = coverageCountBlocked;
        this.coverageCountCaution = coverageCountCaution;
        this.coverageCountFailed = coverageCountFailed;
        this.coverageCountPassed = coverageCountPassed;
        this.coverageCountTotal = coverageCountTotal;
        this.creationDate = creationDate;
        this.description = description;
        this.importanceId = importanceId;
        this.importanceName = importanceName;
        this.indentLevel = indentLevel;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.plannedEffort = plannedEffort;
        this.projectName = projectName;
        this.releaseId = releaseId;
        this.releaseVersionNumber = releaseVersionNumber;
        this.requirementId = requirementId;
        this.statusId = statusId;
        this.statusName = statusName;
        this.summary = summary;
        this.taskActualEffort = taskActualEffort;
        this.taskCount = taskCount;
        this.taskEstimatedEffort = taskEstimatedEffort;
    }


    /**
     * Gets the authorId value for this RemoteRequirement.
     * 
     * @return authorId
     */
    public java.lang.Integer getAuthorId() {
        return authorId;
    }


    /**
     * Sets the authorId value for this RemoteRequirement.
     * 
     * @param authorId
     */
    public void setAuthorId(java.lang.Integer authorId) {
        this.authorId = authorId;
    }


    /**
     * Gets the authorName value for this RemoteRequirement.
     * 
     * @return authorName
     */
    public java.lang.String getAuthorName() {
        return authorName;
    }


    /**
     * Sets the authorName value for this RemoteRequirement.
     * 
     * @param authorName
     */
    public void setAuthorName(java.lang.String authorName) {
        this.authorName = authorName;
    }


    /**
     * Gets the coverageCountBlocked value for this RemoteRequirement.
     * 
     * @return coverageCountBlocked
     */
    public java.lang.Integer getCoverageCountBlocked() {
        return coverageCountBlocked;
    }


    /**
     * Sets the coverageCountBlocked value for this RemoteRequirement.
     * 
     * @param coverageCountBlocked
     */
    public void setCoverageCountBlocked(java.lang.Integer coverageCountBlocked) {
        this.coverageCountBlocked = coverageCountBlocked;
    }


    /**
     * Gets the coverageCountCaution value for this RemoteRequirement.
     * 
     * @return coverageCountCaution
     */
    public java.lang.Integer getCoverageCountCaution() {
        return coverageCountCaution;
    }


    /**
     * Sets the coverageCountCaution value for this RemoteRequirement.
     * 
     * @param coverageCountCaution
     */
    public void setCoverageCountCaution(java.lang.Integer coverageCountCaution) {
        this.coverageCountCaution = coverageCountCaution;
    }


    /**
     * Gets the coverageCountFailed value for this RemoteRequirement.
     * 
     * @return coverageCountFailed
     */
    public java.lang.Integer getCoverageCountFailed() {
        return coverageCountFailed;
    }


    /**
     * Sets the coverageCountFailed value for this RemoteRequirement.
     * 
     * @param coverageCountFailed
     */
    public void setCoverageCountFailed(java.lang.Integer coverageCountFailed) {
        this.coverageCountFailed = coverageCountFailed;
    }


    /**
     * Gets the coverageCountPassed value for this RemoteRequirement.
     * 
     * @return coverageCountPassed
     */
    public java.lang.Integer getCoverageCountPassed() {
        return coverageCountPassed;
    }


    /**
     * Sets the coverageCountPassed value for this RemoteRequirement.
     * 
     * @param coverageCountPassed
     */
    public void setCoverageCountPassed(java.lang.Integer coverageCountPassed) {
        this.coverageCountPassed = coverageCountPassed;
    }


    /**
     * Gets the coverageCountTotal value for this RemoteRequirement.
     * 
     * @return coverageCountTotal
     */
    public java.lang.Integer getCoverageCountTotal() {
        return coverageCountTotal;
    }


    /**
     * Sets the coverageCountTotal value for this RemoteRequirement.
     * 
     * @param coverageCountTotal
     */
    public void setCoverageCountTotal(java.lang.Integer coverageCountTotal) {
        this.coverageCountTotal = coverageCountTotal;
    }


    /**
     * Gets the creationDate value for this RemoteRequirement.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteRequirement.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the description value for this RemoteRequirement.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteRequirement.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the importanceId value for this RemoteRequirement.
     * 
     * @return importanceId
     */
    public java.lang.Integer getImportanceId() {
        return importanceId;
    }


    /**
     * Sets the importanceId value for this RemoteRequirement.
     * 
     * @param importanceId
     */
    public void setImportanceId(java.lang.Integer importanceId) {
        this.importanceId = importanceId;
    }


    /**
     * Gets the importanceName value for this RemoteRequirement.
     * 
     * @return importanceName
     */
    public java.lang.String getImportanceName() {
        return importanceName;
    }


    /**
     * Sets the importanceName value for this RemoteRequirement.
     * 
     * @param importanceName
     */
    public void setImportanceName(java.lang.String importanceName) {
        this.importanceName = importanceName;
    }


    /**
     * Gets the indentLevel value for this RemoteRequirement.
     * 
     * @return indentLevel
     */
    public java.lang.String getIndentLevel() {
        return indentLevel;
    }


    /**
     * Sets the indentLevel value for this RemoteRequirement.
     * 
     * @param indentLevel
     */
    public void setIndentLevel(java.lang.String indentLevel) {
        this.indentLevel = indentLevel;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteRequirement.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteRequirement.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this RemoteRequirement.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteRequirement.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ownerId value for this RemoteRequirement.
     * 
     * @return ownerId
     */
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RemoteRequirement.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerName value for this RemoteRequirement.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this RemoteRequirement.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the plannedEffort value for this RemoteRequirement.
     * 
     * @return plannedEffort
     */
    public java.lang.Integer getPlannedEffort() {
        return plannedEffort;
    }


    /**
     * Sets the plannedEffort value for this RemoteRequirement.
     * 
     * @param plannedEffort
     */
    public void setPlannedEffort(java.lang.Integer plannedEffort) {
        this.plannedEffort = plannedEffort;
    }


    /**
     * Gets the projectName value for this RemoteRequirement.
     * 
     * @return projectName
     */
    public java.lang.String getProjectName() {
        return projectName;
    }


    /**
     * Sets the projectName value for this RemoteRequirement.
     * 
     * @param projectName
     */
    public void setProjectName(java.lang.String projectName) {
        this.projectName = projectName;
    }


    /**
     * Gets the releaseId value for this RemoteRequirement.
     * 
     * @return releaseId
     */
    public java.lang.Integer getReleaseId() {
        return releaseId;
    }


    /**
     * Sets the releaseId value for this RemoteRequirement.
     * 
     * @param releaseId
     */
    public void setReleaseId(java.lang.Integer releaseId) {
        this.releaseId = releaseId;
    }


    /**
     * Gets the releaseVersionNumber value for this RemoteRequirement.
     * 
     * @return releaseVersionNumber
     */
    public java.lang.String getReleaseVersionNumber() {
        return releaseVersionNumber;
    }


    /**
     * Sets the releaseVersionNumber value for this RemoteRequirement.
     * 
     * @param releaseVersionNumber
     */
    public void setReleaseVersionNumber(java.lang.String releaseVersionNumber) {
        this.releaseVersionNumber = releaseVersionNumber;
    }


    /**
     * Gets the requirementId value for this RemoteRequirement.
     * 
     * @return requirementId
     */
    public java.lang.Integer getRequirementId() {
        return requirementId;
    }


    /**
     * Sets the requirementId value for this RemoteRequirement.
     * 
     * @param requirementId
     */
    public void setRequirementId(java.lang.Integer requirementId) {
        this.requirementId = requirementId;
    }


    /**
     * Gets the statusId value for this RemoteRequirement.
     * 
     * @return statusId
     */
    public java.lang.Integer getStatusId() {
        return statusId;
    }


    /**
     * Sets the statusId value for this RemoteRequirement.
     * 
     * @param statusId
     */
    public void setStatusId(java.lang.Integer statusId) {
        this.statusId = statusId;
    }


    /**
     * Gets the statusName value for this RemoteRequirement.
     * 
     * @return statusName
     */
    public java.lang.String getStatusName() {
        return statusName;
    }


    /**
     * Sets the statusName value for this RemoteRequirement.
     * 
     * @param statusName
     */
    public void setStatusName(java.lang.String statusName) {
        this.statusName = statusName;
    }


    /**
     * Gets the summary value for this RemoteRequirement.
     * 
     * @return summary
     */
    public java.lang.Boolean getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this RemoteRequirement.
     * 
     * @param summary
     */
    public void setSummary(java.lang.Boolean summary) {
        this.summary = summary;
    }


    /**
     * Gets the taskActualEffort value for this RemoteRequirement.
     * 
     * @return taskActualEffort
     */
    public java.lang.Integer getTaskActualEffort() {
        return taskActualEffort;
    }


    /**
     * Sets the taskActualEffort value for this RemoteRequirement.
     * 
     * @param taskActualEffort
     */
    public void setTaskActualEffort(java.lang.Integer taskActualEffort) {
        this.taskActualEffort = taskActualEffort;
    }


    /**
     * Gets the taskCount value for this RemoteRequirement.
     * 
     * @return taskCount
     */
    public java.lang.Integer getTaskCount() {
        return taskCount;
    }


    /**
     * Sets the taskCount value for this RemoteRequirement.
     * 
     * @param taskCount
     */
    public void setTaskCount(java.lang.Integer taskCount) {
        this.taskCount = taskCount;
    }


    /**
     * Gets the taskEstimatedEffort value for this RemoteRequirement.
     * 
     * @return taskEstimatedEffort
     */
    public java.lang.Integer getTaskEstimatedEffort() {
        return taskEstimatedEffort;
    }


    /**
     * Sets the taskEstimatedEffort value for this RemoteRequirement.
     * 
     * @param taskEstimatedEffort
     */
    public void setTaskEstimatedEffort(java.lang.Integer taskEstimatedEffort) {
        this.taskEstimatedEffort = taskEstimatedEffort;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteRequirement)) return false;
        RemoteRequirement other = (RemoteRequirement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorId==null && other.getAuthorId()==null) || 
             (this.authorId!=null &&
              this.authorId.equals(other.getAuthorId()))) &&
            ((this.authorName==null && other.getAuthorName()==null) || 
             (this.authorName!=null &&
              this.authorName.equals(other.getAuthorName()))) &&
            ((this.coverageCountBlocked==null && other.getCoverageCountBlocked()==null) || 
             (this.coverageCountBlocked!=null &&
              this.coverageCountBlocked.equals(other.getCoverageCountBlocked()))) &&
            ((this.coverageCountCaution==null && other.getCoverageCountCaution()==null) || 
             (this.coverageCountCaution!=null &&
              this.coverageCountCaution.equals(other.getCoverageCountCaution()))) &&
            ((this.coverageCountFailed==null && other.getCoverageCountFailed()==null) || 
             (this.coverageCountFailed!=null &&
              this.coverageCountFailed.equals(other.getCoverageCountFailed()))) &&
            ((this.coverageCountPassed==null && other.getCoverageCountPassed()==null) || 
             (this.coverageCountPassed!=null &&
              this.coverageCountPassed.equals(other.getCoverageCountPassed()))) &&
            ((this.coverageCountTotal==null && other.getCoverageCountTotal()==null) || 
             (this.coverageCountTotal!=null &&
              this.coverageCountTotal.equals(other.getCoverageCountTotal()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.importanceId==null && other.getImportanceId()==null) || 
             (this.importanceId!=null &&
              this.importanceId.equals(other.getImportanceId()))) &&
            ((this.importanceName==null && other.getImportanceName()==null) || 
             (this.importanceName!=null &&
              this.importanceName.equals(other.getImportanceName()))) &&
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
            ((this.plannedEffort==null && other.getPlannedEffort()==null) || 
             (this.plannedEffort!=null &&
              this.plannedEffort.equals(other.getPlannedEffort()))) &&
            ((this.projectName==null && other.getProjectName()==null) || 
             (this.projectName!=null &&
              this.projectName.equals(other.getProjectName()))) &&
            ((this.releaseId==null && other.getReleaseId()==null) || 
             (this.releaseId!=null &&
              this.releaseId.equals(other.getReleaseId()))) &&
            ((this.releaseVersionNumber==null && other.getReleaseVersionNumber()==null) || 
             (this.releaseVersionNumber!=null &&
              this.releaseVersionNumber.equals(other.getReleaseVersionNumber()))) &&
            ((this.requirementId==null && other.getRequirementId()==null) || 
             (this.requirementId!=null &&
              this.requirementId.equals(other.getRequirementId()))) &&
            ((this.statusId==null && other.getStatusId()==null) || 
             (this.statusId!=null &&
              this.statusId.equals(other.getStatusId()))) &&
            ((this.statusName==null && other.getStatusName()==null) || 
             (this.statusName!=null &&
              this.statusName.equals(other.getStatusName()))) &&
            ((this.summary==null && other.getSummary()==null) || 
             (this.summary!=null &&
              this.summary.equals(other.getSummary()))) &&
            ((this.taskActualEffort==null && other.getTaskActualEffort()==null) || 
             (this.taskActualEffort!=null &&
              this.taskActualEffort.equals(other.getTaskActualEffort()))) &&
            ((this.taskCount==null && other.getTaskCount()==null) || 
             (this.taskCount!=null &&
              this.taskCount.equals(other.getTaskCount()))) &&
            ((this.taskEstimatedEffort==null && other.getTaskEstimatedEffort()==null) || 
             (this.taskEstimatedEffort!=null &&
              this.taskEstimatedEffort.equals(other.getTaskEstimatedEffort())));
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
        if (getAuthorId() != null) {
            _hashCode += getAuthorId().hashCode();
        }
        if (getAuthorName() != null) {
            _hashCode += getAuthorName().hashCode();
        }
        if (getCoverageCountBlocked() != null) {
            _hashCode += getCoverageCountBlocked().hashCode();
        }
        if (getCoverageCountCaution() != null) {
            _hashCode += getCoverageCountCaution().hashCode();
        }
        if (getCoverageCountFailed() != null) {
            _hashCode += getCoverageCountFailed().hashCode();
        }
        if (getCoverageCountPassed() != null) {
            _hashCode += getCoverageCountPassed().hashCode();
        }
        if (getCoverageCountTotal() != null) {
            _hashCode += getCoverageCountTotal().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getImportanceId() != null) {
            _hashCode += getImportanceId().hashCode();
        }
        if (getImportanceName() != null) {
            _hashCode += getImportanceName().hashCode();
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
        if (getPlannedEffort() != null) {
            _hashCode += getPlannedEffort().hashCode();
        }
        if (getProjectName() != null) {
            _hashCode += getProjectName().hashCode();
        }
        if (getReleaseId() != null) {
            _hashCode += getReleaseId().hashCode();
        }
        if (getReleaseVersionNumber() != null) {
            _hashCode += getReleaseVersionNumber().hashCode();
        }
        if (getRequirementId() != null) {
            _hashCode += getRequirementId().hashCode();
        }
        if (getStatusId() != null) {
            _hashCode += getStatusId().hashCode();
        }
        if (getStatusName() != null) {
            _hashCode += getStatusName().hashCode();
        }
        if (getSummary() != null) {
            _hashCode += getSummary().hashCode();
        }
        if (getTaskActualEffort() != null) {
            _hashCode += getTaskActualEffort().hashCode();
        }
        if (getTaskCount() != null) {
            _hashCode += getTaskCount().hashCode();
        }
        if (getTaskEstimatedEffort() != null) {
            _hashCode += getTaskEstimatedEffort().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("coverageCountBlocked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CoverageCountBlocked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageCountCaution");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CoverageCountCaution"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageCountFailed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CoverageCountFailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageCountPassed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CoverageCountPassed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coverageCountTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CoverageCountTotal"));
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
        elemField.setFieldName("importanceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ImportanceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ImportanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("plannedEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "PlannedEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("requirementId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RequirementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "StatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "StatusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("summary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Summary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskActualEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskActualEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskEstimatedEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskEstimatedEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
