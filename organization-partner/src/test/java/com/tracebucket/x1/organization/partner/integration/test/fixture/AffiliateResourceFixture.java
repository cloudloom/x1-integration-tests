package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.AffiliateResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AffiliateResource;

import java.util.Date;

/**
 * Created by Vishwajit on 27-05-2015.
 */
public class AffiliateResourceFixture {

    public static AffiliateResource standardAffiliate() {

        AffiliateResource partner = AffiliateResourceBuilder.anAffiliateBuilder()
                .withBusinessName("MMPBV")
                .withWebsite("www.mmpbv.nl")
                .withCode("XYZ_123")
                .withDateOfIncorporation((new Date()))
                .withLogo("mmp.png")
                .build();
        return partner;
    }
}
