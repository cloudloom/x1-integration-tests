package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.dictionary.api.domain.EmailType;
import com.tracebucket.x1.dictionary.api.domain.jpa.impl.DefaultEmail;

/**
 * Created by sadath on 25-Nov-14.
 */
public class EmailBuilder {
    private String email;
    private EmailType emailType;
    private boolean defaultEmail;

    private EmailBuilder(){ }

    public static EmailBuilder anEmailBuilder(){
        return new EmailBuilder();
    }

    public EmailBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public EmailBuilder withEmailType(EmailType emailType){
        this.emailType = emailType;
        return this;
    }

    public EmailBuilder withDefaultEmail(boolean defaultEmail){
        this.defaultEmail = defaultEmail;
        return this;
    }

    public DefaultEmail build(){
        DefaultEmail email = new DefaultEmail();
        email.setEmail(this.email);
        email.setEmailType(emailType);
        email.setDefaultEmail(defaultEmail);
        return email;
    }

}
