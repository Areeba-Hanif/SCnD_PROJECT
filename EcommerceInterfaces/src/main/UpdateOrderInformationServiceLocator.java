/**
 * UpdateOrderInformationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class UpdateOrderInformationServiceLocator extends org.apache.axis.client.Service implements main.UpdateOrderInformationService {

    public UpdateOrderInformationServiceLocator() {
    }


    public UpdateOrderInformationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UpdateOrderInformationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UpdateOrderInformation
    private java.lang.String UpdateOrderInformation_address = "http://localhost:8080/ECommerceWebsiteProject/services/UpdateOrderInformation";

    public java.lang.String getUpdateOrderInformationAddress() {
        return UpdateOrderInformation_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UpdateOrderInformationWSDDServiceName = "UpdateOrderInformation";

    public java.lang.String getUpdateOrderInformationWSDDServiceName() {
        return UpdateOrderInformationWSDDServiceName;
    }

    public void setUpdateOrderInformationWSDDServiceName(java.lang.String name) {
        UpdateOrderInformationWSDDServiceName = name;
    }

    public main.UpdateOrderInformation getUpdateOrderInformation() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UpdateOrderInformation_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUpdateOrderInformation(endpoint);
    }

    public main.UpdateOrderInformation getUpdateOrderInformation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.UpdateOrderInformationSoapBindingStub _stub = new main.UpdateOrderInformationSoapBindingStub(portAddress, this);
            _stub.setPortName(getUpdateOrderInformationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUpdateOrderInformationEndpointAddress(java.lang.String address) {
        UpdateOrderInformation_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.UpdateOrderInformation.class.isAssignableFrom(serviceEndpointInterface)) {
                main.UpdateOrderInformationSoapBindingStub _stub = new main.UpdateOrderInformationSoapBindingStub(new java.net.URL(UpdateOrderInformation_address), this);
                _stub.setPortName(getUpdateOrderInformationWSDDServiceName());
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
        if ("UpdateOrderInformation".equals(inputPortName)) {
            return getUpdateOrderInformation();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "UpdateOrderInformationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "UpdateOrderInformation"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UpdateOrderInformation".equals(portName)) {
            setUpdateOrderInformationEndpointAddress(address);
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
