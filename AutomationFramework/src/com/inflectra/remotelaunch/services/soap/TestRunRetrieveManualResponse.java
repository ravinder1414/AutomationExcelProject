
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
 *         &lt;element name="TestRun_RetrieveManualResult" type="{http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects}ArrayOfRemoteManualTestRun" minOccurs="0"/>
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
    "testRunRetrieveManualResult"
})
@XmlRootElement(name = "TestRun_RetrieveManualResponse")
public class TestRunRetrieveManualResponse {

    @XmlElementRef(name = "TestRun_RetrieveManualResult", namespace = "http://www.inflectra.com/SpiraTest/Services/v4.0/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfRemoteManualTestRun> testRunRetrieveManualResult;

    /**
     * Gets the value of the testRunRetrieveManualResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteManualTestRun }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRemoteManualTestRun> getTestRunRetrieveManualResult() {
        return testRunRetrieveManualResult;
    }

    /**
     * Sets the value of the testRunRetrieveManualResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRemoteManualTestRun }{@code >}
     *     
     */
    public void setTestRunRetrieveManualResult(JAXBElement<ArrayOfRemoteManualTestRun> value) {
        this.testRunRetrieveManualResult = ((JAXBElement<ArrayOfRemoteManualTestRun> ) value);
    }

}
