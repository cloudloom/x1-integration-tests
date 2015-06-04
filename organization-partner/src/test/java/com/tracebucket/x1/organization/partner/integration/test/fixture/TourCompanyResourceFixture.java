package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.TourCompanyResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.TourCompanyResource;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class TourCompanyResourceFixture {
    public static TourCompanyResource standardTourCompany() {
        Set<AddressResource> addresses = new HashSet<AddressResource>();
        addresses.add(AddressResourceFixture.standardAddress());

        TourCompanyResource tourCompany = TourCompanyResourceBuilder.aTourCompanyBuilder()
                .withName(UUID.randomUUID().toString())
                .withAddresses(addresses)
                .build();
        return tourCompany;
    }
}