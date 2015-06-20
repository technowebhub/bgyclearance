/**
 * Class File Name: ServiceFactory.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.factory;

import org.springframework.config.java.context.JavaConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thub.areyes1.service.BarangayClearanceService;
import com.thub.areyes1.service.impl.BarangayClearanceServiceImpl;

public class ServiceFactory extends Factory {
	
	public static BarangayClearanceService getService(ServiceType serviceType){
		if(serviceType.equals(ServiceType.BGY_CLEARANCE_SERVICE)) {
			return (BarangayClearanceService)appContext.getBean(BarangayClearanceService.class);
		}
		return null;
	}

}
