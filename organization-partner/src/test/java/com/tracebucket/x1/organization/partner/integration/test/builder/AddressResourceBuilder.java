package com.tracebucket.x1.organization.partner.integration.test.builder;


import com.tracebucket.x1.dictionary.api.domain.AddressType;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.AddressResource;

/**
 * Created by sadath on 16-Apr-15.
 */
public class AddressResourceBuilder {
    private String name;
    private String building;
    private String street;
    private String region;
    private String city;
    private String district;
    private String state;
    private String country;
    private String zip;
    private AddressType addressType;
    private boolean defaultAddress;

    private AddressResourceBuilder(){

    }

    public static AddressResourceBuilder anAddressBuilder(){
        return new AddressResourceBuilder();
    }

    public AddressResourceBuilder withName(String name){
        this.name = name;
        return this;
    }

    public AddressResourceBuilder withBuilding(String building){
        this.building = building;
        return this;
    }

    public AddressResourceBuilder withStreet(String street){
        this.street = street;
        return this;
    }

    public AddressResourceBuilder withRegion(String region){
        this.region = region;
        return this;
    }

    public AddressResourceBuilder withCity(String city){
        this.city = city;
        return this;
    }

    public AddressResourceBuilder withDistrict(String district){
        this.district = district;
        return this;
    }

    public AddressResourceBuilder withState(String state){
        this.state = state;
        return this;
    }

    public AddressResourceBuilder withCountry(String country){
        this.country = country;
        return this;
    }

    public AddressResourceBuilder withZip(String zip){
        this.zip = zip;
        return this;
    }

    public AddressResourceBuilder withAddressType(AddressType addressType){
        this.addressType = addressType;
        return this;
    }

    public AddressResourceBuilder withDefaultAddressResource(boolean defaultAddress){
        this.defaultAddress = defaultAddress;
        return this;
    }

    public AddressResource build(){
        AddressResource address = new AddressResource();
        address.setName(name);
        address.setBuilding(building);
        address.setStreet(street);
        address.setRegion(region);
        address.setCity(city);
        address.setDistrict(district);
        address.setState(state);
        address.setCountry(country);
        address.setZip(zip);
        address.setAddressType(addressType);
        address.setDefaultAddress(defaultAddress);
        return address;
    }
}