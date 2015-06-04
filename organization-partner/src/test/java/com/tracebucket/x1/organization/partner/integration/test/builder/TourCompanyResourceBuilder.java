package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.TourCompanyResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class TourCompanyResourceBuilder {
    private String name;
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);

    private TourCompanyResourceBuilder() {

    }

    public static TourCompanyResourceBuilder aTourCompanyBuilder() {
        return new TourCompanyResourceBuilder();
    }

    public TourCompanyResourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TourCompanyResourceBuilder withAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
        return this;
    }

    public TourCompanyResource build() {
        TourCompanyResource museum = new TourCompanyResource();
        museum.setAddresses(this.addresses);
        museum.setName(this.name);
        return museum;
    }
}