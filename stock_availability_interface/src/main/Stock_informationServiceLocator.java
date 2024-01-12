/**
 * Stock_informationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class Stock_informationServiceLocator extends org.apache.axis.client.Service implements main.Stock_informationService {

    public Stock_informationServiceLocator() {
    }


    public Stock_informationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Stock_informationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for stock_information
    private java.lang.String stock_information_address = "http://localhost:8080/Ecommerce/services/stock_information";

    public java.lang.String getstock_informationAddress() {
        return stock_information_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String stock_informationWSDDServiceName = "stock_information";

    public java.lang.String getstock_informationWSDDServiceName() {
        return stock_informationWSDDServiceName;
    }

    public void setstock_informationWSDDServiceName(java.lang.String name) {
        stock_informationWSDDServiceName = name;
    }

    public main.Stock_information getstock_information() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(stock_information_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getstock_information(endpoint);
    }

    public main.Stock_information getstock_information(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.Stock_informationSoapBindingStub _stub = new main.Stock_informationSoapBindingStub(portAddress, this);
            _stub.setPortName(getstock_informationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setstock_informationEndpointAddress(java.lang.String address) {
        stock_information_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Stock_information.class.isAssignableFrom(serviceEndpointInterface)) {
                main.Stock_informationSoapBindingStub _stub = new main.Stock_informationSoapBindingStub(new java.net.URL(stock_information_address), this);
                _stub.setPortName(getstock_informationWSDDServiceName());
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
        if ("stock_information".equals(inputPortName)) {
            return getstock_information();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "stock_informationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "stock_information"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("stock_information".equals(portName)) {
            setstock_informationEndpointAddress(address);
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
