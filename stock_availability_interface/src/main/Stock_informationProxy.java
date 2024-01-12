package main;

public class Stock_informationProxy implements main.Stock_information {
  private String _endpoint = null;
  private main.Stock_information stock_information = null;
  
  public Stock_informationProxy() {
    _initStock_informationProxy();
  }
  
  public Stock_informationProxy(String endpoint) {
    _endpoint = endpoint;
    _initStock_informationProxy();
  }
  
  private void _initStock_informationProxy() {
    try {
      stock_information = (new main.Stock_informationServiceLocator()).getstock_information();
      if (stock_information != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stock_information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stock_information)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stock_information != null)
      ((javax.xml.rpc.Stub)stock_information)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Stock_information getStock_information() {
    if (stock_information == null)
      _initStock_informationProxy();
    return stock_information;
  }
  
  public java.lang.String getStockInformation(java.lang.String productName) throws java.rmi.RemoteException{
    if (stock_information == null)
      _initStock_informationProxy();
    return stock_information.getStockInformation(productName);
  }
  
  
}