package com.tracebucket.x1.partner.integration.test.fixture;

import com.tracebucket.x1.partner.api.rest.resources.DefaultOwnerResource;
import com.tracebucket.x1.partner.integration.test.builder.DefaultOwnerResourceBuilder;

/**
 * Created by vishwa on 23-01-2015.
 */
public class DefaultOwnerResourceFixture {
    public static DefaultOwnerResource standardOwner(String organizationUID) {
        DefaultOwnerResource owner = DefaultOwnerResourceBuilder.anOwnerBuilder()
                .withOrganizationUID(organizationUID)
                .build();
        return owner;
    }
}