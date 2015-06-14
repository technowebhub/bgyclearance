/**
 * Class File Name: DaoFactory.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.thub.areyes1.dao.BarangayClearanceDao;

public class DaoFactory {

	private final static ApplicationContext appContext;
	
	// Instance block
	static {
		appContext = new ClassPathXmlApplicationContext("classpath:*/appDaoContext.xml");
	}
	
	public BarangayClearanceDao getDao(DaoType daoType){
		if(daoType.equals(DaoType.BGY_CLEARANCE_DAO)) {
			return (BarangayClearanceDao)appContext.getBean("barangayClearanceDao");
		}
		return null;
	}
}
