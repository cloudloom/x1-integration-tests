package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.MuseumResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.MuseumResource;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class MuseumResourceFixture {
    public static MuseumResource standardMuseum() {
        Set<AddressResource> addresses = new HashSet<AddressResource>();
        addresses.add(AddressResourceFixture.standardAddress());

        MuseumResource museum = MuseumResourceBuilder.aMuseumBuilder()
                .withName(UUID.randomUUID().toString())
                .withAddresses(addresses)
                .build();
        return museum;
    }
}