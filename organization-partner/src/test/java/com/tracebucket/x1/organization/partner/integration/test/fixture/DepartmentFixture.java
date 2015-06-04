package com.tracebucket.x1.organization.partner.integration.test.fixture;

import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultDepartment;
import com.tracebucket.x1.organization.partner.integration.test.builder.DepartmentBuilder;

/**
 * Created by sadath on 25-Nov-14.
 */
public class DepartmentFixture {
    public static DefaultDepartment standardDepartment(){
        DefaultDepartment department = DepartmentBuilder.aDepartment()
                .withName("Loan")
                .withDescription("Account desc")
                .build();
        return department;
    }
    public static DefaultDepartment standardDepartment2(){
        DefaultDepartment department = DepartmentBuilder.aDepartment()
                .withName("Credit")
                .withDescription("Account desc")
                .build();
        return department;
    }
    public static DefaultDepartment standardDepartment3(){
        DefaultDepartment department = DepartmentBuilder.aDepartment()
                .withName("Debit")
                .withDescription("Account desc")
                .build();
        return department;
    }
    public static DefaultDepartment standardDepartment4(){
        DefaultDepartment department = DepartmentBuilder.aDepartment()
                .withName("Foreign Exchange")
                .withDescription("Account desc")
                .build();
        return department;
    }
}
