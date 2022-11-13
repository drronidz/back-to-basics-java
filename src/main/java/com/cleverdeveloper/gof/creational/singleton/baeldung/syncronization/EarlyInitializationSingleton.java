package com.cleverdeveloper.gof.creational.singleton.baeldung.syncronization;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/14/2022 12:05 AM
*/
/*
*
* Singleton with early initialization. Inlines the singleton instance initialization.
* */

public class EarlyInitializationSingleton {

    private static final EarlyInitializationSingleton EARLY_INITIALIZATION_SINGLETON = new EarlyInitializationSingleton();

    // Private constructor to avoid instantiation
    private EarlyInitializationSingleton() {

    }


    public static EarlyInitializationSingleton getInstance() {
        return EARLY_INITIALIZATION_SINGLETON;
    }
}
