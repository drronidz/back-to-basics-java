package com.cleverdeveloper.gof.structural.bridge.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/21/2022 11:20 PM
*/

public class Red implements Color{
    @Override
    public String fill() {
        return "Color is : " + "Red";
    }
}
