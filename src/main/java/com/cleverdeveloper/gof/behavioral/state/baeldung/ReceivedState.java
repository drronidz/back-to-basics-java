package com.cleverdeveloper.gof.behavioral.state.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 2:45 PM
*/

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pack) {
        System.out.println("This package is already received by a client");
    }

    @Override
    public void previous(Package pack) {
        pack.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package was received by a client");
    }

    @Override
    public String toString() {
        return "ReceivedState{}";
    }
}
