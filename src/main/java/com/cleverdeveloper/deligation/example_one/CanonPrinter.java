package com.cleverdeveloper.deligation.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/2/2022 10:49 PM
*/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CanonPrinter implements Printer {

    private static final Logger LOGGER = LoggerFactory.getLogger(CanonPrinter.class);

    @Override
    public void print(String message) {
        LOGGER.info("Canon Printer : {}", message);
    }
}
