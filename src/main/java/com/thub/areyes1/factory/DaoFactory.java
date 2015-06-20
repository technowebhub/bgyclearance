/**
 * Class File Name: DaoFactory.java
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

import com.thub.areyes1.dao.BarangayClearanceDao;


public class DaoFactory extends Factory {
	public static BarangayClearanceDao getDao(DaoType daoType){
		if(daoType.equals(DaoType.BGY_CLEARANCE_DAO)) {
			return (BarangayClearanceDao)appContext.getBean(BarangayClearanceDao.class);
		}
		return null;
	}
}
