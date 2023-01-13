package com.cleverdeveloper.gof.structural.flyweight.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/13/2023 4:07 PM
*/

public class Engine {

    public void start() {
        System.out.println(Engine.class.getSimpleName() + " is starting!");
    }

    public void stop() {
        System.out.println(Engine.class.getSimpleName() + " is stopping!");
    }
}
