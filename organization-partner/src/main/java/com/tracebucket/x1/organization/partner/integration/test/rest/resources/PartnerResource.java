package com.tracebucket.x1.organization.partner.integration.test.rest.resources;

import com.tracebucket.tron.assembler.BaseResource;
import com.tracebucket.x1.partner.api.dictionary.PartnerCategory;

/**
 * Created by sadath on 26-May-2015.
 */
public class PartnerResource extends BaseResource{
    private String title;
    private String image;
    private String website;
    private PartnerCategory partnerCategory;
    private OwnerResource owner;
    private AffiliateResource affiliate;
    private CustomerResource customer;
    private EntertainmentCompanyResource entertainmentCompany;
    private MuseumResource museum;
    private TourCompanyResource tourCompany;
    private TransportProviderResource transportProvider;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public PartnerCategory getPartnerCategory() {
        return partnerCategory;
    }

    public void setPartnerCategory(PartnerCategory partnerCategory) {
        this.partnerCategory = partnerCategory;
    }

    public OwnerResource getOwner() {
        return owner;
    }

    public void setOwner(OwnerResource owner) {
        this.owner = owner;
    }

    public AffiliateResource getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(AffiliateResource affiliate) {
        this.affiliate = affiliate;
    }

    public CustomerResource getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerResource customer) {
        this.customer = customer;
    }

    public EntertainmentCompanyResource getEntertainmentCompany() {
        return entertainmentCompany;
    }

    public void setEntertainmentCompany(EntertainmentCompanyResource entertainmentCompany) {
        this.entertainmentCompany = entertainmentCompany;
    }

    public MuseumResource getMuseum() {
        return museum;
    }

    public void setMuseum(MuseumResource museum) {
        this.museum = museum;
    }

    public TourCompanyResource getTourCompany() {
        return tourCompany;
    }

    public void setTourCompany(TourCompanyResource tourCompany) {
        this.tourCompany = tourCompany;
    }

    public TransportProviderResource getTransportProvider() {
        return transportProvider;
    }

    public void setTransportProvider(TransportProviderResource transportProvider) {
        this.transportProvider = transportProvider;
    }
}