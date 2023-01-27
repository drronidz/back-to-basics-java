package com.cleverdeveloper.include_default_methods_in_interfaces.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 10/31/2022 12:16 AM
*/

public interface Alarm {

    public default String turnAlarmOn() {
        return "Turning the vehicle alarm on.";
    }

    public default String turnAlarmOff() {
        return "Turning the vehicle alarm off.";
    }
}
