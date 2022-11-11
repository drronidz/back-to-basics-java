package com.cleverdeveloper.gof.creational.singleton.eager;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 3:20 PM
*/

public class EagerSingleton {

    private static volatile EagerSingleton eager_single_instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return eager_single_instance;
    }
}
