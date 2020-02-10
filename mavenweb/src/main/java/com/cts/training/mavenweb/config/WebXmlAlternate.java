package com.cts.training.mavenweb.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
// Auto registers DS
public class WebXmlAlternate extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] { ServletConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		
		return new String[] { "/" };
	}

}
