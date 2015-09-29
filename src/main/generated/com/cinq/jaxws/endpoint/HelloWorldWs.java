
package com.cinq.jaxws.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HelloWorldWs", targetNamespace = "http://endpoint.jaxws.cinq.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorldWs {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.cinq.jaxws.endpoint.HelloWorldDto
     */
    @WebMethod
    @WebResult(partName = "return")
    public HelloWorldDto sayHello(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}