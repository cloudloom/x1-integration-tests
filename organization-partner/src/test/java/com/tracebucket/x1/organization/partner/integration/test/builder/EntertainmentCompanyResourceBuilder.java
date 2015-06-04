package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.EntertainmentCompanyResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.PersonResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class EntertainmentCompanyResourceBuilder {
    private String name;
    private String website;
    private String logo;
    private Set<PersonResource> contactPersons = new HashSet<PersonResource>(0);
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);

    private EntertainmentCompanyResourceBuilder() {

    }

    public static EntertainmentCompanyResourceBuilder anEntertainmentCompanyBuilder() {
        return new EntertainmentCompanyResourceBuilder();
    }

    public EntertainmentCompanyResourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public EntertainmentCompanyResourceBuilder withWebsite(String website) {
        this.website = website;
        return this;
    }

    public EntertainmentCompanyResourceBuilder withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public EntertainmentCompanyResourceBuilder withContactPersons(Set<PersonResource> contactPersons) {
        this.contactPersons = contactPersons;
        return this;
    }

    public EntertainmentCompanyResourceBuilder withAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
        return this;
    }

    public EntertainmentCompanyResource build() {
        EntertainmentCompanyResource entertainmentCompany = new EntertainmentCompanyResource();
        entertainmentCompany.setName(this.name);
        entertainmentCompany.setContactPersons(this.contactPersons);
        entertainmentCompany.setLogo(this.logo);
        entertainmentCompany.setWebsite(this.website);
        entertainmentCompany.setAddresses(this.addresses);
        return entertainmentCompany;
    }
}