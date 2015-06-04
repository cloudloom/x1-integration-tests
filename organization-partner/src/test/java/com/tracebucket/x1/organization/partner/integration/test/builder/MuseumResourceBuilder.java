package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.MuseumResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class MuseumResourceBuilder {
    private String name;
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);

    private MuseumResourceBuilder() {

    }

    public static MuseumResourceBuilder aMuseumBuilder() {
        return new MuseumResourceBuilder();
    }

    public MuseumResourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public MuseumResourceBuilder withAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
        return this;
    }

    public MuseumResource build() {
        MuseumResource museum = new MuseumResource();
        museum.setAddresses(this.addresses);
        museum.setName(this.name);
        return museum;
    }
}