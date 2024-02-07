/**
 * SearchCustomerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ecommerceWebsite;

public class SearchCustomerServiceLocator extends org.apache.axis.client.Service implements ecommerceWebsite.SearchCustomerService {

    public SearchCustomerServiceLocator() {
    }


    public SearchCustomerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchCustomerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchCustomer
    private java.lang.String SearchCustomer_address = "http://localhost:8080/Project_EcommerceWebsite/services/SearchCustomer";

    public java.lang.String getSearchCustomerAddress() {
        return SearchCustomer_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchCustomerWSDDServiceName = "SearchCustomer";

    public java.lang.String getSearchCustomerWSDDServiceName() {
        return SearchCustomerWSDDServiceName;
    }

    public void setSearchCustomerWSDDServiceName(java.lang.String name) {
        SearchCustomerWSDDServiceName = name;
    }

    public ecommerceWebsite.SearchCustomer getSearchCustomer() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchCustomer_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchCustomer(endpoint);
    }

    public ecommerceWebsite.SearchCustomer getSearchCustomer(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ecommerceWebsite.SearchCustomerSoapBindingStub _stub = new ecommerceWebsite.SearchCustomerSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchCustomerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchCustomerEndpointAddress(java.lang.String address) {
        SearchCustomer_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ecommerceWebsite.SearchCustomer.class.isAssignableFrom(serviceEndpointInterface)) {
                ecommerceWebsite.SearchCustomerSoapBindingStub _stub = new ecommerceWebsite.SearchCustomerSoapBindingStub(new java.net.URL(SearchCustomer_address), this);
                _stub.setPortName(getSearchCustomerWSDDServiceName());
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
        if ("SearchCustomer".equals(inputPortName)) {
            return getSearchCustomer();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ecommerceWebsite", "SearchCustomerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ecommerceWebsite", "SearchCustomer"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchCustomer".equals(portName)) {
            setSearchCustomerEndpointAddress(address);
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
