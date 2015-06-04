package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.CurrencyType;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.CurrencyResource;

/**
 * Created by sadath on 16-Apr-15.
 */
public class CurrencyResourceBuilder {
    private String name;
    private String iso4217Code;
    private String subUnit110;
    private String image;
    private CurrencyType currencyType;

    private CurrencyResourceBuilder(){

    }

    public static CurrencyResourceBuilder aDefaultCurrencyResourceBuilder(){
        return new CurrencyResourceBuilder();
    }

    public CurrencyResourceBuilder withName(String name){
        this.name = name;
        return this;
    }

    public CurrencyResourceBuilder withIso4217Code(String iso4217Code){
        this.iso4217Code = iso4217Code;
        return this;
    }

    public CurrencyResourceBuilder withSubUnit110(String subUnit110){
        this.subUnit110 = subUnit110;
        return this;
    }

    public CurrencyResourceBuilder withImage(String image){
        this.image = image;
        return this;
    }

    public CurrencyResourceBuilder withCurrencyType(CurrencyType currencyType){
        this.currencyType = currencyType;
        return this;
    }

    public CurrencyResource build(){
        CurrencyResource currency = new CurrencyResource();
        currency.setName(name);
        currency.setImage(image);
        currency.setIso4217Code(iso4217Code);
        currency.setSubUnit110(subUnit110);
        currency.setCurrencyType(currencyType);
        return currency;
    }
}