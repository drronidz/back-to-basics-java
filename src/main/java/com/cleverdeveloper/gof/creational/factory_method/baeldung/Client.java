package com.cleverdeveloper.gof.creational.factory_method.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/20/2022 11:49 PM
*/

public class Client {
    public static void main(String[] args) {
        Polygon polygon;
        PolygonFactory polygonFactory = new PolygonFactory();

        // get the shape of 4 sides
        polygon = polygonFactory.getPolygon(4);
        System.out.println("The shape with 4 sides is a " + polygon.getType());

        // get the shape of 5 sides
        polygon = polygonFactory.getPolygon(5);
        System.out.println("The shape with 4 sides is a " + polygon.getType());

    }
}
