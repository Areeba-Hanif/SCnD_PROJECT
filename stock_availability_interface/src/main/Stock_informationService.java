/**
 * Stock_informationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface Stock_informationService extends javax.xml.rpc.Service {
    public java.lang.String getstock_informationAddress();

    public main.Stock_information getstock_information() throws javax.xml.rpc.ServiceException;

    public main.Stock_information getstock_information(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
