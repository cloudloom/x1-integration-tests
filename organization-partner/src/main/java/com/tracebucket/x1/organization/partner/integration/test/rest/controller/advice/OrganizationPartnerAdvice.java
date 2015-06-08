package com.tracebucket.x1.organization.partner.integration.test.rest.controller.advice;

import com.tracebucket.x1.organization.api.rest.exception.OrganizationException;
import com.tracebucket.x1.organization.partner.integration.test.rest.exception.OrganizationPartnerException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sadath on 28-Apr-15.
 */
@ControllerAdvice
public class OrganizationPartnerAdvice {
    @ExceptionHandler(OrganizationPartnerException.class)
    @ResponseBody
    public ResponseEntity<String> handleOrganizationPartnerException(OrganizationPartnerException ex) {
        return new ResponseEntity<String>(ex.getMessage(), ex.getHttpStatus());
    }
}