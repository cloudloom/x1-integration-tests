package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.organization.api.rest.resource.DefaultEmailResource;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.EmailResource;

/**
 * Created by sadath on 16-Apr-15.
 */
public class EmailResourceBuilder {
    private String email;
    private EmailType emailType;
    private boolean defaultEmail;

    private EmailResourceBuilder(){ }

    public static EmailResourceBuilder anEmailResourceBuilder(){
        return new EmailResourceBuilder();
    }

    public EmailResourceBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public EmailResourceBuilder withEmailType(EmailType emailType){
        this.emailType = emailType;
        return this;
    }

    public EmailResourceBuilder withDefaultEmail(boolean defaultEmail){
        this.defaultEmail = defaultEmail;
        return this;
    }

    public EmailResource build(){
        EmailResource email = new EmailResource();
        email.setEmail(this.email);
        email.setEmailType(emailType);
        email.setDefaultEmail(defaultEmail);
        return email;
    }
}
