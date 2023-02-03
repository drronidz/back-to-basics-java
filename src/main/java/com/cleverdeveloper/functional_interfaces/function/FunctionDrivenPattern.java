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
        employeeList.add(new Employee(1,"John Doe",2000.00, null));
        employeeList.add(new Employee(2,"Jane Thompson",2000.00, null));
        employeeList.add(new Employee(3,"Carl Miler",2000.00, null));

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1, "Human Resources", "Desc HR"));
        departmentList.add(new Department(2, "Technical", "Desc IT"));

        // Function
        Function<Employee, String> employeePrimaryId = employee -> String.valueOf(employee.getId());
        Function<Department, String> departmentPrimaryId = department -> department.getId() + department.getName();

        System.out.println(toMap(employeeList, employeePrimaryId));
        System.out.println(toMap(departmentList, departmentPrimaryId));

        // Composed Function
        Address addressOne = new Address(1, "19007", "DAOUED SALAH", "AIN AZEL", "SETIF");
        Employee employeeOne = new Employee(1,"John Doe",2000.00, addressOne);

        // get Employee Address From Employee With EmployeeId (first)
        Function<Employee, Address> first = employee -> employee.getAddress();
        // get Postal Code From Address With IdAddress (second)
        Function <Address, String> second = address -> address.getPostalCode();

        System.out.println("Postal Code : " + extract(employeeOne,first, second));


    }

    public static <T, R> Map<T, R> toMap(List<T> list, Function<T, R> function) {
        Map<T, R> result = new HashMap<>();
        for (T type : list) {
            result.put(type, function.apply(type));
        }
        return result;
    }

    public static <T, R, U> U extract(T input, Function<T, R> first, Function<R, U> second) {
        return first.andThen(second).apply(input);
    }

}
