package com.cleverdeveloper.yagni.example_two;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/4/2022 10:55 PM
*/

public class PrintingStrategyFactory {
    static PrintingStrategy createPrinting(String color) {
        if ("RED".equals(color)) {
            return new RedPrintingStrategy();
        }
        if ("BLUE".equals(color)) {
            return new BluePrintingStrategy();
        }
        throw new RuntimeException("Color not supported");
    }
}
