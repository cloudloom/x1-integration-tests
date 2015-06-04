package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.TransportProviderResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class TransportProviderResourceBuilder {
    private String name;
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);

    private TransportProviderResourceBuilder() {

    }

    public static TransportProviderResourceBuilder aTransportProviderBuilder() {
        return new TransportProviderResourceBuilder();
    }

    public TransportProviderResourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TransportProviderResourceBuilder withAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
        return this;
    }

    public TransportProviderResource build() {
        TransportProviderResource museum = new TransportProviderResource();
        museum.setAddresses(this.addresses);
        museum.setName(this.name);
        return museum;
    }
}