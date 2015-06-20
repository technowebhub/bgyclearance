/**
 * Class File Name: Factory.java
 * Author: alvinreyes
 * Date Generate: Jun 20, 2015
 * Description
 */

package com.thub.areyes1.factory;

import org.springframework.config.java.context.JavaConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
		"com.thub.areyes1.dao",
		"com.thub.areyes1.service"})
public abstract class Factory {
	public static AnnotationConfigApplicationContext appContext;
	static {
		Factory.appContext = new AnnotationConfigApplicationContext(Factory.class);
	}
}
