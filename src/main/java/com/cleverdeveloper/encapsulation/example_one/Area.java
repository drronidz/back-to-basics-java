package com.cleverdeveloper.encapsulation.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 9:58 PM
*/

public class Area {

    int length;
    int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: "+ area);
    }
}
