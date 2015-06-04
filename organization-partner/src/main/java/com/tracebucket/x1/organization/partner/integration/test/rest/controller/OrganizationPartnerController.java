package com.tracebucket.x1.organization.partner.integration.test.rest.controller;

import com.tracebucket.tron.assembler.AssemblerResolver;
import com.tracebucket.x1.organization.partner.integration.test.rest.exception.OrganizationPartnerException;
import com.tracebucket.x1.organization.partner.integration.test.service.OrganizationPartnerService;
import com.tracebucket.x1.organization.partner.integration.test.service.impl.OrganizationPartnerServiceImpl;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultPartner;
import com.tracebucket.x1.partner.api.rest.resources.DefaultPartnerResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sadath on 04-Jun-2015.
 */
@RestController
public class OrganizationPartnerController {
    private static Logger log = LoggerFactory.getLogger(OrganizationPartnerController.class);

    @Autowired
    private OrganizationPartnerService partnerService;

    @Autowired
    private AssemblerResolver assemblerResolver;

    @RequestMapping(value = "/organization/{organizationUid}/partner/{partnerUid}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DefaultPartnerResource> addPartnerToOrganization(@PathVariable("organizationUid") String organizationUid, @PathVariable("partnerUid") String partnerUid) {
        DefaultPartner partner = null;
        try {
            partner = partnerService.addPartnerToOrganization(organizationUid, partnerUid);
        } catch (OrganizationPartnerException ope) {
            throw ope;
        }
        if(partner != null) {
            DefaultPartnerResource partnerResource = assemblerResolver.resolveResourceAssembler(DefaultPartnerResource.class, DefaultPartner.class).toResource(partner, DefaultPartnerResource.class);
            return new ResponseEntity<DefaultPartnerResource>(partnerResource, HttpStatus.CREATED);
        }
        return new ResponseEntity<DefaultPartnerResource>(new DefaultPartnerResource(), HttpStatus.NOT_ACCEPTABLE);
    }
}