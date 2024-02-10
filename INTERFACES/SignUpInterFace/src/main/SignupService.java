/**
 * SignupService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface SignupService extends java.rmi.Remote {
    public boolean signUp(java.lang.String username, java.lang.String password, java.lang.String email) throws java.rmi.RemoteException;
}
