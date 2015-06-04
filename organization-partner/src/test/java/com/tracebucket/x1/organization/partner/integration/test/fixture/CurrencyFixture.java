package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.CurrencyType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultCurrency;
import com.tracebucket.x1.organization.partner.integration.test.builder.CurrencyBuilder;

/**
 * Created by sadath on 16-Apr-15.
 */
public class CurrencyFixture {
    public static DefaultCurrency standardBaseCurrency() {
        DefaultCurrency currency = CurrencyBuilder.aDefaultCurrencyBuilder()
                .withImage("Image")
                .withIso4217Code("iso4217code")
                .withSubUnit110("subunit110")
                .withName("INR")
                .withCurrencyType(CurrencyType.BASE)
                .build();
        return currency;
    }
}