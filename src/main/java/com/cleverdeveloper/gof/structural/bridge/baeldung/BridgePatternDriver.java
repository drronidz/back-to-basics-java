package com.cleverdeveloper.gof.structural.bridge.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/21/2022 11:24 PM
*/

public class BridgePatternDriver {
    public static void main(String[] args) {
        // Create a square with a red color
        Shape square = new Square(new Red());
        System.out.println(square.draw());

        // Create a triangle with a blue color
        Shape triangle = new Triangle(new Blue());
        System.out.println(triangle.draw());
    }
}
