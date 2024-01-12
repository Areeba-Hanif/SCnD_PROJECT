/**
 * InformationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface InformationService extends javax.xml.rpc.Service {
    public java.lang.String getinformationAddress();

    public main.Information getinformation() throws javax.xml.rpc.ServiceException;

    public main.Information getinformation(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
