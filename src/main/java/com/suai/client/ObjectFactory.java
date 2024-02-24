
package com.suai.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.suai.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddTransportResponse_QNAME = new QName("http://server.suai.com/", "addTransportResponse");
    private final static QName _DeleteTransport_QNAME = new QName("http://server.suai.com/", "deleteTransport");
    private final static QName _GetAllTransportsResponse_QNAME = new QName("http://server.suai.com/", "getAllTransportsResponse");
    private final static QName _UpdateAvailabilityResponse_QNAME = new QName("http://server.suai.com/", "updateAvailabilityResponse");
    private final static QName _GetAllTransports_QNAME = new QName("http://server.suai.com/", "getAllTransports");
    private final static QName _UpdateAvailability_QNAME = new QName("http://server.suai.com/", "updateAvailability");
    private final static QName _AddTransport_QNAME = new QName("http://server.suai.com/", "addTransport");
    private final static QName _DeleteTransportResponse_QNAME = new QName("http://server.suai.com/", "deleteTransportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.suai.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddTransport }
     * 
     */
    public AddTransport createAddTransport() {
        return new AddTransport();
    }

    /**
     * Create an instance of {@link DeleteTransportResponse }
     * 
     */
    public DeleteTransportResponse createDeleteTransportResponse() {
        return new DeleteTransportResponse();
    }

    /**
     * Create an instance of {@link UpdateAvailability }
     * 
     */
    public UpdateAvailability createUpdateAvailability() {
        return new UpdateAvailability();
    }

    /**
     * Create an instance of {@link GetAllTransports }
     * 
     */
    public GetAllTransports createGetAllTransports() {
        return new GetAllTransports();
    }

    /**
     * Create an instance of {@link GetAllTransportsResponse }
     * 
     */
    public GetAllTransportsResponse createGetAllTransportsResponse() {
        return new GetAllTransportsResponse();
    }

    /**
     * Create an instance of {@link UpdateAvailabilityResponse }
     * 
     */
    public UpdateAvailabilityResponse createUpdateAvailabilityResponse() {
        return new UpdateAvailabilityResponse();
    }

    /**
     * Create an instance of {@link DeleteTransport }
     * 
     */
    public DeleteTransport createDeleteTransport() {
        return new DeleteTransport();
    }

    /**
     * Create an instance of {@link AddTransportResponse }
     * 
     */
    public AddTransportResponse createAddTransportResponse() {
        return new AddTransportResponse();
    }

    /**
     * Create an instance of {@link Transport }
     * 
     */
    public Transport createTransport() {
        return new Transport();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "addTransportResponse")
    public JAXBElement<AddTransportResponse> createAddTransportResponse(AddTransportResponse value) {
        return new JAXBElement<AddTransportResponse>(_AddTransportResponse_QNAME, AddTransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "deleteTransport")
    public JAXBElement<DeleteTransport> createDeleteTransport(DeleteTransport value) {
        return new JAXBElement<DeleteTransport>(_DeleteTransport_QNAME, DeleteTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTransportsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "getAllTransportsResponse")
    public JAXBElement<GetAllTransportsResponse> createGetAllTransportsResponse(GetAllTransportsResponse value) {
        return new JAXBElement<GetAllTransportsResponse>(_GetAllTransportsResponse_QNAME, GetAllTransportsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAvailabilityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "updateAvailabilityResponse")
    public JAXBElement<UpdateAvailabilityResponse> createUpdateAvailabilityResponse(UpdateAvailabilityResponse value) {
        return new JAXBElement<UpdateAvailabilityResponse>(_UpdateAvailabilityResponse_QNAME, UpdateAvailabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTransports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "getAllTransports")
    public JAXBElement<GetAllTransports> createGetAllTransports(GetAllTransports value) {
        return new JAXBElement<GetAllTransports>(_GetAllTransports_QNAME, GetAllTransports.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAvailability }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "updateAvailability")
    public JAXBElement<UpdateAvailability> createUpdateAvailability(UpdateAvailability value) {
        return new JAXBElement<UpdateAvailability>(_UpdateAvailability_QNAME, UpdateAvailability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "addTransport")
    public JAXBElement<AddTransport> createAddTransport(AddTransport value) {
        return new JAXBElement<AddTransport>(_AddTransport_QNAME, AddTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.suai.com/", name = "deleteTransportResponse")
    public JAXBElement<DeleteTransportResponse> createDeleteTransportResponse(DeleteTransportResponse value) {
        return new JAXBElement<DeleteTransportResponse>(_DeleteTransportResponse_QNAME, DeleteTransportResponse.class, null, value);
    }

}
