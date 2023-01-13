package com.cleverdeveloper.gof.structural.decorator.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 2:58 PM
*/

public class DecoratorPatternDriver {
    public static void main(String[] args) {
        // Creating a christmas tree with just one Garland ...
        ChristmasTree tree = new Garland(new ChristmasTreeImpl());
        System.out.println(tree.decorate());

        // Creating a christmas tree with two Garlands and one Bubble lights ...
        ChristmasTree treeOne = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(treeOne.decorate());
    }
}
