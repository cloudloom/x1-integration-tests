package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.OwnerBuilder;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultOwner;

/**
 * Created by vishwa on 23-01-2015.
 */
public class OwnerFixture {
    public static DefaultOwner standardOwner(String organizationUID) {
        DefaultOwner owner = OwnerBuilder.anOwnerBuilder()
                .withOrganizationUID(organizationUID)
                .build();
        return owner;
    }
}