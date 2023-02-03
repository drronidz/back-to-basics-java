package com.cleverdeveloper.functional_interfaces.function;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/3/2023 2:33 PM
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionDrivenPattern {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"John Doe",2000.00));
        employeeList.add(new Employee(2,"Jane Thompson",2000.00));
        employeeList.add(new Employee(3,"Carl Miler",2000.00));

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1, "Human Resources", "Desc HR"));
        departmentList.add(new Department(2, "Technical", "Desc IT"));

        Function<Employee, String> employeePrimaryId = employee -> String.valueOf(employee.getId());
        Function<Department, String> departmentPrimaryId = department -> department.getId() + department.getName();

        System.out.println(toMap(employeeList, employeePrimaryId));
        System.out.println(toMap(departmentList, departmentPrimaryId));
    }

    public static <T, R> Map<T, R> toMap(List<T> list, Function<T, R> function) {
        Map<T, R> result = new HashMap<>();
        for (T type : list) {
            result.put(type, function.apply(type));
        }
        return result;
    }

}
