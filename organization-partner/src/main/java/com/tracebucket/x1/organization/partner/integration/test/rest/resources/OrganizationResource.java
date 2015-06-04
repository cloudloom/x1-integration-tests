package com.tracebucket.x1.organization.partner.integration.test.rest.resources;


import com.tracebucket.tron.assembler.BaseResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 31-Mar-15.
 */
public class OrganizationResource extends BaseResource {
    private String code;
    private String name;
    private String description;
    private String website;
    protected String image;
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);
    private Set<CurrencyResource> currencies = new HashSet<CurrencyResource>(0);
    private Set<TimezoneResource> timezones = new HashSet<TimezoneResource>(0);
    private Set<PersonResource> contactPersons = new HashSet<PersonResource>(0);
    private Set<PhoneResource> phones = new HashSet<PhoneResource>(0);
    private Set<EmailResource> emails = new HashSet<EmailResource>(0);
    private Set<OrganizationUnitResource> organizationUnits = new HashSet<OrganizationUnitResource>(0);

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<AddressResource> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
    }

    public Set<CurrencyResource> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Set<CurrencyResource> currencies) {
        this.currencies = currencies;
    }

    public Set<TimezoneResource> getTimezones() {
        return timezones;
    }

    public void setTimezones(Set<TimezoneResource> timezones) {
        this.timezones = timezones;
    }

    public Set<PersonResource> getContactPersons() {
        return contactPersons;
    }

    public void setContactPersons(Set<PersonResource> contactPersons) {
        this.contactPersons = contactPersons;
    }

    public Set<PhoneResource> getPhones() {
        return phones;
    }

    public void setPhones(Set<PhoneResource> phones) {
        this.phones = phones;
    }

    public Set<EmailResource> getEmails() {
        return emails;
    }

    public void setEmails(Set<EmailResource> emails) {
        this.emails = emails;
    }

    public Set<OrganizationUnitResource> getOrganizationUnits() {
        return organizationUnits;
    }

    public void setOrganizationUnits(Set<OrganizationUnitResource> organizationUnits) {
        this.organizationUnits = organizationUnits;
    }
}