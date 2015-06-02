package com.tracebucket.x1.organization.partner.integration.test.rest.exception;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class OrganizationPartnerException extends RuntimeException implements Serializable {

    private String message;

    private HttpStatus httpStatus;

    public OrganizationPartnerException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}