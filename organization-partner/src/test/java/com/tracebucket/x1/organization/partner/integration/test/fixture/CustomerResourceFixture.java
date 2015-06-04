package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.Gender;
import com.tracebucket.x1.organization.partner.integration.test.builder.CustomerResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.CustomerResource;
import com.tracebucket.x1.partner.api.dictionary.Salutation;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class CustomerResourceFixture {
    public static CustomerResource standardCustomer() {
        Set<AddressResource> addresses = new HashSet<AddressResource>();
        addresses.add(AddressResourceFixture.standardAddress());

        CustomerResource customer = CustomerResourceBuilder.aCustomerBuilder()
                .withName(UUID.randomUUID().toString())
                .withBirthDay(new Date())
                .withEmail(UUID.randomUUID().toString())
                .withFirstName(UUID.randomUUID().toString())
                .withGender(Gender.MALE)
                .withInitial(UUID.randomUUID().toString())
                .withLastName(UUID.randomUUID().toString())
                .withMiddleName(UUID.randomUUID().toString())
                .withSalutation(Salutation.Mr)
                .withAddresses(addresses)
                .build();
        return customer;
    }
}