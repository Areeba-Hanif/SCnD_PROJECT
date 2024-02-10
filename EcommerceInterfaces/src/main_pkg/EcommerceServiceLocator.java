/**
 * EcommerceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main_pkg;

public class EcommerceServiceLocator extends org.apache.axis.client.Service implements main_pkg.EcommerceService {

    public EcommerceServiceLocator() {
    }


    public EcommerceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EcommerceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Ecommerce
    private java.lang.String Ecommerce_address = "http://localhost:8080/ECommerceWebsiteProject/services/Ecommerce";

    public java.lang.String getEcommerceAddress() {
        return Ecommerce_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EcommerceWSDDServiceName = "Ecommerce";

    public java.lang.String getEcommerceWSDDServiceName() {
        return EcommerceWSDDServiceName;
    }

    public void setEcommerceWSDDServiceName(java.lang.String name) {
        EcommerceWSDDServiceName = name;
    }

    public main_pkg.Ecommerce getEcommerce() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Ecommerce_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEcommerce(endpoint);
    }

    public main_pkg.Ecommerce getEcommerce(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main_pkg.EcommerceSoapBindingStub _stub = new main_pkg.EcommerceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEcommerceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEcommerceEndpointAddress(java.lang.String address) {
        Ecommerce_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main_pkg.Ecommerce.class.isAssignableFrom(serviceEndpointInterface)) {
                main_pkg.EcommerceSoapBindingStub _stub = new main_pkg.EcommerceSoapBindingStub(new java.net.URL(Ecommerce_address), this);
                _stub.setPortName(getEcommerceWSDDServiceName());
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
        if ("Ecommerce".equals(inputPortName)) {
            return getEcommerce();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "EcommerceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "Ecommerce"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Ecommerce".equals(portName)) {
            setEcommerceEndpointAddress(address);
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
