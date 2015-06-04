package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.PhoneType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPhone;

/**
 * Created by sadath on 25-Nov-14.
 */
public class PhoneBuilder {
    private Long number;
    private Integer extension;
    private PhoneType phoneType;
    private boolean defaultPhone;

    private PhoneBuilder(){ }

    public static PhoneBuilder aPhoneBuilder(){
        return new PhoneBuilder();
    }

    public PhoneBuilder withNumber(Long number){
        this.number = number;
        return this;
    }

    public PhoneBuilder withExtension(Integer extension){
        this.extension = extension;
        return this;
    }

    public PhoneBuilder withPhoneType(PhoneType phoneType){
        this.phoneType = phoneType;
        return this;
    }

    public PhoneBuilder withDefaultPhonee(boolean defaultPhone){
        this.defaultPhone = defaultPhone;
        return this;
    }

    public DefaultPhone build() {
        DefaultPhone phone = new DefaultPhone();
        phone.setNumber(number);
        phone.setExtension(extension);
        phone.setPhoneType(phoneType);
        phone.setDefaultPhone(defaultPhone);
        return phone;
    }
}
