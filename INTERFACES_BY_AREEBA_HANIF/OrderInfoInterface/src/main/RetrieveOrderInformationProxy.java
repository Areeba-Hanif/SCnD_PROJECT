package main;

public class RetrieveOrderInformationProxy implements main.RetrieveOrderInformation {
  private String _endpoint = null;
  private main.RetrieveOrderInformation retrieveOrderInformation = null;
  
  public RetrieveOrderInformationProxy() {
    _initRetrieveOrderInformationProxy();
  }
  
  public RetrieveOrderInformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initRetrieveOrderInformationProxy();
  }
  
  private void _initRetrieveOrderInformationProxy() {
    try {
      retrieveOrderInformation = (new main.RetrieveOrderInformationServiceLocator()).getRetrieveOrderInformation();
      if (retrieveOrderInformation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)retrieveOrderInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)retrieveOrderInformation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (retrieveOrderInformation != null)
      ((javax.xml.rpc.Stub)retrieveOrderInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.RetrieveOrderInformation getRetrieveOrderInformation() {
    if (retrieveOrderInformation == null)
      _initRetrieveOrderInformationProxy();
    return retrieveOrderInformation;
  }
  
  public main.Order getOrderInformation(int orderId) throws java.rmi.RemoteException{
    if (retrieveOrderInformation == null)
      _initRetrieveOrderInformationProxy();
    return retrieveOrderInformation.getOrderInformation(orderId);
  }
  
  
}