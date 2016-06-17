
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
 *         &lt;element name="Release_CreateResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects}RemoteRelease" minOccurs="0"/>
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
    "releaseCreateResult"
})
@XmlRootElement(name = "Release_CreateResponse")
public class ReleaseCreateResponse {

    @XmlElementRef(name = "Release_CreateResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v4.0/", type = JAXBElement.class)
    protected JAXBElement<RemoteRelease> releaseCreateResult;

    /**
     * Gets the value of the releaseCreateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RemoteRelease }{@code >}
     *     
     */
    public JAXBElement<RemoteRelease> getReleaseCreateResult() {
        return releaseCreateResult;
    }

    /**
     * Sets the value of the releaseCreateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RemoteRelease }{@code >}
     *     
     */
    public void setReleaseCreateResult(JAXBElement<RemoteRelease> value) {
        this.releaseCreateResult = ((JAXBElement<RemoteRelease> ) value);
    }

}
