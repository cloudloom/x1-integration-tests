package com.tracebucket.x1.partner.integration.test.fixture;

import com.tracebucket.x1.partner.api.rest.resources.DefaultAffiliateResource;
import com.tracebucket.x1.partner.integration.test.builder.DefaultAffiliateResourceBuilder;

import java.util.Date;

/**
 * Created by Vishwajit on 27-05-2015.
 */
public class DefaultAffiliateResourceFixture {

    public static DefaultAffiliateResource standardAffiliate() {

        DefaultAffiliateResource partner = DefaultAffiliateResourceBuilder.anAffiliateBuilder()
                .withBusinessName("MMPBV")
                .withWebsite("www.mmpbv.nl")
                .withCode("XYZ_123")
                .withDateOfIncorporation((new Date()))
                .withLogo("mmp.png")
                .build();
        return partner;
    }
}
