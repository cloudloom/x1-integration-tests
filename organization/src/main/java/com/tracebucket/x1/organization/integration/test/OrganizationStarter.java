package com.tracebucket.x1.organization.integration.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ffl on 02-03-2015.
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = "com.tracebucket.x1.organization.integration.test.config")
public class OrganizationStarter {
    public static void main(String[] args) {
        SpringApplication.run(OrganizationStarter.class, args);
    }
}