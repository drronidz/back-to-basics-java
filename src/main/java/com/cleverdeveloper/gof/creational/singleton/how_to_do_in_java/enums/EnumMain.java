package com.cleverdeveloper.gof.creational.singleton.how_to_do_in_java.enums;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 4:18 PM
*/

public class EnumMain {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.SINGLE_INSTANCE;

        System.out.println(enumSingleton.getValue());
        enumSingleton.setValue(15);
        System.out.println(enumSingleton.getValue());
    }
}
