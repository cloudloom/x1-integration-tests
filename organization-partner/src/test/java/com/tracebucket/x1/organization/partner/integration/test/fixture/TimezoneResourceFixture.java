package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.TimezoneType;
import com.tracebucket.x1.organization.partner.integration.test.builder.TimezoneResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.TimezoneResource;

/**
 * Created by sadath on 16-Apr-15.
 */
public class TimezoneResourceFixture {
    public static TimezoneResource standardTimezone() {
        TimezoneResource timezone = TimezoneResourceBuilder.aDefaultTimezoneResourceBuilder()
                .withTimezoneType(TimezoneType.DEFAULT)
                .withAbbreviation("Greenwich")
                .withImage("image")
                .withName("GMT")
                .withUtcOffset(0)
                .build();
        return timezone;
    }
}