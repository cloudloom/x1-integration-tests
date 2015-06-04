package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.BusinessLineResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.BusinessLineResource;

/**
 * Created by sadath on 31-Mar-15.
 */
public class BusinessLineResourceFixture {
    public static BusinessLineResource standardBusinessLine(){
        BusinessLineResource businessLine = BusinessLineResourceBuilder.aBusinessLineResource()
                .withName("Business Line1")
                .withDescription("Business line description")
                .build();
        return businessLine;
    }
}
