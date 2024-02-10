package main;

public class StockInfoProxy implements main.StockInfo {
  private String _endpoint = null;
  private main.StockInfo stockInfo = null;
  
  public StockInfoProxy() {
    _initStockInfoProxy();
  }
  
  public StockInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initStockInfoProxy();
  }
  
  private void _initStockInfoProxy() {
    try {
      stockInfo = (new main.StockInfoServiceLocator()).getStockInfo();
      if (stockInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stockInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stockInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stockInfo != null)
      ((javax.xml.rpc.Stub)stockInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.StockInfo getStockInfo() {
    if (stockInfo == null)
      _initStockInfoProxy();
    return stockInfo;
  }
  
  public java.lang.String getStockInformation(java.lang.String in0) throws java.rmi.RemoteException{
    if (stockInfo == null)
      _initStockInfoProxy();
    return stockInfo.getStockInformation(in0);
  }
  
  
}