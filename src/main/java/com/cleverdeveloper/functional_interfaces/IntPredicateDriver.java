package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 4:07 PM
*/

import java.util.Arrays;
import java.util.function.IntPredicate;

public class IntPredicateDriver {
    public static void main(String[] args) {

        int[] ages = { 18, 28, 18, 46, 90, 45, 2, 3, 1, 5, 7, 21, 12 };
        IntPredicate p = n -> n >= 18;

        Arrays.stream(ages).filter(p).forEach(System.out::println);
    }
}
