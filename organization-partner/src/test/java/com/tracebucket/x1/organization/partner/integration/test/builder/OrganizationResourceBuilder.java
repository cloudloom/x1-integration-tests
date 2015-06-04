package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.partner.integration.test.rest.resources.OrganizationResource;

/**
 * Created by sadath on 31-Mar-15.
 */
public class OrganizationResourceBuilder {
    private String code;
    private String name;
    private String description;
    private String website;
    protected String image;
/*    private Set<DefaultAddressResource> addresses = new HashSet<DefaultAddressResource>(0);
    private Set<DefaultCurrencyResource> currencies = new HashSet<DefaultCurrencyResource>(0);
    private Set<DefaultTimezoneResource> timezones = new HashSet<DefaultTimezoneResource>(0);
    private Set<DefaultPersonResource> contactPersons = new HashSet<DefaultPersonResource>(0);
    private Set<DefaultPhoneResource> phones = new HashSet<DefaultPhoneResource>(0);
    private Set<DefaultEmailResource> emails = new HashSet<DefaultEmailResource>(0);
    private Set<DefaultOrganizationUnitResource> organizationUnits = new HashSet<DefaultOrganizationUnitResource>(0);*/

    private OrganizationResourceBuilder(){ }

    public static OrganizationResourceBuilder anOrganizationBuilder(){
        return new OrganizationResourceBuilder();
    }

    public OrganizationResourceBuilder withName(String name){
        this.name = name;
        return this;
    }

    public OrganizationResourceBuilder withCode(String code){
        this.code = code;
        return this;
    }

    public OrganizationResourceBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public OrganizationResourceBuilder withWebsite(String website){
        this.website = website;
        return this;
    }

    public OrganizationResourceBuilder withImage(String image){
        this.image = image;
        return this;
    }

/*    public DefaultOrganizationResourceBuilder withAddresses(Set<DefaultAddressResource> addresses){
        this.addresses = addresses;
        return this;
    }

    public DefaultOrganizationResourceBuilder withCurrencies(Set<DefaultCurrencyResource> currencies){
        this.currencies = currencies;
        return this;
    }

    public DefaultOrganizationResourceBuilder withTimezones(Set<DefaultTimezoneResource> timezones){
        this.timezones = timezones;
        return this;
    }

    public DefaultOrganizationResourceBuilder withContactPersons(Set<DefaultPersonResource> contactPersons){
        this.contactPersons = contactPersons;
        return this;
    }

    public DefaultOrganizationResourceBuilder withPhones(Set<DefaultPhoneResource> phones){
        this.phones = phones;
        return this;
    }

    public DefaultOrganizationResourceBuilder withEmails(Set<DefaultEmailResource> emails){
        this.emails = emails;
        return this;
    }

    public DefaultOrganizationResourceBuilder withOrganizationUnits(Set<DefaultOrganizationUnitResource> organizationUnits){
        this.organizationUnits = organizationUnits;
        return this;
    }*/

    public OrganizationResource build(){
        OrganizationResource organization = new OrganizationResource();
        organization.setName(name);
        organization.setImage(image);
        organization.setCode(code);
        organization.setDescription(description);
        organization.setWebsite(website);
/*        organization.setAddresses(addresses);
        organization.setContactPersons(contactPersons);
        organization.setCurrencies(currencies);
        organization.setTimezones(timezones);
        organization.setPhones(phones);
        organization.setEmails(emails);
        organization.setOrganizationUnits(organizationUnits);*/
        return organization;
    }
}