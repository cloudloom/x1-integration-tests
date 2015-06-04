package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.dictionary.api.domain.Gender;
import com.tracebucket.x1.dictionary.api.domain.PhoneType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultPerson;
import com.tracebucket.x1.organization.partner.integration.test.builder.PersonBuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sadath on 25-Nov-14.
 */
public class PersonFixture {

    public static DefaultPerson standardPerson(){
        Map<String, EmailType> emails = new HashMap<String, EmailType>();
        emails.put("sadath@mmp.com", EmailType.PERSONAL);
        Map<String, PhoneType> phones = new HashMap<String, PhoneType>();
        phones.put("9898988889888", PhoneType.MOBILE);
        DefaultPerson person = PersonBuilder.asPerson()
                .withFirstName("Syed")
                .withLastName("Sadath")
                .withGender(Gender.MALE)
                .withBirthDay(new Date())
                .withImage("Image")
                .withEmails(emails)
                .withPhones(phones)
                .build();
        return person;
    }

    public static DefaultPerson standardPerson2(){
        Map<String, EmailType> emails = new HashMap<String, EmailType>();
        emails.put("firoz@mmp.com", EmailType.PERSONAL);
        Map<String, PhoneType> phones = new HashMap<String, PhoneType>();
        phones.put("23232323232", PhoneType.MOBILE);
        DefaultPerson person = PersonBuilder.asPerson()
                .withFirstName("Firoz")
                .withLastName("Fazil")
                .withGender(Gender.MALE)
                .withBirthDay(new Date())
                .withImage("Image")
                .withEmails(emails)
                .withPhones(phones)
                .build();
        return person;
    }
}
