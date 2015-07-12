package com.thub.areyes1.ui;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Class File Name: SampleAnnotation.java
 * Author: alvinreyes
 * Date Generate: Jul 12, 2015
 * Description
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface SampleAnnotation {
	String hello() default "";
}
