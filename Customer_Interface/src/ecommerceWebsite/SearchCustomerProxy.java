package ecommerceWebsite;

public class SearchCustomerProxy implements ecommerceWebsite.SearchCustomer {
  private String _endpoint = null;
  private ecommerceWebsite.SearchCustomer searchCustomer = null;
  
  public SearchCustomerProxy() {
    _initSearchCustomerProxy();
  }
  
  public SearchCustomerProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchCustomerProxy();
  }
  
  private void _initSearchCustomerProxy() {
    try {
      searchCustomer = (new ecommerceWebsite.SearchCustomerServiceLocator()).getSearchCustomer();
      if (searchCustomer != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchCustomer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchCustomer)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchCustomer != null)
      ((javax.xml.rpc.Stub)searchCustomer)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ecommerceWebsite.SearchCustomer getSearchCustomer() {
    if (searchCustomer == null)
      _initSearchCustomerProxy();
    return searchCustomer;
  }
  
  public java.lang.String searchCustomerInfo(java.lang.String customerID) throws java.rmi.RemoteException{
    if (searchCustomer == null)
      _initSearchCustomerProxy();
    return searchCustomer.searchCustomerInfo(customerID);
  }
  
  
}