package com.cleverdeveloper.gof.creational.singleton.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/13/2022 11:12 PM
*/

public enum EnumSingleton {

    INSTANCE("Initial enum information");
    private String information;

    EnumSingleton(String information) {
        this.information = information;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
