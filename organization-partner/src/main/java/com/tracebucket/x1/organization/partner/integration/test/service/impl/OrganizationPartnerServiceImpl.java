package com.tracebucket.x1.organization.partner.integration.test.service.impl;

import com.tracebucket.tron.ddd.annotation.PersistChanges;
import com.tracebucket.tron.ddd.domain.AggregateId;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultOrganization;
import com.tracebucket.x1.organization.api.service.DefaultOrganizationService;
import com.tracebucket.x1.organization.partner.integration.test.rest.exception.OrganizationPartnerException;
import com.tracebucket.x1.organization.partner.integration.test.service.OrganizationPartnerService;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultOwner;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultPartner;
import com.tracebucket.x1.partner.api.service.DefaultPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sadath on 04-Jun-2015.
 */
@Service
@Transactional
public class OrganizationPartnerServiceImpl implements OrganizationPartnerService {

    @Autowired
    private DefaultPartnerService partnerService;

    @Autowired
    private DefaultOrganizationService organizationService;

    @Override
    @PersistChanges(repository = "partnerRepository")
    public DefaultPartner addPartnerToOrganization(String organizationUid, String partnerUid) {
        DefaultPartner partner = partnerService.findOne(new AggregateId(partnerUid));
        DefaultOrganization organization = organizationService.findOne(new AggregateId(organizationUid));
        if(partner == null) {
            throw new OrganizationPartnerException("Partner With Uid = "+ partnerUid + " Not Found", HttpStatus.NOT_FOUND);
        } else if (organization == null) {
            throw new OrganizationPartnerException("Organization With Uid = "+ organizationUid + " Not Found", HttpStatus.NOT_FOUND);
        } else {
            partner.changeOwner(new DefaultOwner(organizationUid));
            return partner;
        }
    }

    @Override
    public Map<DefaultOrganization, Set<DefaultPartner>> getOrganizationsPartners() {
        List<DefaultOrganization> organizations = organizationService.findAll();
        ConcurrentHashMap<DefaultOrganization, Set<DefaultPartner>> response = new ConcurrentHashMap<DefaultOrganization, Set<DefaultPartner>>();
        if(organizations != null && organizations.size() > 0) {
            organizations.parallelStream().forEach(organization -> {
                List<DefaultPartner> partners = partnerService.findPartnersByOrganization(organization.getAggregateId().getAggregateId());
                response.put(organization, partners != null ? new HashSet<DefaultPartner>(partners) : Collections.emptySet());
            });
        }
        return response;
    }
}