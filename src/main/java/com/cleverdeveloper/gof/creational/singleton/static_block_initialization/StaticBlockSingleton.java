package com.cleverdeveloper.gof.creational.singleton.static_block_initialization;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 3:51 PM
*/

public class StaticBlockSingleton {
    private static final StaticBlockSingleton STATIC_BLOCK_SINGLETON;

    static {
        try {
            STATIC_BLOCK_SINGLETON = new StaticBlockSingleton();
        } catch (Exception exception) {
            throw new RuntimeException("Unexpected, ", exception);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return STATIC_BLOCK_SINGLETON;
    }

    private StaticBlockSingleton() {
        // ...
    }
}
