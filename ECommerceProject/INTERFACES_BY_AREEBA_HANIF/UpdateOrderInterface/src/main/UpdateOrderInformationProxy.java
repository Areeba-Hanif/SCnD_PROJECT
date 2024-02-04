package main;

public class UpdateOrderInformationProxy implements main.UpdateOrderInformation {
  private String _endpoint = null;
  private main.UpdateOrderInformation updateOrderInformation = null;
  
  public UpdateOrderInformationProxy() {
    _initUpdateOrderInformationProxy();
  }
  
  public UpdateOrderInformationProxy(String endpoint) {
    _endpoint = endpoint;
    _initUpdateOrderInformationProxy();
  }
  
  private void _initUpdateOrderInformationProxy() {
    try {
      updateOrderInformation = (new main.UpdateOrderInformationServiceLocator()).getUpdateOrderInformation();
      if (updateOrderInformation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)updateOrderInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)updateOrderInformation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (updateOrderInformation != null)
      ((javax.xml.rpc.Stub)updateOrderInformation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.UpdateOrderInformation getUpdateOrderInformation() {
    if (updateOrderInformation == null)
      _initUpdateOrderInformationProxy();
    return updateOrderInformation;
  }
  
  public java.lang.String updateOrder(int orderId, java.lang.String newOrderDate, java.lang.String newTotalAmount, java.lang.String newOrderStatus) throws java.rmi.RemoteException{
    if (updateOrderInformation == null)
      _initUpdateOrderInformationProxy();
    return updateOrderInformation.updateOrder(orderId, newOrderDate, newTotalAmount, newOrderStatus);
  }
  
  
}