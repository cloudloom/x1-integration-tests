package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.organization.partner.integration.test.builder.MuseumBuilder;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultMuseum;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class MuseumFixture {
    public static DefaultMuseum standardMuseum() {
        Set<DefaultAddress> addresses = new HashSet<DefaultAddress>();
        addresses.add(AddressFixture.standardAddress());

        DefaultMuseum museum = MuseumBuilder.aMuseumBuilder()
                .withName(UUID.randomUUID().toString())
                .withAddresses(addresses)
                .build();
        return museum;
    }
}