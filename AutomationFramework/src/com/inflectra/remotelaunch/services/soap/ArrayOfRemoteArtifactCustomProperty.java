
package com.inflectra.remotelaunch.services.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRemoteArtifactCustomProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRemoteArtifactCustomProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RemoteArtifactCustomProperty" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects}RemoteArtifactCustomProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRemoteArtifactCustomProperty", namespace = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", propOrder = {
    "remoteArtifactCustomProperty"
})
public class ArrayOfRemoteArtifactCustomProperty {

    @XmlElement(name = "RemoteArtifactCustomProperty", nillable = true)
    protected List<RemoteArtifactCustomProperty> remoteArtifactCustomProperty;

    /**
     * Gets the value of the remoteArtifactCustomProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remoteArtifactCustomProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoteArtifactCustomProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemoteArtifactCustomProperty }
     * 
     * 
     */
    public List<RemoteArtifactCustomProperty> getRemoteArtifactCustomProperty() {
        if (remoteArtifactCustomProperty == null) {
            remoteArtifactCustomProperty = new ArrayList<RemoteArtifactCustomProperty>();
        }
        return this.remoteArtifactCustomProperty;
    }

}
