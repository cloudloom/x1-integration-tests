package com.tracebucket.x1.organization.partner.integration.test.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tracebucket.x1.organization.api.rest.resource.DefaultOrganizationResource;
import com.tracebucket.x1.organization.partner.integration.test.OrganizationPartnerStarter;
import com.tracebucket.x1.organization.partner.integration.test.fixture.OrganizationResourceFixture;
import com.tracebucket.x1.organization.partner.integration.test.fixture.PartnerResourceFixture;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.OrganizationResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.PartnerResource;
import com.tracebucket.x1.partner.api.rest.resources.DefaultPartnerResource;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Created by sadath on 04-Jun-2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = OrganizationPartnerStarter.class)
@WebIntegrationTest
public class OrganizationPartnerControllerTest {
    private static final Logger log = LoggerFactory.getLogger(OrganizationPartnerControllerTest.class);

    private RestTemplate restTemplate = null;

    @Value("http://localhost:${server.port}${server.contextPath}")
    private String basePath;

    @Autowired
    private ObjectMapper objectMapper;

    private OrganizationResource organization = null;

    private PartnerResource partner = null;

    @Before
    public void setUp() {
        restTemplate = new RestTemplate();
    }

    private void createOrganization() throws Exception{
        organization = OrganizationResourceFixture.standardOrganization();
        log.info("Create Organization : " + objectMapper.writeValueAsString(organization));
        organization = restTemplate.postForObject(basePath+"/organization", organization, OrganizationResource.class);
        Assert.assertNotNull(organization);
    }

    private void createPartner() throws Exception{
        partner = PartnerResourceFixture.standardPartner();
        log.info("Create Partner : " + objectMapper.writeValueAsString(partner));
        partner = restTemplate.postForObject(basePath + "/partner", partner, PartnerResource.class);
        Assert.assertNotNull(partner);
    }

    @Test
    public void testCreate() throws Exception {
        createOrganization();
        createPartner();
        Assert.assertNotNull(organization.getUid());
        Assert.assertNotNull(partner.getUid());
    }

    @Test
    public void testAddPartnerToOrganization() throws Exception {
        createOrganization();
        createPartner();
        restTemplate.put(basePath + "/organization/" + organization.getUid() + "/partner/" + partner.getUid(), null);
        partner = restTemplate.getForObject(basePath + "/partner/" + partner.getUid(), PartnerResource.class);
        Assert.assertNotNull(partner.getUid());
        Assert.assertNotNull(partner.getOwner());
        Assert.assertNotNull(partner.getOwner().getOrganizationUID());
    }

    @Test
    public void testGetOrganizationsPartners() throws Exception {
        createOrganization();
        createPartner();
        restTemplate.put(basePath + "/organization/" + organization.getUid() + "/partner/" + partner.getUid(), null);
        partner = restTemplate.getForObject(basePath + "/partner/" + partner.getUid(), PartnerResource.class);
        Assert.assertNotNull(partner.getUid());
        Assert.assertNotNull(partner.getOwner());
        Assert.assertNotNull(partner.getOwner().getOrganizationUID());
        Map<DefaultOrganizationResource, List<DefaultPartnerResource>> response = restTemplate.getForObject(basePath + "/organizations/partners", Map.class);
        Assert.assertNotNull(response);
        Assert.assertTrue(response.size() > 0);
    }

    @After
    public void tearDown() throws Exception{
        if(organization != null && organization.getUid() != null) {
            restTemplate.delete(basePath + "/organization/" + organization.getUid());
            try {
                restTemplate.getForEntity(new URI(basePath + "/organization/" + organization.getUid()), DefaultOrganizationResource.class);
            } catch (HttpClientErrorException httpClientErrorException) {
                Assert.assertEquals(HttpStatus.NOT_FOUND, httpClientErrorException.getStatusCode());
            }
        }
        if(partner != null && partner.getUid() != null) {
            restTemplate.delete(basePath + "/partner/" + partner.getUid());
            try {
                restTemplate.getForEntity(new URI(basePath + "/partner/" + partner.getUid()), PartnerResource.class);
            } catch (HttpClientErrorException httpClientErrorException) {
                Assert.assertEquals(HttpStatus.NOT_FOUND, httpClientErrorException.getStatusCode());
            }
        }
    }
}