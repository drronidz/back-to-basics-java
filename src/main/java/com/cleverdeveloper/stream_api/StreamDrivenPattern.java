package com.cleverdeveloper.stream_api;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/18/2023 11:45 PM
*/

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
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


        /** ######################## Ways of Converting a Stream to Collection ########################"); **/

        // Converting a Stream to a List :
        List<String> listOfColors = Stream.of("Pink", "Blue", "orange")
                .collect(Collectors.toList());

        // Converting a Stream to a Set
        Set<Integer> setOfNumbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toSet());

        // Converting a Stream to a Map
        Map<String, Integer> colorsMap = Stream.of("Pink", "Blue", "orange")
                .collect(Collectors.toMap(
                        color -> color,
                        color -> color.length()));

        // Converting a Stream to an Array
        String[] colorsArray = Stream.of("Pink", "Blue", "orange")
                .toArray(String[]::new);

        /** ######################## Ways of Printing a Stream  ########################"); **/
        Stream<Integer> streamToPrint = Stream.of(1, 2, 3, 4, 5);
        // 1
        streamToPrint.forEach(System.out::println);
        // 2
        System.out.println(streamToPrint.collect(Collectors.toList()));
        // 3
        streamToPrint.limit(4).forEach(System.out::println);
        // 4
        streamToPrint.peek(System.out::println).count();

        /** ######################## How to use Stream Intermediate Operations  ########################"); **/

        /* filter() */
        Stream<String> streamOfAnimals = Stream.of("Lion", "cat", "monkey", "cow", "horse");
        streamOfAnimals.filter(animal -> animal.startsWith("c")).forEach(System.out::print);
        // output : catcow

        /* distinct() */
        Stream<String> streamOfAnimalsOne = Stream.of("cat", "cat", "monkey", "cow", "cat");
        streamOfAnimalsOne.distinct().forEach(System.out::print);
        // output : monkeycow

        /* limit() & skip() */
        Stream<Integer> numbersOne = Stream.iterate(1, n -> n + 1);
        numbersOne.skip(9).limit(6).forEach(System.out::print);
        // output : 101112131415


        List<Programmer> listOfProgrammers = Arrays.asList(
                new Programmer("ProgrammerOne", Arrays.asList("Java" , "Python", "Angular")),
                new Programmer("ProgrammerTwo", Arrays.asList("Ruby" , "Angular", "Java")),
                new Programmer("ProgrammerThree", Arrays.asList("React" , "Spring", "Angular"))
        );

        /* map() */
        listOfProgrammers.stream()
                .map(Programmer::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        // output :
        // ProgrammerOne
        // ProgrammerTwo
        // ProgrammerThree

        /* flatMap() */
        listOfProgrammers.stream()
                .flatMap( programmer -> programmer.getSkills().stream())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        // output :
        // Java
        // Spring
        // Ruby
        // React
        // Angular
        // Python

        /* sorted() */
    }
}
