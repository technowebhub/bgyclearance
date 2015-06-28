/**
 * Class File Name: Datasource.java
 * Author: alvinreyes
 * Date Generate: Jun 28, 2015
 * Description
 */

package com.thub.areyes1.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.thub.areyes1.dao.BaseDao;
@Configuration
@ComponentScan(basePackageClasses = {BaseDao.class})
public class DataSourceFactoryConfig {
	
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("org.sqlite.JDBC");
		dm.setUrl("jdbc:sqlite://Users/alvinreyes/EclipseProjects/J2EE/bgybus-clearance/src/main/resources/SampleDB.db");
		//dm.setPassword("");
		//dm.setUsername("");
		return dm;
	}
}
