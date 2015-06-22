/**
 * Class File Name: ServiceFactory.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.factory;

import com.thub.areyes1.service.BarangayClearanceService;


/**
 * A factory for creating Service objects.
 */
public class ServiceFactory extends Factory {
	
	/**
	 * Gets the service.
	 *
	 * @param serviceType the service type
	 * @return the service
	 */
	public static BarangayClearanceService getService(ServiceType serviceType){
		if(serviceType.equals(ServiceType.BGY_CLEARANCE_SERVICE)) {
			return (BarangayClearanceService)appContext.getBean(BarangayClearanceService.class);
		}
		return null;
	}

}
