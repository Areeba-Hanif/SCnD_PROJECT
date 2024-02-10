package main_pkg;

public class ListOfAllCustomersProxy implements main_pkg.ListOfAllCustomers {
  private String _endpoint = null;
  private main_pkg.ListOfAllCustomers listOfAllCustomers = null;
  
  public ListOfAllCustomersProxy() {
    _initListOfAllCustomersProxy();
  }
  
  public ListOfAllCustomersProxy(String endpoint) {
    _endpoint = endpoint;
    _initListOfAllCustomersProxy();
  }
  
  private void _initListOfAllCustomersProxy() {
    try {
      listOfAllCustomers = (new main_pkg.ListOfAllCustomersServiceLocator()).getListOfAllCustomers();
      if (listOfAllCustomers != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listOfAllCustomers)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listOfAllCustomers)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listOfAllCustomers != null)
      ((javax.xml.rpc.Stub)listOfAllCustomers)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main_pkg.ListOfAllCustomers getListOfAllCustomers() {
    if (listOfAllCustomers == null)
      _initListOfAllCustomersProxy();
    return listOfAllCustomers;
  }
  
  public void main(java.lang.String[] args) throws java.rmi.RemoteException{
    if (listOfAllCustomers == null)
      _initListOfAllCustomersProxy();
    listOfAllCustomers.main(args);
  }
  
  
}