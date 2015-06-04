package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.TransportProviderResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.TransportProviderResource;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class TransportProviderResourceFixture {
    public static TransportProviderResource standardTransportProvider() {
        Set<AddressResource> addresses = new HashSet<AddressResource>();
        addresses.add(AddressResourceFixture.standardAddress());

        TransportProviderResource transportProvider = TransportProviderResourceBuilder.aTransportProviderBuilder()
                .withName(UUID.randomUUID().toString())
                .withAddresses(addresses)
                .build();
        return transportProvider;
    }
}