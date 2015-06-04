package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.PhoneType;
import com.tracebucket.x1.organization.partner.integration.test.builder.PhoneResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.PhoneResource;

import java.util.Date;

/**
 * Created by sadath on 16-Apr-15.
 */
public class PhoneResourceFixture {
    public static PhoneResource standardPhone() {
        PhoneResource email = PhoneResourceBuilder.aPhoneBuilder()
                .withExtension(new Long(new Date().getTime()).intValue())
                .withNumber(new Date().getTime())
                .withPhoneType(PhoneType.HOME)
                .build();
        return email;
    }
}