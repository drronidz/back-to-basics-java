package com.cleverdeveloper.default_method_interface;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/10/2023 4:32 PM
*/

public interface Human {
    void speaks();
    void eats();
    default void walks() {
        System.out.println("Every human follows the same walking pattern ...");
    }
}
