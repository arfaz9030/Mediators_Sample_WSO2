package com.aibiz.classexample;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;


public class ShowNameUpperCase extends AbstractMediator { 

	Log log = LogFactory.getLog(ShowNameUpperCase.class);
	public boolean mediate(MessageContext context) { 
		converttoUppercase(context);
		return true;
	}
	public void converttoUppercase(MessageContext context) {
		String city = (String)context.getProperty("CITY");
		log.debug("values before sequences"+city);
		String convertedUp = city.toUpperCase();
		context.setProperty("CONVERTED", convertedUp);
		log.debug("values from sequences"+convertedUp);
	}
}

