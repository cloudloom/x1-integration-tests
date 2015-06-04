package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultBusinessLine;

/**
 * Created by sadath on 25-Nov-14.
 */
public class BusinessLineBuilder {
    private String name;
    private String description;

    public BusinessLineBuilder(){ }

    public static BusinessLineBuilder aBusinessLine(){
        return new BusinessLineBuilder();
    }

    public BusinessLineBuilder withName(String name){
        this.name = name;
        return this;
    }

    public BusinessLineBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public DefaultBusinessLine build(){
        DefaultBusinessLine businessLine = new DefaultBusinessLine();
        businessLine.setName(name);
        businessLine.setDescription(description);
        return businessLine;
    }
}
