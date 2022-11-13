package com.cleverdeveloper.gof.creational.prototype.example_one;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 11:19 PM
*/

public class Movie implements PrototypeCapable {
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie Object ...");
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
