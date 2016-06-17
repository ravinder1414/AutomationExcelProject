/**
 * BasicHttpBinding_IImportExportStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.inflectra.www.SpiraTest.Services.v4_0;

public class BasicHttpBinding_IImportExportStub extends org.apache.axis.client.Stub implements com.inflectra.www.SpiraTest.Services.v4_0.IImportExport {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[193];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
        _initOperationDesc20();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Connection_Authenticate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Connection_AuthenticateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Connection_Authenticate2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "plugInName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Connection_Authenticate2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Connection_ConnectToProject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Connection_ConnectToProjectResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Connection_Disconnect");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("System_GetProductName");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetProductNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("System_GetServerDateTime");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        oper.setReturnClass(java.util.Calendar.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetServerDateTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("System_GetWebServerUrl");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetWebServerUrlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveByFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveByFolderResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestCase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_Move");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "destinationTestCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_MoveStep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "sourceTestStepId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "destinationTestStepId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_DeleteStep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testStepId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_AddStep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestStep"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_AddStepResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_AddLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "position"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "linkedTestCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestStepParameter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStepParameter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_AddLinkResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_AddUpdateAutomationScript");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "automationEngineId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "urlOrFilename"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "binaryData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectAttachmentTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectAttachmentFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveCommentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_CountForFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parentID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CountForFolderResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_CreateComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CreateCommentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_CreateFromTestCases");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint"), int[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteManualTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateFromTestCasesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_Count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_CreateFromTestSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteManualTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateFromTestSetResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_CreateForAutomationHost");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "automationHostToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dateRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DateRange"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomatedTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateForAutomationHostResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_CreateForAutomatedTestSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "automationHostToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomatedTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateForAutomatedTestSetResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RecordAutomated1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestRun"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RecordAutomated1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RecordAutomated2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testerUserId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetTestCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "buildId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "executionStatusId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "runnerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "runnerTestName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "runnerAssertCount"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "runnerMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "runnerStackTrace"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testRunFormatId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RecordAutomated2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RecordAutomated3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestRuns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomatedTestRun"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomatedTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RecordAutomated3Result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RetrieveManual");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteManualTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveManualResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RetrieveAutomated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomatedTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveAutomatedResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testRunId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RetrieveAutomatedById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testRunId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveAutomatedByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_RetrieveManualById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testRunId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveManualByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestRun_Save");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestRuns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteManualTestRun"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "endDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteManualTestRun"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_SaveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_AddTestMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestSetTestCaseMapping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "existingTestSetTestCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSetTestCaseParameter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseParameter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSetTestCaseMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_AddTestMappingResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parentTestSetFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_Count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_CountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_CreateFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parentTestSetFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_CreateFolderResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_RemoveTestMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestSetTestCaseMapping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_RetrieveTestCaseMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSetTestCaseMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveTestCaseMappingResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSet"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_RetrieveForOwner");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSet"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveForOwnerResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestSet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_Move");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "destinationTestSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_RetrieveComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveCommentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestSet_CreateComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_CreateCommentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("User_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteUser"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "passwordQuestion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "passwordAnswer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectRoleId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteUser"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "User_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("User_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteUser"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "User_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("User_RetrieveByUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteUser"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "User_RetrieveByUserNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("User_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "userId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationHost_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomationHost"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationHost_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "automationHostId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationHost_RetrieveByToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_RetrieveByTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationHost_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteAutomationHost"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationHost_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteAutomationHost"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationHost_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "automationHostId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationEngine_RetrieveByToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_RetrieveByTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationEngine_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "activeOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomationEngine"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationEngine_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteEngine"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AutomationEngine_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "automationEngineId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Build_RetrieveByReleaseId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteBuild"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Build_RetrieveByReleaseIdResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Build_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "buildId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Build_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Build_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteBuild"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Build_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_RetrieveForArtifactType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "includeDeleted"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteCustomProperty"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_RetrieveForArtifactTypeResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_AddCustomList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteCustomList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_AddCustomListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_AddCustomListValue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteCustomListValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomListValue"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomListValue"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_AddCustomListValueResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_AddDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteCustomProperty"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "customListId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_AddDefinitionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_UpdateDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteCustomProperty"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_DeleteDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "customPropertyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_RetrieveCustomListById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "customListId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_RetrieveCustomListByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_RetrieveCustomLists");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteCustomList"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_RetrieveCustomListsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomProperty_UpdateCustomList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteCustomList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_AddArtifactMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDataMappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_AddUserMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDataMappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_RemoveArtifactMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDataMappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_RetrieveArtifactMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveArtifactMappingsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_RetrieveCustomPropertyMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "customPropertyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveCustomPropertyMappingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_RetrieveCustomPropertyValueMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "customPropertyId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveCustomPropertyValueMappingsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_RetrieveFieldValueMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactFieldId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveFieldValueMappingsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_RetrieveProjectMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveProjectMappingsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataMapping_RetrieveUserMappings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "dataSyncSystemId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveUserMappingsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_OpenFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "attachmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_OpenFileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_AddFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDocument"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "binaryData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddFileResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_AddUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDocument"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddUrlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_AddFileVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDocumentVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "binaryData"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "makeCurrent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddFileVersionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_AddUrlVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDocumentVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "makeCurrent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddUrlVersionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_DeleteFromArtifact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "attachmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "attachmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocument"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_RetrieveForFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "folderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocument"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveForFolderResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_RetrieveForArtifact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocument"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveForArtifactResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_AddToArtifactId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "attachmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "attachmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_RetrieveTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "activeOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocumentType"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveTypesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentType"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_RetrieveFolders");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocumentFolder"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveFoldersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_RetrieveFolderById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "folderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveFolderByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_AddFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDocumentFolder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddFolderResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_DeleteFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectAttachmentFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Document_UpdateFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteDocumentFolder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Association_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteAssociation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAssociation"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAssociation"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Association_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Association_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteAssociation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAssociation"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Association_RetrieveForArtifact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAssociation"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Association_RetrieveForArtifactResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAssociation"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_AddPriority");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteIncidentPriority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentPriority"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentPriority"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddPriorityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_Count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_CountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_AddComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteComments"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddCommentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_AddSeverity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteIncidentSeverity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentSeverity"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentSeverity"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddSeverityResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_AddStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteIncidentStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentStatus"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentStatus"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_AddType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteIncidentType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddTypeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteIncident"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "incidentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveByTestCase");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "openOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveByTestCaseResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveByTestRunStep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testRunStepId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveByTestRunStepResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveByTestStep");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testStepId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveByTestStepResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveForOwner");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveForOwnerResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveNew");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "creationDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncident"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveNewResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrievePriorities");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentPriority"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrievePrioritiesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentPriority"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "incidentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveCommentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveSeverities");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentSeverity"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveSeveritiesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentSeverity"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveStatuses");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentStatus"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveStatusesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentStatus"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveTypes");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentType"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveTypesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveWorkflowFields");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "currentTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "currentStatusId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteWorkflowIncidentFields"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveWorkflowFieldsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentFields"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveWorkflowTransitions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "currentTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "currentStatusId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "isDetector"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "isOwner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteWorkflowIncidentTransition"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveWorkflowTransitionsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentTransition"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveWorkflowCustomProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "currentTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "currentStatusId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteWorkflowIncidentCustomProperties"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveWorkflowCustomPropertiesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentCustomProperties"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteIncident"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "incidentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveDefaultStatus");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentStatus"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveDefaultStatusResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Incident_RetrieveDefaultType");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveDefaultTypeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Project_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteProject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "existingProjectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Project_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Project_Retrieve");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteProject"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Project_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Project_RetrieveUserMembership");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteProjectUser"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_RetrieveUserMembershipResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectUser"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Project_RefreshProgressExecutionStatusCaches");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "runInBackground"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProjectRole_Retrieve");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteProjectRole"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "ProjectRole_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectRole"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_AddTestMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteReleaseTestCaseMapping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteReleaseTestCaseMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_AddTestMapping2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteReleaseTestCaseMappings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteReleaseTestCaseMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteReleaseTestCaseMapping"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_Count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_CountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteRelease"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parentReleaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_RemoveTestMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteReleaseTestCaseMapping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteReleaseTestCaseMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "activeOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), java.lang.Boolean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRelease"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_Retrieve2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRelease"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Retrieve2Result"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteRelease"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_Move");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "destinationReleaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_RetrieveComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "ReleaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RetrieveCommentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_RetrieveTestMapping");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteReleaseTestCaseMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RetrieveTestMappingResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteReleaseTestCaseMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Release_CreateComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_CreateCommentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_AddTestCoverage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteReqTestCaseMapping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirementTestCaseMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_CountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Create1");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteRequirement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "indentPosition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Create1Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Create2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteRequirement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parentRequirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Create2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_RemoveTestCoverage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteReqTestCaseMapping"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirementTestCaseMapping"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRequirement"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "requirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_RetrieveForOwner");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRequirement"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveForOwnerResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_RetrieveTestCoverage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "requirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRequirementTestCaseMapping"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveTestCoverageResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirementTestCaseMapping"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteRequirement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "requirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Move");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "requirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "destinationRequirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Indent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "requirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_Outdent");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "requirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_RetrieveComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "RequirementId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveCommentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Requirement_CreateComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_CreateCommentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("System_GetProductVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteVersion"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteVersion.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetProductVersionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("System_GetSettings");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteSetting"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetSettingsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSetting"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("System_GetArtifactUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "navigationLinkId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "tabName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetArtifactUrlResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("System_GetProjectIdForArtifact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactTypeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "artifactId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(java.lang.Integer.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetProjectIdForArtifactResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTask"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "taskId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_RetrieveForOwner");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTask"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveForOwnerResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_RetrieveNew");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "creationDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTask"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveNewResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTask"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_Count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_CountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_Delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "taskId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_RetrieveComments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TaskId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveCommentsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Task_CreateComment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteComment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_CreateCommentResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_AddParameter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestCaseParameter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCaseParameter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCaseParameter"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_AddParameterResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_Count");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CountResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_Create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestCase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parentTestFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CreateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[183] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_CreateFolder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteTestCase"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parentTestFolderId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CreateFolderResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage"), 
                      true
                     ));
        _operations[184] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_CreateParameterToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "parameterName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CreateParameterTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[185] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_Retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[186] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCaseParameter"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveParametersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCaseParameter"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[187] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveStepParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testStepId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestStepParameter"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveStepParametersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStepParameter"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[188] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testCaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveByIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[189] = oper;

    }

    private static void _initOperationDesc20(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveByReleaseId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "releaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "remoteFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter"), org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "startingRow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "numberOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveByReleaseIdResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[190] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveByTestSetId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "testSetId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveByTestSetIdResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[191] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TestCase_RetrieveForOwner");
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCase"));
        oper.setReturnClass(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveForOwnerResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"),
                      "org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage"), 
                      true
                     ));
        _operations[192] = oper;

    }

    public BasicHttpBinding_IImportExportStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_IImportExportStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_IImportExportStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteArtifactCustomProperty");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifactCustomProperty");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifactCustomProperty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAssociation");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAssociation");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAssociation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomatedTestRun");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomationEngine");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteAutomationHost");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteBuild");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteBuildSourceCode");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuildSourceCode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuildSourceCode");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuildSourceCode");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteComment");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteCustomList");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteCustomListValue");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomListValue");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomListValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteCustomProperty");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteCustomPropertyOption");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomPropertyOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomPropertyOption");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomPropertyOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDataMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocument");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocumentFolder");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocumentType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentType");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteDocumentVersion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteFilter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncident");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentPriority");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentPriority");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentPriority");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentSeverity");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentSeverity");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentSeverity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentStatus");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentStatus");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentStatus");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteIncidentType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteManualTestRun");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteProject");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteProjectRole");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectRole");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectRole");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteProjectUser");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectUser");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectUser");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRelease");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteReleaseTestCaseMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteReleaseTestCaseMapping");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteReleaseTestCaseMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRequirement");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteRequirementTestCaseMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirementTestCaseMapping");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirementTestCaseMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteSetting");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSetting");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSetting");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTask");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCase");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestCaseParameter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCaseParameter");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCaseParameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestRun");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRun");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRun");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestRunStep");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRunStep");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRunStep");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSet");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSetTestCaseMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestSetTestCaseParameter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseParameter");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseParameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestStep");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteTestStepParameter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStepParameter");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStepParameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteWorkflowIncidentCustomProperties");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentCustomProperties");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentCustomProperties");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteWorkflowIncidentFields");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentFields");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentFields");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "ArrayOfRemoteWorkflowIncidentTransition");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentTransition");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentTransition");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "DateRange");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "MultiValueFilter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.MultiValueFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifact");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteArtifactCustomProperty");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteArtifactCustomProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAssociation");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomatedTestRun");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationEngine");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteAutomationHost");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuild");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteBuildSourceCode");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuildSourceCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteComment");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomList");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomListValue");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomProperty");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteCustomPropertyOption");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomPropertyOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDataMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocument");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentFolder");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteDocumentVersion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteFilter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncident");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentPriority");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentSeverity");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentStatus");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteIncidentType");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteManualTestRun");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProject");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectRole");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteProjectUser");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRelease");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteReleaseTestCaseMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirement");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteRequirementTestCaseMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSetting");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteSort");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTask");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCase");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestCaseParameter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRun");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestRunStep");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRunStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSet");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseMapping");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestSetTestCaseParameter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStep");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteTestStepParameter");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteUser");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteVersion");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentCustomProperties");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentFields");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects", "RemoteWorkflowIncidentTransition");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ArrayOfValidationFaultMessageItem");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessageItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessageItem");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessageItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ServiceFaultMessage");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessage");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0", "ValidationFaultMessageItem");
            cachedSerQNames.add(qName);
            cls = org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessageItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.Boolean connection_Authenticate(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IService/Connection_Authenticate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Connection_Authenticate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean connection_Authenticate2(java.lang.String userName, java.lang.String password, java.lang.String plugInName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IService/Connection_Authenticate2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Connection_Authenticate2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, plugInName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean connection_ConnectToProject(java.lang.Integer projectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IService/Connection_ConnectToProject");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Connection_ConnectToProject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void connection_Disconnect() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IService/Connection_Disconnect");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Connection_Disconnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String system_GetProductName() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IService/System_GetProductName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetProductName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.util.Calendar system_GetServerDateTime() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IService/System_GetServerDateTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetServerDateTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Calendar) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Calendar) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Calendar.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String system_GetWebServerUrl() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IService/System_GetWebServerUrl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetWebServerUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveByFolder(java.lang.Integer testCaseFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveByFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveByFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseFolderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testCase_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase remoteTestCase) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestCase});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testCase_Delete(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testCase_Move(java.lang.Integer testCaseId, java.lang.Integer destinationTestCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_Move");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_Move"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId, destinationTestCaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testCase_MoveStep(java.lang.Integer testCaseId, java.lang.Integer sourceTestStepId, java.lang.Integer destinationTestStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_MoveStep");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_MoveStep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId, sourceTestStepId, destinationTestStepId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testCase_DeleteStep(java.lang.Integer testCaseId, java.lang.Integer testStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_DeleteStep");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_DeleteStep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId, testStepId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep testCase_AddStep(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep remoteTestStep, java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_AddStep");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_AddStep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestStep, testCaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStep.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Integer testCase_AddLink(java.lang.Integer testCaseId, java.lang.Integer position, java.lang.Integer linkedTestCaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[] parameters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_AddLink");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_AddLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId, position, linkedTestCaseId, parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Integer) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testCase_AddUpdateAutomationScript(java.lang.Integer testCaseId, java.lang.Integer automationEngineId, java.lang.String urlOrFilename, java.lang.String description, byte[] binaryData, java.lang.String version, java.lang.Integer projectAttachmentTypeId, java.lang.Integer projectAttachmentFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_AddUpdateAutomationScript");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_AddUpdateAutomationScript"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId, automationEngineId, urlOrFilename, description, binaryData, version, projectAttachmentTypeId, projectAttachmentFolderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] testCase_RetrieveComments(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveComments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long testCase_CountForFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer parentID) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_CountForFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CountForFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, parentID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment testCase_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_CreateComment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CreateComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_CreateFromTestCases(int[] testCaseIds, java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_CreateFromTestCases");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateFromTestCases"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseIds, releaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long testRun_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_Count");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_Count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_CreateFromTestSet(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_CreateFromTestSet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateFromTestSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_CreateForAutomationHost(java.lang.String automationHostToken, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.DateRange dateRange) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_CreateForAutomationHost");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateForAutomationHost"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {automationHostToken, dateRange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_CreateForAutomatedTestSet(java.lang.Integer testSetId, java.lang.String automationHostToken) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_CreateForAutomatedTestSet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_CreateForAutomatedTestSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId, automationHostToken});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun testRun_RecordAutomated1(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun remoteTestRun) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RecordAutomated1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RecordAutomated1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestRun});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Integer testRun_RecordAutomated2(java.lang.String userName, java.lang.String password, java.lang.Integer projectId, java.lang.Integer testerUserId, java.lang.Integer testCaseId, java.lang.Integer releaseId, java.lang.Integer testSetId, java.lang.Integer testSetTestCaseId, java.lang.Integer buildId, java.util.Calendar startDate, java.util.Calendar endDate, java.lang.Integer executionStatusId, java.lang.String runnerName, java.lang.String runnerTestName, java.lang.Integer runnerAssertCount, java.lang.String runnerMessage, java.lang.String runnerStackTrace, java.lang.Integer testRunFormatId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RecordAutomated2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RecordAutomated2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName, password, projectId, testerUserId, testCaseId, releaseId, testSetId, testSetTestCaseId, buildId, startDate, endDate, executionStatusId, runnerName, runnerTestName, runnerAssertCount, runnerMessage, runnerStackTrace, testRunFormatId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Integer) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_RecordAutomated3(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] remoteTestRuns) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RecordAutomated3");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RecordAutomated3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestRuns});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun[] testRun_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, remoteSort, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_RetrieveManual(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RetrieveManual");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveManual"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, remoteSort, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[] testRun_RetrieveAutomated(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RetrieveAutomated");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveAutomated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, remoteSort, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun testRun_RetrieveById(java.lang.Integer testRunId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestRun.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun testRun_RetrieveAutomatedById(java.lang.Integer testRunId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RetrieveAutomatedById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveAutomatedById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomatedTestRun.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun testRun_RetrieveManualById(java.lang.Integer testRunId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_RetrieveManualById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_RetrieveManualById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] testRun_Save(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[] remoteTestRuns, java.util.Calendar endDate) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestRun_Save");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestRun_Save"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestRuns, endDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteManualTestRun[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[] testSet_AddTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping remoteTestSetTestCaseMapping, java.lang.Integer existingTestSetTestCaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseParameter[] parameters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_AddTestMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_AddTestMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestSetTestCaseMapping, existingTestSetTestCaseId, parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet testSet_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet remoteTestSet, java.lang.Integer parentTestSetFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestSet, parentTestSetFolderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long testSet_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_Count");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_Count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet testSet_CreateFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet remoteTestSet, java.lang.Integer parentTestSetFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_CreateFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_CreateFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestSet, parentTestSetFolderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testSet_RemoveTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping remoteTestSetTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_RemoveTestMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RemoveTestMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestSetTestCaseMapping});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[] testSet_RetrieveTestCaseMapping(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_RetrieveTestCaseMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveTestCaseMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSetTestCaseMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[] testSet_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet testSet_RetrieveById(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[] testSet_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_RetrieveForOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveForOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testSet_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestSet remoteTestSet) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestSet});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testSet_Delete(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void testSet_Move(java.lang.Integer testSetId, java.lang.Integer destinationTestSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_Move");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_Move"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId, destinationTestSetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] testSet_RetrieveComments(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_RetrieveComments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_RetrieveComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment testSet_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestSet_CreateComment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestSet_CreateComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser user_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser remoteUser, java.lang.String password, java.lang.String passwordQuestion, java.lang.String passwordAnswer, java.lang.Integer projectRoleId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/User_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "User_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteUser, password, passwordQuestion, passwordAnswer, projectRoleId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser user_RetrieveById(java.lang.Integer userId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/User_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "User_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser user_RetrieveByUserName(java.lang.String userName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/User_RetrieveByUserName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "User_RetrieveByUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteUser.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void user_Delete(java.lang.Integer userId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/User_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "User_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost[] automationHost_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationHost_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, remoteSort, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost automationHost_RetrieveById(java.lang.Integer automationHostId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationHost_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {automationHostId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost automationHost_RetrieveByToken(java.lang.String token) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationHost_RetrieveByToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_RetrieveByToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost automationHost_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost remoteAutomationHost) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationHost_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteAutomationHost});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void automationHost_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationHost remoteAutomationHost) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationHost_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteAutomationHost});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void automationHost_Delete(java.lang.Integer automationHostId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationHost_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationHost_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {automationHostId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine automationEngine_RetrieveByToken(java.lang.String token) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationEngine_RetrieveByToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_RetrieveByToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine[] automationEngine_Retrieve(java.lang.Boolean activeOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationEngine_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activeOnly});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine automationEngine_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine remoteEngine) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationEngine_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteEngine});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine automationEngine_RetrieveById(java.lang.Integer automationEngineId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/AutomationEngine_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "AutomationEngine_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {automationEngineId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAutomationEngine.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild[] build_RetrieveByReleaseId(java.lang.Integer releaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Build_RetrieveByReleaseId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Build_RetrieveByReleaseId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId, remoteFilters, remoteSort, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild build_RetrieveById(java.lang.Integer releaseId, java.lang.Integer buildId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Build_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Build_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId, buildId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild build_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild remoteBuild) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Build_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Build_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteBuild});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteBuild.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty[] customProperty_RetrieveForArtifactType(java.lang.Integer artifactTypeId, java.lang.Boolean includeDeleted) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_RetrieveForArtifactType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_RetrieveForArtifactType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifactTypeId, includeDeleted});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList customProperty_AddCustomList(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList remoteCustomList) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_AddCustomList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_AddCustomList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteCustomList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue customProperty_AddCustomListValue(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue remoteCustomListValue) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_AddCustomListValue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_AddCustomListValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteCustomListValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomListValue.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty customProperty_AddDefinition(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty remoteCustomProperty, java.lang.Integer customListId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_AddDefinition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_AddDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteCustomProperty, customListId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customProperty_UpdateDefinition(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomProperty remoteCustomProperty) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_UpdateDefinition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_UpdateDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteCustomProperty});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customProperty_DeleteDefinition(java.lang.Integer customPropertyId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_DeleteDefinition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_DeleteDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customPropertyId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList customProperty_RetrieveCustomListById(java.lang.Integer customListId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_RetrieveCustomListById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_RetrieveCustomListById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customListId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList[] customProperty_RetrieveCustomLists() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_RetrieveCustomLists");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_RetrieveCustomLists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void customProperty_UpdateCustomList(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteCustomList remoteCustomList) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/CustomProperty_UpdateCustomList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "CustomProperty_UpdateCustomList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteCustomList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void dataMapping_AddArtifactMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] remoteDataMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_AddArtifactMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_AddArtifactMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId, artifactTypeId, remoteDataMappings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void dataMapping_AddUserMappings(java.lang.Integer dataSyncSystemId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] remoteDataMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_AddUserMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_AddUserMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId, remoteDataMappings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void dataMapping_RemoveArtifactMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] remoteDataMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_RemoveArtifactMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RemoveArtifactMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId, artifactTypeId, remoteDataMappings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveArtifactMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_RetrieveArtifactMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveArtifactMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId, artifactTypeId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping dataMapping_RetrieveCustomPropertyMapping(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, java.lang.Integer customPropertyId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_RetrieveCustomPropertyMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveCustomPropertyMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId, artifactTypeId, customPropertyId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveCustomPropertyValueMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactTypeId, java.lang.Integer customPropertyId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_RetrieveCustomPropertyValueMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveCustomPropertyValueMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId, artifactTypeId, customPropertyId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveFieldValueMappings(java.lang.Integer dataSyncSystemId, java.lang.Integer artifactFieldId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_RetrieveFieldValueMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveFieldValueMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId, artifactFieldId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveProjectMappings(java.lang.Integer dataSyncSystemId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_RetrieveProjectMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveProjectMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[] dataMapping_RetrieveUserMappings(java.lang.Integer dataSyncSystemId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/DataMapping_RetrieveUserMappings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "DataMapping_RetrieveUserMappings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {dataSyncSystemId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDataMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] document_OpenFile(java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_OpenFile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_OpenFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attachmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument document_AddFile(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument remoteDocument, byte[] binaryData) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_AddFile");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteDocument, binaryData});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument document_AddUrl(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument remoteDocument) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_AddUrl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteDocument});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion document_AddFileVersion(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion remoteDocumentVersion, byte[] binaryData, java.lang.Boolean makeCurrent) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_AddFileVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddFileVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteDocumentVersion, binaryData, makeCurrent});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion document_AddUrlVersion(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion remoteDocumentVersion, java.lang.Boolean makeCurrent) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_AddUrlVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddUrlVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteDocumentVersion, makeCurrent});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentVersion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void document_DeleteFromArtifact(java.lang.Integer attachmentId, java.lang.Integer artifactTypeId, java.lang.Integer artifactId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_DeleteFromArtifact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_DeleteFromArtifact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attachmentId, artifactTypeId, artifactId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void document_Delete(java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attachmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[] document_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, remoteSort, startingRow, numberRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[] document_RetrieveForFolder(java.lang.Integer folderId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_RetrieveForFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveForFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {folderId, remoteFilters, remoteSort, startingRow, numberRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[] document_RetrieveForArtifact(java.lang.Integer artifactTypeId, java.lang.Integer artifactId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_RetrieveForArtifact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveForArtifact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifactTypeId, artifactId, remoteFilters, remoteSort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void document_AddToArtifactId(java.lang.Integer artifactTypeId, java.lang.Integer artifactId, java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_AddToArtifactId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddToArtifactId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifactTypeId, artifactId, attachmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument document_RetrieveById(java.lang.Integer attachmentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attachmentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocument.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType[] document_RetrieveTypes(java.lang.Boolean activeOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_RetrieveTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activeOnly});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder[] document_RetrieveFolders() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_RetrieveFolders");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveFolders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder document_RetrieveFolderById(java.lang.Integer folderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_RetrieveFolderById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_RetrieveFolderById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {folderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder document_AddFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder remoteDocumentFolder) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_AddFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_AddFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteDocumentFolder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void document_DeleteFolder(java.lang.Integer projectAttachmentFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_DeleteFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_DeleteFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectAttachmentFolderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void document_UpdateFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteDocumentFolder remoteDocumentFolder) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Document_UpdateFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Document_UpdateFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteDocumentFolder});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation association_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation remoteAssociation) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Association_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Association_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteAssociation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void association_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation remoteAssociation) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Association_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Association_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteAssociation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation[] association_RetrieveForArtifact(java.lang.Integer artifactTypeId, java.lang.Integer artifactId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Association_RetrieveForArtifact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Association_RetrieveForArtifact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifactTypeId, artifactId, remoteFilters, remoteSort});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteAssociation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority incident_AddPriority(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority remoteIncidentPriority) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_AddPriority");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddPriority"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteIncidentPriority});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long incident_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_Count");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_Count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] incident_AddComments(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] remoteComments) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_AddComments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteComments});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity incident_AddSeverity(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity remoteIncidentSeverity) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_AddSeverity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddSeverity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteIncidentSeverity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus incident_AddStatus(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus remoteIncidentStatus) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_AddStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteIncidentStatus});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType incident_AddType(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType remoteIncidentType) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_AddType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_AddType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteIncidentType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident incident_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident remoteIncident) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteIncident});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, remoteSort, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident incident_RetrieveById(java.lang.Integer incidentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {incidentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveByTestCase(java.lang.Integer testCaseId, java.lang.Boolean openOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveByTestCase");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveByTestCase"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId, openOnly});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveByTestRunStep(java.lang.Integer testRunStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveByTestRunStep");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveByTestRunStep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testRunStepId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveByTestStep(java.lang.Integer testStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveByTestStep");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveByTestStep"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testStepId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveForOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveForOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[] incident_RetrieveNew(java.util.Calendar creationDate, java.lang.Integer startRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveNew");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveNew"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creationDate, startRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority[] incident_RetrievePriorities() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrievePriorities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrievePriorities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentPriority[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] incident_RetrieveComments(java.lang.Integer incidentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveComments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {incidentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity[] incident_RetrieveSeverities() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveSeverities");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveSeverities"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentSeverity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus[] incident_RetrieveStatuses() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveStatuses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveStatuses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType[] incident_RetrieveTypes() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveTypes");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields[] incident_RetrieveWorkflowFields(java.lang.Integer currentTypeId, java.lang.Integer currentStatusId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveWorkflowFields");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveWorkflowFields"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {currentTypeId, currentStatusId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentFields[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition[] incident_RetrieveWorkflowTransitions(java.lang.Integer currentTypeId, java.lang.Integer currentStatusId, java.lang.Boolean isDetector, java.lang.Boolean isOwner) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveWorkflowTransitions");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveWorkflowTransitions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {currentTypeId, currentStatusId, isDetector, isOwner});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentTransition[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties[] incident_RetrieveWorkflowCustomProperties(java.lang.Integer currentTypeId, java.lang.Integer currentStatusId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveWorkflowCustomProperties");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveWorkflowCustomProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {currentTypeId, currentStatusId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteWorkflowIncidentCustomProperties[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void incident_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncident remoteIncident) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteIncident});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void incident_Delete(java.lang.Integer incidentId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {incidentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus incident_RetrieveDefaultStatus() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveDefaultStatus");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveDefaultStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType incident_RetrieveDefaultType() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Incident_RetrieveDefaultType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Incident_RetrieveDefaultType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteIncidentType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject project_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject remoteProject, java.lang.Integer existingProjectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Project_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteProject, existingProjectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void project_Delete(java.lang.Integer projectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Project_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject[] project_Retrieve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Project_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject project_RetrieveById(java.lang.Integer projectId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Project_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {projectId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProject.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser[] project_RetrieveUserMembership() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Project_RetrieveUserMembership");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_RetrieveUserMembership"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void project_RefreshProgressExecutionStatusCaches(java.lang.Integer releaseId, java.lang.Boolean runInBackground) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Project_RefreshProgressExecutionStatusCaches");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Project_RefreshProgressExecutionStatusCaches"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId, runInBackground});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole[] projectRole_Retrieve() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/ProjectRole_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "ProjectRole_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteProjectRole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void release_AddTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping remoteReleaseTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_AddTestMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_AddTestMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteReleaseTestCaseMapping});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void release_AddTestMapping2(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[] remoteReleaseTestCaseMappings) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_AddTestMapping2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_AddTestMapping2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteReleaseTestCaseMappings});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long release_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_Count");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease release_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease remoteRelease, java.lang.Integer parentReleaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteRelease, parentReleaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void release_RemoveTestMapping(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping remoteReleaseTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_RemoveTestMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RemoveTestMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteReleaseTestCaseMapping});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[] release_Retrieve(java.lang.Boolean activeOnly) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {activeOnly});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[] release_Retrieve2(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_Retrieve2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Retrieve2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease release_RetrieveById(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void release_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRelease remoteRelease) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteRelease});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void release_Delete(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void release_Move(java.lang.Integer releaseId, java.lang.Integer destinationReleaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_Move");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_Move"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId, destinationReleaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] release_RetrieveComments(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_RetrieveComments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RetrieveComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[] release_RetrieveTestMapping(java.lang.Integer releaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_RetrieveTestMapping");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_RetrieveTestMapping"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteReleaseTestCaseMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment release_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Release_CreateComment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Release_CreateComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void requirement_AddTestCoverage(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping remoteReqTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_AddTestCoverage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_AddTestCoverage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteReqTestCaseMapping});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long requirement_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Count");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement requirement_Create1(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement remoteRequirement, java.lang.Integer indentPosition) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Create1");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Create1"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteRequirement, indentPosition});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement requirement_Create2(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement remoteRequirement, java.lang.Integer parentRequirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Create2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Create2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteRequirement, parentRequirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void requirement_RemoveTestCoverage(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping remoteReqTestCaseMapping) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_RemoveTestCoverage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RemoveTestCoverage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteReqTestCaseMapping});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[] requirement_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement requirement_RetrieveById(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[] requirement_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_RetrieveForOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveForOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping[] requirement_RetrieveTestCoverage(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_RetrieveTestCoverage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveTestCoverage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirementTestCaseMapping[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void requirement_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteRequirement remoteRequirement) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteRequirement});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void requirement_Delete(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void requirement_Move(java.lang.Integer requirementId, java.lang.Integer destinationRequirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Move");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Move"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requirementId, destinationRequirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void requirement_Indent(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Indent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Indent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void requirement_Outdent(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_Outdent");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_Outdent"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] requirement_RetrieveComments(java.lang.Integer requirementId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_RetrieveComments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_RetrieveComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requirementId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment requirement_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Requirement_CreateComment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Requirement_CreateComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteVersion system_GetProductVersion() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/System_GetProductVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetProductVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteVersion) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteVersion) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteVersion.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting[] system_GetSettings() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/System_GetSettings");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSetting[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String system_GetArtifactUrl(java.lang.Integer navigationLinkId, java.lang.Integer projectId, java.lang.Integer artifactId, java.lang.String tabName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/System_GetArtifactUrl");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetArtifactUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {navigationLinkId, projectId, artifactId, tabName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Integer system_GetProjectIdForArtifact(java.lang.Integer artifactTypeId, java.lang.Integer artifactId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/System_GetProjectIdForArtifact");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "System_GetProjectIdForArtifact"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {artifactTypeId, artifactId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Integer) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask task_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask remoteTask) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTask});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[] task_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteSort remoteSort, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, remoteSort, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask task_RetrieveById(java.lang.Integer taskId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[] task_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_RetrieveForOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveForOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[] task_RetrieveNew(java.util.Calendar creationDate, java.lang.Integer startRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_RetrieveNew");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveNew"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {creationDate, startRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void task_Update(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTask remoteTask) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTask});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long task_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_Count");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_Count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void task_Delete(java.lang.Integer taskId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_Delete");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_Delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[] task_RetrieveComments(java.lang.Integer taskId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_RetrieveComments");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_RetrieveComments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taskId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment task_CreateComment(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment remoteComment) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/Task_CreateComment");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "Task_CreateComment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteComment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteComment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter testCase_AddParameter(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter remoteTestCaseParameter) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_AddParameter");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_AddParameter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestCaseParameter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Long testCase_Count(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_Count");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_Count"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase testCase_Create(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase remoteTestCase, java.lang.Integer parentTestFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_Create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_Create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestCase, parentTestFolderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase testCase_CreateFolder(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase remoteTestCase, java.lang.Integer parentTestFolderId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[184]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_CreateFolder");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CreateFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteTestCase, parentTestFolderId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ValidationFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String testCase_CreateParameterToken(java.lang.String parameterName) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[185]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_CreateParameterToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_CreateParameterToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameterName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_Retrieve(org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[186]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_Retrieve");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_Retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {remoteFilters, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter[] testCase_RetrieveParameters(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[187]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveParameters");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveParameters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCaseParameter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[] testCase_RetrieveStepParameters(java.lang.Integer testCaseId, java.lang.Integer testStepId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[188]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveStepParameters");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveStepParameters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId, testStepId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestStepParameter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase testCase_RetrieveById(java.lang.Integer testCaseId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[189]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveById");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testCaseId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveByReleaseId(java.lang.Integer releaseId, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteFilter[] remoteFilters, java.lang.Integer startingRow, java.lang.Integer numberOfRows) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[190]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveByReleaseId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveByReleaseId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {releaseId, remoteFilters, startingRow, numberOfRows});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveByTestSetId(java.lang.Integer testSetId) throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[191]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveByTestSetId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveByTestSetId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testSetId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[] testCase_RetrieveForOwner() throws java.rmi.RemoteException, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[192]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.inflectra.com/SpiraTest/Services/v4.0/IImportExport/TestCase_RetrieveForOwner");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.inflectra.com/SpiraTest/Services/v4.0/", "TestCase_RetrieveForOwner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0_DataObjects.RemoteTestCase[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) {
              throw (org.datacontract.schemas._2004._07.Inflectra_SpiraTest_Web_Services_v4_0.ServiceFaultMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
