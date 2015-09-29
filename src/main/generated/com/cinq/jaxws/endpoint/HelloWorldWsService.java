
package com.cinq.jaxws.endpoint;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "HelloWorldWsService", targetNamespace = "http://endpoint.jaxws.cinq.com/", wsdlLocation = "http://localhost:8080/jaxws/HelloWs?wsdl")
public class HelloWorldWsService
    extends Service
{

    private final static URL HELLOWORLDWSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.cinq.jaxws.endpoint.HelloWorldWsService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.cinq.jaxws.endpoint.HelloWorldWsService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/jaxws/HelloWs?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/jaxws/HelloWs?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        HELLOWORLDWSSERVICE_WSDL_LOCATION = url;
    }

    public HelloWorldWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldWsService() {
        super(HELLOWORLDWSSERVICE_WSDL_LOCATION, new QName("http://endpoint.jaxws.cinq.com/", "HelloWorldWsService"));
    }

    /**
     * 
     * @return
     *     returns HelloWorldWs
     */
    @WebEndpoint(name = "HelloWorldWsPort")
    public HelloWorldWs getHelloWorldWsPort() {
        return super.getPort(new QName("http://endpoint.jaxws.cinq.com/", "HelloWorldWsPort"), HelloWorldWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldWs
     */
    @WebEndpoint(name = "HelloWorldWsPort")
    public HelloWorldWs getHelloWorldWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoint.jaxws.cinq.com/", "HelloWorldWsPort"), HelloWorldWs.class, features);
    }

}