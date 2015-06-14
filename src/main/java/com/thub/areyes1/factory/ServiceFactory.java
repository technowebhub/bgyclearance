/**
 * Class File Name: ServiceFactory.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thub.areyes1.service.BarangayClearanceService;
import com.thub.areyes1.service.impl.BarangayClearanceServiceImpl;

public class ServiceFactory {
	
	private final static ApplicationContext appContext;
	
	// Instance block
	static {
		appContext = new ClassPathXmlApplicationContext("classpath:*/appServiceContext.xml");
	}
	
	public BarangayClearanceService getService(ServiceType serviceType){
		if(serviceType.equals(ServiceType.BGY_CLEARANCE_SERVICE)) {
			return (BarangayClearanceService)appContext.getBean("barangayClearanceService");
		}
		return null;
	}

}
