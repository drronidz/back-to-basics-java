package com.cleverdeveloper.gof.creational.singleton.baeldung.syncronization;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/13/2022 11:56 PM
*/

public class DraconianSingleton {

    private static DraconianSingleton instance;

    private DraconianSingleton() {
    }

    public static synchronized DraconianSingleton getInstance() {
        return instance == null ? instance = new DraconianSingleton() : instance;
    }


}
