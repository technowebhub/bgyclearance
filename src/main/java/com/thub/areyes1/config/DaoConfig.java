/**
 * Class File Name: DaoConfig.java
 * Author: alvinreyes
 * Date Generate: Jun 28, 2015
 * Description
 */

package com.thub.areyes1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.thub.areyes1.dao.impl.BarangayClearanceDaoImpl;

/**
 * The Class DaoConfig.
 */
@Configuration
@ComponentScan(basePackageClasses = {BarangayClearanceDaoImpl.class})
public class DaoConfig {

}
