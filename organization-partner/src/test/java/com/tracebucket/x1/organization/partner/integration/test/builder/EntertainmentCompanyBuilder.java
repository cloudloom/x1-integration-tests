package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPerson;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultEntertainmentCompany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class EntertainmentCompanyBuilder {
    private String name;
    private String website;
    private String logo;
    private Set<DefaultPerson> contactPersons = new HashSet<DefaultPerson>(0);
    private Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);

    private EntertainmentCompanyBuilder() {

    }

    public static EntertainmentCompanyBuilder anEntertainmentCompanyBuilder() {
        return new EntertainmentCompanyBuilder();
    }

    public EntertainmentCompanyBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public EntertainmentCompanyBuilder withWebsite(String website) {
        this.website = website;
        return this;
    }

    public EntertainmentCompanyBuilder withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public EntertainmentCompanyBuilder withContactPersons(Set<DefaultPerson> contactPersons) {
        this.contactPersons = contactPersons;
        return this;
    }

    public EntertainmentCompanyBuilder withAddresses(Set<DefaultAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public DefaultEntertainmentCompany build() {
        DefaultEntertainmentCompany entertainmentCompany = new DefaultEntertainmentCompany();
        entertainmentCompany.setName(this.name);
        entertainmentCompany.setContactPersons(this.contactPersons);
        entertainmentCompany.setLogo(this.logo);
        entertainmentCompany.setWebsite(this.website);
        entertainmentCompany.setAddresses(this.addresses);
        return entertainmentCompany;
    }
}