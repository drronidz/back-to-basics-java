package com.cleverdeveloper.gof.creational.singleton.baeldung.syncronization;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/13/2022 11:47 PM
*/

/*
* Double Checked Locking Design Pattern Applied to a Singleton
* */
public class DCLSingleton {
    private static volatile DCLSingleton instance;

    // Private constructor to avoid instantiation.
    private DCLSingleton() {
    }

    /*
    * @return the current instance of singleton
    */
    public static DCLSingleton getInstance() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
