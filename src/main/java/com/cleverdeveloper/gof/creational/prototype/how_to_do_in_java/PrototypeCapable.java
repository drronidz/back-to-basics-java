package com.cleverdeveloper.gof.creational.prototype.how_to_do_in_java;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 11/11/2022 11:18 PM
*/

public interface PrototypeCapable extends Cloneable {
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
