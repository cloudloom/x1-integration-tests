package com.tracebucket.x1.organization.partner.integration.test.config;

import com.tracebucket.tron.context.EnableAutoAssemblerResolution;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sadath on 25-May-15.
 */
@Configuration
@EnableAutoAssemblerResolution(basePackages = {"com.tracebucket.x1.**.api.rest.assembler", "com.tracebucket.x1.organization.partner.integration.test.rest.assemblers"})
public class AssemblerConfiguration {
}