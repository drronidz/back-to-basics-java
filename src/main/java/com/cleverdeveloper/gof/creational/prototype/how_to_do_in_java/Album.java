package com.cleverdeveloper.gof.creational.prototype.how_to_do_in_java;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 11:21 PM
*/

public class Album implements PrototypeCapable {
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Album clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album Object ...");
        return (Album) super.clone();
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                '}';
    }
}
