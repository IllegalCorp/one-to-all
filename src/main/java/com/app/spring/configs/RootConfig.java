package com.app.spring.configs;

import com.app.cloudant.CloudantAccess;
import com.app.spring.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;


@Configuration
public class RootConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(RootConfig.class);

    @Bean
    public CloudantAccess cloudantClient() {
        CloudantAccess cloudantAccess = new CloudantAccess();
        return cloudantAccess;
    }

    @Bean
    public BeanUtils beanUtils() {
        return new BeanUtils();
    }

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);

        LOGGER.debug("Hello world!");
        LOGGER.info("Hello world to console!", new NullPointerException());
    }
}
