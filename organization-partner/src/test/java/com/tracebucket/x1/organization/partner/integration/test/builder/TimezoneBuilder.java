package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.TimezoneType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultTimezone;

/**
 * Created by sadath on 16-Apr-15.
 */
public class TimezoneBuilder {
    private String name;
    private String abbreviation;
    private Integer utcOffset;
    private String image;
    private TimezoneType timezoneType;

    private TimezoneBuilder(){

    }

    public static TimezoneBuilder aDefaultTimezoneBuilder(){
        return new TimezoneBuilder();
    }

    public TimezoneBuilder withName(String name){
        this.name = name;
        return this;
    }

    public TimezoneBuilder withAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
        return this;
    }

    public TimezoneBuilder withUtcOffset(Integer utcOffset){
        this.utcOffset = utcOffset;
        return this;
    }

    public TimezoneBuilder withImage(String image){
        this.image = image;
        return this;
    }

    public TimezoneBuilder withTimezoneType(TimezoneType timezoneType){
        this.timezoneType = timezoneType;
        return this;
    }

    public DefaultTimezone build(){
        DefaultTimezone timezone = new DefaultTimezone();
        timezone.setImage(image);
        timezone.setAbbreviation(abbreviation);
        timezone.setName(name);
        timezone.setTimezoneType(timezoneType);
        timezone.setUtcOffset(utcOffset);
        return timezone;
    }
}