package com.cleverdeveloper.gof.creational.abstract_factory.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/19/2022 1:18 PM
*/

public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String animalType) {
        if("Dog".equalsIgnoreCase(animalType))
            return new Dog();
        else if ("Duck".equalsIgnoreCase(animalType))
            return new Duck();

        return null;
    }
}
