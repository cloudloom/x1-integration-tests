package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.CurrencyType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultCurrency;

/**
 * Created by sadath on 16-Apr-15.
 */
public class CurrencyBuilder {
    private String name;
    private String iso4217Code;
    private String subUnit110;
    private String image;
    private CurrencyType currencyType;

    private CurrencyBuilder(){

    }

    public static CurrencyBuilder aDefaultCurrencyBuilder(){
        return new CurrencyBuilder();
    }

    public CurrencyBuilder withName(String name){
        this.name = name;
        return this;
    }

    public CurrencyBuilder withIso4217Code(String iso4217Code){
        this.iso4217Code = iso4217Code;
        return this;
    }

    public CurrencyBuilder withSubUnit110(String subUnit110){
        this.subUnit110 = subUnit110;
        return this;
    }

    public CurrencyBuilder withImage(String image){
        this.image = image;
        return this;
    }

    public CurrencyBuilder withCurrencyType(CurrencyType currencyType){
        this.currencyType = currencyType;
        return this;
    }

    public DefaultCurrency build(){
        DefaultCurrency currency = new DefaultCurrency();
        currency.setName(name);
        currency.setImage(image);
        currency.setIso4217Code(iso4217Code);
        currency.setSubUnit110(subUnit110);
        currency.setCurrencyType(currencyType);
        return currency;
    }
}
