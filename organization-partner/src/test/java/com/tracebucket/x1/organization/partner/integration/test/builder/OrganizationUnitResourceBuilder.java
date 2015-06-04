package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.api.domain.OrganizationFunction;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.*;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 31-Mar-15.
 */
public class OrganizationUnitResourceBuilder {
    private String name;
    private String description;
    private OrganizationResource organization;
    private OrganizationUnitResource parent;
    private Set<OrganizationFunction> organizationFunctions = new HashSet<OrganizationFunction>(0);
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);
    private Set<PersonResource> contactPersons = new HashSet<PersonResource>(0);
    private Set<PhoneResource> phones = new HashSet<PhoneResource>(0);
    private Set<EmailResource> emails = new HashSet<EmailResource>(0);
    private Set<DepartmentResource> departments = new HashSet<DepartmentResource>(0);
    private Set<BusinessLineResource> businessLines = new HashSet<BusinessLineResource>(0);
    private Set<OrganizationUnitResource> children = new HashSet<OrganizationUnitResource>(0);

    private OrganizationUnitResourceBuilder(){ }

    public static OrganizationUnitResourceBuilder anOrganizationUnitResourceBuilder(){
        return new OrganizationUnitResourceBuilder();
    }

    public OrganizationUnitResourceBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public OrganizationUnitResourceBuilder withName(String name){
        this.name = name;
        return this;
    }

    public OrganizationUnitResourceBuilder withOrganization(OrganizationResource organization){
        this.organization = organization;
        return this;
    }

    public OrganizationUnitResourceBuilder withParent(OrganizationUnitResource parent){
        this.parent = parent;
        return this;
    }

    public OrganizationUnitResourceBuilder withOrganizationFunctions(Set<OrganizationFunction> organizationFunctions){
        this.organizationFunctions = organizationFunctions;
        return this;
    }

    public OrganizationUnitResourceBuilder withAddresses(Set<AddressResource> addresses){
        this.addresses = addresses;
        return this;
    }

    public OrganizationUnitResourceBuilder withContactPersons(Set<PersonResource> contactPersons){
        this.contactPersons = contactPersons;
        return this;
    }

    public OrganizationUnitResourceBuilder withPhones(Set<PhoneResource> phones){
        this.phones = phones;
        return this;
    }

    public OrganizationUnitResourceBuilder withEmails(Set<EmailResource> emails){
        this.emails = emails;
        return this;
    }

    public OrganizationUnitResourceBuilder withDepartments(Set<DepartmentResource> departments){
        this.departments = departments;
        return this;
    }

    public OrganizationUnitResourceBuilder withBusinessLines(Set<BusinessLineResource> businessLines){
        this.businessLines = businessLines;
        return this;
    }

    public OrganizationUnitResourceBuilder withChildren(Set<OrganizationUnitResource> children){
        this.children = children;
        return this;
    }

    public OrganizationUnitResource build(){
        OrganizationUnitResource organizationUnit = new OrganizationUnitResource();
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