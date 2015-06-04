package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPerson;
import com.tracebucket.x1.organization.partner.integration.test.builder.EntertainmentCompanyBuilder;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultEntertainmentCompany;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class EntertainmentCompanyFixture {
    public static DefaultEntertainmentCompany standardEntertainmentCompany() {
        Set<DefaultAddress> addresses = new HashSet<DefaultAddress>();
        addresses.add(AddressFixture.standardAddress());

        Set<DefaultPerson> persons = new HashSet<DefaultPerson>();
        persons.add(PersonFixture.standardPerson());

        DefaultEntertainmentCompany entertainmentCompany = EntertainmentCompanyBuilder.anEntertainmentCompanyBuilder()
                .withName(UUID.randomUUID().toString())
                .withLogo(UUID.randomUUID().toString())
                .withWebsite(UUID.randomUUID().toString())
                .withAddresses(addresses)
                .withContactPersons(persons)
                .build();
        return entertainmentCompany;
    }
}