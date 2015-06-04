package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultTourCompany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class TourCompanyBuilder {
    private String name;
    private Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);

    private TourCompanyBuilder() {

    }

    public static TourCompanyBuilder aTourCompanyBuilder() {
        return new TourCompanyBuilder();
    }

    public TourCompanyBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TourCompanyBuilder withAddresses(Set<DefaultAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public DefaultTourCompany build() {
        DefaultTourCompany museum = new DefaultTourCompany();
        museum.setAddresses(this.addresses);
        museum.setName(this.name);
        return museum;
    }
}