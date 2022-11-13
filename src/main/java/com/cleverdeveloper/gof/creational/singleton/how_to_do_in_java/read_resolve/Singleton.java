package com.cleverdeveloper.gof.creational.singleton.how_to_do_in_java.read_resolve;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 4:26 PM
*/

import java.io.Serializable;

public class Singleton implements Serializable {

    private volatile static Singleton single_instance = null;

    public static Singleton getInstance() {
        return single_instance == null
                ? single_instance = new Singleton()
                : single_instance;
    }

    // To avoid multiple instances creation
    protected  Object readResolve() {
        return single_instance;
    }

    private int i = 10;


    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
