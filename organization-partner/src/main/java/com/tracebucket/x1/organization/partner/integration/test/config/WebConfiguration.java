package com.tracebucket.x1.organization.partner.integration.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sadath on 25-May-15.
 */
@Configuration
@ComponentScan(basePackages = {"com.tracebucket.x1.**.api.rest", "com.tracebucket.x1.organization.partner.integration.test.rest"})
public class WebConfiguration {
}