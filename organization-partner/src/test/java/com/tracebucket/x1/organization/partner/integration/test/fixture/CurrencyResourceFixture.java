package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.CurrencyType;
import com.tracebucket.x1.organization.partner.integration.test.builder.CurrencyResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.CurrencyResource;

/**
 * Created by sadath on 16-Apr-15.
 */
public class CurrencyResourceFixture {
    public static CurrencyResource standardBaseCurrency() {
        CurrencyResource currency = CurrencyResourceBuilder.aDefaultCurrencyResourceBuilder()
                .withImage("Image")
                .withIso4217Code("iso4217code")
                .withSubUnit110("subunit110")
                .withName("INR")
                .withCurrencyType(CurrencyType.BASE)
                .build();
        return currency;
    }
}