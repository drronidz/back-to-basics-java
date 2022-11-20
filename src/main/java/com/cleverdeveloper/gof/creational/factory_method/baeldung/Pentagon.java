package com.cleverdeveloper.gof.creational.factory_method.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/20/2022 11:46 PM
*/

public class Pentagon implements Polygon{
    @Override
    public String getType() {
        return getClass().getSimpleName();
    }
}
