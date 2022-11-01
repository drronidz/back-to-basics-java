package com.cleverdeveloper.coupling.loose.example_two;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 2:26 PM
*/


public class Volume {
    public static void main(String[] args) {
        Box box = new Box(5, 5, 5);
        System.out.println(box.getVolume());
    }
}
