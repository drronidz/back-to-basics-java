package com.cleverdeveloper.functional_interfaces.predicate;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 4:06 PM
*/

import java.util.function.Predicate;

public class PredicateIsEqualDriver {
    public static void main(String[] args) {
        // Static method
        Predicate<String> i = Predicate.isEqual("here is my crayon");
        System.out.println(i.test("here is my pencil"));
        System.out.println(i.test("here is my crayon"));

    }
}
