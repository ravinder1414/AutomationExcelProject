
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
 *         &lt;element name="TestRun_RetrieveAutomatedResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects}ArrayOfRemoteAutomatedTestRun" minOccurs="0"/>
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
    "testRunRetrieveAutomatedResult"
})
@XmlRootElement(name = "TestRun_RetrieveAutomatedResponse")
public class TestRunRetrieveAutomatedResponse {

    @XmlElementRef(name = "TestRun_RetrieveAutomatedResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v4.0/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRemoteAutomatedTestRun> testRunRetrieveAutomatedResult;

    /**
     * Gets the value of the testRunRetrieveAutomatedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteAutomatedTestRun> getTestRunRetrieveAutomatedResult() {
        return testRunRetrieveAutomatedResult;
    }

    /**
     * Sets the value of the testRunRetrieveAutomatedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteAutomatedTestRun }{@code >}
     *     
     */
    public void setTestRunRetrieveAutomatedResult(JAXBElement<ArrayOfRemoteAutomatedTestRun> value) {
        this.testRunRetrieveAutomatedResult = ((JAXBElement<ArrayOfRemoteAutomatedTestRun> ) value);
    }

}
