/**
 * SignupServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class SignupServiceServiceLocator extends org.apache.axis.client.Service implements main.SignupServiceService {

    public SignupServiceServiceLocator() {
    }


    public SignupServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SignupServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SignupService
    private java.lang.String SignupService_address = "http://localhost:8080/ECommerceProject/services/SignupService";

    public java.lang.String getSignupServiceAddress() {
        return SignupService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SignupServiceWSDDServiceName = "SignupService";

    public java.lang.String getSignupServiceWSDDServiceName() {
        return SignupServiceWSDDServiceName;
    }

    public void setSignupServiceWSDDServiceName(java.lang.String name) {
        SignupServiceWSDDServiceName = name;
    }

    public main.SignupService getSignupService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SignupService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSignupService(endpoint);
    }

    public main.SignupService getSignupService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.SignupServiceSoapBindingStub _stub = new main.SignupServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSignupServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSignupServiceEndpointAddress(java.lang.String address) {
        SignupService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.SignupService.class.isAssignableFrom(serviceEndpointInterface)) {
                main.SignupServiceSoapBindingStub _stub = new main.SignupServiceSoapBindingStub(new java.net.URL(SignupService_address), this);
                _stub.setPortName(getSignupServiceWSDDServiceName());
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
        if ("SignupService".equals(inputPortName)) {
            return getSignupService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "SignupServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "SignupService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SignupService".equals(portName)) {
            setSignupServiceEndpointAddress(address);
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
