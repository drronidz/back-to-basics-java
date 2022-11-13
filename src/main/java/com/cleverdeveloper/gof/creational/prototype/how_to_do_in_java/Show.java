package com.cleverdeveloper.gof.creational.prototype.how_to_do_in_java;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 11:22 PM
*/

public class Show implements PrototypeCapable {
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Show clone() throws CloneNotSupportedException {
        System.out.println("Cloning Show Object ...");
        return (Show) super.clone();
    }

    @Override
    public String toString() {
        return "Show{" +
                "name='" + name + '\'' +
                '}';
    }
}
