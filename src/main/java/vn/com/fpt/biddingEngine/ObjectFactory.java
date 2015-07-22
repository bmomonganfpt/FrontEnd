
package vn.com.fpt.biddingEngine;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bids package. 
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

    private final static QName _GetBidDemoResponse_QNAME = new QName("bids", "getBidDemoResponse");
    private final static QName _GetItemDemoResponse_QNAME = new QName("bids", "getItemDemoResponse");
    private final static QName _GetItemDemo_QNAME = new QName("bids", "getItemDemo");
    private final static QName _GetBidDemo_QNAME = new QName("bids", "getBidDemo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bids
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBidDemo }
     * 
     */
    public GetBidDemo createGetBidDemo() {
        return new GetBidDemo();
    }

    /**
     * Create an instance of {@link GetBidDemoResponse }
     * 
     */
    public GetBidDemoResponse createGetBidDemoResponse() {
        return new GetBidDemoResponse();
    }

    /**
     * Create an instance of {@link GetItemDemoResponse }
     * 
     */
    public GetItemDemoResponse createGetItemDemoResponse() {
        return new GetItemDemoResponse();
    }

    /**
     * Create an instance of {@link GetItemDemo }
     * 
     */
    public GetItemDemo createGetItemDemo() {
        return new GetItemDemo();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Bid }
     * 
     */
    public Bid createBid() {
        return new Bid();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBidDemoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "bids", name = "getBidDemoResponse")
    public JAXBElement<GetBidDemoResponse> createGetBidDemoResponse(GetBidDemoResponse value) {
        return new JAXBElement<GetBidDemoResponse>(_GetBidDemoResponse_QNAME, GetBidDemoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemDemoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "bids", name = "getItemDemoResponse")
    public JAXBElement<GetItemDemoResponse> createGetItemDemoResponse(GetItemDemoResponse value) {
        return new JAXBElement<GetItemDemoResponse>(_GetItemDemoResponse_QNAME, GetItemDemoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemDemo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "bids", name = "getItemDemo")
    public JAXBElement<GetItemDemo> createGetItemDemo(GetItemDemo value) {
        return new JAXBElement<GetItemDemo>(_GetItemDemo_QNAME, GetItemDemo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBidDemo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "bids", name = "getBidDemo")
    public JAXBElement<GetBidDemo> createGetBidDemo(GetBidDemo value) {
        return new JAXBElement<GetBidDemo>(_GetBidDemo_QNAME, GetBidDemo.class, null, value);
    }

}
