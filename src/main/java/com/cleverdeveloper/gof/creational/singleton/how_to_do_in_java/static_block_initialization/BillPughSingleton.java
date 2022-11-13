package com.cleverdeveloper.gof.creational.singleton.how_to_do_in_java.static_block_initialization;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 3:59 PM
*/

public class BillPughSingleton {
    private BillPughSingleton() {

    }

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
