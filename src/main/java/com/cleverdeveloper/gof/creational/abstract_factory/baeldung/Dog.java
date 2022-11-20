package com.cleverdeveloper.gof.creational.abstract_factory.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/19/2022 1:15 PM
*/

public class Dog implements Animal{
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String makeSound() {
        return "Barks";
    }
}
