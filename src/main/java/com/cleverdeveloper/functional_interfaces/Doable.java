package com.cleverdeveloper.functional_interfaces;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/27/2023 3:05 PM
*/

@FunctionalInterface
public interface Doable {

    public abstract void execute();

    @Override
    String toString();

    default void beforeTask() {
        System.out.println("beforeTask... ");
    }

    default void afterTask() {
        System.out.println("afterTask... ");
    }
}
