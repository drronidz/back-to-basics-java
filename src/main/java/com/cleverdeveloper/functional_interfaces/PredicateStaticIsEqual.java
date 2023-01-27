package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 3:47 PM
*/

import java.util.function.Predicate;

public class PredicateStaticIsEqual {
    public static void main(String[] args) {
        // Static method of Predicate Interface : Predicate.isEqual()
        Predicate<String> contains = Predicate.isEqual("here is my crayon");

        System.out.println(contains.test("here is my crayon"));
        System.out.println(contains.test("here is my pencil"));
    }
}
