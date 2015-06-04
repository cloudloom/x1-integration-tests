package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.Person;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AffiliateResource;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Vishwajit on 27-05-2015.
 */
public class AffiliateResourceBuilder {

    private String businessName;
    private String code;
    private Date dateOfIncorporation;
    private String logo;
    private String website;
    private Set<Person> persons = new HashSet<Person>(0);
    private String name;
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);

    private AffiliateResourceBuilder(){ }

    public static AffiliateResourceBuilder anAffiliateBuilder(){
        return new AffiliateResourceBuilder();
    }

    public AffiliateResourceBuilder withBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    public AffiliateResourceBuilder withCode(String code) {
        this.code = code;
        return this;
    }

    public AffiliateResourceBuilder withDateOfIncorporation(Date dateOfIncorporation) {
        this.dateOfIncorporation = dateOfIncorporation;
        return this;
    }

    public AffiliateResourceBuilder withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    public AffiliateResourceBuilder withWebsite(String website) {
        this.website = website;
        return this;
    }

    public AffiliateResourceBuilder withPersons(Set<Person> persons) {
        this.persons = persons;
        return this;
    }

    public AffiliateResourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AffiliateResourceBuilder withAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
        return this;
    }

    public AffiliateResource build() {
        AffiliateResource affiliateResource = new AffiliateResource();
        affiliateResource.setWebsite(website);
        affiliateResource.setBusinessName(businessName);
        affiliateResource.setCode(code);
        affiliateResource.setDateOfIncorporation(dateOfIncorporation );
        affiliateResource.setLogo(logo);
        affiliateResource.setPersons(persons);
        affiliateResource.setName(name);
        affiliateResource.setAddresses(addresses);
        return affiliateResource;
    }
}
