package com.cleverdeveloper.gof.creational.singleton.simple;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 2:49 PM
*/

// Helper Class
public class Singleton {
    /* Static variable reference of single instance
    of type Singleton
    */
    private static Singleton single_instance = null;

    public String message;

    public Singleton() {
        message = "Hello I'm a message part of Singleton class.";
    }

    // A static method to create instanceof Singleton class.
    public static Singleton getInstance() {

        if(single_instance == null) single_instance = new Singleton();

        return single_instance;
    }
}
