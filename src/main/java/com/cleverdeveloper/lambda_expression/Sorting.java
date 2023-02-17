package com.cleverdeveloper.lambda_expression;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/10/2023 4:20 PM
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Sorting {
    public static void main(String[] args) {
        String [] mobiles = {"Samsung", "Lenovo", "Xiaomi", "Oppo", "Apple", "Sony", "Blackberry"};

        System.out.println("############### Using Anonymous Inner class ###############");

        Arrays.sort(mobiles, new Comparator<String>() {
            @Override
            public int compare(String stringOne, String stringTwo) {
                return stringOne.compareTo(stringTwo);
            }
        });

        System.out.println("############### Using Arrays.stream to covert in Stream ###############");
        Arrays.stream(mobiles).forEach(System.out::println);

        System.out.println("############### Using Lambda Expression ###############");
        /* Using This one : */
        Arrays.sort(mobiles, (s1, s2) -> s1.compareTo(s2));
        /* Or using This one : */
        Arrays.sort(mobiles, String::compareTo);

        System.out.println("############### Using Stream.of to covert in Stream ###############");
        Stream.of(mobiles).forEach(System.out::println);
    }
}
