package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.TimezoneType;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.TimezoneResource;

/**
 * Created by sadath on 16-Apr-15.
 */
public class TimezoneResourceBuilder {
    private String name;
    private String abbreviation;
    private Integer utcOffset;
    private String image;
    private TimezoneType timezoneType;

    private TimezoneResourceBuilder(){

    }

    public static TimezoneResourceBuilder aDefaultTimezoneResourceBuilder(){
        return new TimezoneResourceBuilder();
    }

    public TimezoneResourceBuilder withName(String name){
        this.name = name;
        return this;
    }

    public TimezoneResourceBuilder withAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
        return this;
    }

    public TimezoneResourceBuilder withUtcOffset(Integer utcOffset){
        this.utcOffset = utcOffset;
        return this;
    }

    public TimezoneResourceBuilder withImage(String image){
        this.image = image;
        return this;
    }

    public TimezoneResourceBuilder withTimezoneType(TimezoneType timezoneType){
        this.timezoneType = timezoneType;
        return this;
    }

    public TimezoneResource build(){
        TimezoneResource timezone = new TimezoneResource();
        timezone.setImage(image);
        timezone.setAbbreviation(abbreviation);
        timezone.setName(name);
        timezone.setTimezoneType(timezoneType);
        timezone.setUtcOffset(utcOffset);
        return timezone;
    }
}