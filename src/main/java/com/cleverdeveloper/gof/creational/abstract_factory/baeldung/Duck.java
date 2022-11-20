package com.cleverdeveloper.gof.creational.abstract_factory.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/19/2022 1:13 PM
*/

public class Duck implements Animal{
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String makeSound() {
        return "Quacks";
    }
}
