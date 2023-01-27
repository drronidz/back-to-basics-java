package com.cleverdeveloper.tell_dont_ask.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/5/2022 12:25 AM
*/

public class NaturalNumberValidator {
    public static Integer operation(Integer from, Integer amount) {
        if (from + amount <= 0) {
            return 0;
        }
        return from + amount;
    }
}
