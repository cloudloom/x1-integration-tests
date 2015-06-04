package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.PartnerResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.PartnerResource;
import com.tracebucket.x1.partner.api.dictionary.PartnerCategory;

/**
 * Created by Vishwajit on 27-05-2015.
 */
public class PartnerResourceFixture {

    public static PartnerResource standardPartner() {

        PartnerResource partner = PartnerResourceBuilder.aPartnerBuilder()
                                          .withPartnerCategory(PartnerCategory.GROUP)
                                          .withImage("logo_1")
                                          .withTitle("title_1")
                                          .withWebsite("www.yyy.nl").build();
        return partner;
    }
}
