package com.SpringRest.SearchAppJPA.search;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

public class SearchGateway {
	
	public static void main(String args[]) {
		
	    Resource classPathResource=new ClassPathResource("applicationContext.xml");  
	    BeanFactory springBeanfactory=new XmlBeanFactory(classPathResource); 
	    
		SearchService searchApp = (SearchService)springBeanfactory.getBean("searchApp");
		searchApp.search(7);

	}
}
