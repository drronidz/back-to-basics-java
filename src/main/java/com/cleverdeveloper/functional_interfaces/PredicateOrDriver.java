package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 4:04 PM
*/

import java.util.function.Predicate;

public class PredicateOrDriver {
    public static void main(String[] args) {

        Predicate<String> containsA = t -> t.contains("crayon");
        Predicate<String> containsB = t -> t.contains("my");
        System.out.println(containsA.or(containsB).test("here is my crayon"));
        System.out.println(containsA.or(containsB).test("here is my pencil"));
        System.out.println(containsA.or(containsB).test("here is John's crayon"));
        System.out.println(containsA.or(containsB).test("here is John's pencil"));

    }
}
