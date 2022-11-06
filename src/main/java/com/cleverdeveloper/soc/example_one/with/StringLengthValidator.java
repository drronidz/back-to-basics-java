package com.cleverdeveloper.soc.example_one.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/6/2022 11:46 PM
*/

public class StringLengthValidator {
    public static boolean greaterThan(String value, Integer length) {
        if (value.length() > length) {
            return true;
        } else {
            throw new Error("String is not long enough.");
        }
    }
}
