package com.cleverdeveloper.gof.creational.prototype.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 11:28 PM
*/

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        String moviePrototype = PrototypeFactory
                .getInstance(PrototypeFactory.ModelType.MOVIE).toString();
        System.out.println(moviePrototype);

        String albumPrototype = PrototypeFactory
                .getInstance(PrototypeFactory.ModelType.ALBUM).toString();
        System.out.println(albumPrototype);

        String showPrototype = PrototypeFactory
                .getInstance(PrototypeFactory.ModelType.SHOW).toString();
        System.out.println(showPrototype);
    }
}
