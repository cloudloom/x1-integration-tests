package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultEmail;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPerson;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPhone;
import com.tracebucket.x1.organization.api.domain.OrganizationFunction;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultBusinessLine;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultDepartment;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultOrganization;
import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultOrganizationUnit;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 25-Nov-14.
 */
public class OrganizationUnitBuilder {
    private String name;
    private String description;
    private DefaultOrganization organization;
    private DefaultOrganizationUnit parent;
    private Set<OrganizationFunction> organizationFunctions = new HashSet<OrganizationFunction>(0);
    private Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);
    private Set<DefaultPerson> contactPersons = new HashSet<DefaultPerson>(0);
    private Set<DefaultPhone> phones = new HashSet<DefaultPhone>(0);
    private Set<DefaultEmail> emails = new HashSet<DefaultEmail>(0);
    private Set<DefaultDepartment> departments = new HashSet<DefaultDepartment>(0);
    private Set<DefaultBusinessLine> businessLines = new HashSet<DefaultBusinessLine>(0);
    private Set<DefaultOrganizationUnit> children = new HashSet<DefaultOrganizationUnit>(0);

    private OrganizationUnitBuilder(){ }

    public static OrganizationUnitBuilder anOrganizationUnitBuilder(){
        return new OrganizationUnitBuilder();
    }

    public OrganizationUnitBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public OrganizationUnitBuilder withName(String name){
        this.name = name;
        return this;
    }

    public OrganizationUnitBuilder withOrganization(DefaultOrganization organization){
        this.organization = organization;
        return this;
    }

    public OrganizationUnitBuilder withParent(DefaultOrganizationUnit parent){
        this.parent = parent;
        return this;
    }

    public OrganizationUnitBuilder withOrganizationFunctions(Set<OrganizationFunction> organizationFunctions){
        this.organizationFunctions = organizationFunctions;
        return this;
    }

    public OrganizationUnitBuilder withAddresses(Set<DefaultAddress> addresses){
        this.addresses = addresses;
        return this;
    }

    public OrganizationUnitBuilder withContactPersons(Set<DefaultPerson> contactPersons){
        this.contactPersons = contactPersons;
        return this;
    }

    public OrganizationUnitBuilder withPhones(Set<DefaultPhone> phones){
        this.phones = phones;
        return this;
    }

    public OrganizationUnitBuilder withEmails(Set<DefaultEmail> emails){
        this.emails = emails;
        return this;
    }

    public OrganizationUnitBuilder withDepartments(Set<DefaultDepartment> departments){
        this.departments = departments;
        return this;
    }

    public OrganizationUnitBuilder withBusinessLines(Set<DefaultBusinessLine> businessLines){
        this.businessLines = businessLines;
        return this;
    }

    public OrganizationUnitBuilder withChildren(Set<DefaultOrganizationUnit> children){
        this.children = children;
        return this;
    }

    public DefaultOrganizationUnit build(){
        DefaultOrganizationUnit organizationUnit = new DefaultOrganizationUnit();
        organizationUnit.setName(name);
        organizationUnit.setDescription(description);
        organizationUnit.setBusinessLines(businessLines);
        organizationUnit.setChildren(children);
        organizationUnit.setDepartments(departments);
        organizationUnit.setOrganizationFunctions(organizationFunctions);
        organizationUnit.setParent(parent);
        organizationUnit.setOrganization(organization);
        organizationUnit.setEmails(emails);
        organizationUnit.setContactPersons(contactPersons);
        organizationUnit.setPhones(phones);
        organizationUnit.setAddresses(addresses);
        return organizationUnit;
    }
}