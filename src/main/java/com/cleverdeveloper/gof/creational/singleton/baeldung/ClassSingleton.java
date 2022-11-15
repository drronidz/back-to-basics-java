package com.cleverdeveloper.gof.creational.singleton.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/13/2022 10:39 PM
*/

public class ClassSingleton {

    private static ClassSingleton INSTANCE;
    private String information = "Initial class information ...";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        return INSTANCE == null
                ? INSTANCE = new ClassSingleton()
                : INSTANCE;
    }

    public String getInformation() {
        return information + this.hashCode() ;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
