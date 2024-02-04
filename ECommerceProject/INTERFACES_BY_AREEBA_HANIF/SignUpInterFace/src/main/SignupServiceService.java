/**
 * SignupServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface SignupServiceService extends javax.xml.rpc.Service {
    public java.lang.String getSignupServiceAddress();

    public main.SignupService getSignupService() throws javax.xml.rpc.ServiceException;

    public main.SignupService getSignupService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
