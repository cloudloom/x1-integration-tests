package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.PartnerBuilder;
import com.tracebucket.x1.partner.api.dictionary.PartnerCategory;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultAffiliate;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultPartner;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultPartnerRole;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 11-Aug-14.
 */
public class PartnerFixture {

    public static DefaultPartner standardPartner() {

        Set<DefaultPartnerRole> partnerRoles = new HashSet<DefaultPartnerRole>();
        DefaultAffiliate affiliate = AffiliateFixture.standardAffiliate();
        partnerRoles.add(affiliate);

        DefaultPartner partner = PartnerBuilder.aPartnerBuilder()
                .withPartnerCategory(PartnerCategory.GROUP)
                .withImage("logo_1")
                .withTitle("title_1")
                //.withPartnerRoles(partnerRoles)
                .withWebsite("www.yyy.nl").build();
        return partner;
    }
}
