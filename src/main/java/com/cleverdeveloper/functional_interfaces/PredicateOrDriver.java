package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 3:46 PM
*/

import java.util.function.Predicate;

public class PredicateOrDriver {
    public static void main(String[] args) {
        // Default method of Predicate Interface : Predicate.or()
        Predicate<String> containsOne = word -> word.contains("crayon");
        Predicate<String> containsTwo = word -> word.contains("my");

        System.out.println(containsOne.or(containsTwo).test("here is my crayon"));
        System.out.println(containsOne.or(containsTwo).test("here is my pencil"));
        System.out.println(containsOne.or(containsTwo).test("here is John's crayon"));
        System.out.println(containsOne.or(containsTwo).test("here is John's pencil"));

    }
}
