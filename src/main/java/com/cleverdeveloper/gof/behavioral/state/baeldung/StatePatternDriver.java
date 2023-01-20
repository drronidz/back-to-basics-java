package com.cleverdeveloper.gof.behavioral.state.baeldung;

/*
PROJECT NAME : Back 2 Basics (Java Core)
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 1/20/2023 2:48 PM
*/

public class StatePatternDriver {
    public static void main(String[] args) {
        Package pack = new Package();
        pack.printStatus();

        pack.nextState();
        pack.printStatus();

        pack.nextState();
        pack.printStatus();

        pack.nextState();
        pack.printStatus();
    }
}
