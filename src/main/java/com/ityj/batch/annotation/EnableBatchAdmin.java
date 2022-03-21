package com.ityj.batch.annotation;

import org.springframework.context.annotation.ImportResource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is responsible for bootstrapping Spring Batch Admin v1.3.1
 * within an existing web application.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ImportResource({"classpath:/org/springframework/batch/admin/web/resources/servlet-config.xml",
        "classpath:/org/springframework/batch/admin/web/resources/webapp-config.xml"})
public @interface EnableBatchAdmin {}