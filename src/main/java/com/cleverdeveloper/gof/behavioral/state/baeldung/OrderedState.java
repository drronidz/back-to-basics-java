package com.cleverdeveloper.gof.behavioral.state.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 2:40 PM
*/

public class OrderedState implements PackageState {


    @Override
    public void next(Package pack) {
        pack.setState(new DeliveredState());
    }

    @Override
    public void previous(Package pack) {
        System.out.println("The package is in it's root state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office");
    }

    @Override
    public String toString() {
        return "OrderedState{}";
    }
}
