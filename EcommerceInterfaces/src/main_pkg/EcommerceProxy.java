package main_pkg;

public class EcommerceProxy implements main_pkg.Ecommerce {
  private String _endpoint = null;
  private main_pkg.Ecommerce ecommerce = null;
  
  public EcommerceProxy() {
    _initEcommerceProxy();
  }
  
  public EcommerceProxy(String endpoint) {
    _endpoint = endpoint;
    _initEcommerceProxy();
  }
  
  private void _initEcommerceProxy() {
    try {
      ecommerce = (new main_pkg.EcommerceServiceLocator()).getEcommerce();
      if (ecommerce != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ecommerce)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ecommerce)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ecommerce != null)
      ((javax.xml.rpc.Stub)ecommerce)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main_pkg.Ecommerce getEcommerce() {
    if (ecommerce == null)
      _initEcommerceProxy();
    return ecommerce;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (ecommerce == null)
      _initEcommerceProxy();
    ecommerce.main(args);
  }
  
  
}