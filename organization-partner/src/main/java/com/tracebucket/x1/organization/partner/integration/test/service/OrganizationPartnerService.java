package com.tracebucket.x1.organization.partner.integration.test.service;

import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultPartner;

/**
 * Created by sadath on 04-Jun-2015.
 */
public interface OrganizationPartnerService {
    public DefaultPartner addPartnerToOrganization(String organizationUid, String partnerUid);
}