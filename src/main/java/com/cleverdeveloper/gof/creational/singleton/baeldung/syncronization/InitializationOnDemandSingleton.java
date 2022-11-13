package com.cleverdeveloper.gof.creational.singleton.baeldung.syncronization;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/14/2022 12:09 AM
*/

public class InitializationOnDemandSingleton {

    private static class InstanceHolder {
        private static final InitializationOnDemandSingleton
                INSTANCE = new InitializationOnDemandSingleton();
    }

    private InitializationOnDemandSingleton() {

    }

    public static InitializationOnDemandSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
