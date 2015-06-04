package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.api.domain.OrganizationFunction;
import com.tracebucket.x1.organization.partner.integration.test.builder.OrganizationUnitResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 31-Mar-15.
 */
public class OrganizationUnitResourceFixture {
    public static OrganizationUnitResource standardOrganizationUnitResource(){
        OrganizationResource organization = null;
        OrganizationUnitResource parent = null;

        Set<DepartmentResource> departments = new HashSet<DepartmentResource>();
        departments.add(DepartmentResourceFixture.standardDepartment());

        Set<BusinessLineResource> businessLines = new HashSet<BusinessLineResource>();
        businessLines.add(BusinessLineResourceFixture.standardBusinessLine());

        Set<OrganizationFunction> organizationFunctions = new HashSet<OrganizationFunction>();
        organizationFunctions.add(OrganizationFunction.SALES);
        organizationFunctions.add(OrganizationFunction.PURCHASE);

/*        Set<OrganizationUnitResource> children = new HashSet<OrganizationUnitResource>();
        children.add(OrganizationUnitFixture.standardOrganizationUnit());*/

        Set<AddressResource> addresses = new HashSet<AddressResource>(0);
        addresses.add(AddressResourceFixture.standardAddress());
        addresses.add(AddressResourceFixture.headOffice());

        Set<PersonResource> contactPersons = new HashSet<PersonResource>(0);
        contactPersons.add(PersonResourceFixture.standardPerson());

        Set<PhoneResource> phones = new HashSet<PhoneResource>(0);
        phones.add(PhoneResourceFixture.standardPhone());

        Set<EmailResource> emails = new HashSet<EmailResource>(0);
        emails.add(EmailResourceFixture.standardEmail());

        OrganizationUnitResource organizationUnit = OrganizationUnitResourceBuilder.anOrganizationUnitResourceBuilder()
                .withName("OrganizationResource " + new Date().getTime())
                .withDescription(UUID.randomUUID().toString())
                .withBusinessLines(businessLines)
                        //.withChildren(children)
                .withDepartments(departments)
                .withOrganizationFunctions(organizationFunctions)
                .withOrganization(organization)
                .withParent(parent)
                .withAddresses(addresses)
                .withContactPersons(contactPersons)
                .withPhones(phones)
                .withEmails(emails)
                .build();
        return organizationUnit;
    }
}