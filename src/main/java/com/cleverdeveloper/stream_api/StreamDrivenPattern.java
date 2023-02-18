package com.cleverdeveloper.stream_api;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/18/2023 11:45 PM
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class StreamDrivenPattern {
    public static void main(String[] args) throws IOException {

        // Simple example of stream API ...
        List <Integer> numbers = Arrays.asList(5, 2, 7, 3, 8, 1, 6, 4);

        List <Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("List of even numbers (from numbers) : " + evenNumbers);

        /** ######################## Ways of Creating a Stream ########################"); **/
        // Creating an Empty Stream from Stream.empty()
        Stream<String>  emptyStream = Stream.empty();

        // Creating a Stream of a File
        String filePath = "";
        Stream<String> streamFromFile  = Files.lines(Paths.get(filePath));

        // From a collection :
        List <Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream <Integer> streamFromCollection = list.stream();

        // From an Array :
        int [] array = { 1, 2, 3, 4, 5 };
        Stream<Integer> streamFromArray = Stream.of(1, 2, 3, 4, 5);

        // From a Stream Builder :
        Stream.Builder<String> streamBuilder = Stream.builder();
        streamBuilder.add("foo");
        streamBuilder.add("bar");
        streamBuilder.add("baz");
        Stream<String> stream = streamBuilder.build();

        // From a Stream Generator :
        Stream<Integer> streamGenerator = Stream.generate(() -> new Random().nextInt(100));

        // From a Stream Iterator :
        Stream<Integer> StreamIterator = Stream.iterate(1, n -> n + 2);

        // From a Stream of Primitives :
        IntStream intStream = IntStream.range(1, 10);
        LongStream longStream = LongStream.rangeClosed(1, 10);
        DoubleStream doubleStream = DoubleStream.generate(Math::random);


        /** ######################## Ways of Creating a Stream ########################"); **/
    }
}
