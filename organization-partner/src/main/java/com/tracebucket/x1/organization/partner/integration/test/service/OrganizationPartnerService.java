package com.tracebucket.x1.organization.partner.integration.test.service;

import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultOrganization;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultPartner;

import java.util.Map;
import java.util.Set;

/**
 * Created by sadath on 04-Jun-2015.
 */
public interface OrganizationPartnerService {
    public DefaultPartner addPartnerToOrganization(String organizationUid, String partnerUid);
    public Map<DefaultOrganization, Set<DefaultPartner>> getOrganizationsPartners();
}