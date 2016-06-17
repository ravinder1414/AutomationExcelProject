/**
 * ImportExportLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.inflectra.www.SpiraTest.Services.v4_0;

public class ImportExportLocator extends org.apache.axis.client.Service implements com.inflectra.www.SpiraTest.Services.v4_0.ImportExport {

    public ImportExportLocator() {
    }


    public ImportExportLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImportExportLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IImportExport
    private java.lang.String BasicHttpBinding_IImportExport_address = "https://impellam.spiraservice.net/Services/v4_0/ImportExport.svc";

    public java.lang.String getBasicHttpBinding_IImportExportAddress() {
        return BasicHttpBinding_IImportExport_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IImportExportWSDDServiceName = "BasicHttpBinding_IImportExport";

    public java.lang.String getBasicHttpBinding_IImportExportWSDDServiceName() {
        return BasicHttpBinding_IImportExportWSDDServiceName;
    }

    public void setBasicHttpBinding_IImportExportWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IImportExportWSDDServiceName = name;
    }

    public com.inflectra.www.SpiraTest.Services.v4_0.IImportExport getBasicHttpBinding_IImportExport() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IImportExport_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IImportExport(endpoint);
    }

    public com.inflectra.www.SpiraTest.Services.v4_0.IImportExport getBasicHttpBinding_IImportExport(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.inflectra.www.SpiraTest.Services.v4_0.BasicHttpBinding_IImportExportStub _stub = new com.inflectra.www.SpiraTest.Services.v4_0.BasicHttpBinding_IImportExportStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IImportExportWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IImportExportEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IImportExport_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.inflectra.www.SpiraTest.Services.v4_0.IImportExport.class.isAssignableFrom(serviceEndpointInterface)) {
                com.inflectra.www.SpiraTest.Services.v4_0.BasicHttpBinding_IImportExportStub _stub = new com.inflectra.www.SpiraTest.Services.v4_0.BasicHttpBinding_IImportExportStub(new java.net.URL(BasicHttpBinding_IImportExport_address), this);
                _stub.setPortName(getBasicHttpBinding_IImportExportWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IImportExport".equals(inputPortName)) {
            return getBasicHttpBinding_IImportExport();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "ImportExport");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "BasicHttpBinding_IImportExport"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IImportExport".equals(portName)) {
            setBasicHttpBinding_IImportExportEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
