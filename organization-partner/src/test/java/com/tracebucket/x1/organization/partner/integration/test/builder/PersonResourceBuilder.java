package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.dictionary.api.domain.Gender;
import com.tracebucket.x1.dictionary.api.domain.PersonType;
import com.tracebucket.x1.dictionary.api.domain.PhoneType;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.PersonResource;

import java.util.*;

/**
 * Created by sadath on 16-Apr-15.
 */
public class PersonResourceBuilder {
    private String firstName;
    private String lastName;
    private Date birthDay;
    private Gender gender;
    private String image;
    private Map<String, EmailType> emails = new HashMap<String, EmailType>();
    private Map<String, PhoneType> phones = new HashMap<String, PhoneType>();
    private Set<PersonType> personTypes = new HashSet<PersonType>();

    private PersonResourceBuilder(){

    }

    public static PersonResourceBuilder asPerson(){
        return new PersonResourceBuilder();
    }

    public PersonResourceBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public PersonResourceBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public PersonResourceBuilder withBirthDay(Date birthDay)
    {
        this.birthDay = birthDay;
        return this;
    }

    public PersonResourceBuilder withGender(Gender gender){
        this.gender = gender;
        return this;
    }

    public PersonResourceBuilder withImage(String image){
        this.image = image;
        return this;
    }

    public PersonResourceBuilder withEmails(Map<String, EmailType> emails){
        this.emails = emails;
        return this;
    }

    public PersonResourceBuilder withPhones(Map<String, PhoneType> phones){
        this.phones = phones;
        return this;
    }

    public PersonResourceBuilder withPersonTypes(Set<PersonType> personTypes){
        this.personTypes = personTypes;
        return this;
    }

    public PersonResource build(){
        PersonResource person = new PersonResource();
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setBirthDay(birthDay);
        person.setGender(gender);
        person.setImage(image);
        person.setEmails(emails);
        person.setPhones(phones);
        person.setPersonTypes(personTypes);
        return person;
    }
}