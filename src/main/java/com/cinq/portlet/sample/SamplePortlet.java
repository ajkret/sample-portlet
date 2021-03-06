package com.cinq.portlet.sample;

import java.io.IOException;
import java.util.Enumeration;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class SamplePortlet implements Portlet {
	static Logger logger = Logger.getLogger(SamplePortlet.class.getName());
	
	PortletContext context = null;

//	protected void doView(RenderRequest request, RenderResponse response)
//			throws PortletException, IOException {
//		response.setContentType("text/html");
//
//		PortletPreferences pref = request.getPreferences();
//		
//		// Get the value of "displaytext" from our preferences, if not
//		// available,
//		// then use the second string passed to the function
//		String displayText = pref.getValue("displaytext",
//				"MISSING: display-text");
//		// displays the string from our preferences
//
//		response.setContentType(request.getResponseContentType());
//		PrintWriter writer = response.getWriter();
//		writer.write(displayText);
//
//		// getPortletContext().getRequestDispatcher("/index.jsp").include(
//		// request, response);
//	}

	public void init(PortletConfig config) throws PortletException {
		logger.info("init");
		context = config.getPortletContext();
		
	}

	public void processAction(ActionRequest request, ActionResponse response)
			throws PortletException, IOException {
		logger.info("processAction");
		
	}

	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		Object renderPartAttrValue = request.getAttribute(RenderRequest.RENDER_PART);
		logger.info("render " + renderPartAttrValue);
		
		if(request.getAttributeNames()!=null) {
			Enumeration<String> attrs = request.getAttributeNames();
			while(attrs.hasMoreElements()) {
				String key = attrs.nextElement();
				logger.info(key + ": " +request.getAttribute(key));
				
			}
		}
		
		response.setContentType("text/html");
		context.getRequestDispatcher("/index.jsp").include(
				request, response);

	}

	public void destroy() {
		logger.info("destroy");
		
	}

}
