package com.tracebucket.x1.organization.partner.integration.test.rest.resources;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.tracebucket.tron.assembler.BaseResource;
import com.tracebucket.x1.organization.api.domain.OrganizationFunction;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 31-Mar-15.
 */
public class OrganizationUnitResource extends BaseResource {
    private String name;
    private String description;
    private OrganizationResource organization;
    @JsonBackReference
    private OrganizationUnitResource parent;
    private Set<OrganizationFunction> organizationFunctions = new HashSet<OrganizationFunction>(0);
    private Set<AddressResource> addresses = new HashSet<AddressResource>(0);
    private Set<PersonResource> contactPersons = new HashSet<PersonResource>(0);
    private Set<PhoneResource> phones = new HashSet<PhoneResource>(0);
    private Set<EmailResource> emails = new HashSet<EmailResource>(0);
    private Set<DepartmentResource> departments = new HashSet<DepartmentResource>(0);
    private Set<BusinessLineResource> businessLines = new HashSet<BusinessLineResource>(0);
    @JsonManagedReference
    private Set<OrganizationUnitResource> children = new HashSet<OrganizationUnitResource>(0);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrganizationResource getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationResource organization) {
        this.organization = organization;
    }

    public OrganizationUnitResource getParent() {
        return parent;
    }

    public void setParent(OrganizationUnitResource parent) {
        this.parent = parent;
    }

    public Set<OrganizationFunction> getOrganizationFunctions() {
        return organizationFunctions;
    }

    public void setOrganizationFunctions(Set<OrganizationFunction> organizationFunctions) {
        this.organizationFunctions = organizationFunctions;
    }

    public Set<AddressResource> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<AddressResource> addresses) {
        this.addresses = addresses;
    }

    public Set<PersonResource> getContactPersons() {
        return contactPersons;
    }

    public void setContactPersons(Set<PersonResource> contactPersons) {
        this.contactPersons = contactPersons;
    }

    public Set<PhoneResource> getPhones() {
        return phones;
    }

    public void setPhones(Set<PhoneResource> phones) {
        this.phones = phones;
    }

    public Set<EmailResource> getEmails() {
        return emails;
    }

    public void setEmails(Set<EmailResource> emails) {
        this.emails = emails;
    }

    public Set<DepartmentResource> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<DepartmentResource> departments) {
        this.departments = departments;
    }

    public Set<BusinessLineResource> getBusinessLines() {
        return businessLines;
    }

    public void setBusinessLines(Set<BusinessLineResource> businessLines) {
        this.businessLines = businessLines;
    }

    public Set<OrganizationUnitResource> getChildren() {
        return children;
    }

    public void setChildren(Set<OrganizationUnitResource> children) {
        this.children = children;
    }
}