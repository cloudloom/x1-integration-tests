package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultOwner;

/**
 * Created by vishwa on 23-01-2015.
 */
public class OwnerBuilder {
    private String organizationUID;

    private OwnerBuilder(){ }

    public static OwnerBuilder anOwnerBuilder(){
        return new OwnerBuilder();
    }

    public OwnerBuilder withOrganizationUID(String organizationUID){
        this.organizationUID = organizationUID;
        return this;
    }

    public DefaultOwner build(){
        DefaultOwner owner = new DefaultOwner();
        owner.setOrganizationUID(organizationUID);
        return owner;
    }
}