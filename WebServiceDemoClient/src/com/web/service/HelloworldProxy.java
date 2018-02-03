package com.web.service;

public class HelloworldProxy implements com.web.service.Helloworld {
  private String _endpoint = null;
  private com.web.service.Helloworld helloworld = null;
  
  public HelloworldProxy() {
    _initHelloworldProxy();
  }
  
  public HelloworldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloworldProxy();
  }
  
  private void _initHelloworldProxy() {
    try {
      helloworld = (new com.web.service.HelloworldServiceLocator()).getHelloworld();
      if (helloworld != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloworld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloworld)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloworld != null)
      ((javax.xml.rpc.Stub)helloworld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.web.service.Helloworld getHelloworld() {
    if (helloworld == null)
      _initHelloworldProxy();
    return helloworld;
  }
  
  public float addValue(float value) throws java.rmi.RemoteException{
    if (helloworld == null)
      _initHelloworldProxy();
    return helloworld.addValue(value);
  }
  
  public float addSubtract(float value) throws java.rmi.RemoteException{
    if (helloworld == null)
      _initHelloworldProxy();
    return helloworld.addSubtract(value);
  }
  
  
}