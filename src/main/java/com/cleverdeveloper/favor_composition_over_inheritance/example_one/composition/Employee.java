package com.cleverdeveloper.favor_composition_over_inheritance.example_one.composition;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 12:56 AM
*/

public class Employee {
    public double salary;
    private Person person;

    public Employee(Person person, double salary) {
        this.salary = salary;
        this.person = person;
    }
}
