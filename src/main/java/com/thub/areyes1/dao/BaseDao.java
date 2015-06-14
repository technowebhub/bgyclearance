/**
 * Class File Name: BaseDao.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class BaseDao {
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate(){
		return this.jdbcTemplate;
	}
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
}
