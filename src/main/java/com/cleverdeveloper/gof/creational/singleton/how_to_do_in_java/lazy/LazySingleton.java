package com.cleverdeveloper.gof.creational.singleton.how_to_do_in_java.lazy;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 3:34 PM
*/

public class LazySingleton {
    private static volatile LazySingleton lazy_single_instance = null;

    private LazySingleton() {

    }

    // without double-checked-locking principle
    public static LazySingleton getInstanceWithoutDoubleCheckLocking() {
        if (lazy_single_instance == null) {
            synchronized (LazySingleton.class) {
                lazy_single_instance = new LazySingleton();
            }
        }
        return lazy_single_instance;
    }

    // with double-checked-locking-principle
    public static LazySingleton getInstanceWithDoubleCheckLocking() {
        if (lazy_single_instance == null) {
            synchronized (LazySingleton.class) {
                if (lazy_single_instance == null) {
                    lazy_single_instance = new LazySingleton();
                }
            }
        }
        return  lazy_single_instance;
    }


}
