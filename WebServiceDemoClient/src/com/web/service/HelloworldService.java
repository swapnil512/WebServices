/**
 * HelloworldService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.web.service;

public interface HelloworldService extends javax.xml.rpc.Service {
    public java.lang.String getHelloworldAddress();

    public com.web.service.Helloworld getHelloworld() throws javax.xml.rpc.ServiceException;

    public com.web.service.Helloworld getHelloworld(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
