package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultEmail;
import com.tracebucket.x1.organization.partner.integration.test.builder.EmailBuilder;

import java.util.UUID;

/**
 * Created by sadath on 25-Nov-14.
 */
public class EmailFixture {
    public static DefaultEmail standardEmail() {
        DefaultEmail email = EmailBuilder.anEmailBuilder()
                .withEmail(UUID.randomUUID().toString())
                .withEmailType(EmailType.BUSINESS)
                .build();
        return email;
    }
}
