package com.cleverdeveloper.gof.creational.factory_method.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/20/2022 11:47 PM
*/

public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        if (numberOfSides == 3) return new Triangle();
        if (numberOfSides == 4) return new Square();
        if (numberOfSides == 5) return new Pentagon();
        return null;
    }
}
