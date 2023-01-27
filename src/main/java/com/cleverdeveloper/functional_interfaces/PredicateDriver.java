package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 3:12 PM
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateDriver {
    public static void main(String[] args) {

        // Default use of Predicate interface
        Predicate<Integer> oddNumbers = (number -> number % 2 != 0);
        Predicate<Integer> positiveNumbers = (number -> number > 0);

        Integer[] numbersArray = IntStream.rangeClosed(-10, 10).boxed().toArray(Integer[]::new);

        System.out.println(filter(numbersArray, oddNumbers));
        System.out.println(filter(numbersArray, positiveNumbers));

    }

    public static <T> List<T> filter(T[] array, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for(T t : array) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }
}
