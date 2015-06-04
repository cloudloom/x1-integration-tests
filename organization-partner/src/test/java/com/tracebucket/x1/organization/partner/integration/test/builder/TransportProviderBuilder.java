package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultTransportProvider;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 01-Jun-2015.
 */
public class TransportProviderBuilder {
    private String name;
    private Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);

    private TransportProviderBuilder() {

    }

    public static TransportProviderBuilder aTransportProviderBuilder() {
        return new TransportProviderBuilder();
    }

    public TransportProviderBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TransportProviderBuilder withAddresses(Set<DefaultAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    public DefaultTransportProvider build() {
        DefaultTransportProvider museum = new DefaultTransportProvider();
        museum.setAddresses(this.addresses);
        museum.setName(this.name);
        return museum;
    }
}