package com.cleverdeveloper.coupling.loose.example_two;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 2:26 PM
*/

public class Box {

    private int volume;

    public Box (int length, int width, int height) {
        this.volume = length * width * height;
    }

    public int getVolume() {
        return volume;
    }
}
