package com.cleverdeveloper.gof.creational.singleton.java_enum;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 4:16 PM
*/

public enum  EnumSingleton {
    SINGLE_INSTANCE;
    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
