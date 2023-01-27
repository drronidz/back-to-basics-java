package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 3:45 PM
*/

import java.util.function.Predicate;

public class PredicateAndDriver {
    public static void main(String[] args) {
        // Default method of Predicate Interface : Predicate.and()
        Predicate<Integer> adultYet = i -> i >= 18;
        Predicate<Integer> adultStill = i -> i < 65;

        System.out.println(adultYet.and(adultStill).test(5));
        System.out.println(adultYet.and(adultStill).test(38));
        System.out.println(adultYet.and(adultStill).test(90));
    }
}
