package com.cleverdeveloper.gof.creational.singleton.template;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 10:01 PM
*/

public class Singleton {
    private static final long SERIAL_VERSION_UID = 1l;

    private Singleton() {
        // private constructor
    }

    private static class SingleInstanceHolder {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
