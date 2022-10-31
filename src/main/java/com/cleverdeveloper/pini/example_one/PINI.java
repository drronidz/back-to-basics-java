package com.cleverdeveloper.pini.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 1:32 PM
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PINI {

    public static void main(String[] args) {
        Shape shape = new Circle();
        print(shape);

        // Better (using interface as reference type ...)
        List<String> list = new ArrayList<>();
        // Avoid
        ArrayList<String> arrayList = new ArrayList<>();
    }

    private static void print(Shape shape) {
        shape.draw();
    }

    // Always use interface type as a return type ...
    private static Collection listStrings() {
        List<String> strings = new ArrayList<>();
        // add a list of string to the list
        return strings;
    }

    // Always use Interface Types as method argument
    private static List<String> setToList(Set<String> stringSet) {
        return stringSet
                .stream()
                .collect(Collectors.toList());
    }
}
