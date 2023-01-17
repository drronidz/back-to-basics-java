package com.cleverdeveloper.gof.behavioral.interpreter.baeldung.expression;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/17/2023 11:45 PM
*/

public class Row {

    private String firstName;
    private String lastName;

    public Row(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
