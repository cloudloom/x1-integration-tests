package com.tracebucket.x1.organization.partner.integration.test.rest.resources;

import com.tracebucket.tron.assembler.BaseResource;
import com.tracebucket.x1.dictionary.api.domain.PhoneType;

/**
 * Created by sadath on 16-Apr-15.
 */
public class PhoneResource extends BaseResource {
    private Long number;
    private Integer extension;
    private PhoneType phoneType;
    private boolean defaultPhone;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Integer getExtension() {
        return extension;
    }

    public void setExtension(Integer extension) {
        this.extension = extension;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public boolean isDefaultPhone() {
        return defaultPhone;
    }

    public void setDefaultPhone(boolean defaultPhone) {
        this.defaultPhone = defaultPhone;
    }

    public boolean isDefaultContactNumber(){
        return defaultPhone;
    }
}