package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 4:00 PM
*/

import java.util.function.Predicate;

public class PredicateTestDriver {
    public static void main(String[] args) {
        Predicate<Integer> adult = age -> age >= 18;
        System.out.println(adult.test(12));
        System.out.println(adult.test(19));
        System.out.println(adult.test(21));
    }
}
