package com.cleverdeveloper.gof.creational.abstract_factory.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/19/2022 1:44 PM
*/

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        if ("Toy".equalsIgnoreCase(choice))
            return new AnimalFactory();
        else if ("Color".equalsIgnoreCase(choice))
            return new ColorFactory();

        return null;
    }
}
