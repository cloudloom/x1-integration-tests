package com.tracebucket.x1.organization.partner.integration.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by sadath on 25-May-15.
 */
@Configuration
@ComponentScan(basePackages = {"com.tracebucket.x1.**.api.service.impl", "com.tracebucket.x1.organization.partner.integration.test.service.impl"}, scopedProxy = ScopedProxyMode.INTERFACES)
@EnableTransactionManagement(proxyTargetClass = true)
public class ServiceConfiguration {
}