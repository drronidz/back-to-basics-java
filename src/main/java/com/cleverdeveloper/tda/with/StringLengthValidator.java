package com.cleverdeveloper.tda.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/5/2022 12:22 AM
*/

public class StringLengthValidator {
    public static boolean greaterThan(String value, Integer length) {
        if (value.length() > length) {
            return true;
        }
        else {
            throw new Error("String is not long enough") ;
        }
    }
}
