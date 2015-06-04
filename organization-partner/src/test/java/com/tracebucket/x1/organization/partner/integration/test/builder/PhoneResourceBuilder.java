package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.PhoneType;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.PhoneResource;

/**
 * Created by sadath on 16-Apr-15.
 */
public class PhoneResourceBuilder {
    private Long number;
    private Integer extension;
    private PhoneType phoneType;
    private boolean defaultPhone;

    private PhoneResourceBuilder(){ }

    public static PhoneResourceBuilder aPhoneBuilder(){
        return new PhoneResourceBuilder();
    }

    public PhoneResourceBuilder withNumber(Long number){
        this.number = number;
        return this;
    }

    public PhoneResourceBuilder withExtension(Integer extension){
        this.extension = extension;
        return this;
    }

    public PhoneResourceBuilder withPhoneType(PhoneType phoneType){
        this.phoneType = phoneType;
        return this;
    }

    public PhoneResourceBuilder withDefaultPhonee(boolean defaultPhone){
        this.defaultPhone = defaultPhone;
        return this;
    }

    public PhoneResource build() {
        PhoneResource phone = new PhoneResource();
        phone.setNumber(number);
        phone.setExtension(extension);
        phone.setPhoneType(phoneType);
        phone.setDefaultPhone(defaultPhone);
        return phone;
    }
}
