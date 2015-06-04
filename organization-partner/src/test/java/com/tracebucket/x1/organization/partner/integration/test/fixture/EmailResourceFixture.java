package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.organization.partner.integration.test.builder.EmailResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.EmailResource;

import java.util.UUID;

/**
 * Created by sadath on 16-Apr-15.
 */
public class EmailResourceFixture {
    public static EmailResource standardEmail() {
        EmailResource email = EmailResourceBuilder.anEmailResourceBuilder()
                .withEmail(UUID.randomUUID().toString())
                .withEmailType(EmailType.BUSINESS)
                .build();
        return email;
    }
}