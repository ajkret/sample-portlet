package com.cinq.portlet.sample.action;

import java.net.URL;

import javax.portlet.PortletPreferences;
import javax.xml.namespace.QName;

import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.portlet.interceptor.PortletPreferencesAware;

import com.cinq.jaxws.endpoint.HelloWorldDto;
import com.cinq.jaxws.endpoint.HelloWorldWs;
import com.cinq.jaxws.endpoint.HelloWorldWsService;

public class HelloAction extends DefaultActionSupport implements PortletPreferencesAware {

    private static final long serialVersionUID = 1L;

    private String firstName;

    private String lastName;

    private int random;

    private PortletPreferences preferences;

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPortletPreferences(PortletPreferences preferences) {
        this.preferences = preferences;
    }

    @Override
	public String execute() throws Exception {
		firstName = preferences.getValue("firstName", "");
		lastName = preferences.getValue("lastName", "");
		
		// Call external service
		HelloWorldWsService service = new HelloWorldWsService(new URL("http://localhost:7800/jaxws/HelloWs?wsdl"),new QName("http://endpoint.jaxws.cinq.com/", "HelloWorldWsService"));
		
		HelloWorldWs ws = service.getHelloWorldWsPort();
		HelloWorldDto dto = ws.sayHello(firstName + " " + lastName);
		this.random = dto.getRandom();
		
		return SUCCESS;
	}
}
