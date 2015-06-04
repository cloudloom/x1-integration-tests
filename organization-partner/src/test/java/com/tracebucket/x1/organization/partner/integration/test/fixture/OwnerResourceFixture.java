package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.OwnerResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.OwnerResource;
import com.tracebucket.x1.partner.api.rest.resources.DefaultOwnerResource;
/**
 * Created by vishwa on 23-01-2015.
 */
public class OwnerResourceFixture {
    public static OwnerResource standardOwner(String organizationUID) {
        OwnerResource owner = OwnerResourceBuilder.anOwnerBuilder()
                .withOrganizationUID(organizationUID)
                .build();
        return owner;
    }
}