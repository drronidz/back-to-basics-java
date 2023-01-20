package com.cleverdeveloper.gof.behavioral.state.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 2:38 PM
*/

public interface PackageState {
    public void next(Package pack);
    public void previous(Package pack);
    public void printStatus();
}
