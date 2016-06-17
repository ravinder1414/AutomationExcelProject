/**
 * RemoteIncident.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteIncident  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.Integer actualEffort;

    private java.util.Calendar closedDate;

    private java.lang.Integer completionPercent;

    private java.util.Calendar creationDate;

    private java.lang.String description;

    private java.lang.Integer detectedReleaseId;

    private java.lang.String detectedReleaseVersionNumber;

    private java.lang.Integer estimatedEffort;

    private java.lang.Integer fixedBuildId;

    private java.lang.String fixedBuildName;

    private java.lang.Integer incidentId;

    private java.lang.Integer incidentStatusId;

    private java.lang.String incidentStatusName;

    private java.lang.Boolean incidentStatusOpenStatus;

    private java.lang.Integer incidentTypeId;

    private java.lang.String incidentTypeName;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.Integer openerId;

    private java.lang.String openerName;

    private java.lang.Integer ownerId;

    private java.lang.String ownerName;

    private java.lang.Integer priorityId;

    private java.lang.String priorityName;

    private java.lang.String projectName;

    private java.lang.Integer projectedEffort;

    private java.lang.Integer remainingEffort;

    private java.lang.Integer resolvedReleaseId;

    private java.lang.String resolvedReleaseVersionNumber;

    private java.lang.Integer severityId;

    private java.lang.String severityName;

    private java.util.Calendar startDate;

    private java.lang.Integer testRunStepId;

    private java.lang.Integer verifiedReleaseId;

    private java.lang.String verifiedReleaseVersionNumber;

    public RemoteIncident() {
    }

    public RemoteIncident(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.Integer actualEffort,
           java.util.Calendar closedDate,
           java.lang.Integer completionPercent,
           java.util.Calendar creationDate,
           java.lang.String description,
           java.lang.Integer detectedReleaseId,
           java.lang.String detectedReleaseVersionNumber,
           java.lang.Integer estimatedEffort,
           java.lang.Integer fixedBuildId,
           java.lang.String fixedBuildName,
           java.lang.Integer incidentId,
           java.lang.Integer incidentStatusId,
           java.lang.String incidentStatusName,
           java.lang.Boolean incidentStatusOpenStatus,
           java.lang.Integer incidentTypeId,
           java.lang.String incidentTypeName,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.Integer openerId,
           java.lang.String openerName,
           java.lang.Integer ownerId,
           java.lang.String ownerName,
           java.lang.Integer priorityId,
           java.lang.String priorityName,
           java.lang.String projectName,
           java.lang.Integer projectedEffort,
           java.lang.Integer remainingEffort,
           java.lang.Integer resolvedReleaseId,
           java.lang.String resolvedReleaseVersionNumber,
           java.lang.Integer severityId,
           java.lang.String severityName,
           java.util.Calendar startDate,
           java.lang.Integer testRunStepId,
           java.lang.Integer verifiedReleaseId,
           java.lang.String verifiedReleaseVersionNumber) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.actualEffort = actualEffort;
        this.closedDate = closedDate;
        this.completionPercent = completionPercent;
        this.creationDate = creationDate;
        this.description = description;
        this.detectedReleaseId = detectedReleaseId;
        this.detectedReleaseVersionNumber = detectedReleaseVersionNumber;
        this.estimatedEffort = estimatedEffort;
        this.fixedBuildId = fixedBuildId;
        this.fixedBuildName = fixedBuildName;
        this.incidentId = incidentId;
        this.incidentStatusId = incidentStatusId;
        this.incidentStatusName = incidentStatusName;
        this.incidentStatusOpenStatus = incidentStatusOpenStatus;
        this.incidentTypeId = incidentTypeId;
        this.incidentTypeName = incidentTypeName;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.openerId = openerId;
        this.openerName = openerName;
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.priorityId = priorityId;
        this.priorityName = priorityName;
        this.projectName = projectName;
        this.projectedEffort = projectedEffort;
        this.remainingEffort = remainingEffort;
        this.resolvedReleaseId = resolvedReleaseId;
        this.resolvedReleaseVersionNumber = resolvedReleaseVersionNumber;
        this.severityId = severityId;
        this.severityName = severityName;
        this.startDate = startDate;
        this.testRunStepId = testRunStepId;
        this.verifiedReleaseId = verifiedReleaseId;
        this.verifiedReleaseVersionNumber = verifiedReleaseVersionNumber;
    }


    /**
     * Gets the actualEffort value for this RemoteIncident.
     * 
     * @return actualEffort
     */
    public java.lang.Integer getActualEffort() {
        return actualEffort;
    }


    /**
     * Sets the actualEffort value for this RemoteIncident.
     * 
     * @param actualEffort
     */
    public void setActualEffort(java.lang.Integer actualEffort) {
        this.actualEffort = actualEffort;
    }


    /**
     * Gets the closedDate value for this RemoteIncident.
     * 
     * @return closedDate
     */
    public java.util.Calendar getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this RemoteIncident.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.util.Calendar closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the completionPercent value for this RemoteIncident.
     * 
     * @return completionPercent
     */
    public java.lang.Integer getCompletionPercent() {
        return completionPercent;
    }


    /**
     * Sets the completionPercent value for this RemoteIncident.
     * 
     * @param completionPercent
     */
    public void setCompletionPercent(java.lang.Integer completionPercent) {
        this.completionPercent = completionPercent;
    }


    /**
     * Gets the creationDate value for this RemoteIncident.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteIncident.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the description value for this RemoteIncident.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteIncident.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the detectedReleaseId value for this RemoteIncident.
     * 
     * @return detectedReleaseId
     */
    public java.lang.Integer getDetectedReleaseId() {
        return detectedReleaseId;
    }


    /**
     * Sets the detectedReleaseId value for this RemoteIncident.
     * 
     * @param detectedReleaseId
     */
    public void setDetectedReleaseId(java.lang.Integer detectedReleaseId) {
        this.detectedReleaseId = detectedReleaseId;
    }


    /**
     * Gets the detectedReleaseVersionNumber value for this RemoteIncident.
     * 
     * @return detectedReleaseVersionNumber
     */
    public java.lang.String getDetectedReleaseVersionNumber() {
        return detectedReleaseVersionNumber;
    }


    /**
     * Sets the detectedReleaseVersionNumber value for this RemoteIncident.
     * 
     * @param detectedReleaseVersionNumber
     */
    public void setDetectedReleaseVersionNumber(java.lang.String detectedReleaseVersionNumber) {
        this.detectedReleaseVersionNumber = detectedReleaseVersionNumber;
    }


    /**
     * Gets the estimatedEffort value for this RemoteIncident.
     * 
     * @return estimatedEffort
     */
    public java.lang.Integer getEstimatedEffort() {
        return estimatedEffort;
    }


    /**
     * Sets the estimatedEffort value for this RemoteIncident.
     * 
     * @param estimatedEffort
     */
    public void setEstimatedEffort(java.lang.Integer estimatedEffort) {
        this.estimatedEffort = estimatedEffort;
    }


    /**
     * Gets the fixedBuildId value for this RemoteIncident.
     * 
     * @return fixedBuildId
     */
    public java.lang.Integer getFixedBuildId() {
        return fixedBuildId;
    }


    /**
     * Sets the fixedBuildId value for this RemoteIncident.
     * 
     * @param fixedBuildId
     */
    public void setFixedBuildId(java.lang.Integer fixedBuildId) {
        this.fixedBuildId = fixedBuildId;
    }


    /**
     * Gets the fixedBuildName value for this RemoteIncident.
     * 
     * @return fixedBuildName
     */
    public java.lang.String getFixedBuildName() {
        return fixedBuildName;
    }


    /**
     * Sets the fixedBuildName value for this RemoteIncident.
     * 
     * @param fixedBuildName
     */
    public void setFixedBuildName(java.lang.String fixedBuildName) {
        this.fixedBuildName = fixedBuildName;
    }


    /**
     * Gets the incidentId value for this RemoteIncident.
     * 
     * @return incidentId
     */
    public java.lang.Integer getIncidentId() {
        return incidentId;
    }


    /**
     * Sets the incidentId value for this RemoteIncident.
     * 
     * @param incidentId
     */
    public void setIncidentId(java.lang.Integer incidentId) {
        this.incidentId = incidentId;
    }


    /**
     * Gets the incidentStatusId value for this RemoteIncident.
     * 
     * @return incidentStatusId
     */
    public java.lang.Integer getIncidentStatusId() {
        return incidentStatusId;
    }


    /**
     * Sets the incidentStatusId value for this RemoteIncident.
     * 
     * @param incidentStatusId
     */
    public void setIncidentStatusId(java.lang.Integer incidentStatusId) {
        this.incidentStatusId = incidentStatusId;
    }


    /**
     * Gets the incidentStatusName value for this RemoteIncident.
     * 
     * @return incidentStatusName
     */
    public java.lang.String getIncidentStatusName() {
        return incidentStatusName;
    }


    /**
     * Sets the incidentStatusName value for this RemoteIncident.
     * 
     * @param incidentStatusName
     */
    public void setIncidentStatusName(java.lang.String incidentStatusName) {
        this.incidentStatusName = incidentStatusName;
    }


    /**
     * Gets the incidentStatusOpenStatus value for this RemoteIncident.
     * 
     * @return incidentStatusOpenStatus
     */
    public java.lang.Boolean getIncidentStatusOpenStatus() {
        return incidentStatusOpenStatus;
    }


    /**
     * Sets the incidentStatusOpenStatus value for this RemoteIncident.
     * 
     * @param incidentStatusOpenStatus
     */
    public void setIncidentStatusOpenStatus(java.lang.Boolean incidentStatusOpenStatus) {
        this.incidentStatusOpenStatus = incidentStatusOpenStatus;
    }


    /**
     * Gets the incidentTypeId value for this RemoteIncident.
     * 
     * @return incidentTypeId
     */
    public java.lang.Integer getIncidentTypeId() {
        return incidentTypeId;
    }


    /**
     * Sets the incidentTypeId value for this RemoteIncident.
     * 
     * @param incidentTypeId
     */
    public void setIncidentTypeId(java.lang.Integer incidentTypeId) {
        this.incidentTypeId = incidentTypeId;
    }


    /**
     * Gets the incidentTypeName value for this RemoteIncident.
     * 
     * @return incidentTypeName
     */
    public java.lang.String getIncidentTypeName() {
        return incidentTypeName;
    }


    /**
     * Sets the incidentTypeName value for this RemoteIncident.
     * 
     * @param incidentTypeName
     */
    public void setIncidentTypeName(java.lang.String incidentTypeName) {
        this.incidentTypeName = incidentTypeName;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteIncident.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteIncident.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this RemoteIncident.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteIncident.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the openerId value for this RemoteIncident.
     * 
     * @return openerId
     */
    public java.lang.Integer getOpenerId() {
        return openerId;
    }


    /**
     * Sets the openerId value for this RemoteIncident.
     * 
     * @param openerId
     */
    public void setOpenerId(java.lang.Integer openerId) {
        this.openerId = openerId;
    }


    /**
     * Gets the openerName value for this RemoteIncident.
     * 
     * @return openerName
     */
    public java.lang.String getOpenerName() {
        return openerName;
    }


    /**
     * Sets the openerName value for this RemoteIncident.
     * 
     * @param openerName
     */
    public void setOpenerName(java.lang.String openerName) {
        this.openerName = openerName;
    }


    /**
     * Gets the ownerId value for this RemoteIncident.
     * 
     * @return ownerId
     */
    public java.lang.Integer getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this RemoteIncident.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.Integer ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the ownerName value for this RemoteIncident.
     * 
     * @return ownerName
     */
    public java.lang.String getOwnerName() {
        return ownerName;
    }


    /**
     * Sets the ownerName value for this RemoteIncident.
     * 
     * @param ownerName
     */
    public void setOwnerName(java.lang.String ownerName) {
        this.ownerName = ownerName;
    }


    /**
     * Gets the priorityId value for this RemoteIncident.
     * 
     * @return priorityId
     */
    public java.lang.Integer getPriorityId() {
        return priorityId;
    }


    /**
     * Sets the priorityId value for this RemoteIncident.
     * 
     * @param priorityId
     */
    public void setPriorityId(java.lang.Integer priorityId) {
        this.priorityId = priorityId;
    }


    /**
     * Gets the priorityName value for this RemoteIncident.
     * 
     * @return priorityName
     */
    public java.lang.String getPriorityName() {
        return priorityName;
    }


    /**
     * Sets the priorityName value for this RemoteIncident.
     * 
     * @param priorityName
     */
    public void setPriorityName(java.lang.String priorityName) {
        this.priorityName = priorityName;
    }


    /**
     * Gets the projectName value for this RemoteIncident.
     * 
     * @return projectName
     */
    public java.lang.String getProjectName() {
        return projectName;
    }


    /**
     * Sets the projectName value for this RemoteIncident.
     * 
     * @param projectName
     */
    public void setProjectName(java.lang.String projectName) {
        this.projectName = projectName;
    }


    /**
     * Gets the projectedEffort value for this RemoteIncident.
     * 
     * @return projectedEffort
     */
    public java.lang.Integer getProjectedEffort() {
        return projectedEffort;
    }


    /**
     * Sets the projectedEffort value for this RemoteIncident.
     * 
     * @param projectedEffort
     */
    public void setProjectedEffort(java.lang.Integer projectedEffort) {
        this.projectedEffort = projectedEffort;
    }


    /**
     * Gets the remainingEffort value for this RemoteIncident.
     * 
     * @return remainingEffort
     */
    public java.lang.Integer getRemainingEffort() {
        return remainingEffort;
    }


    /**
     * Sets the remainingEffort value for this RemoteIncident.
     * 
     * @param remainingEffort
     */
    public void setRemainingEffort(java.lang.Integer remainingEffort) {
        this.remainingEffort = remainingEffort;
    }


    /**
     * Gets the resolvedReleaseId value for this RemoteIncident.
     * 
     * @return resolvedReleaseId
     */
    public java.lang.Integer getResolvedReleaseId() {
        return resolvedReleaseId;
    }


    /**
     * Sets the resolvedReleaseId value for this RemoteIncident.
     * 
     * @param resolvedReleaseId
     */
    public void setResolvedReleaseId(java.lang.Integer resolvedReleaseId) {
        this.resolvedReleaseId = resolvedReleaseId;
    }


    /**
     * Gets the resolvedReleaseVersionNumber value for this RemoteIncident.
     * 
     * @return resolvedReleaseVersionNumber
     */
    public java.lang.String getResolvedReleaseVersionNumber() {
        return resolvedReleaseVersionNumber;
    }


    /**
     * Sets the resolvedReleaseVersionNumber value for this RemoteIncident.
     * 
     * @param resolvedReleaseVersionNumber
     */
    public void setResolvedReleaseVersionNumber(java.lang.String resolvedReleaseVersionNumber) {
        this.resolvedReleaseVersionNumber = resolvedReleaseVersionNumber;
    }


    /**
     * Gets the severityId value for this RemoteIncident.
     * 
     * @return severityId
     */
    public java.lang.Integer getSeverityId() {
        return severityId;
    }


    /**
     * Sets the severityId value for this RemoteIncident.
     * 
     * @param severityId
     */
    public void setSeverityId(java.lang.Integer severityId) {
        this.severityId = severityId;
    }


    /**
     * Gets the severityName value for this RemoteIncident.
     * 
     * @return severityName
     */
    public java.lang.String getSeverityName() {
        return severityName;
    }


    /**
     * Sets the severityName value for this RemoteIncident.
     * 
     * @param severityName
     */
    public void setSeverityName(java.lang.String severityName) {
        this.severityName = severityName;
    }


    /**
     * Gets the startDate value for this RemoteIncident.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RemoteIncident.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the testRunStepId value for this RemoteIncident.
     * 
     * @return testRunStepId
     */
    public java.lang.Integer getTestRunStepId() {
        return testRunStepId;
    }


    /**
     * Sets the testRunStepId value for this RemoteIncident.
     * 
     * @param testRunStepId
     */
    public void setTestRunStepId(java.lang.Integer testRunStepId) {
        this.testRunStepId = testRunStepId;
    }


    /**
     * Gets the verifiedReleaseId value for this RemoteIncident.
     * 
     * @return verifiedReleaseId
     */
    public java.lang.Integer getVerifiedReleaseId() {
        return verifiedReleaseId;
    }


    /**
     * Sets the verifiedReleaseId value for this RemoteIncident.
     * 
     * @param verifiedReleaseId
     */
    public void setVerifiedReleaseId(java.lang.Integer verifiedReleaseId) {
        this.verifiedReleaseId = verifiedReleaseId;
    }


    /**
     * Gets the verifiedReleaseVersionNumber value for this RemoteIncident.
     * 
     * @return verifiedReleaseVersionNumber
     */
    public java.lang.String getVerifiedReleaseVersionNumber() {
        return verifiedReleaseVersionNumber;
    }


    /**
     * Sets the verifiedReleaseVersionNumber value for this RemoteIncident.
     * 
     * @param verifiedReleaseVersionNumber
     */
    public void setVerifiedReleaseVersionNumber(java.lang.String verifiedReleaseVersionNumber) {
        this.verifiedReleaseVersionNumber = verifiedReleaseVersionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteIncident)) return false;
        RemoteIncident other = (RemoteIncident) obj;
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
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.completionPercent==null && other.getCompletionPercent()==null) || 
             (this.completionPercent!=null &&
              this.completionPercent.equals(other.getCompletionPercent()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.detectedReleaseId==null && other.getDetectedReleaseId()==null) || 
             (this.detectedReleaseId!=null &&
              this.detectedReleaseId.equals(other.getDetectedReleaseId()))) &&
            ((this.detectedReleaseVersionNumber==null && other.getDetectedReleaseVersionNumber()==null) || 
             (this.detectedReleaseVersionNumber!=null &&
              this.detectedReleaseVersionNumber.equals(other.getDetectedReleaseVersionNumber()))) &&
            ((this.estimatedEffort==null && other.getEstimatedEffort()==null) || 
             (this.estimatedEffort!=null &&
              this.estimatedEffort.equals(other.getEstimatedEffort()))) &&
            ((this.fixedBuildId==null && other.getFixedBuildId()==null) || 
             (this.fixedBuildId!=null &&
              this.fixedBuildId.equals(other.getFixedBuildId()))) &&
            ((this.fixedBuildName==null && other.getFixedBuildName()==null) || 
             (this.fixedBuildName!=null &&
              this.fixedBuildName.equals(other.getFixedBuildName()))) &&
            ((this.incidentId==null && other.getIncidentId()==null) || 
             (this.incidentId!=null &&
              this.incidentId.equals(other.getIncidentId()))) &&
            ((this.incidentStatusId==null && other.getIncidentStatusId()==null) || 
             (this.incidentStatusId!=null &&
              this.incidentStatusId.equals(other.getIncidentStatusId()))) &&
            ((this.incidentStatusName==null && other.getIncidentStatusName()==null) || 
             (this.incidentStatusName!=null &&
              this.incidentStatusName.equals(other.getIncidentStatusName()))) &&
            ((this.incidentStatusOpenStatus==null && other.getIncidentStatusOpenStatus()==null) || 
             (this.incidentStatusOpenStatus!=null &&
              this.incidentStatusOpenStatus.equals(other.getIncidentStatusOpenStatus()))) &&
            ((this.incidentTypeId==null && other.getIncidentTypeId()==null) || 
             (this.incidentTypeId!=null &&
              this.incidentTypeId.equals(other.getIncidentTypeId()))) &&
            ((this.incidentTypeName==null && other.getIncidentTypeName()==null) || 
             (this.incidentTypeName!=null &&
              this.incidentTypeName.equals(other.getIncidentTypeName()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.openerId==null && other.getOpenerId()==null) || 
             (this.openerId!=null &&
              this.openerId.equals(other.getOpenerId()))) &&
            ((this.openerName==null && other.getOpenerName()==null) || 
             (this.openerName!=null &&
              this.openerName.equals(other.getOpenerName()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.ownerName==null && other.getOwnerName()==null) || 
             (this.ownerName!=null &&
              this.ownerName.equals(other.getOwnerName()))) &&
            ((this.priorityId==null && other.getPriorityId()==null) || 
             (this.priorityId!=null &&
              this.priorityId.equals(other.getPriorityId()))) &&
            ((this.priorityName==null && other.getPriorityName()==null) || 
             (this.priorityName!=null &&
              this.priorityName.equals(other.getPriorityName()))) &&
            ((this.projectName==null && other.getProjectName()==null) || 
             (this.projectName!=null &&
              this.projectName.equals(other.getProjectName()))) &&
            ((this.projectedEffort==null && other.getProjectedEffort()==null) || 
             (this.projectedEffort!=null &&
              this.projectedEffort.equals(other.getProjectedEffort()))) &&
            ((this.remainingEffort==null && other.getRemainingEffort()==null) || 
             (this.remainingEffort!=null &&
              this.remainingEffort.equals(other.getRemainingEffort()))) &&
            ((this.resolvedReleaseId==null && other.getResolvedReleaseId()==null) || 
             (this.resolvedReleaseId!=null &&
              this.resolvedReleaseId.equals(other.getResolvedReleaseId()))) &&
            ((this.resolvedReleaseVersionNumber==null && other.getResolvedReleaseVersionNumber()==null) || 
             (this.resolvedReleaseVersionNumber!=null &&
              this.resolvedReleaseVersionNumber.equals(other.getResolvedReleaseVersionNumber()))) &&
            ((this.severityId==null && other.getSeverityId()==null) || 
             (this.severityId!=null &&
              this.severityId.equals(other.getSeverityId()))) &&
            ((this.severityName==null && other.getSeverityName()==null) || 
             (this.severityName!=null &&
              this.severityName.equals(other.getSeverityName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.testRunStepId==null && other.getTestRunStepId()==null) || 
             (this.testRunStepId!=null &&
              this.testRunStepId.equals(other.getTestRunStepId()))) &&
            ((this.verifiedReleaseId==null && other.getVerifiedReleaseId()==null) || 
             (this.verifiedReleaseId!=null &&
              this.verifiedReleaseId.equals(other.getVerifiedReleaseId()))) &&
            ((this.verifiedReleaseVersionNumber==null && other.getVerifiedReleaseVersionNumber()==null) || 
             (this.verifiedReleaseVersionNumber!=null &&
              this.verifiedReleaseVersionNumber.equals(other.getVerifiedReleaseVersionNumber())));
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
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getCompletionPercent() != null) {
            _hashCode += getCompletionPercent().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDetectedReleaseId() != null) {
            _hashCode += getDetectedReleaseId().hashCode();
        }
        if (getDetectedReleaseVersionNumber() != null) {
            _hashCode += getDetectedReleaseVersionNumber().hashCode();
        }
        if (getEstimatedEffort() != null) {
            _hashCode += getEstimatedEffort().hashCode();
        }
        if (getFixedBuildId() != null) {
            _hashCode += getFixedBuildId().hashCode();
        }
        if (getFixedBuildName() != null) {
            _hashCode += getFixedBuildName().hashCode();
        }
        if (getIncidentId() != null) {
            _hashCode += getIncidentId().hashCode();
        }
        if (getIncidentStatusId() != null) {
            _hashCode += getIncidentStatusId().hashCode();
        }
        if (getIncidentStatusName() != null) {
            _hashCode += getIncidentStatusName().hashCode();
        }
        if (getIncidentStatusOpenStatus() != null) {
            _hashCode += getIncidentStatusOpenStatus().hashCode();
        }
        if (getIncidentTypeId() != null) {
            _hashCode += getIncidentTypeId().hashCode();
        }
        if (getIncidentTypeName() != null) {
            _hashCode += getIncidentTypeName().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOpenerId() != null) {
            _hashCode += getOpenerId().hashCode();
        }
        if (getOpenerName() != null) {
            _hashCode += getOpenerName().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getOwnerName() != null) {
            _hashCode += getOwnerName().hashCode();
        }
        if (getPriorityId() != null) {
            _hashCode += getPriorityId().hashCode();
        }
        if (getPriorityName() != null) {
            _hashCode += getPriorityName().hashCode();
        }
        if (getProjectName() != null) {
            _hashCode += getProjectName().hashCode();
        }
        if (getProjectedEffort() != null) {
            _hashCode += getProjectedEffort().hashCode();
        }
        if (getRemainingEffort() != null) {
            _hashCode += getRemainingEffort().hashCode();
        }
        if (getResolvedReleaseId() != null) {
            _hashCode += getResolvedReleaseId().hashCode();
        }
        if (getResolvedReleaseVersionNumber() != null) {
            _hashCode += getResolvedReleaseVersionNumber().hashCode();
        }
        if (getSeverityId() != null) {
            _hashCode += getSeverityId().hashCode();
        }
        if (getSeverityName() != null) {
            _hashCode += getSeverityName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getTestRunStepId() != null) {
            _hashCode += getTestRunStepId().hashCode();
        }
        if (getVerifiedReleaseId() != null) {
            _hashCode += getVerifiedReleaseId().hashCode();
        }
        if (getVerifiedReleaseVersionNumber() != null) {
            _hashCode += getVerifiedReleaseVersionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteIncident.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ActualEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("detectedReleaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DetectedReleaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detectedReleaseVersionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DetectedReleaseVersionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fixedBuildId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FixedBuildId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedBuildName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FixedBuildName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentStatusName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentStatusName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentStatusOpenStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentStatusOpenStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incidentTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "IncidentTypeName"));
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
        elemField.setFieldName("openerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "OpenerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "OpenerName"));
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
        elemField.setFieldName("priorityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "PriorityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "PriorityName"));
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
        elemField.setFieldName("remainingEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemainingEffort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedReleaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ResolvedReleaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolvedReleaseVersionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ResolvedReleaseVersionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "SeverityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "SeverityName"));
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
        elemField.setFieldName("testRunStepId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "TestRunStepId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifiedReleaseId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "VerifiedReleaseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifiedReleaseVersionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "VerifiedReleaseVersionNumber"));
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
