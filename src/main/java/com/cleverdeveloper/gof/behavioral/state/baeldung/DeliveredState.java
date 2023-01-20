package com.cleverdeveloper.gof.behavioral.state.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 2:43 PM
*/

public class DeliveredState implements PackageState {


    @Override
    public void next(Package pack) {
        pack.setState(new ReceivedState());
    }

    @Override
    public void previous(Package pack) {
        pack.setState(new OrderedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }

    @Override
    public String toString() {
        return "DeliveredState{}";
    }
}
