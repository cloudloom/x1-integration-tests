package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.Gender;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.partner.api.dictionary.Salutation;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultCustomer;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class CustomerBuilder {
    private String initial;
    private Salutation salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDay;
    private Gender gender;
    private String email;
    private String name;
    private Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);

    private CustomerBuilder() {

    }

    public static CustomerBuilder aCustomerBuilder() {
        return new CustomerBuilder();
    }

    public CustomerBuilder withInitial(String initial) {
        this.initial = initial;
        return this;
    }

    public CustomerBuilder withSalutation(Salutation salutation) {
        this.salutation = salutation;
        return this;
    }

    public CustomerBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder withMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public CustomerBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder withBirthDay(Date birthDay) {
        this.birthDay = birthDay;
        return this;
    }

    public CustomerBuilder withGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public CustomerBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder withAddresses(Set<DefaultAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public DefaultCustomer build() {
        DefaultCustomer customer = new DefaultCustomer();
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