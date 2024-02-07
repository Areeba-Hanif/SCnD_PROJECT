/**
 * ViewAllOrdersServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class ViewAllOrdersServiceLocator extends org.apache.axis.client.Service implements main.ViewAllOrdersService {

    public ViewAllOrdersServiceLocator() {
    }


    public ViewAllOrdersServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ViewAllOrdersServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ViewAllOrders
    private java.lang.String ViewAllOrders_address = "http://localhost:8080/ECommerceProject/services/ViewAllOrders";

    public java.lang.String getViewAllOrdersAddress() {
        return ViewAllOrders_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ViewAllOrdersWSDDServiceName = "ViewAllOrders";

    public java.lang.String getViewAllOrdersWSDDServiceName() {
        return ViewAllOrdersWSDDServiceName;
    }

    public void setViewAllOrdersWSDDServiceName(java.lang.String name) {
        ViewAllOrdersWSDDServiceName = name;
    }

    public main.ViewAllOrders getViewAllOrders() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ViewAllOrders_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getViewAllOrders(endpoint);
    }

    public main.ViewAllOrders getViewAllOrders(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.ViewAllOrdersSoapBindingStub _stub = new main.ViewAllOrdersSoapBindingStub(portAddress, this);
            _stub.setPortName(getViewAllOrdersWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setViewAllOrdersEndpointAddress(java.lang.String address) {
        ViewAllOrders_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.ViewAllOrders.class.isAssignableFrom(serviceEndpointInterface)) {
                main.ViewAllOrdersSoapBindingStub _stub = new main.ViewAllOrdersSoapBindingStub(new java.net.URL(ViewAllOrders_address), this);
                _stub.setPortName(getViewAllOrdersWSDDServiceName());
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
        if ("ViewAllOrders".equals(inputPortName)) {
            return getViewAllOrders();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "ViewAllOrdersService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "ViewAllOrders"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ViewAllOrders".equals(portName)) {
            setViewAllOrdersEndpointAddress(address);
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
