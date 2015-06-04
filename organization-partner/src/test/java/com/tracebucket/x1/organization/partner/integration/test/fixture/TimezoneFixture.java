package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.TimezoneType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultTimezone;
import com.tracebucket.x1.organization.partner.integration.test.builder.TimezoneBuilder;

/**
 * Created by sadath on 16-Apr-15.
 */
public class TimezoneFixture {
    public static DefaultTimezone standardTimezone() {
        DefaultTimezone timezone = TimezoneBuilder.aDefaultTimezoneBuilder()
                .withTimezoneType(TimezoneType.DEFAULT)
                .withAbbreviation("Greenwich")
                .withImage("image")
                .withName("GMT")
                .withUtcOffset(0)
                .build();
        return timezone;
    }
}