/**
 * ListOfAllCustomersServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main_pkg;

public class ListOfAllCustomersServiceLocator extends org.apache.axis.client.Service implements main_pkg.ListOfAllCustomersService {

    public ListOfAllCustomersServiceLocator() {
    }


    public ListOfAllCustomersServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ListOfAllCustomersServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ListOfAllCustomers
    private java.lang.String ListOfAllCustomers_address = "http://localhost:8080/ECommerceWebsiteProject/services/ListOfAllCustomers";

    public java.lang.String getListOfAllCustomersAddress() {
        return ListOfAllCustomers_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ListOfAllCustomersWSDDServiceName = "ListOfAllCustomers";

    public java.lang.String getListOfAllCustomersWSDDServiceName() {
        return ListOfAllCustomersWSDDServiceName;
    }

    public void setListOfAllCustomersWSDDServiceName(java.lang.String name) {
        ListOfAllCustomersWSDDServiceName = name;
    }

    public main_pkg.ListOfAllCustomers getListOfAllCustomers() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ListOfAllCustomers_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getListOfAllCustomers(endpoint);
    }

    public main_pkg.ListOfAllCustomers getListOfAllCustomers(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main_pkg.ListOfAllCustomersSoapBindingStub _stub = new main_pkg.ListOfAllCustomersSoapBindingStub(portAddress, this);
            _stub.setPortName(getListOfAllCustomersWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setListOfAllCustomersEndpointAddress(java.lang.String address) {
        ListOfAllCustomers_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main_pkg.ListOfAllCustomers.class.isAssignableFrom(serviceEndpointInterface)) {
                main_pkg.ListOfAllCustomersSoapBindingStub _stub = new main_pkg.ListOfAllCustomersSoapBindingStub(new java.net.URL(ListOfAllCustomers_address), this);
                _stub.setPortName(getListOfAllCustomersWSDDServiceName());
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
        if ("ListOfAllCustomers".equals(inputPortName)) {
            return getListOfAllCustomers();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "ListOfAllCustomersService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "ListOfAllCustomers"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ListOfAllCustomers".equals(portName)) {
            setListOfAllCustomersEndpointAddress(address);
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
