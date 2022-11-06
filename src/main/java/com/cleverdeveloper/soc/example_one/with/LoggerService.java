package com.cleverdeveloper.soc.example_one.with;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/6/2022 11:57 PM
*/

import java.util.Date;

public class LoggerService {
    public static String log(String message) {
        message = new Date() + " :: " + message;
        System.out.println(message);
        return message;
    }
}
