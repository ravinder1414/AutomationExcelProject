/**
 * RemoteTask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteTask  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.Integer actualEffort;

    private java.lang.Integer completionPercent;

    private java.util.Calendar creationDate;

    private java.lang.Integer creatorId;

    private java.lang.String description;

    private java.util.Calendar endDate;

    private java.lang.Integer estimatedEffort;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.Integer ownerId;

    private java.lang.String ownerName;

    private java.lang.String projectName;

    private java.lang.Integer projectedEffort;

    private java.lang.Integer releaseId;

    private java.lang.String releaseVersionNumber;

    private java.lang.Integer remainingEffort;

    private java.lang.Integer requirementId;

    private java.lang.String requirementName;

    private java.util.Calendar startDate;

    private java.lang.Integer taskId;

    private java.lang.Integer taskPriorityId;

    private java.lang.String taskPriorityName;

    private java.lang.Integer taskStatusId;

    private java.lang.String taskStatusName;

    public RemoteTask() {
    }

    public RemoteTask(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.Integer actualEffort,
           java.lang.Integer completionPercent,
           java.util.Calendar creationDate,
           java.lang.Integer creatorId,
           java.lang.String description,
           java.util.Calendar endDate,
           java.lang.Integer estimatedEffort,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.Integer ownerId,
           java.lang.String ownerName,
           java.lang.String projectName,
           java.lang.Integer projectedEffort,
           java.lang.Integer releaseId,
           java.lang.String releaseVersionNumber,
           java.lang.Integer remainingEffort,
           java.lang.Integer requirementId,
           java.lang.String requirementName,
           java.util.Calendar startDate,
           java.lang.Integer taskId,
           java.lang.Integer taskPriorityId,
           java.lang.String taskPriorityName,
           java.lang.Integer taskStatusId,
           java.lang.String taskStatusName) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.actualEffort = actualEffort;
        this.completionPercent = completionPercent;
        this.creationDate = creationDate;
        this.creatorId = creatorId;
        this.description = description;
        this.endDate = endDate;
        this.estimatedEffort = estimatedEffort;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.projectName = projectName;
        this.projectedEffort = projectedEffort;
        this.releaseId = releaseId;
        this.releaseVersionNumber = releaseVersionNumber;
        this.remainingEffort = remainingEffort;
        this.requirementId = requirementId;
        this.requirementName = requirementName;
        this.startDate = startDate;
        this.taskId = taskId;
        this.taskPriorityId = taskPriorityId;
        this.taskPriorityName = taskPriorityName;
        this.taskStatusId = taskStatusId;
        this.taskStatusName = taskStatusName;
    }


    /**
     * Gets the actualEffort value for this RemoteTask.
     * 
     * @return actualEffort
     */
    public java.lang.Integer getActualEffort() {
        return actualEffort;
    }


    /**
     * Sets the actualEffort value for this RemoteTask.
     * 
     * @param actualEffort
     */
    public void setActualEffort(java.lang.Integer actualEffort) {
        this.actualEffort = actualEffort;
    }


    /**
     * Gets the completionPercent value for this RemoteTask.
     * 
     * @return completionPercent
     */
    public java.lang.Integer getCompletionPercent() {
        return completionPercent;
    }


    /**
     * Sets the completionPercent value for this RemoteTask.
     * 
     * @param completionPercent
     */
    public void setCompletionPercent(java.lang.Integer completionPercent) {
        this.completionPercent = completionPercent;
    }


    /**
     * Gets the creationDate value for this RemoteTask.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteTask.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the creatorId value for this RemoteTask.
     * 
     * @return creatorId
     */
    public java.lang.Integer getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this RemoteTask.
     * 
     * @param creatorId
     */
    public void setCreatorId(java.lang.Integer creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the description value for this RemoteTask.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteTask.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endDate value for this RemoteTask.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this RemoteTask.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the estimatedEffort value for this RemoteTask.
     * 
     * @return estimatedEffort
     */
    public java.lang.Integer getEstimatedEffort() {
        return estimatedEffort;
    }


    /**
     * Sets the estimatedEffort value for this RemoteTask.
     * 
     * @param estimatedEffort
     */
    public void setEstimatedEffort(java.lang.Integer estimatedEffort) {
        this.estimatedEffort = estimatedEffort;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteTask.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteTask.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this RemoteTask.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteTask.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ownerId value for this RemoteTask.
     * 
     * @return ownerId
     */
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RemoteTask.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerName value for this RemoteTask.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this RemoteTask.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the projectName value for this RemoteTask.
     * 
     * @return projectName
     */
    public java.lang.String getProjectName() {
        return projectName;
    }


    /**
     * Sets the projectName value for this RemoteTask.
     * 
     * @param projectName
     */
    public void setProjectName(java.lang.String projectName) {
        this.projectName = projectName;
    }


    /**
     * Gets the projectedEffort value for this RemoteTask.
     * 
     * @return projectedEffort
     */
    public java.lang.Integer getProjectedEffort() {
        return projectedEffort;
    }


    /**
     * Sets the projectedEffort value for this RemoteTask.
     * 
     * @param projectedEffort
     */
    public void setProjectedEffort(java.lang.Integer projectedEffort) {
        this.projectedEffort = projectedEffort;
    }


    /**
     * Gets the releaseId value for this RemoteTask.
     * 
     * @return releaseId
     */
    public java.lang.Integer getReleaseId() {
        return releaseId;
    }


    /**
     * Sets the releaseId value for this RemoteTask.
     * 
     * @param releaseId
     */
    public void setReleaseId(java.lang.Integer releaseId) {
        this.releaseId = releaseId;
    }


    /**
     * Gets the releaseVersionNumber value for this RemoteTask.
     * 
     * @return releaseVersionNumber
     */
    public java.lang.String getReleaseVersionNumber() {
        return releaseVersionNumber;
    }


    /**
     * Sets the releaseVersionNumber value for this RemoteTask.
     * 
     * @param releaseVersionNumber
     */
    public void setReleaseVersionNumber(java.lang.String releaseVersionNumber) {
        this.releaseVersionNumber = releaseVersionNumber;
    }


    /**
     * Gets the remainingEffort value for this RemoteTask.
     * 
     * @return remainingEffort
     */
    public java.lang.Integer getRemainingEffort() {
        return remainingEffort;
    }


    /**
     * Sets the remainingEffort value for this RemoteTask.
     * 
     * @param remainingEffort
     */
    public void setRemainingEffort(java.lang.Integer remainingEffort) {
        this.remainingEffort = remainingEffort;
    }


    /**
     * Gets the requirementId value for this RemoteTask.
     * 
     * @return requirementId
     */
    public java.lang.Integer getRequirementId() {
        return requirementId;
    }


    /**
     * Sets the requirementId value for this RemoteTask.
     * 
     * @param requirementId
     */
    public void setRequirementId(java.lang.Integer requirementId) {
        this.requirementId = requirementId;
    }


    /**
     * Gets the requirementName value for this RemoteTask.
     * 
     * @return requirementName
     */
    public java.lang.String getRequirementName() {
        return requirementName;
    }


    /**
     * Sets the requirementName value for this RemoteTask.
     * 
     * @param requirementName
     */
    public void setRequirementName(java.lang.String requirementName) {
        this.requirementName = requirementName;
    }


    /**
     * Gets the startDate value for this RemoteTask.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RemoteTask.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the taskId value for this RemoteTask.
     * 
     * @return taskId
     */
    public java.lang.Integer getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this RemoteTask.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.Integer taskId) {
        this.taskId = taskId;
    }


    /**
     * Gets the taskPriorityId value for this RemoteTask.
     * 
     * @return taskPriorityId
     */
    public java.lang.Integer getTaskPriorityId() {
        return taskPriorityId;
    }


    /**
     * Sets the taskPriorityId value for this RemoteTask.
     * 
     * @param taskPriorityId
     */
    public void setTaskPriorityId(java.lang.Integer taskPriorityId) {
        this.taskPriorityId = taskPriorityId;
    }


    /**
     * Gets the taskPriorityName value for this RemoteTask.
     * 
     * @return taskPriorityName
     */
    public java.lang.String getTaskPriorityName() {
        return taskPriorityName;
    }


    /**
     * Sets the taskPriorityName value for this RemoteTask.
     * 
     * @param taskPriorityName
     */
    public void setTaskPriorityName(java.lang.String taskPriorityName) {
        this.taskPriorityName = taskPriorityName;
    }


    /**
     * Gets the taskStatusId value for this RemoteTask.
     * 
     * @return taskStatusId
     */
    public java.lang.Integer getTaskStatusId() {
        return taskStatusId;
    }


    /**
     * Sets the taskStatusId value for this RemoteTask.
     * 
     * @param taskStatusId
     */
    public void setTaskStatusId(java.lang.Integer taskStatusId) {
        this.taskStatusId = taskStatusId;
    }


    /**
     * Gets the taskStatusName value for this RemoteTask.
     * 
     * @return taskStatusName
     */
    public java.lang.String getTaskStatusName() {
        return taskStatusName;
    }


    /**
     * Sets the taskStatusName value for this RemoteTask.
     * 
     * @param taskStatusName
     */
    public void setTaskStatusName(java.lang.String taskStatusName) {
        this.taskStatusName = taskStatusName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteTask)) return false;
        RemoteTask other = (RemoteTask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualEffort==null && other.getActualEffort()==null) || 
             (this.actualEffort!=null &&
              this.actualEffort.equals(other.getActualEffort()))) &&
            ((this.completionPercent==null && other.getCompletionPercent()==null) || 
             (this.completionPercent!=null &&
              this.completionPercent.equals(other.getCompletionPercent()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.estimatedEffort==null && other.getEstimatedEffort()==null) || 
             (this.estimatedEffort!=null &&
              this.estimatedEffort.equals(other.getEstimatedEffort()))) &&
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
            ((this.projectedEffort==null && other.getProjectedEffort()==null) || 
             (this.projectedEffort!=null &&
              this.projectedEffort.equals(other.getProjectedEffort()))) &&
            ((this.releaseId==null && other.getReleaseId()==null) || 
             (this.releaseId!=null &&
              this.releaseId.equals(other.getReleaseId()))) &&
            ((this.releaseVersionNumber==null && other.getReleaseVersionNumber()==null) || 
             (this.releaseVersionNumber!=null &&
              this.releaseVersionNumber.equals(other.getReleaseVersionNumber()))) &&
            ((this.remainingEffort==null && other.getRemainingEffort()==null) || 
             (this.remainingEffort!=null &&
              this.remainingEffort.equals(other.getRemainingEffort()))) &&
            ((this.requirementId==null && other.getRequirementId()==null) || 
             (this.requirementId!=null &&
              this.requirementId.equals(other.getRequirementId()))) &&
            ((this.requirementName==null && other.getRequirementName()==null) || 
             (this.requirementName!=null &&
              this.requirementName.equals(other.getRequirementName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              this.taskId.equals(other.getTaskId()))) &&
            ((this.taskPriorityId==null && other.getTaskPriorityId()==null) || 
             (this.taskPriorityId!=null &&
              this.taskPriorityId.equals(other.getTaskPriorityId()))) &&
            ((this.taskPriorityName==null && other.getTaskPriorityName()==null) || 
             (this.taskPriorityName!=null &&
              this.taskPriorityName.equals(other.getTaskPriorityName()))) &&
            ((this.taskStatusId==null && other.getTaskStatusId()==null) || 
             (this.taskStatusId!=null &&
              this.taskStatusId.equals(other.getTaskStatusId()))) &&
            ((this.taskStatusName==null && other.getTaskStatusName()==null) || 
             (this.taskStatusName!=null &&
              this.taskStatusName.equals(other.getTaskStatusName())));
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
        if (getActualEffort() != null) {
            _hashCode += getActualEffort().hashCode();
        }
        if (getCompletionPercent() != null) {
            _hashCode += getCompletionPercent().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getCreatorId() != null) {
            _hashCode += getCreatorId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEstimatedEffort() != null) {
            _hashCode += getEstimatedEffort().hashCode();
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
        if (getProjectedEffort() != null) {
            _hashCode += getProjectedEffort().hashCode();
        }
        if (getReleaseId() != null) {
            _hashCode += getReleaseId().hashCode();
        }
        if (getReleaseVersionNumber() != null) {
            _hashCode += getReleaseVersionNumber().hashCode();
        }
        if (getRemainingEffort() != null) {
            _hashCode += getRemainingEffort().hashCode();
        }
        if (getRequirementId() != null) {
            _hashCode += getRequirementId().hashCode();
        }
        if (getRequirementName() != null) {
            _hashCode += getRequirementName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTaskId() != null) {
            _hashCode += getTaskId().hashCode();
        }
        if (getTaskPriorityId() != null) {
            _hashCode += getTaskPriorityId().hashCode();
        }
        if (getTaskPriorityName() != null) {
            _hashCode += getTaskPriorityName().hashCode();
        }
        if (getTaskStatusId() != null) {
            _hashCode += getTaskStatusId().hashCode();
        }
        if (getTaskStatusName() != null) {
            _hashCode += getTaskStatusName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteTask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ActualEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completionPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CompletionPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("creatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "CreatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "EstimatedEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("projectedEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ProjectedEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("remainingEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemainingEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("requirementName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RequirementName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskPriorityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskPriorityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskPriorityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskPriorityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskStatusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TaskStatusName"));
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
