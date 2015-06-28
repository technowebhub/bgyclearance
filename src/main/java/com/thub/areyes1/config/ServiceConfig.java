/**
 * Class File Name: ServiceConfig.java
 * Author: alvinreyes
 * Date Generate: Jun 28, 2015
 * Description
 */

package com.thub.areyes1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.thub.areyes1.service.impl.BarangayClearanceServiceImpl;

@Configuration
@ComponentScan(basePackageClasses = {BarangayClearanceServiceImpl.class})
public class ServiceConfig {

	
}
