package com.cleverdeveloper.gof.structural.composite.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/6/2023 3:25 PM
*/

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{

    private Integer id;
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void deleteDepartment(Department department) {
        childDepartments.remove(department);
    }
}
