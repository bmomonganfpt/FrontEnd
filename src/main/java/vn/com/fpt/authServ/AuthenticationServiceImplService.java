
package vn.com.fpt.authServ;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AuthenticationServiceImplService", targetNamespace = "http://endpoints.fpt.com.vn/", wsdlLocation = "http://localhost:8585/AuthServ/authenticate?wsdl")
public class AuthenticationServiceImplService
    extends Service
{

    private final static URL AUTHENTICATIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException AUTHENTICATIONSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName AUTHENTICATIONSERVICEIMPLSERVICE_QNAME = new QName("http://endpoints.fpt.com.vn/", "AuthenticationServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8585/AuthServ/authenticate?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHENTICATIONSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        AUTHENTICATIONSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public AuthenticationServiceImplService() {
        super(__getWsdlLocation(), AUTHENTICATIONSERVICEIMPLSERVICE_QNAME);
    }

    public AuthenticationServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHENTICATIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public AuthenticationServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, AUTHENTICATIONSERVICEIMPLSERVICE_QNAME);
    }

    public AuthenticationServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHENTICATIONSERVICEIMPLSERVICE_QNAME, features);
    }

    public AuthenticationServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthenticationServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuthenticationService
     */
    @WebEndpoint(name = "AuthenticationServiceImplPort")
    public AuthenticationService getAuthenticationServiceImplPort() {
        return super.getPort(new QName("http://endpoints.fpt.com.vn/", "AuthenticationServiceImplPort"), AuthenticationService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthenticationService
     */
    @WebEndpoint(name = "AuthenticationServiceImplPort")
    public AuthenticationService getAuthenticationServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoints.fpt.com.vn/", "AuthenticationServiceImplPort"), AuthenticationService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHENTICATIONSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw AUTHENTICATIONSERVICEIMPLSERVICE_EXCEPTION;
        }
        return AUTHENTICATIONSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
