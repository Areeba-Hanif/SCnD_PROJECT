/**
 * InformationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class InformationServiceLocator extends org.apache.axis.client.Service implements main.InformationService {

    public InformationServiceLocator() {
    }


    public InformationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public InformationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for information
    private java.lang.String information_address = "http://localhost:8080/ecommerce_wepsite/services/information";

    public java.lang.String getinformationAddress() {
        return information_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String informationWSDDServiceName = "information";

    public java.lang.String getinformationWSDDServiceName() {
        return informationWSDDServiceName;
    }

    public void setinformationWSDDServiceName(java.lang.String name) {
        informationWSDDServiceName = name;
    }

    public main.Information getinformation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(information_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getinformation(endpoint);
    }

    public main.Information getinformation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.InformationSoapBindingStub _stub = new main.InformationSoapBindingStub(portAddress, this);
            _stub.setPortName(getinformationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setinformationEndpointAddress(java.lang.String address) {
        information_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Information.class.isAssignableFrom(serviceEndpointInterface)) {
                main.InformationSoapBindingStub _stub = new main.InformationSoapBindingStub(new java.net.URL(information_address), this);
                _stub.setPortName(getinformationWSDDServiceName());
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
        if ("information".equals(inputPortName)) {
            return getinformation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "informationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "information"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("information".equals(portName)) {
            setinformationEndpointAddress(address);
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
