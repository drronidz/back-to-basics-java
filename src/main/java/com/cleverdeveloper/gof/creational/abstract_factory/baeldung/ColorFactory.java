package com.cleverdeveloper.gof.creational.abstract_factory.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/19/2022 1:17 PM
*/

 public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String colorType) {
        if ("Brown".equalsIgnoreCase(colorType))
            return new Brown();
        else if ("White".equalsIgnoreCase(colorType))
            return new White();

        return null;
    }
 }
