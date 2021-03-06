
package com.inflectra.remotelaunch.services.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remoteCustomProperty" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects}RemoteCustomProperty" minOccurs="0"/>
 *         &lt;element name="customListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "remoteCustomProperty",
    "customListId"
})
@XmlRootElement(name = "CustomProperty_AddDefinition")
public class CustomPropertyAddDefinition {

    @XmlElementRef(name = "remoteCustomProperty", namespace = "http://www.inflectra.com/SpiraTest/Services/v4.0/", type = JAXBElement.class)
    protected JAXBElement<RemoteCustomProperty> remoteCustomProperty;
    @XmlElementRef(name = "customListId", namespace = "http://www.inflectra.com/SpiraTest/Services/v4.0/", type = JAXBElement.class)
    protected JAXBElement<Integer> customListId;

    /**
     * Gets the value of the remoteCustomProperty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoteCustomProperty }{@code >}
     *     
     */
    public JAXBElement<RemoteCustomProperty> getRemoteCustomProperty() {
        return remoteCustomProperty;
    }

    /**
     * Sets the value of the remoteCustomProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoteCustomProperty }{@code >}
     *     
     */
    public void setRemoteCustomProperty(JAXBElement<RemoteCustomProperty> value) {
        this.remoteCustomProperty = ((JAXBElement<RemoteCustomProperty> ) value);
    }

    /**
     * Gets the value of the customListId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCustomListId() {
        return customListId;
    }

    /**
     * Sets the value of the customListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCustomListId(JAXBElement<Integer> value) {
        this.customListId = ((JAXBElement<Integer> ) value);
    }

}
