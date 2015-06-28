/**
 * Class File Name: BaseDao.java
 * Author: alvinreyes
 * Date Generate: Jun 14, 2015
 * Description
 */

package com.thub.areyes1.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * The Class BaseDao.
 */
@Repository
public class BaseDao {
	
	public DataSource dataSource;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Connection getConnection() throws  SQLException {
		return this.dataSource.getConnection();
	}
	
}
