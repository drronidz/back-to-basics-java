package com.cleverdeveloper.yagni.example_two;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 10:57 PM
*/

public class PrintingClass {
    void print (String inColor, Object toPrint) {
        PrintingStrategy strategy = PrintingStrategyFactory.createPrinting(inColor);
    }
}
