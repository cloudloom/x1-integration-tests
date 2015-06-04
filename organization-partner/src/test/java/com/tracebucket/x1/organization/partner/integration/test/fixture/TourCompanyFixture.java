package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.organization.partner.integration.test.builder.TourCompanyBuilder;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultTourCompany;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class TourCompanyFixture {
    public static DefaultTourCompany standardTourCompany() {
        Set<DefaultAddress> addresses = new HashSet<DefaultAddress>();
        addresses.add(AddressFixture.standardAddress());

        DefaultTourCompany tourCompany = TourCompanyBuilder.aTourCompanyBuilder()
                .withName(UUID.randomUUID().toString())
                .withAddresses(addresses)
                .build();
        return tourCompany;
    }
}