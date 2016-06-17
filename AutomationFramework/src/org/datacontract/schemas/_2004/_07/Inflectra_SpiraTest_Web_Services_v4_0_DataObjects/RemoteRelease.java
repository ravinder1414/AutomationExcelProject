/**
 * RemoteRelease.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects;

public class RemoteRelease  extends org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Integer availableEffort;

    private java.util.Calendar creationDate;

    private java.lang.Integer creatorId;

    private java.lang.String creatorName;

    private java.lang.Integer daysNonWorking;

    private java.lang.String description;

    private java.util.Calendar endDate;

    private java.lang.String fullName;

    private java.lang.String indentLevel;

    private java.lang.Boolean iteration;

    private java.util.Calendar lastUpdateDate;

    private java.lang.String name;

    private java.lang.Integer plannedEffort;

    private java.lang.Integer releaseId;

    private java.lang.Integer resourceCount;

    private java.util.Calendar startDate;

    private java.lang.Boolean summary;

    private java.lang.Integer taskActualEffort;

    private java.lang.Integer taskCount;

    private java.lang.Integer taskEstimatedEffort;

    private java.lang.String versionNumber;

    public RemoteRelease() {
    }

    public RemoteRelease(
           java.lang.Integer artifactTypeId,
           java.util.Calendar concurrencyDate,
           org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[] customProperties,
           java.lang.Integer projectId,
           java.lang.Boolean active,
           java.lang.Integer availableEffort,
           java.util.Calendar creationDate,
           java.lang.Integer creatorId,
           java.lang.String creatorName,
           java.lang.Integer daysNonWorking,
           java.lang.String description,
           java.util.Calendar endDate,
           java.lang.String fullName,
           java.lang.String indentLevel,
           java.lang.Boolean iteration,
           java.util.Calendar lastUpdateDate,
           java.lang.String name,
           java.lang.Integer plannedEffort,
           java.lang.Integer releaseId,
           java.lang.Integer resourceCount,
           java.util.Calendar startDate,
           java.lang.Boolean summary,
           java.lang.Integer taskActualEffort,
           java.lang.Integer taskCount,
           java.lang.Integer taskEstimatedEffort,
           java.lang.String versionNumber) {
        super(
            artifactTypeId,
            concurrencyDate,
            customProperties,
            projectId);
        this.active = active;
        this.availableEffort = availableEffort;
        this.creationDate = creationDate;
        this.creatorId = creatorId;
        this.creatorName = creatorName;
        this.daysNonWorking = daysNonWorking;
        this.description = description;
        this.endDate = endDate;
        this.fullName = fullName;
        this.indentLevel = indentLevel;
        this.iteration = iteration;
        this.lastUpdateDate = lastUpdateDate;
        this.name = name;
        this.plannedEffort = plannedEffort;
        this.releaseId = releaseId;
        this.resourceCount = resourceCount;
        this.startDate = startDate;
        this.summary = summary;
        this.taskActualEffort = taskActualEffort;
        this.taskCount = taskCount;
        this.taskEstimatedEffort = taskEstimatedEffort;
        this.versionNumber = versionNumber;
    }


    /**
     * Gets the active value for this RemoteRelease.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this RemoteRelease.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the availableEffort value for this RemoteRelease.
     * 
     * @return availableEffort
     */
    public java.lang.Integer getAvailableEffort() {
        return availableEffort;
    }


    /**
     * Sets the availableEffort value for this RemoteRelease.
     * 
     * @param availableEffort
     */
    public void setAvailableEffort(java.lang.Integer availableEffort) {
        this.availableEffort = availableEffort;
    }


    /**
     * Gets the creationDate value for this RemoteRelease.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this RemoteRelease.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the creatorId value for this RemoteRelease.
     * 
     * @return creatorId
     */
    public java.lang.Integer getCreatorId() {
        return creatorId;
    }


    /**
     * Sets the creatorId value for this RemoteRelease.
     * 
     * @param creatorId
     */
    public void setCreatorId(java.lang.Integer creatorId) {
        this.creatorId = creatorId;
    }


    /**
     * Gets the creatorName value for this RemoteRelease.
     * 
     * @return creatorName
     */
    public java.lang.String getCreatorName() {
        return creatorName;
    }


    /**
     * Sets the creatorName value for this RemoteRelease.
     * 
     * @param creatorName
     */
    public void setCreatorName(java.lang.String creatorName) {
        this.creatorName = creatorName;
    }


    /**
     * Gets the daysNonWorking value for this RemoteRelease.
     * 
     * @return daysNonWorking
     */
    public java.lang.Integer getDaysNonWorking() {
        return daysNonWorking;
    }


    /**
     * Sets the daysNonWorking value for this RemoteRelease.
     * 
     * @param daysNonWorking
     */
    public void setDaysNonWorking(java.lang.Integer daysNonWorking) {
        this.daysNonWorking = daysNonWorking;
    }


    /**
     * Gets the description value for this RemoteRelease.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RemoteRelease.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endDate value for this RemoteRelease.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this RemoteRelease.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the fullName value for this RemoteRelease.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this RemoteRelease.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the indentLevel value for this RemoteRelease.
     * 
     * @return indentLevel
     */
    public java.lang.String getIndentLevel() {
        return indentLevel;
    }


    /**
     * Sets the indentLevel value for this RemoteRelease.
     * 
     * @param indentLevel
     */
    public void setIndentLevel(java.lang.String indentLevel) {
        this.indentLevel = indentLevel;
    }


    /**
     * Gets the iteration value for this RemoteRelease.
     * 
     * @return iteration
     */
    public java.lang.Boolean getIteration() {
        return iteration;
    }


    /**
     * Sets the iteration value for this RemoteRelease.
     * 
     * @param iteration
     */
    public void setIteration(java.lang.Boolean iteration) {
        this.iteration = iteration;
    }


    /**
     * Gets the lastUpdateDate value for this RemoteRelease.
     * 
     * @return lastUpdateDate
     */
    public java.util.Calendar getLastUpdateDate() {
        return lastUpdateDate;
    }


    /**
     * Sets the lastUpdateDate value for this RemoteRelease.
     * 
     * @param lastUpdateDate
     */
    public void setLastUpdateDate(java.util.Calendar lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Gets the name value for this RemoteRelease.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RemoteRelease.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the plannedEffort value for this RemoteRelease.
     * 
     * @return plannedEffort
     */
    public java.lang.Integer getPlannedEffort() {
        return plannedEffort;
    }


    /**
     * Sets the plannedEffort value for this RemoteRelease.
     * 
     * @param plannedEffort
     */
    public void setPlannedEffort(java.lang.Integer plannedEffort) {
        this.plannedEffort = plannedEffort;
    }


    /**
     * Gets the releaseId value for this RemoteRelease.
     * 
     * @return releaseId
     */
    public java.lang.Integer getReleaseId() {
        return releaseId;
    }


    /**
     * Sets the releaseId value for this RemoteRelease.
     * 
     * @param releaseId
     */
    public void setReleaseId(java.lang.Integer releaseId) {
        this.releaseId = releaseId;
    }


    /**
     * Gets the resourceCount value for this RemoteRelease.
     * 
     * @return resourceCount
     */
    public java.lang.Integer getResourceCount() {
        return resourceCount;
    }


    /**
     * Sets the resourceCount value for this RemoteRelease.
     * 
     * @param resourceCount
     */
    public void setResourceCount(java.lang.Integer resourceCount) {
        this.resourceCount = resourceCount;
    }


    /**
     * Gets the startDate value for this RemoteRelease.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this RemoteRelease.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the summary value for this RemoteRelease.
     * 
     * @return summary
     */
    public java.lang.Boolean getSummary() {
        return summary;
    }


    /**
     * Sets the summary value for this RemoteRelease.
     * 
     * @param summary
     */
    public void setSummary(java.lang.Boolean summary) {
        this.summary = summary;
    }


    /**
     * Gets the taskActualEffort value for this RemoteRelease.
     * 
     * @return taskActualEffort
     */
    public java.lang.Integer getTaskActualEffort() {
        return taskActualEffort;
    }


    /**
     * Sets the taskActualEffort value for this RemoteRelease.
     * 
     * @param taskActualEffort
     */
    public void setTaskActualEffort(java.lang.Integer taskActualEffort) {
        this.taskActualEffort = taskActualEffort;
    }


    /**
     * Gets the taskCount value for this RemoteRelease.
     * 
     * @return taskCount
     */
    public java.lang.Integer getTaskCount() {
        return taskCount;
    }


    /**
     * Sets the taskCount value for this RemoteRelease.
     * 
     * @param taskCount
     */
    public void setTaskCount(java.lang.Integer taskCount) {
        this.taskCount = taskCount;
    }


    /**
     * Gets the taskEstimatedEffort value for this RemoteRelease.
     * 
     * @return taskEstimatedEffort
     */
    public java.lang.Integer getTaskEstimatedEffort() {
        return taskEstimatedEffort;
    }


    /**
     * Sets the taskEstimatedEffort value for this RemoteRelease.
     * 
     * @param taskEstimatedEffort
     */
    public void setTaskEstimatedEffort(java.lang.Integer taskEstimatedEffort) {
        this.taskEstimatedEffort = taskEstimatedEffort;
    }


    /**
     * Gets the versionNumber value for this RemoteRelease.
     * 
     * @return versionNumber
     */
    public java.lang.String getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this RemoteRelease.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.String versionNumber) {
        this.versionNumber = versionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemoteRelease)) return false;
        RemoteRelease other = (RemoteRelease) obj;
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
            ((this.availableEffort==null && other.getAvailableEffort()==null) || 
             (this.availableEffort!=null &&
              this.availableEffort.equals(other.getAvailableEffort()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.creatorId==null && other.getCreatorId()==null) || 
             (this.creatorId!=null &&
              this.creatorId.equals(other.getCreatorId()))) &&
            ((this.creatorName==null && other.getCreatorName()==null) || 
             (this.creatorName!=null &&
              this.creatorName.equals(other.getCreatorName()))) &&
            ((this.daysNonWorking==null && other.getDaysNonWorking()==null) || 
             (this.daysNonWorking!=null &&
              this.daysNonWorking.equals(other.getDaysNonWorking()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.indentLevel==null && other.getIndentLevel()==null) || 
             (this.indentLevel!=null &&
              this.indentLevel.equals(other.getIndentLevel()))) &&
            ((this.iteration==null && other.getIteration()==null) || 
             (this.iteration!=null &&
              this.iteration.equals(other.getIteration()))) &&
            ((this.lastUpdateDate==null && other.getLastUpdateDate()==null) || 
             (this.lastUpdateDate!=null &&
              this.lastUpdateDate.equals(other.getLastUpdateDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.plannedEffort==null && other.getPlannedEffort()==null) || 
             (this.plannedEffort!=null &&
              this.plannedEffort.equals(other.getPlannedEffort()))) &&
            ((this.releaseId==null && other.getReleaseId()==null) || 
             (this.releaseId!=null &&
              this.releaseId.equals(other.getReleaseId()))) &&
            ((this.resourceCount==null && other.getResourceCount()==null) || 
             (this.resourceCount!=null &&
              this.resourceCount.equals(other.getResourceCount()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
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
              this.taskEstimatedEffort.equals(other.getTaskEstimatedEffort()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber())));
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
        if (getAvailableEffort() != null) {
            _hashCode += getAvailableEffort().hashCode();
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
        if (getDaysNonWorking() != null) {
            _hashCode += getDaysNonWorking().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getIndentLevel() != null) {
            _hashCode += getIndentLevel().hashCode();
        }
        if (getIteration() != null) {
            _hashCode += getIteration().hashCode();
        }
        if (getLastUpdateDate() != null) {
            _hashCode += getLastUpdateDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPlannedEffort() != null) {
            _hashCode += getPlannedEffort().hashCode();
        }
        if (getReleaseId() != null) {
            _hashCode += getReleaseId().hashCode();
        }
        if (getResourceCount() != null) {
            _hashCode += getResourceCount().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
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
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemoteRelease.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "AvailableEffort"));
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
        elemField.setFieldName("daysNonWorking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DaysNonWorking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "FullName"));
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
        elemField.setFieldName("iteration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "Iteration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("plannedEffort");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "PlannedEffort"));
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
        elemField.setFieldName("resourceCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ResourceCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "VersionNumber"));
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
