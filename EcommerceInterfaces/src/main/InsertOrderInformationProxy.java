package main;

public class InsertOrderInformationProxy implements main.InsertOrderInformation {
  private String _endpoint = null;
  private main.InsertOrderInformation insertOrderInformation = null;
  
  public InsertOrderInformationProxy() {
    _initInsertOrderInformationProxy();
  }
  
  public InsertOrderInformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initInsertOrderInformationProxy();
  }
  
  private void _initInsertOrderInformationProxy() {
    try {
      insertOrderInformation = (new main.InsertOrderInformationServiceLocator()).getInsertOrderInformation();
      if (insertOrderInformation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)insertOrderInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)insertOrderInformation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (insertOrderInformation != null)
      ((javax.xml.rpc.Stub)insertOrderInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.InsertOrderInformation getInsertOrderInformation() {
    if (insertOrderInformation == null)
      _initInsertOrderInformationProxy();
    return insertOrderInformation;
  }
  
  public java.lang.String setOrderInformation(java.lang.String orderDate, java.lang.String totalAmount, java.lang.String orderStatus) throws java.rmi.RemoteException{
    if (insertOrderInformation == null)
      _initInsertOrderInformationProxy();
    return insertOrderInformation.setOrderInformation(orderDate, totalAmount, orderStatus);
  }
  
  
}