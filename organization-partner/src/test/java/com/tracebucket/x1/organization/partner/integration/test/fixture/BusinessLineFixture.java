package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultBusinessLine;
import com.tracebucket.x1.organization.partner.integration.test.builder.BusinessLineBuilder;

/**
 * Created by sadath on 25-Nov-14.
 */
public class BusinessLineFixture {
    public static DefaultBusinessLine standardBusinessLine(){
        DefaultBusinessLine businessLine = BusinessLineBuilder.aBusinessLine()
                .withName("Business Line1")
                .withDescription("Business line description")
                .build();
        return businessLine;
    }
}
