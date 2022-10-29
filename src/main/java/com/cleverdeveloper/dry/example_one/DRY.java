package com.cleverdeveloper.dry.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/30/2022 12:03 AM
*/

public class DRY {
    /* Write code here ... #### */
    public static void main(String[] args) {

        // Creating a Dog instance
        Animal dog = new Dog();
        dog.eats();
        dog.speaks();

        System.out.println("-------------------");

        // Creating a Cat instance
        Animal cat = new Cat();
        cat.eats();
        cat.speaks();
    }
}
