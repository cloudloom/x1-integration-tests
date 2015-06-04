package com.tracebucket.x1.organization.partner.integration.test.builder;

import com.tracebucket.x1.organization.api.domain.impl.jpa.DefaultDepartment;

/**
 * Created by sadath on 25-Nov-14.
 */
public class DepartmentBuilder {
    private String name;
    private String description;

    public DepartmentBuilder(){ }

    public static DepartmentBuilder aDepartment(){
        return new DepartmentBuilder();
    }

    public DepartmentBuilder withName(String name){
        this.name = name;
        return this;
    }

    public DepartmentBuilder withDescription(String description){
        this.description = description;
        return this;
    }

    public DefaultDepartment build(){
        DefaultDepartment department = new DefaultDepartment();
        department.setName(name);
        department.setDescription(description);
        return department;
    }
}
