package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultEmail;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPerson;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPhone;
import com.tracebucket.x1.organization.api.domain.OrganizationFunction;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultBusinessLine;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultDepartment;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultOrganization;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultOrganizationUnit;
import com.tracebucket.x1.organization.partner.integration.test.builder.OrganizationUnitBuilder;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by sadath on 25-Nov-14.
 */
public class OrganizationUnitFixture {
    public static DefaultOrganizationUnit standardOrganizationUnit(){
        DefaultOrganization organization = null;
        DefaultOrganizationUnit parent = null;

        Set<DefaultDepartment> departments = new HashSet<DefaultDepartment>();
        departments.add(DepartmentFixture.standardDepartment());

        Set<DefaultBusinessLine> businessLines = new HashSet<DefaultBusinessLine>();
        businessLines.add(BusinessLineFixture.standardBusinessLine());

        Set<OrganizationFunction> organizationFunctions = new HashSet<OrganizationFunction>();
        organizationFunctions.add(OrganizationFunction.SALES);
        organizationFunctions.add(OrganizationFunction.PURCHASE);

/*        Set<DefaultOrganizationUnit> children = new HashSet<DefaultOrganizationUnit>();
        children.add(DefaultOrganizationUnitFixture.standardOrganizationUnit());*/

        Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);
        addresses.add(AddressFixture.standardAddress());
        addresses.add(AddressFixture.headOffice());

        Set<DefaultPerson> contactPersons = new HashSet<DefaultPerson>(0);
        contactPersons.add(PersonFixture.standardPerson());

        Set<DefaultPhone> phones = new HashSet<DefaultPhone>(0);
        phones.add(PhoneFixture.standardPhone());

        Set<DefaultEmail> emails = new HashSet<DefaultEmail>(0);
        emails.add(EmailFixture.standardEmail());

        DefaultOrganizationUnit organizationUnit = OrganizationUnitBuilder.anOrganizationUnitBuilder()
                //.withName("Yorkshire")
                .withName("Organization " + new Date().getTime())
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

    public static DefaultOrganizationUnit standardOrganizationUnit2(){
        DefaultOrganization organization = null;
        DefaultOrganizationUnit parent = null;

        Set<DefaultDepartment> departments = new HashSet<DefaultDepartment>();
        departments.add(DepartmentFixture.standardDepartment());

        Set<DefaultBusinessLine> businessLines = new HashSet<DefaultBusinessLine>();
        businessLines.add(BusinessLineFixture.standardBusinessLine());

        Set<OrganizationFunction> organizationFunctions = new HashSet<OrganizationFunction>();
        organizationFunctions.add(OrganizationFunction.SALES);
        organizationFunctions.add(OrganizationFunction.PURCHASE);

/*        Set<DefaultOrganizationUnit> children = new HashSet<DefaultOrganizationUnit>();
        children.add(DefaultOrganizationUnitFixture.standardOrganizationUnit());*/

        Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);
        addresses.add(AddressFixture.standardAddress());
        addresses.add(AddressFixture.headOffice());

        Set<DefaultPerson> contactPersons = new HashSet<DefaultPerson>(0);
        contactPersons.add(PersonFixture.standardPerson());

        Set<DefaultPhone> phones = new HashSet<DefaultPhone>(0);
        phones.add(PhoneFixture.standardPhone());

        Set<DefaultEmail> emails = new HashSet<DefaultEmail>(0);
        emails.add(EmailFixture.standardEmail());

        DefaultOrganizationUnit organizationUnit = OrganizationUnitBuilder.anOrganizationUnitBuilder()
                .withName("Berkshire")
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
