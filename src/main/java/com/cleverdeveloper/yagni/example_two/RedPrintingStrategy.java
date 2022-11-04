package com.cleverdeveloper.yagni.example_two;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 10:55 PM
*/

public class RedPrintingStrategy implements PrintingStrategy {
    @Override
    public void print(Object object) {
        System.out.println("" + object.toString() + "");
    }
}
