/**
 * StockInfoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class StockInfoServiceLocator extends org.apache.axis.client.Service implements main.StockInfoService {

    public StockInfoServiceLocator() {
    }


    public StockInfoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StockInfoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StockInfo
    private java.lang.String StockInfo_address = "http://localhost:8080/ECommerceWebsiteProject/services/StockInfo";

    public java.lang.String getStockInfoAddress() {
        return StockInfo_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StockInfoWSDDServiceName = "StockInfo";

    public java.lang.String getStockInfoWSDDServiceName() {
        return StockInfoWSDDServiceName;
    }

    public void setStockInfoWSDDServiceName(java.lang.String name) {
        StockInfoWSDDServiceName = name;
    }

    public main.StockInfo getStockInfo() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StockInfo_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStockInfo(endpoint);
    }

    public main.StockInfo getStockInfo(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.StockInfoSoapBindingStub _stub = new main.StockInfoSoapBindingStub(portAddress, this);
            _stub.setPortName(getStockInfoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStockInfoEndpointAddress(java.lang.String address) {
        StockInfo_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.StockInfo.class.isAssignableFrom(serviceEndpointInterface)) {
                main.StockInfoSoapBindingStub _stub = new main.StockInfoSoapBindingStub(new java.net.URL(StockInfo_address), this);
                _stub.setPortName(getStockInfoWSDDServiceName());
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
        if ("StockInfo".equals(inputPortName)) {
            return getStockInfo();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "StockInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "StockInfo"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StockInfo".equals(portName)) {
            setStockInfoEndpointAddress(address);
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
