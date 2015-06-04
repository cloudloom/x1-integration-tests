package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.Gender;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.CustomerResource;
import com.tracebucket.x1.partner.api.dictionary.Salutation;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class CustomerResourceBuilder {
    private String initial;
    private Salutation salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDay;
    private Gender gender;
    private String email;
    private String name;
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);

    private CustomerResourceBuilder() {

    }

    public static CustomerResourceBuilder aCustomerBuilder() {
        return new CustomerResourceBuilder();
    }

    public CustomerResourceBuilder withInitial(String initial) {
        this.initial = initial;
        return this;
    }

    public CustomerResourceBuilder withSalutation(Salutation salutation) {
        this.salutation = salutation;
        return this;
    }

    public CustomerResourceBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerResourceBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public CustomerResourceBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerResourceBuilder withBirthDay(Date birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public CustomerResourceBuilder withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public CustomerResourceBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerResourceBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CustomerResourceBuilder withAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
        return this;
    }

    public CustomerResource build() {
        CustomerResource customer = new CustomerResource();
        customer.setInitial(this.initial);
        customer.setSalutation(this.salutation);
        customer.setFirstName(this.firstName);
        customer.setMiddleName(this.middleName);
        customer.setLastName(this.lastName);
        customer.setBirthDay(this.birthDay);
        customer.setGender(this.gender);
        customer.setEmail(this.email);
        customer.setName(this.name);
        customer.setAddresses(this.addresses);
        return customer;
    }
}