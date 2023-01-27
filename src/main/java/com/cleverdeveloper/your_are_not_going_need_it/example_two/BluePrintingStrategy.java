package com.cleverdeveloper.your_are_not_going_need_it.example_two;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 10:54 PM
*/

public class BluePrintingStrategy implements PrintingStrategy{
    @Override
    public void print(Object object) {
        System.out.println("" + object.toString() + "");
    }
}
