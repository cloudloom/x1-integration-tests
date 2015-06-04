package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.partner.integration.test.rest.resources.OwnerResource;

/**
 * Created by vishwa on 23-01-2015.
 */
public class OwnerResourceBuilder {
    private String organizationUID;

    private OwnerResourceBuilder(){ }

    public static OwnerResourceBuilder anOwnerBuilder(){
        return new OwnerResourceBuilder();
    }

    public OwnerResourceBuilder withOrganizationUID(String organizationUID){
        this.organizationUID = organizationUID;
        return this;
    }

    public OwnerResource build(){
        OwnerResource owner = new OwnerResource();
        owner.setOrganizationUID(organizationUID);
        return owner;
    }
}