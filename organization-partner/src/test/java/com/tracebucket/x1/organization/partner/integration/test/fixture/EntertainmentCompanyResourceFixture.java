package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.EntertainmentCompanyResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.EntertainmentCompanyResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.PersonResource;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class EntertainmentCompanyResourceFixture {
    public static EntertainmentCompanyResource standardEntertainmentCompany() {
        Set<AddressResource> addresses = new HashSet<AddressResource>();
        addresses.add(AddressResourceFixture.standardAddress());

        Set<PersonResource> persons = new HashSet<PersonResource>();
        persons.add(PersonResourceFixture.standardPerson());

        EntertainmentCompanyResource entertainmentCompany = EntertainmentCompanyResourceBuilder.anEntertainmentCompanyBuilder()
                .withName(UUID.randomUUID().toString())
                .withLogo(UUID.randomUUID().toString())
                .withWebsite(UUID.randomUUID().toString())
                .withAddresses(addresses)
                .withContactPersons(persons)
                .build();
        return entertainmentCompany;
    }
}