package com.tracebucket.x1.organization.partner.integration.test.service;

import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultPartner;
import com.tracebucket.x1.partner.api.rest.resources.DefaultPartnerResource;
import org.springframework.http.ResponseEntity;

/**
 * Created by sadath on 04-Jun-2015.
 */
public interface OrganizationPartnerService {
    public DefaultPartner addPartnerToOrganization(String organizationUid, String partnerUid);
}