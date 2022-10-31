package com.cleverdeveloper.fcoij.example_one.composition;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 12:57 AM
*/

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person("Mr.", "Jones", 25);
        Employee jones = new Employee(personOne, 1000.00);

        Person personTwo = new Person("Mr.", "John", 24);
        Employee employee = new Employee(personTwo, 20000);
        Manager john = new Manager("Mr.",personTwo, employee);
    }
}
