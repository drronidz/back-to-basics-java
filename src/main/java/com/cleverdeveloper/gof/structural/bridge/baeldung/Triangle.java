package com.cleverdeveloper.gof.structural.bridge.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/21/2022 11:22 PM
*/

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Triangle drawn. " + color.fill();
    }
}
