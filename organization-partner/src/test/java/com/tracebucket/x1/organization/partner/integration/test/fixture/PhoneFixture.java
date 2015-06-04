package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.PhoneType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPhone;
import com.tracebucket.x1.organization.partner.integration.test.builder.PhoneBuilder;

import java.util.Date;

/**
 * Created by sadath on 25-Nov-14.
 */
public class PhoneFixture {
    public static DefaultPhone standardPhone() {
        DefaultPhone email = PhoneBuilder.aPhoneBuilder()
                .withExtension(new Long(new Date().getTime()).intValue())
                .withNumber(new Date().getTime())
                .withPhoneType(PhoneType.HOME)
                .build();
        return email;
    }
}
