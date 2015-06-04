package com.tracebucket.x1.organization.partner.integration.test.rest.resources;

import com.tracebucket.tron.assembler.BaseResource;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 26-May-2015.
 */
public class PartnerRoleResource extends BaseResource {
    private String name;
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AddressResource> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
    }
}