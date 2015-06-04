package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultAddress;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPerson;
import com.tracebucket.x1.partner.api.domain.impl.jpa.DefaultAffiliate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sadath on 11-Aug-14.
 */
public class AffiliateBuilder {
    private String name;
    private String businessName;
    private String code;
    private Date dateOfIncorporation;
    private String logo;
    private String website;
    private Set<DefaultPerson> persons = new HashSet<DefaultPerson>(0);
    private Set<DefaultAddress> addresses = new HashSet<DefaultAddress>(0);

    public AffiliateBuilder(){

    }

    public static AffiliateBuilder anAffiliateBuilder(){
        return new AffiliateBuilder();
    }

    public AffiliateBuilder withName(String name){
        this.name = name;
        return this;
    }

    public AffiliateBuilder withBusinessName(String businessName){
        this.businessName = businessName;
        return this;
    }

    public AffiliateBuilder withCode(String code){
        this.code = code;
        return this;
    }

    public AffiliateBuilder withDateOfIncorporation(Date dateOfIncorporation){
        this.dateOfIncorporation = dateOfIncorporation;
        return this;
    }

    public AffiliateBuilder withLogo(String logo){
        this.logo = logo;
        return this;
    }

    public AffiliateBuilder withWebsite(String website){
        this.website = website;
        return this;
    }

    public AffiliateBuilder withPersons(Set<DefaultPerson> persons){
        this.persons = persons;
        return this;
    }

    public AffiliateBuilder withAddresses(Set<DefaultAddress> addresses){
        this.addresses = addresses;
        return this;
    }

    public DefaultAffiliate build() {
        DefaultAffiliate affiliate = new DefaultAffiliate();
        affiliate.setName(name);
        affiliate.setCode(code);
        affiliate.setBusinessName(businessName);
        affiliate.setDateOfIncorporation(dateOfIncorporation);
        affiliate.setLogo(logo);
        affiliate.setAddresses(addresses);
        affiliate.setPersons(persons);
        affiliate.setWebsite(website);
        return affiliate;
    }
}
