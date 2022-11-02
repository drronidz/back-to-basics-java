package com.cleverdeveloper.deligation.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/2/2022 11:01 PM
*/

public class Delegation {

    public static final String MESSAGE_TO_PRINT = "hello world";

    public static void main(String[] args) {

        PrinterController hpPrinterController = new PrinterController(new HPPrinter());
        PrinterController canonPrinterController = new PrinterController(new CanonPrinter());
        PrinterController epsonPrinterController = new PrinterController(new EpsonPrinter());

        hpPrinterController.print(MESSAGE_TO_PRINT);
        canonPrinterController.print(MESSAGE_TO_PRINT);
        epsonPrinterController.print(MESSAGE_TO_PRINT);
    }
}
