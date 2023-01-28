package com.cleverdeveloper.functional_interfaces.predicate;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 4:05 PM
*/

import java.util.function.Predicate;

public class PredicateNegateDriver {
    public static void main(String[] args) {

        Predicate<Integer> adult = age -> age >= 18;

        System.out.println(adult.negate().test(7));
        System.out.println(adult.negate().test(19));

    }
}
