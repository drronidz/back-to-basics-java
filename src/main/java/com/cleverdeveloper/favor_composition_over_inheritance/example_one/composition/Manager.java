package com.cleverdeveloper.favor_composition_over_inheritance.example_one.composition;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 1:02 AM
*/

public class Manager {

    public String title;
    private Person person;
    private Employee employee;

    public Manager(String title, Person person, Employee employee) {
        this.title = title;
        this.person = person;
        this.employee = employee;
    }
}
