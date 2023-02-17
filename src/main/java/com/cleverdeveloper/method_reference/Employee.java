package com.cleverdeveloper.method_reference;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/17/2023 3:41 PM
*/

public class Employee {
    String name;
    int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getEmployeeInfo() {
        System.out.println("I am a method of class Employee ...");
    }
}
