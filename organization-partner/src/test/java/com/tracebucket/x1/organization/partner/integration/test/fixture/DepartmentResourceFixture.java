package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.partner.integration.test.builder.DepartmentResourceBuilder;
import com.tracebucket.x1.organization.partner.integration.test.rest.resources.DepartmentResource;

/**
 * Created by sadath on 31-Mar-15.
 */
public class DepartmentResourceFixture {
    public static DepartmentResource standardDepartment(){
        DepartmentResource department = DepartmentResourceBuilder.aDepartmentResource()
                .withName("Account")
                .withDescription("Account desc")
                .build();
        return department;
    }
}