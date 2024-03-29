
package com.suai.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TransportService", targetNamespace = "http://server.suai.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TransportService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateAvailability", targetNamespace = "http://server.suai.com/", className = "com.suai.client.UpdateAvailability")
    @ResponseWrapper(localName = "updateAvailabilityResponse", targetNamespace = "http://server.suai.com/", className = "com.suai.client.UpdateAvailabilityResponse")
    @Action(input = "http://server.suai.com/TransportService/updateAvailabilityRequest", output = "http://server.suai.com/TransportService/updateAvailabilityResponse")
    public void updateAvailability(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "deleteTransport", targetNamespace = "http://server.suai.com/", className = "com.suai.client.DeleteTransport")
    @ResponseWrapper(localName = "deleteTransportResponse", targetNamespace = "http://server.suai.com/", className = "com.suai.client.DeleteTransportResponse")
    @Action(input = "http://server.suai.com/TransportService/deleteTransportRequest", output = "http://server.suai.com/TransportService/deleteTransportResponse")
    public void deleteTransport(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.suai.client.Transport>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllTransports", targetNamespace = "http://server.suai.com/", className = "com.suai.client.GetAllTransports")
    @ResponseWrapper(localName = "getAllTransportsResponse", targetNamespace = "http://server.suai.com/", className = "com.suai.client.GetAllTransportsResponse")
    @Action(input = "http://server.suai.com/TransportService/getAllTransportsRequest", output = "http://server.suai.com/TransportService/getAllTransportsResponse")
    public List<Transport> getAllTransports();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.suai.client.Transport
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addTransport", targetNamespace = "http://server.suai.com/", className = "com.suai.client.AddTransport")
    @ResponseWrapper(localName = "addTransportResponse", targetNamespace = "http://server.suai.com/", className = "com.suai.client.AddTransportResponse")
    @Action(input = "http://server.suai.com/TransportService/addTransportRequest", output = "http://server.suai.com/TransportService/addTransportResponse")
    public Transport addTransport(
        @WebParam(name = "arg0", targetNamespace = "")
        Transport arg0);

}
