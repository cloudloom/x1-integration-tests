package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.partner.integration.test.rest.resources.*;
import com.tracebucket.x1.partner.api.dictionary.PartnerCategory;

/**
 * Created by Vishwajit on 27-05-2015.
 */
public class PartnerResourceBuilder {

    private String title;
    private String image;
    private String website;
    private PartnerCategory partnerCategory;
    private OwnerResource ownerResource;
    private AffiliateResource affiliate;
    private CustomerResource customer;
    private EntertainmentCompanyResource entertainmentCompany;
    private MuseumResource museum;
    private TourCompanyResource tourCompany;
    private TransportProviderResource transportProvider;

    private PartnerResourceBuilder(){ }

    public static PartnerResourceBuilder aPartnerBuilder(){
        return new PartnerResourceBuilder();
    }


    public PartnerResourceBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PartnerResourceBuilder withImage(String image) {
        this.image = image;
        return this;
    }

    public PartnerResourceBuilder withWebsite(String website) {
        this.website = website;
        return this;
    }

    public PartnerResourceBuilder withPartnerCategory(PartnerCategory partnerCategory) {
        this.partnerCategory = partnerCategory;
        return this;
    }

    public PartnerResourceBuilder withOwner(OwnerResource ownerResource) {
        this.ownerResource = ownerResource;
        return this;
    }

    public PartnerResourceBuilder withAffiliate(AffiliateResource affiliate) {
        this.affiliate = affiliate;
        return this;
    }

    public PartnerResourceBuilder withCustomer(CustomerResource customer) {
        this.customer = customer;
        return this;
    }

    public PartnerResourceBuilder withEntertainmentCompany(EntertainmentCompanyResource entertainmentCompany) {
        this.entertainmentCompany = entertainmentCompany;
        return this;
    }

    public PartnerResourceBuilder withMuseum(MuseumResource museum) {
        this.museum = museum;
        return this;
    }

    public PartnerResourceBuilder withTourCompany(TourCompanyResource tourCompany) {
        this.tourCompany = tourCompany;
        return this;
    }

    public PartnerResourceBuilder withTransportProvider(TransportProviderResource transportProvider) {
        this.transportProvider = transportProvider;
        return this;
    }

    public PartnerResource build(){
        PartnerResource partner = new PartnerResource();
        partner.setTitle(title);
        partner.setImage(image);
        partner.setWebsite(website);
        partner.setPartnerCategory(partnerCategory);
        partner.setOwner(ownerResource);
        partner.setAffiliate(affiliate);
        partner.setCustomer(customer);
        partner.setEntertainmentCompany(entertainmentCompany);
        partner.setMuseum(museum);
        partner.setTourCompany(tourCompany);
        partner.setTransportProvider(transportProvider);
        return partner;
    }
}
