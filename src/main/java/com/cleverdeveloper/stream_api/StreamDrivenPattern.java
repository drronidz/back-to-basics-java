package com.cleverdeveloper.stream_api;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/18/2023 11:45 PM
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDrivenPattern {
    public static void main(String[] args) {

        // Simple example of stream API ...
        List<Integer> numbers = Arrays.asList(5, 2, 7, 3, 8, 1, 6, 4);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("List of even numbers (from numbers) : " + evenNumbers);


    }
}
