package main;

public class ViewAllOrdersProxy implements main.ViewAllOrders {
  private String _endpoint = null;
  private main.ViewAllOrders viewAllOrders = null;
  
  public ViewAllOrdersProxy() {
    _initViewAllOrdersProxy();
  }
  
  public ViewAllOrdersProxy(String endpoint) {
    _endpoint = endpoint;
    _initViewAllOrdersProxy();
  }
  
  private void _initViewAllOrdersProxy() {
    try {
      viewAllOrders = (new main.ViewAllOrdersServiceLocator()).getViewAllOrders();
      if (viewAllOrders != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)viewAllOrders)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)viewAllOrders)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (viewAllOrders != null)
      ((javax.xml.rpc.Stub)viewAllOrders)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.ViewAllOrders getViewAllOrders() {
    if (viewAllOrders == null)
      _initViewAllOrdersProxy();
    return viewAllOrders;
  }
  
  public main.Order[] getOrders() throws java.rmi.RemoteException{
    if (viewAllOrders == null)
      _initViewAllOrdersProxy();
    return viewAllOrders.getOrders();
  }
  
  
}