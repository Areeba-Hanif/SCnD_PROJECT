package main;

public class SignupServiceProxy implements main.SignupService {
  private String _endpoint = null;
  private main.SignupService signupService = null;
  
  public SignupServiceProxy() {
    _initSignupServiceProxy();
  }
  
  public SignupServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSignupServiceProxy();
  }
  
  private void _initSignupServiceProxy() {
    try {
      signupService = (new main.SignupServiceServiceLocator()).getSignupService();
      if (signupService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)signupService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)signupService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (signupService != null)
      ((javax.xml.rpc.Stub)signupService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.SignupService getSignupService() {
    if (signupService == null)
      _initSignupServiceProxy();
    return signupService;
  }
  
  public boolean signUp(java.lang.String username, java.lang.String password, java.lang.String email) throws java.rmi.RemoteException{
    if (signupService == null)
      _initSignupServiceProxy();
    return signupService.signUp(username, password, email);
  }
  
  
}