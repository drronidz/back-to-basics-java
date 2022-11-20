package com.cleverdeveloper.gof.creational.abstract_factory.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/19/2022 1:47 PM
*/

public class Client {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        // Creating a White duck toy
        // Creating the Duck
        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy = (Animal) abstractFactory.create("Duck");

        // Creating the color
        abstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) abstractFactory.create("White");

        String result = "A "
                + toy.getType() + " with "
                + color.getColor() + " color "
                + toy.makeSound();

        System.out.println(result);
        // A Duck with White color Quacks

    }
}
