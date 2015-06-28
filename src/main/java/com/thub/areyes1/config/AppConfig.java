/**
 * Class File Name: AppConfig.java
 * Author: alvinreyes
 * Date Generate: Jun 28, 2015
 * Description
 */

package com.thub.areyes1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.thub.areyes1.ui.BgyClearanceFrame;
import com.thub.areyes1.ui.BgyClearanceRegistrationDialog;

@Configuration
@ComponentScan(basePackageClasses = {BgyClearanceFrame.class,BgyClearanceRegistrationDialog.class})
@Import(value = {DataSourceFactoryConfig.class, DaoConfig.class, ServiceConfig.class})
public class AppConfig {	


}
